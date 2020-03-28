package arrayclass;
import java.util.*;

public class ArrayClass {
    //function/method that accepts all input into an array and prints multiples of the numbers
    static void array_data() throws InputMismatchException {
        double num1, num2, num3, num4, num5;
        double mul_num; //multiple of the numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome.Please enter five numbers.");

        //taking input from user
        System.out.print("Enter first number: "); //first number from user
        num1 = input.nextDouble();
        System.out.print("Enter second number: "); //second input from user
        num2 = input.nextDouble();
        System.out.print("Enter third number: "); //third input from user
        num3 = input.nextDouble();
        System.out.print("Enter fourth number: "); //fourth input from user
        num4 = input.nextDouble();
        System.out.print("Enter fifth number: "); //fifth input from user
        num5 = input.nextDouble();

        //creating an array to take all five numbers from user
        double numbers[] = {num1, num2, num3, num4, num5};
        //Displaying the multiples of numbers entered by user using array indexes
        System.out.println("Multiples of numbers: ");
        for (double num : numbers) {
            mul_num = Math.pow(num, 2);
            System.out.println(mul_num);
        }

        throw new InputMismatchException("Input Mismatch.");
    }

    public static void main(String[] args) {
        //calling method
        try{array_data();
    }catch(InputMismatchException e){
        System.out.println("Exception: " + e.getMessage());
    }
    }
}


