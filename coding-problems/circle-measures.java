// Write functions that calculate the area and perimeter of a circle.

public class CircleMeasures {

    public static double areaOfTheCircle(double radius, double pi) {
        return ((radius * radius) * pi);
    }

    public static double perimeterOfTheCircle(double radius, double pi) {
        return (2 * radius * pi);
    }

    public static void main(String[]args){

        System.out.println(areaOfTheCircle(7.5,3.142));
        System.out.println(perimeterOfTheCircle(7.5, 3.142));
    }

}
