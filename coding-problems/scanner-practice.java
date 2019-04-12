import java.util.Scanner;

public class App {
    public static void main(String[] args){

        System.out.println("Hello I am computer");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello," + name + " I am great at counting");
        System.out.println("How high should I count?");
        int number = input.nextInt();
        System.out.println("Okay, I'll count to " + number);

        for (int i = 0; i <= number ; i++) {
            System.out.println(i);
        }

        input.close();

    }
}
