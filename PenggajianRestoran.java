import java.util.Scanner;

public class PenggajianRestoran {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan informasi gaji
        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Masukkan jumlah jam kerja lembur: ");
        int jamLembur = scanner.nextInt();

        // Menghitung gaji total
        double gajiLembur = jamLembur * 20; // Misalkan tarif lembur per jam adalah 20
        double gajiTotal = gajiPokok + gajiLembur;

        // Menampilkan rincian gaji
        System.out.println("\nRincian Gaji " + namaKaryawan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Gaji Lembur: " + gajiLembur);
        System.out.println("Gaji Total: " + gajiTotal);

        // Menutup Scanner
    }
}