package Arrays.SubArray0Exists;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        int []input = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        Arrays.sort(input);
        int sum=0;
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        for(int i:input){
            sum+=i;
            if(sums.contains(sum)){
                System.out.println("Subarray Exists");
                return;
            }

            sums.add(sum);
        }
        System.out.println("Subarray doesnt exist");
    }
}
