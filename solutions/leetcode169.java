import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode169 {

    public static void main(String[] args) {

        int[] nums = {3, 3, 4, 2, 3, 3, 3, 2};
        System.out.println(majorityElement(nums)); // Çıkış: 3
    }

    public static int majorityElement(int[] nums) {
        int limit = nums.length / 2;
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // Sayacı artır
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > limit) { // limit'i aşan elemanı bul
                return entry.getKey();
            }
        }
        return -1; // Çoğunluk elemanı bulunamazsa (Teorik olarak olmayacak ama güvenli dönüş)
    }


}
