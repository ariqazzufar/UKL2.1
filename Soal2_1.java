import java.util.Scanner;

public class Soal2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Hitung Faktorial Bilangan Bulat Positif ===");
        System.out.print("Masukkan bilangan bulat positif: ");
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            // Cek apakah bilangan positif
            if (n < 0) {
                System.out.println("Input tidak valid. Faktorial hanya untuk bilangan bulat positif atau nol.");
            } else {
                long hasilFaktorial = hitungFaktorial(n);
                System.out.printf("Faktorial dari %d adalah: %d\n", n, hasilFaktorial);
            }
        } else {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
        }
        
        scanner.close();
    }

    private static long hitungFaktorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}