import java.util.Scanner;
/**
 * SiakadFor16
 */
public class SiakadFor16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int statusLulus = 0, statusUlang = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                statusLulus++;
            } else {
                statusUlang++;
            }
        }
        System.out.println("Nilai tetinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah lulus: " + statusLulus);
        System.out.println("Jumlah tidak Lulus: " + statusUlang);
    }
}