package Arrays.SortBinaryArrayInLinearTime;

public class Solution1 {
    public static void main(String[] args) {
        int []input = {1,0,1,0,1,0,0};
        int zeros=0;
        for(int i:input){
            if(i==0)
                zeros++;
        }
        for(int i=0;i<zeros;i++)
            input[i]=0;
        for (int i=zeros;i<input.length;i++)
            input[i]=1;

        for (int i:input)
            System.out.print(i+"\t");


    }
}
