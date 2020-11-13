import java.util.*;

class TayfunSolution {

    public static int[] solution() {
        int[] nums = {4,3,2,44,1,100,55};
        //TODO: write your code below
        for (int i = nums.length - 1, j = 0; j < i; i--, j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //Do not change below statement:
        return nums;
    }
}