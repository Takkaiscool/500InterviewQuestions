package Arrays.GivenSumInAnArray;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int []input = {8,7,2,5,3,1};
        Arrays.sort(input);
        int sum=10;
        int low = 0;
        int high= input.length-1;
        while (low<high){
            if(input[low]+input[high]==sum){
                System.out.println("Pair found they are "+input[low]+" and "+input[high] );
                return;
            }
            if(input[low]+input[high]<sum){
                low++;
            }else{
                high--;
            }

        }
        System.out.println("Pair not found");
    }
}
