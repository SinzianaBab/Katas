//https://www.codewars.com/kata/5f70c883e10f9e0001c89673/train/java

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class GravityFlip1 {
    public static void main(String[] args) {
        int[] arr = { 1,2,2,3 };
        int[] flippedArr = flip('R', arr);
        int[] flipLeft = flip('L', arr);
        System.out.println(Arrays.toString(flippedArr));
        System.out.println(Arrays.toString(flipLeft));
    }


        public static int[] flip(char dir, int[] arr) {

            if (dir == 'L') {
                arr = Arrays.stream(arr)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
            } else{
                Arrays.sort(arr);
            }

            return arr;
        }
}
