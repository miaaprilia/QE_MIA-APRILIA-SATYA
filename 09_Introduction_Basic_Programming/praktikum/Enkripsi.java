import java.util.Scanner;

public class Enkripsi {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        String kata;
        int key = 10;

        String[] huruf = new String[26];
        for(char c = 'A'; c <= 'Z'; c++)
            huruf[c - 65] = String.valueOf(c);

        System.out.println("PROGRAM JAVA MENGGUNAKAN ENKRIPSI : ");
        System.out.println("-----------------------------------------------");
        System.out.print("Input: ");
        kata = input.nextLine();
        String cipher = "";
        loop1:
        for(int a = 0; a < kata.length(); a++)
        {
            int index_plain = -1;
            for(int b = 0; b < huruf.length; b++)
            {
                index_plain = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;
                // Jika Ketemu Karakternya
                if(index_plain != -1)
                {
                    // Rumus Enkripsi --> C = (nomor_karakter_plain + key) mod 26
                    cipher += huruf[(index_plain + key) % 26];
                    continue loop1;
                }
            }

            //  Jika plain text tidak mengandung huruf maka, langsung dimasukkan ke variable cipher
            //  Misal, spasi atau angka
            cipher += kata.charAt(a);
        }

        //  Tampilkan hasil cipher
        System.out.println("Cipher Text : "+cipher);
    }
}