
public class SearchNilai23 {
    public static void main(String[] args) {

        int[] arrNilai = { 80, 85, 78, 96, 90, 82, 86 };
        int key = 90;
        int hasi = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasi = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai " + key + " ketemu di indeks ke " + hasi);
        System.out.println();
    }
}
