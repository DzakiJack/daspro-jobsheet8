import java.util.Scanner;

public class Tugas307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        int i = 1;
        int seluruhBarang = 0;
        int maxBarang = 0;       
        int tokoTerbanyak = 0;  

        while (i <= jumlahToko) {
            System.out.println("\nToko " + i);
            System.out.print("Masukkan jumlah pelanggan: ");
            int pelanggan = sc.nextInt();
            
            int totalBarangToko = 0; 
            int j = 1;
            while (j <= pelanggan) {
                System.out.print("Masukkan jumlah barang pelanggan ke-" + j + ": ");
                int barangPelanggan = sc.nextInt();
                totalBarangToko += barangPelanggan; 
                j++;
            }
            seluruhBarang += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = i;
            }
            i++;
        }
        System.out.println("\nTotal barang seluruh toko: " + seluruhBarang);
        System.out.println("Toko dengan barang terbanyak: Toko " + tokoTerbanyak + " (dengan " + maxBarang + " barang)");
        sc.close();
    }
}