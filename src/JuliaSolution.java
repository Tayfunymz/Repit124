import java.util.Arrays;

public class JuliaSolution {
    public static int[] solution() {
        int[] nums = {4,3,2,44,1,100,55};
        //TODO: write your code below
        int [ ]reverse=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--) { 
            for(int j=0;j<=i;j++){
                reverse[j]+=nums[i];
            }

            }
// STILL PRINTS ME IN SAME ORDER :(



   //you saying its easy one i cant do that one ,i dont understand ...
   // To make it easy create a new int[] nums2 = new int[nums.length]
   // Then iterate through the nums array starting from the end going to the beggining 
   // and add each element to your new array.

        System.out.println(Arrays.toString(nums)); // And here you are printing nums instead of reverse.


        // DO NOT TOUCH BELOW CODE PLEASE
        // IF you make a new array CHANGE return nums to -> return yournewarray
        return nums;  // ITS BECAUSE YOU ARE RETURNING nums AND YOUR NEW LIST IS CALLED reverse
    }
}
