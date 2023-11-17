import java.util.Arrays;

public class Soal3_Indicestwonumbers {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 6};
        int target1 = 6;
        int[] hasil1 = temukanIndeks(nums1, target1);
        System.out.println("Output: ");
        System.out.println(Arrays.toString(hasil1));  // Output: [1, 3]

        System.out.println("");
        System.out.println("==========");
        System.out.println("");

        int[] nums2 = {2, 5, 9, 11};
        int target2 = 11;
        int[] hasil2 = temukanIndeks(nums2, target2);
        System.out.println("Output: ");
        System.out.println(Arrays.toString(hasil2));  // Output: [0, 2]
    }

    public static int[] temukanIndeks(int[] nums, int target) {
        int kiri = 0;
        int kanan = nums.length - 1;

        while (kiri < kanan) {
            int jumlahSekarang = nums[kiri] + nums[kanan];
            if (jumlahSekarang == target) {
                return new int[]{kiri, kanan};
            } else if (jumlahSekarang < target) {
                kiri++;
            } else {
                kanan--;
            }
        }

        // Jika tidak ada pasangan yang ditemukan, kembalikan array kosong atau tangani sesuai kebutuhan.
        return new int[]{};
    }
}
