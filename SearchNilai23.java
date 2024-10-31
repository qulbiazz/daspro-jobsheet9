import java.util.Scanner;

public class SearchNilai23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang diinput: ");
        int jmlNilai = input.nextInt();

        int[] arrNilai = new int[jmlNilai];
        int key = 0;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = input.nextInt();
        }
        System.out.print("Masukkan key yang dicari: ");
        key = input.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                System.out.println("Nilai " + key + " ketemu di indeks ke " + hasil);
                break;
            }
            if (key != arrNilai[i]) {
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;

            }
        }
    }
}
