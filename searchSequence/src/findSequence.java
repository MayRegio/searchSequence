//declare instantiable class
public class findSequence {

    //declare method with parameters
    public static int findPatternInSequence (int[] arr, int[] searchKey) {
        //declare variable to store the size of our array
        int n = arr.length;
        //process to search the number we want
        //our index is initialized with 0
        //our program will run until our index is lower than our array size (n)
        //and once i is higher than n, our program will stop - i++ (counter loop control)
        for (int i = 0; i < n; i++) {
            //print output
            System.out.println("Searching at: arr [" + i + " ] = " + arr[i]);
            //if the index is equal to our searchKey
            if(arr[i] == searchKey[0]) {
                //return this index
                return i;
            }
        }
        //otherwise, return -1
        return -1;
    }
}
