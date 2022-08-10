import java.util.Scanner;

public class searchSequence {
    //declare main method to run the app
    public static void main(String[] args) {
        //declare array of integer
        int nums[] = {3,4,5,6,7};
        //create an object to call the instantiable class
        findSequence findSequence = new findSequence();

        //declare scanner to user input
        Scanner userInput = new Scanner(System.in);
        //print the request to the user input
        System.out.print("Please, enter a whole number between 3 and 7: ");
        //declare the variable which we want to search
        int key = userInput.nextInt();
        //declare a variable to store our find
        int foundAt = findSequence.findPatternInSequence(nums, key);
        //print out our answer
        System.out.println("Found the number " + key + " at the index of ocurrence  " + foundAt + ".");

    }
}
