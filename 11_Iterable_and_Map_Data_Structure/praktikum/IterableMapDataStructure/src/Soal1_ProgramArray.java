import java.util.ArrayList;
import java.util.List;

public class Soal1_ProgramArray {
    public static void main(String[] args) {
        String[] input1Array1 = {"kazuya", "jin", "lee"};
        String[] input1Array2 = {"kazuya", "feng"};
        String[] result1 = mergeAndRemoveDuplicates(input1Array1, input1Array2);
        System.out.println("Output: ");
        for (String name : result1) {
            System.out.print(name + " ");}
        System.out.println("");
        System.out.println("");
        System.out.println("====================");
        System.out.println("");
        String[] input2Array1 = {"lee", "jin"};
        String[] input2Array2 = {"kazuya", "panda"};
        String[] result2 = mergeAndRemoveDuplicates(input2Array1, input2Array2);
        System.out.println("Output: ");
        for (String name : result2) {
            System.out.print(name + " ");}
        System.out.println("");
    }
    public static String[] mergeAndRemoveDuplicates(String[] arr1, String[] arr2) {
        // Gabungkan kedua array
        List<String> mergedList = new ArrayList<>();
        for (String name : arr1) {
            mergedList.add(name);
        }
        for (String name : arr2) {
            if (!mergedList.contains(name)) {
                mergedList.add(name);
            }
        }
        // Konversi list menjadi array
        String[] resultArray = new String[mergedList.size()];
        resultArray = mergedList.toArray(resultArray);
        return resultArray;
    }
}
