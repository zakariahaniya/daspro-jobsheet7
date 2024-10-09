import java.util.Scanner;
/**
 * Tiket16
 */
public class Tiket16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0, harga = 50000;
        double totalMasuk = 0, totalHarga = 0, diskon = 0;
        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk batal): ");
            int tiket = sc.nextInt();
            if (tiket == 0) {
                System.out.println("Pembelian dibatalkan");
                break;
            }
            if (tiket < 0) {
                System.out.println("Jumlah tidak valid. Mohon masukkan ulang");
                continue;
            }
            totalHarga = tiket * harga;
            if (tiket > 4) {
                if (tiket > 10) {
                    diskon = 0.15;
                } else
                diskon = 0.1;
            }
            System.out.println("Harga: Rp " + totalHarga);
            System.out.println("Diskon: " + diskon);
            totalHarga = totalHarga - (totalHarga * diskon);
            System.out.println("Total harga: Rp " + totalHarga);
            totalTiket += tiket;
            totalMasuk += totalHarga;
        } while (true);
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pemasukan: Rp " + totalMasuk);
    }
}