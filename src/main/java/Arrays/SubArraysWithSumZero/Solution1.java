package Arrays.SubArraysWithSumZero;

public class Solution1 {

    public static void main(String[] args) {
        int []input = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        for (int i = 0; i < input.length; i++)
        {
            int sum = 0;

            // consider all sub-arrays ending at j
            for (int j = i; j < input.length; j++)
            {
                // sum of elements so far
                sum += input[j];

                // if sum is seen before, we have found a subarray with 0 sum
                if (sum == 0) {
                    System.out.println("Subarray [" + i + ".." + j + "]");
                }
            }
        }
    }
}
