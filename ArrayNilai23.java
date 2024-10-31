import java.util.Scanner;;

public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai akhir ke-" +i+ ": ");
            nilaiAkhir[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan Nilai akhir ke-" +i+ " adalah " +nilaiAkhir[i]);
        }
    }
}
