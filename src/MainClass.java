
import java.util.*;
/*
Write a java program that asks the user for inputs of five(5) numbers. The program should then pick each number and replace that number with
the second multiple of that number.The results after the replacement should be displayed*/
public class MainClass extends MultipleClass {

    //THE function TAKES INPUT FROM USER OF FIVE DIFFERENT NUMBERS AND DISPLAYS THE MULTIPLE OF EACH
    static void Multiple() throws InputMismatchException {
        double num1, num2, num3, num4, num5;
        double mul_num1, mul_num2, mul_num3, mul_num4, mul_num5; //multiple of the numbers

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

        //Displaying the multiples of numbers entered by user
        mul_num1 = Math.pow(num1,2);
        mul_num2 = Math.pow(num2,2);
        mul_num3 = Math.pow(num3,2);
        mul_num4 = Math.pow(num4,2);
        mul_num5 = Math.pow(num5,2);
        System.out.println("\nThe multiple of the numbers you entered are: \nFirst number: " + mul_num1 + "\nSecond number: " + mul_num2 );
        System.out.println("Third number: " + mul_num3 + "\nFourth number: " + mul_num4 + "\nFifth number: " + mul_num5);
        System.out.println();

        MultipleClass obj = new MultipleClass();  //instantiating object for MulitpleClass
        System.out.println("Fourth multiple of numbers: "); //fourth multiple of numbers
        obj.mult(num1);
        obj.mult(num2);
        obj.mult(num3);
        obj.mult(num4);
        obj.mult(num5);
    }

    public static void main(String[] args) {
        //calling the method/function
        try {
            Multiple();
        } catch (InputMismatchException e) {
            System.out.println("Exception: Input Mismatch");
            System.out.println("Try again.");
        }

        //Instantiating an object for Student
        Students student1 = new Students("P/SDS/AFE/242","Ganoh");
        int age_of_student = student1.age;
        int level_of_student = student1.level;
        System.out.println("Age:" + age_of_student);
        System.out.println("Level: "+ level_of_student);
    }
}
