import figures.*;
import point.Point;

import java.util.Scanner;

public class Main {

    public static String FIGURE = "FIGURE";
    public static String CIRCLE = "CIRCLE";
    public static String SQUARE = "SQUARE";
    public static String RECTANGLE = "RECTANGLE";
    public static String PARALLELOGRAM = "PARALLELOGRAM";
    public static String TRIANGLE = "TRIANGLE";
    public static String POLYGON = "POLYGON";
    public static String SPHERE = "SPHERE";
    public static String TRUNCATED_SPHERE = "TRUNCATED_SPHERE";
    public static String CYLINDER = "CYLINDER";
    public static String CONE = "CONE";
    public static String END = "END";
    public static String RETYPE_MESSAGE = "please, retype";


    public static Figure getFigure(String arg, Point points) {
        Figure resultFigure = null;
        switch (arg) {
            case ("FIGURE"):
                resultFigure = new Figure(points);
                break;

            case ("CIRCLE"):
                resultFigure = new Circle(points);
                break;

            case ("SQUARE"):
                resultFigure = new Square(points);
                break;

            case ("RECTANGLE"):
                resultFigure = new Rectangle(points);
                break;

            case ("PARALLELOGRAM"):
                resultFigure = new Parallelogram(points);
                break;

            case ("TRIANGLE"):
                resultFigure = new Triangle(points);
                break;

            case ("POLYGON"):
                resultFigure = new Polygon(points);
                break;

            case ("SPHERE"):
                resultFigure = new Sphere(points);
                break;

            case ("TRUNCATED_SPHERE"):
                resultFigure = new TruncatedSphere(points);
                break;

            case ("CYLINDER"):
                resultFigure = new Cylinder(points);
                break;

            case ("CONE"):
                resultFigure = new Cone(points);
                break;

            case ("END"):
                break;

            default:
                System.out.println("please, retype");
                break;
        }
        return resultFigure;
    }

    public static Point addPoints(String numbers, Point points) {

        if (numbers.equals("STOP_INPUT")) {
            return points;
        }

        String[] nums = numbers.split(" ");
        int size = nums.length;
        int[] finalNums = new int[size];
        for (int i = 0; i < size; i++) {
            finalNums[i] = Integer.parseInt(nums[i]);
        }

        points.getPoints().add(finalNums);
        return points;
    }

    public static void main(String[] args) {
        Point points = new Point();

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String word = "";
        while (!word.equals("STOP_INPUT")) {
            word = scanner.nextLine();
            addPoints(word, points);
        }

        Figure figure = getFigure(command, points);

        String validation = figure.isValid();
        System.out.println(validation);

        if (!validation.equals("The figure is invalid")) {
            double square = Double.parseDouble(figure.getSquare());
            String stringPerimeter = figure.getPerimeter();
            System.out.printf("The figure area %.2f", square);
            System.out.print("\n");
            double perimeter = 0;

            if (!stringPerimeter.equals("The figure has no perimeter")) {
                perimeter = Double.parseDouble(stringPerimeter);
                System.out.printf("The figure perimeter %.2f", perimeter);
            } else {
                System.out.printf("The figure has no perimeter");
            }
        }
    }
}