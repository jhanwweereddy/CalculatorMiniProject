import java.util.Scanner;
import calculator.Calculator;
public class Main {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        Scanner scan = new Scanner(System.in);

        System.out.println("1-> Square Root");
        System.out.println("2-> Factorial Function");
        System.out.println("3-> Natural Logarithm");
        System.out.println("4-> Power Function");
        System.out.println("5-> Exit");
        System.out.println("Select your desired Operation from the above");

        int op = scan.nextInt();

        while(op != 5)
        {
            if(op == 1)
            {
                System.out.println("Enter number whose square root you want");
                int x = scan.nextInt();
                System.out.println("Square root of " + x + " is = " + calculator.SquareRoot(x));
            }

            else if(op == 2)
            {
                System.out.println("Enter number whose factorial you want");
                int x = scan.nextInt();
                System.out.println("Factorial of " + x + " is = " + calculator.factorial(x));
            }

            else if(op == 3)
            {
                System.out.println("Enter number whose natural logarithm value you want");
                int x = scan.nextInt();
                System.out.println("Natural Logarithm of " + x + " is = " + calculator.log(x));
            }

            else if(op == 4)
            {
                System.out.println("Enter base");
                int x = scan.nextInt();
                System.out.println("Enter power");
                int y = scan.nextInt();
                System.out.println(x + " power " + y + " is = " + calculator.power(x, y));
            }

            System.out.println("1-> Square Root");
            System.out.println("2-> Factorial Function");
            System.out.println("3-> Natural Logarithm");
            System.out.println("4-> Power Function");
            System.out.println("5-> Exit");
            System.out.println("Select your desired Operation from the above");

            op = scan.nextInt();
        }
    }
}