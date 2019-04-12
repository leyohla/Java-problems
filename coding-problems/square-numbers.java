import java.util.List;
import java.util.ArrayList;

//import jdk.internal.jline.internal.TestAccessible;
//import org.openqa.selenium.*;

//2. A method that takes a number n, and uses square to return the first n square numbers. 

public class Numbers {

    public static int returnSquareNumbers(int n) {
        return n * n;
    }

    public static List<Integer> squareNumbers(int upperBound) {

        List<Integer> squareNumbers = new ArrayList<Integer>();
        for (int i=1; i <= upperBound; i++) {
            squareNumbers.add(returnSquareNumbers(i));
        }
        return squareNumbers;
    }


    public static int sumOfSquares(int upperBound) {
        List<Integer> squareNums = squareNumbers(upperBound);
        int sum = 0;
        for(int value: squareNums){
            sum += value;
        }
        return sum;
    }

    public static double squareRootFinder(int num) {
        double squareRoot = 0;
        double range = 0.1;
        while(true){
            if (squareRoot * squareRoot == num) {
                return squareRoot;
            }
            else {
                squareRoot += 1;
            }

        }
    }

    //A method that takes a number, and computes an approximation of its square root iteratively.


    public static void main(String[] args) {
        int n = 17;
        System.out.println("The square number of " + n + " is " + returnSquareNumbers(n));
        System.out.println(returnSquareNumbers( 10 ));
        System.out.println(sumOfSquares(3));
        System.out.println(squareRootFinder(16));
        
        }

    }

//3. A method that takes a number n and returns the sum of the first n squares.
