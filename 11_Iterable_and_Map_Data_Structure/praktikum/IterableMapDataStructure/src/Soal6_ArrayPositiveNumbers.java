public class Soal6_ArrayPositiveNumbers {
    public static void main(String[] args) {
        int[] input1 = {2, 1, 5, 1, 3, 2};
        int k1 = 3;
        int maxSum1 = maxSubarraySum(input1, k1);
        System.out.println("Output: ");
        System.out.println(maxSum1);  // Output: 9

        System.out.println("");
        System.out.println("==========");
        System.out.println("");

        int[] input2 = {2, 3, 4, 1, 5};
        int k2 = 2;
        int maxSum2 = maxSubarraySum(input2, k2);
        System.out.println("Output: ");
        System.out.println(maxSum2);  // Output: 7
    }

    public static int maxSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        int currentSum = 0;

        // Hitung jumlah awal dari subarray pertama
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;
        // Geser jendela untuk menghitung jumlah maksimum
        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
