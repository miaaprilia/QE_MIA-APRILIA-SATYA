public class Soal5_SortNumbers {
    public static void main(String[] args) {
        int[] input1 = {2, 3, 3, 3, 6, 9, 9};
        int length1 = removeDuplicates(input1);
        System.out.println("Output: ");
        System.out.println(length1);  // Output: 4

        System.out.println("");
        System.out.println("==========");
        System.out.println("");

        int[] input2 = {2, 2, 2, 11};
        int length2 = removeDuplicates(input2);
        System.out.println("Output: ");
        System.out.println(length2);  // Output: 2
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int nonDuplicateIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[nonDuplicateIndex] = nums[i];
                nonDuplicateIndex++;
            }
        }

        return nonDuplicateIndex;
    }
}
