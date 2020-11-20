import java.util.Arrays;

public class JuliaSolution {
    public static int[] solution() {
        int[] nums = {4,3,2,44,1,100,55};
        //TODO: write your code below
        int []reverse=new int[nums.length]; // THIS IS GOOD

        for (int i = nums.length - 1; i >= 0; i--) {   // YOU HAD THIS PART CORRECT

            for (int j = 0; j < i; j++) {
                reverse[j]=nums[i];
            }
        }





        //return nums;
        return  reverse; // YOU WANT TO change it to reverse since your answer is in reverse
    }
}
