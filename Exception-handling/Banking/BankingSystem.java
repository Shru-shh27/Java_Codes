// package Banking;

// import java.util.Scanner;

// class InvalidPinException extends Exception {
//     InvalidPinException(String message) {
//         super(message); // to display the message of the exception
//     }

// }

// class InsufficientBalanceException extends Exception {
//     InsufficientBalanceException(String message) {
//         super(message); // to display the message of the exception
//     }
// }

// class DailyLimitExceededException extends Exception {
//     DailyLimitExceededException(String message) {
//         super(message); // to display the message of the exception
//     }
// }

// class InvalidAccountNumberException extends Exception {
//     InvalidAccountNumberException(String message) {
//         super(message); // to display the message of the exception
//     }
// }

// public class Bank {
//     static final int Correct_pin = 1234; // Predefined PIN
//     static double balance = 3000.0; // Initial balance
//     static double dailyLimit = 1000.0; // Daily withdrawal limit
//     static double dailyWithdrawn = 0.0; // Amount withdrawn today

//     public static void verifyPin(String pin) throws InvalidPinException {
//         try {
//             if (Integer.parseInt(pin) != Correct_pin) {
//                 throw new InvalidPinException("Error: Invalid PIN. Please try again.");
//             } 
//             System.out.println("PIN verified successfully.");
//         } catch (NumberFormatException e) {
//             throw new InvalidPinException("Error: Invalid PIN format. Please enter a valid PIN.");
//         }
//     }

//      public static void checkBalance(){
//         System.out.println("Current Balance: " + balance);
//         System.out.println("Daily Withdrawn Amount: " + dailyWithdrawn);
//         System.out.println("Remaining Daily Limit: " + (dailyLimit - dailyWithdrawn));
//      }

// public static void withdraw(double amount)throws InsufficientBalanceException, DailyLimitExceededException , InvalidAccountNumberException {
//     if(amount <=0){
//         throw new InvalidAccountNumberException("Error: Invalid withdrawal amount. Please enter a positive amount.");
//     }
//     if(amount % 100 != 0){
//         throw new InvalidAccountNumberException("Error: Invalid withdrawal amount. Please enter a multiple of 100.");
//     }
//     if(amount > balance) {
//         throw new InsufficientBalanceException("Error: Insufficient balance.");
//     }
//     if(amount > dailyLimit - dailyWithdrawn) {
//         throw new DailyLimitExceededException("Error: Daily withdrawal limit exceeded.");
//     }
// }

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Welcome to the ATM!");

//         int attempts = 0;
//         while (attempts < 3) {
//             System.out.print("Enter your PIN number: ");
//             String pin = scanner.nextLine();

//             verifyPin(pin);
//             attempts++;
//         }
//     }
// }

package Banking;

import java.util.*;

class InvalidPinException extends Exception{
    InvalidPinException(String message){
        super(message);
    }
}

class InsufficentBalanceException extends Exception{

}

class DailyLimitException extends Exception{

}

class InvalidAmountException extends Exception{
    InvalidAmountException(String message){
        super(message);
    }
}

public class BankingSystem {

    static final int CORRECT_PIN = 1234;
    static double balance = 10000;
    static double dailyLimit = 5000;
    static double withdrawnToday = 0;

    public static void verifyPin(int pin) throws InvalidPinException{
        if(pin != CORRECT_PIN){
            throw new InvalidPinException("Invalid PIN!");
        }

        System.out.println("Pin Verified successfully");
        
    }

    public static void checkBalance(){
        System.out.println("Current Balance: Rs. " + balance);
        System.out.println("Withdrawn Today: Rs. " + withdrawnToday);
        System.out.println("Remaining Daily Limit: Rs." + (dailyLimit - withdrawnToday));
    }

    public static void Withdraw(double amount) throws InvalidAmountException, DailyLimitException, InsufficentBalanceException{
        if(amount <= 0){
            throw new InvalidAmountException("Amount must be greater than zero");
        }

        if(amount % 100 != 0){
            throw new InvalidAmountException("Ampunt must be a multiple of Rs. 100");
        }

        if(amount > balance){
            throw new InsufficentBalanceException("Insufficent balance. Your balance is Rs. " + balance);
        }

        if(withdrawnToday + amount > dailyLimit){
            throw new DailyLimitException("Daily withdrawl Limit exceeded. " + "Your daily limit is Rs" + dailyLimit);
        }

        // perform withdrwal
        balance = balance - amount;
        withdrawnToday = withdrawnToday + amount;

        System.out.println("Amount withdrawn successfully");
        System.out.println("Amount withdrawn Rs." + amount);
        System.out.println("Remaining Balance Rs." + balance);
    }

    public static void deposit(double amount) throws InvalidAmountException{
        if(amount  <= 0){
            throw new InvalidAmountException("Deposit Amount must be greater than zero");
        }

        balance += amount;
        System.out.println("Deposit Successfull!");
        System.out.println("Deposited: Rs " + amount);
        System.out.println("New Balance: Rs " + balance);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("      Welcome to ATM   )");
        System.out.println("====================================");


        int attempts = 0 ;
    
        while( attempts < 3){
            System.out.print("Enter PIN: ");
            int pin = scn.nextInt();

            verifyPin(pin);
        }
    }
}
   