package p1;

import java.util.Arrays;
public class NumberOftringles {
    public static void main (String[] args)
    {
        int nums[] = {6, 18, 9, 7, 10,};
        int n = nums.length;
        System.out.println("Original Array : "+Arrays.toString(nums));
        Arrays.sort(nums);
        int nt = 0;
        for (int i = 0; i < n-2; ++i)
        {
            int x = i + 2;
            for (int j = i+1; j < n; ++j)
            {
                while (x < n && nums[i] + nums[j] > nums[x])
                    ++x;
                nt += x - j - 1;
            }
        }
        System.out.println("Number of possible triangles can be formed from the array is: " +nt);
    }
}
