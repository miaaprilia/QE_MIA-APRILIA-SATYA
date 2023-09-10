import java.util.Scanner;

class LoopingBintangSegitiga {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM JAVA MENGGUNAKAN LOOPING : ");
        System.out.println("-----------------------------------------------");

        int i,j, tinggi_segitiga;

        System.out.println("Looping Bintang Segitiga");
        System.out.print("Input: ");
        tinggi_segitiga = input.nextInt();
        for(int b = 1; b <= tinggi_segitiga; b++){
            for (int c = tinggi_segitiga; c >= b; c--) {
                System.out.print(" ");
            }
            for (int d = 1; d <= b; d++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}