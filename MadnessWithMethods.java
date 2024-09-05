//gtc 09/05/2024
//MadnessWithMethods.java


import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Heart of Darkness...or just methods. \n");

        int userInputNumber = 0;

        userInputNumber = getUserInput();

        System.out.println("\n The user input the number: " + userInputNumber);

        //Find the largest of two ints.
        int myFirstNum = 8;
        int mySecondNum = 4;
        int largest = 0;
        //Call the method named compareTwoInts()
        largest = compareTwoInts(myFirstNum, mySecondNum);
        System.out.println("\n The largest of " + myFirstNum + " and " + mySecondNum + " is: " + largest);

        //Sum two ints.
        int theSumOfTwoInts = 0;
        theSumOfTwoInts = sumTwoInts(myFirstNum, mySecondNum);



}

//  Method to get an integer from the user.
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        //Read the integer input from the user.
        int userInput = 0;
        userInput = scanner.nextInt();
        return userInput; //Return the input to the calling method.
    }

    // Method to compare tow integers and return the largest.
    public static int compareTwoInts(int firstInt, int secondInt) {
        int largest = 0;
        if (firstInt > secondInt) {
            largest = firstInt;
        } else {
            largest = secondInt;
        }
        return largest;


    }

    //Method to return the sum of two integeers
    public static int sumTwoInts(int num1, int num2) {
        int theSum = 0;
        theSum = num1 + num2;
        return theSum;
    }

}
