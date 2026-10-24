import java.util.Scanner;
public class bioskop13 {
    public static void main(String[] args) {
        int hargaTiket = 50000, jumlahTiket, totalTiketTerjual = 0;
        double totalPendapatan = 0, subTotal, diskon, totalBayar;
        char pilihanUlang = 'y';

        Scanner sc = new Scanner(System.in);

        System.out.println("---Penjualan Tiket Bioskop---");
        
        while (pilihanUlang =='y' || pilihanUlang =='Y') {
            do{
                System.out.print("Masukkan jumlah tiket yang dibeli: ");
                jumlahTiket = sc.nextInt();

                if (jumlahTiket < 0) {
                    System.out.print("Jumlah tiket tidak valid.");
                }
            } while (jumlahTiket < 0);

            if (jumlahTiket > 10){
                diskon = 0.15;
            } else if (jumlahTiket > 4){
                diskon = 0.10;
            } else{
                diskon = 0.0;
            }
            
            subTotal = jumlahTiket * hargaTiket;
            totalBayar = subTotal - (subTotal * diskon);

            System.out.println("Subtotal : Rp. " + subTotal);
            System.out.println("total bayar : Rp. " + totalBayar);

            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalBayar;

            System.out.println("Apakah ada transaksi lain? (y/n): ");
            pilihanUlang = sc.next().charAt(0);

        }

    System.out.println("---Laporan Penjualan---");
    System.out.println("Total tiket terjual: " + totalTiketTerjual + " Tiket");
    System.out.println("Total pendapatan: Rp. " + totalPendapatan );

    }
}
