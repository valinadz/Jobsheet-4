import java.util.Scanner;

public class Gaji22 {
    public static void main (String[] args) {

        Scanner input =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Julah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan Besaran Gaji Anda");
        gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Anda");
        potGaji=input.nextInt();


        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);

    }
}