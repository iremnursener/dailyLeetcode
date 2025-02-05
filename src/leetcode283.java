public class leetcode283 {



    public static void main(String[]args){
        int[] nums = { 0,0,1 };
        moveZeroes(nums);
    }


    public static void moveZeroes(int[] nums) {
        int length = nums.length;
        int index = 0; // Sıfır olmayan elemanları yerleştireceğimiz indeks

        // Sıfır olmayan elemanları başa alıyoruz
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];  // Sıfır olmayan elemanı `index`'e yerleştir
                if (i != index) {
                    nums[i] = 0;  // Sıfır olan elemanı yerine 0 koy
                }
                index++; // Sonraki sıfır olmayan eleman için index'i artır
            }
        }

        // Sonuçları yazdır
        for (int num : nums) {
            System.out.println(num);
        }
    }
}