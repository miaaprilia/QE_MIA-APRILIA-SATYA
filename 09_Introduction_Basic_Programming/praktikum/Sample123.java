import java.util.Scanner;
import java.util.Locale;

public class Sample123 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("PROGRAM JAVA MENGHITUNG SAMPLE 1, 2 & 3 : ");
        System.out.println("-----------------------------------------------");

        double hargabeli, hargajual, output;

        System.out.println("Sample 1");
        System.out.print("Harga Beli: ");
        hargabeli = input.nextDouble();

        System.out.print("Harga Jual: ");
        hargajual = input.nextDouble();

        output = hargajual - hargabeli ;

        if (hargajual == hargabeli) {
            System.out.println("Sama Saja: " + output);
        } else if (hargajual >= hargabeli) {
            System.out.println("Untung Sebesar: " + output);
        } else {
            System.out.println("Rugi Sebesar: " + output);
        }

        System.out.println("");

        System.out.println("Sample 2");
        System.out.print("Harga Beli: ");
        hargabeli = input.nextDouble();

        System.out.print("Harga Jual: ");
        hargajual = input.nextDouble();

        output = hargajual - hargabeli ;

        if (hargajual == hargabeli) {
            System.out.println("Sama Saja: " + output);
        } else if (hargajual >= hargabeli) {
            System.out.println("Untung Sebesar: " + output);
        } else {
            System.out.println("Rugi Sebesar: " + output);
        }

        System.out.println("");

        System.out.println("Sample 3");
        System.out.print("Harga Beli: ");
        hargabeli = input.nextDouble();

        System.out.print("Harga Jual: ");
        hargajual = input.nextDouble();

        output = hargajual - hargabeli ;

        if (hargajual == hargabeli) {
            System.out.println("Sama Saja: " + output);
        } else if (hargajual >= hargabeli) {
            System.out.println("Untung Sebesar: " + output);
        } else {
            System.out.println("Rugi Sebesar: " + output);
        }
    }
}