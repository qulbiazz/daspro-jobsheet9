import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai Mahasiswa: ");
        int jmlNilai = input.nextInt();

        int[] nilaiMhs = new int[jmlNilai];
        double rataRata;

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Nilai mahasiswa ke-" + (1 + i) + ": ");
            nilaiMhs[i] = input.nextInt();
        }

        int totalNilai = 0;
        for (int i = 0; i < jmlNilai; i++) {
            totalNilai += nilaiMhs[i];
        }

        rataRata = (double) totalNilai / jmlNilai;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < jmlNilai; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println("-------------------------");
        for (int i = 0; i < jmlNilai; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println("\nNilai rata-rata mahasiswa: " + rataRata);
        System.out.println("Nilai tertinggi mahasiswa: " + nilaiTertinggi);
        System.out.println("Nilai terendah mahasiswa: " + nilaiTerendah);

    }
}
