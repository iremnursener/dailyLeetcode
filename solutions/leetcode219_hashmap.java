import java.util.HashMap;

public class leetcode219_hashmap {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;

        System.out.println(  containsNearbyDuplicate(nums, k));

    }



    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numAndLastIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numAndLastIndexMap.containsKey(nums[i])) {
                int lastIndex = numAndLastIndexMap.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true;
                }
            }
            numAndLastIndexMap.put(nums[i], i); // En son görülen index'i güncelleriz
        }

        return false;
    }


}
