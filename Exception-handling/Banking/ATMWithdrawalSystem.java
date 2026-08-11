package Banking;
//Design Java programs showcasing exception handling through square root calculations, an ATM withdrawal system, and a university enrollment system with custom exceptions.

import java.util.Scanner;

class InvalidPinException extends Exception {

    public InvalidPinException(String message) {

        super(message);

    }

}

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {

        super(message);

    }

}

public class ATMWithdrawalSystem {

    private static final int CORRECT_PIN = 1234; // Predefined PIN

    private static double balance = 3000.0; // Initial balance

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter PIN: ");

            int enteredPin = scanner.nextInt();

            // Validate PIN

            if (enteredPin != CORRECT_PIN) {

                throw new InvalidPinException("Error: Invalid PIN. Please try again.");

            }

            System.out.print("Withdraw Amount: ");

            double withdrawAmount = scanner.nextDouble();

            if (withdrawAmount > balance) {

                throw new InsufficientBalanceException("Error: Insufficient balance.");

            }

            balance -= withdrawAmount;

            System.out.println("Withdrawal Successful! Remaining Balance: " + balance);

        } catch (InvalidPinException | InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Error: Invalid input. Please enter numeric values.");

        } finally {

            System.out.println("Current Balance: " + balance);

            scanner.close();

        }

    }

}