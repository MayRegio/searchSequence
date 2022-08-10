import java.util.Arrays;
import java.util.Scanner;

public class searchSequence extends IndexOutOfBoundsException{
    //declare main method to run the app
    public static void main(String[] args) {
        //declare array of integer
        int nums [] = {3,4,5,6,7};
        //create an object to call the instantiable class
        findSequence find = new findSequence();

        //declare the variable which we want to search
        int key []= {4,5};
        //declare a variable to store our find
        int foundAt = find.findPatternInSequence(nums, key);
        //print out our answer
        System.out.println("Found the sequence number " + Arrays.toString(key) + " at the index of ocurrence  " + foundAt + ".");

    }
}
