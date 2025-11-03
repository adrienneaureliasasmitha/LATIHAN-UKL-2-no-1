import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
  Scanner input = new Scanner(System.in);
  
        System.out.println("=== PROGRAM MENGHITUNG FAKTORIAL ===");
        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = input.nextInt();

        // Mengecek apakah bilangan valid (positif)
        if (angka < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;

            // Perulangan untuk menghitung faktorial
            for (int i = 1; i <= angka; i++) {
                faktorial *= i;
            }

            // Menampilkan hasil
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Bilangan : " + angka);
            System.out.println("Faktorial: " + faktorial);
        }

        input.close();
    }
}
