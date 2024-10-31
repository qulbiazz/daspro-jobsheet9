
import java.util.Scanner;

public class ArrayRataNilai23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlMhs = 0;
        jmlMhs = input.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0;
        double rata2, rataLulus, rataTidakLulus;
        int jumlahLulus = 0, jumlahTidakLulus = 0, lulus = 0, tidakLulus = 0;

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
                lulus += nilaiMhs[i];
            } else {
                jumlahTidakLulus++;
                tidakLulus += nilaiMhs[i];
            }
        }

        rataLulus = (double) lulus /  jumlahLulus;
        rataTidakLulus = (double) tidakLulus / jumlahTidakLulus;
        System.out.println("Rata rata nilai lulus: " + rataLulus);
        System.out.println("Rata rata nilai tidak lulus: " + rataTidakLulus);

    }
}
