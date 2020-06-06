package Arrays.GivenSumInAnArray;

import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        int []input = {8,7,2,5,3,1};
        int sum=10;
        HashMap<Integer,Integer> output = new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(output.containsKey(sum-input[i])){
                System.out.println("Pair found at index "+output.get(sum-input[i])+" and "+i);
                return;
            }
            output.put(input[i],i);
        }
        System.out.println("Pair not found");
    }
}
