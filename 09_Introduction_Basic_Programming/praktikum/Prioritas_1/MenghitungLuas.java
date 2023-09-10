import java.util.Locale;
import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int a, t;
        double luas, lebar, panjang, r;

        System.out.println("PROGRAM JAVA MENGHITUNG LUAS BANGUN DATAR : ");
        System.out.println("-----------------------------------------------");

        System.out.println("Luas Bangun Datar Segitiga");
        System.out.print("Masukan Alas : ");
        a = input.nextInt();
        System.out.print("Masukan Tinggi : ");
        t = input.nextInt();

        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga : " + luas);

    System.out.println("");

        System.out.println("Luas Bangun Datar Persegi Panjang");
        System.out.print("Masukan Panjang : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar : ");
        lebar=input.nextInt();

        luas=panjang*lebar;

        System.out.println("Luas Persegi Panjang : " + luas);

    System.out.println("");

        System.out.println("Luas Bangun Datar Lingkaran");

        System.out.print("Input jari-jari lingkaran: ");
        r = input.nextDouble();

        luas = 3.14 * r * r;

        System.out.println("Luas lingkaran: " + luas);
    }
}