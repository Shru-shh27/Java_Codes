// public class ThrowandThrows {
    

//     public static void checkAge(int age) {
//         if (age < 18) {
//             throw new ArithmeticException("Access denied - You must be at least 18 years old.");
//         } else {
//             System.out.println("Access granted - You are old enough!");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             checkAge(15);
//         } catch (ArithmeticException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }


import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {


            System.out.print("Enter a number: ");

            double number = scanner.nextDouble();

           
            if (number < 0) {

                throw new IllegalArgumentException("Error: Cannot calculate the square root of a negative number.");

            }
            
            double result = Math.sqrt(number);

            System.out.println("Square root: " + result);    

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: Invalid input. Please enter a valid number.");

        } finally {

            scanner.close();

        }

    }

}