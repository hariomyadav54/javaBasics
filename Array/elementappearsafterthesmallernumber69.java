package p1;

import java.util.Arrays;

public class elementappearsafterthesmallernumber69 {
        public static int diff_between_two_elemnts(int[] nums)
        {
            int diff_two_elemnts = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    diff_two_elemnts = Integer.max(diff_two_elemnts,nums[j] - nums[i]);
                }
            }

            return diff_two_elemnts;
        }

        public static void main(String[] args)
        {
            int[] nums = { 7 ,9 ,5, 6, 13, 2 };
            System.out.println("\nOriginal array: "+ Arrays.toString(nums));

            System.out.print("The maximum difference between two elements of the said array elements\n" + diff_between_two_elemnts(nums));
        }
    }

