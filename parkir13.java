import java.util.Scanner;
public class parkir13 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1: mobil, 2: motor, 0: tidak valid): ");
            jenis = sc.nextInt();

            if (jenis == 1) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                total = durasi * 3000;
                System.out.println("Total pembayaran: Rp. " + total);

            } else if(jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                total = durasi * 2000;
                System.out.println("Total pembayaran: Rp. " + total);
            }
        } while (jenis != 0);
            System.out.println("Kendaraan tidak valid! silahkan input ulang.");
            sc.close();
        
    
    }
}
