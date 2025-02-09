import java.util.HashMap;
import java.util.Map;

public class leetcode136 {

    public static void main(String[] args) {
       testSingleNumber(); // Test metodunu çağırıyoruz
    }
    public static void testSingleNumber() {
        // Test 1: Normal örnek
        int[] nums1 = {4, 1, 2, 1, 2};
        System.out.println("Test 1: " + (singleNumber(nums1) == 4 ? "Pass" : "Fail"));

        // Test 2: Tek sayı örneği
        int[] nums2 = {2, 2, 1};
        System.out.println("Test 2: " + (singleNumber(nums2) == 1 ? "Pass" : "Fail"));

        // Test 3: Negatif sayılar
        int[] nums3 = {-1, -1, -2};
        System.out.println("Test 3: " + (singleNumber(nums3) == -2 ? "Pass" : "Fail"));

        // Test 4: Büyük örnek
        int[] nums4 = {1000, 2000, 3000, 1000, 2000};
        System.out.println("Test 4: " + (singleNumber(nums4) == 3000 ? "Pass" : "Fail"));

        // Test 5: Sadece bir eleman
        int[] nums5 = {5};
        System.out.println("Test 5: " + (singleNumber(nums5) == 5 ? "Pass" : "Fail"));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();


        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {

            if (entry.getValue() == 1) {
               return entry.getKey();
            }

        }

        return -1;
    }
}
