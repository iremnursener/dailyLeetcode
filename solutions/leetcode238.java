import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode238 {


    public int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        int result = 0;
        int temp;


        for (int i = 0; i < nums.length; i++) {

            temp = nums[i];
            nums[i] = 1;
            result = Arrays.stream(nums)
                    .reduce(1, (a, b) -> a * b);
            results[i] = result;
            nums[i]=temp;
        }


        return results;
    }


}
