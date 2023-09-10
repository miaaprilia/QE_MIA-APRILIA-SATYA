import java.util.Scanner;

class LoopingDataAlfabet {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("PROGRAM JAVA MENGGUNAKAN LOOPING : ");
        System.out.println("-----------------------------------------------");

        int besar_persegi,i,j;

        System.out.println("Looping ZYX Persegi");
        System.out.print("Input: ");
        besar_persegi = input.nextInt();

        for(i=1; i<=besar_persegi; i++) {
            for(j=1; j<=besar_persegi; j++) {
                System.out.print(String.format("X Y Z "));
            }
            System.out.println();
        }
    }
}