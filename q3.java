import jdk.jshell.ImportSnippet;

import java.util.HashSet;

public class q3 {
        public static boolean hasPairWithSum(int[] arr, int t) {
            HashSet<Integer> seen = new HashSet<>();

            for (int num : arr) {
                int complement = t - num;
                if (seen.contains(complement)) {
                    return true;
                }
                seen.add(num);
            }

            return false;
        }

        public static void main(String[] args) {
            int[] arr1 = {0, -1, 2, -3, 1};
            int t1 = -2;
            System.out.println(hasPairWithSum(arr1, t1));  // Expected: true

            int[] arr2 = {1, -2, 1, 0, 5};
            int t2 = 0;
            System.out.println(hasPairWithSum(arr2, t2));  // Expected: false
        }
    }
