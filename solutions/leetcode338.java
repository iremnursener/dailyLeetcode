import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode338 {

    public static void main(String[] args) {


        int n = 5;  // Test için bir değer belirledik
        int[] output = countBits(n);

        System.out.println(Arrays.toString(output)); // Çıktıyı yazdır
    }

    public static int[] countBits(int n) {

        int[] result=new int[n+1];


        for (int i = 0; i <= n; i++) {

            result[i] = Integer.bitCount(i);

        }
        return result;


    }

}
