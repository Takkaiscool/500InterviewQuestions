package Arrays.GivenSumInAnArray;

public class Solution1 {

    public static void main(String[] args) {
        int []input = {8,7,2,5,3,1};
        int sum=10;
        for (int i=0;i<input.length;i++){

            for(int j=i+1;j<input.length;j++){
                if(input[i]+input[j]==sum){
                    System.out.println("Pair found at index "+i+" and "+j );
                    //return;
                }
            }
        }
        System.out.println("No Pair found");
    }

}
