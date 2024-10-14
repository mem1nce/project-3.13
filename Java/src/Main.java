import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını alıyoruz
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        // Ters üçgen çizimi
        for (int i = n; i > 0; i--) {
            // Satır başındaki boşluklar
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();  // Her satırdan sonra bir alt satıra geçiyoruz
        }
    }
}
