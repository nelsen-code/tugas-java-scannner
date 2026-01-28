import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta input alas
        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();

        // Meminta input tinggi
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup Scanner
        input.close();
    }
}
