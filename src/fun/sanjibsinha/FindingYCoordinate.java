package fun.sanjibsinha;

import java.util.Scanner;

/*
Finding the y-coordinate of a point on a line
where x-coordinate is given
 */
public class FindingYCoordinate {

    static int lineSlope = 0;
    static int yIntercept = 0;
    static int xCoordinate = 0;
    static int yCoordinate = 0;

    public static void main(String[] args) {

        System.out.println("Enter the value of the line-slope in positive integer: ");
        Scanner slopeOfLine = new Scanner(System.in);
        lineSlope = slopeOfLine.nextInt();
        System.out.println("Enter the intercept of y-axis: ");
        Scanner interceptOfY = new Scanner(System.in);
        yIntercept = interceptOfY.nextInt();
        System.out.println("Enter the value of x-coordinate: ");
        Scanner coordinateOfX = new Scanner(System.in);
        xCoordinate = coordinateOfX.nextInt();
        yCoordinate = lineSlope * xCoordinate + yIntercept;
        //line of slope = rise vertically/run horizontally
        //yCoordinate = (lineSlope * xCoordinate) + yIntercept;
        System.out.println("The y-cordinate is: " + yCoordinate + ". When the slope of line is: "
                + lineSlope + ". Intercept of y-axis is: " + yIntercept + ". X coordinate is: " + xCoordinate);

    }

}
