import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double addition,subtraction,multiplication,division,num1,num2;
        int pick;

        System.out.println("********CALCULATOR********");
        System.out.println("*    (1)+Addition        *");
        System.out.println("*    (2)-Subtraction     *");
        System.out.println("*    (3)*Multiplication  *");
        System.out.println("*    (4)/Division        *");
        System.out.println("**************************");

        pick = keyboard.nextInt();

        switch (pick)
        {
            case (1):
                System.out.println("+Addition");
                System.out.println("Enter two numbers");
                num1 = keyboard.nextDouble();
                num2 = keyboard.nextDouble();
                addition = num1+num2;
                System.out.println("Result = " + addition);
                break;
            case (2):
                System.out.println("-Subtraction");
                System.out.println("Enter two numbers");
                num1 = keyboard.nextDouble();
                num2 = keyboard.nextDouble();
                subtraction = num1-num2;
                System.out.println("Result = " + subtraction);
                break;
            case (3):
                System.out.println("*Multiplication");
                System.out.println("Enter two numbers");
                num1 = keyboard.nextDouble();
                num2 = keyboard.nextDouble();
                multiplication = num1*num2;
                System.out.println("Result = " + multiplication);
                break;
            case (4):
                System.out.println("/Division");
                System.out.println("Enter two numbers");
                num1 = keyboard.nextDouble();
                num2 = keyboard.nextDouble();
                division = num1/num2;
                System.out.println("Result = " + division);
                break;
                default:
                    System.out.println("invalid character");

        }








    }
}
