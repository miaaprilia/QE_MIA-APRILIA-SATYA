import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Soal4_ArrayUnique {
    public static void main(String[] args) {
        int[] input1Array1 = {1, 2, 3, 4};
        int[] input1Array2 = {1, 3, 5, 10, 16};
        int[] input2Array1 = {3, 8};
        int[] input2Array2 = {2, 8};
        int[] output1 = arrayUnique(input1Array1, input1Array2);
        System.out.println("Output: ");
        System.out.println(Arrays.toString(output1));  // Output: [2, 4]
        System.out.println("");
        System.out.println("==========");
        System.out.println("");
        int[] output2 = arrayUnique(input2Array1, input2Array2);
        System.out.println("Output: ");
        System.out.println(Arrays.toString(output2));  // Output: [3]
    }
    public static int[] arrayUnique(int[] arr1, int[] arr2) {
        // Mengonversi array kedua menjadi set untuk mempermudah pencarian
        Set<Integer> set2 = new HashSet<>();
        for (int num : arr2) {
            set2.add(num);
        } List<Integer> resultList = new ArrayList<>();
        // Mengiterasi melalui elemen-elemen di array pertama
        for (int num : arr1) {
            // Jika elemen tidak ada dalam array kedua, tambahkan ke resultList
            if (!set2.contains(num)) {
                resultList.add(num);
            }
        }
        // Mengonversi resultList kembali ke array int
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}
