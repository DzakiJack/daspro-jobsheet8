import java.util.Scanner;

public class Tugas207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Nilai n harus lebih besar dari 3");
            }
        } while (n < 3);

        int hasil = 0;
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int perkalian = j * i;
                System.out.printf("%-4d", perkalian); //Saya mencari di google cara membuat jarak agar rapi

                hasil += perkalian;
                j++;

            }
            System.out.println();
            i++;
        }
        System.out.println("Jumlah seluruh angka: " + hasil);


        sc.close();
    
        }
        
    }

