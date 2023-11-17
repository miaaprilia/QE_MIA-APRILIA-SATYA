import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Soal2_KumpulanAngka {
    public static void main(String[] args) {
        String input1 = "76523752";
        List<Character> output1 = angkaUnik(input1);
        System.out.println("Output: ");
        System.out.println(output1);  // Output: [6, 4, 3, 7]

        System.out.println("");
        System.out.println("==========");
        System.out.println("");

        String input2 = "1122";
        List<Character> output2 = angkaUnik(input2);
        System.out.println("Output: ");
        System.out.println(output2);  // Output: []
    }
    public static List<Character> angkaUnik(String input) {
        Map<Character, Integer> frekuensi = new HashMap<>();
        List<Character> hasil = new ArrayList<>();

        // Hitung frekuensi kemunculan setiap karakter dalam string
        for (char karakter : input.toCharArray()) {
            frekuensi.put(karakter, frekuensi.getOrDefault(karakter, 0) + 1);
        }

        // Tambahkan karakter ke hasil jika frekuensinya adalah 1
        for (char karakter : input.toCharArray()) {
            if (frekuensi.get(karakter) == 1) {
                hasil.add(karakter);
            }
        }

        return hasil;
    }
}
