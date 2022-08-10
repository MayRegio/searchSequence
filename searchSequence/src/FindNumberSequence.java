import java.util.Arrays;

public class FindNumberSequence {

        public static void main(String[] args) {

            // * Do not modify this method.

            // Simple problem, expect 3
            /*int[] find = new int[] { 4, 5, 6 };
            int[] randomNumbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
            System.out.println("pattern found at index: " + findPatternInSequence(find, randomNumbers));

            // Pattern not found, expect -1
            find = new int[] { 4, 5, 99 };
            randomNumbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
            System.out.println("pattern found at index: " + findPatternInSequence(find, randomNumbers));

            // Partial match, expect -1
            find = new int[] { 4, 5, 6 };
            randomNumbers = new int[] { 1, 2, 3, 4, 5, 99, 7, 8 };
            System.out.println("pattern found at index: " + findPatternInSequence(find, randomNumbers));

            // Complex case, expect 13
            find = new int[] { 0, 0, 1, 1 };
            randomNumbers = new int[] { 99, 98, 97, 96, 0, 95, 0, 0, 94, 0, 0, 1, 93, 0, 0, 1, 1 };
            System.out.println("pattern found at index: " + findPatternInSequence(find, randomNumbers));

            // Duplicate  case, expect 4
            find = new int[] { 2, 3 };
            randomNumbers = new int[] { 1, 2, 9, 8, 2, 3, 3, 5, 8, 2, 3 };
            System.out.println("pattern found at index: " + findPatternInSequence(find, randomNumbers));*/

            //find sequence 4,5
            int firstArray [] = {3,4,5,6,7};
            int findNow [] = {4,5};
            System.out.println("Pattern found at index: " + findPatternInSequence(findNow, firstArray));
            System.out.println("Found the sequence number " + Arrays.toString(findNow) + " at the index of occurance " + findPatternInSequence(findNow, firstArray));
        }

        private static int findPatternInSequence(int[] findSequence, int[] searchSequence) {

            for (int i = 0; i < searchSequence.length; i++) {
                if(searchSequence[i] == findSequence[0]) {
                    boolean foundSequence = true;
                    for (int j = 0; j < findSequence.length; j++) {
                        if(searchSequence.length <= i+j || findSequence[j] != searchSequence[i+j]) {
                            foundSequence = false;
                            break;
                        }
                    }
                    if(foundSequence) {
                        return i;
                    }
                }
            }

            return -1;
        }
   }

