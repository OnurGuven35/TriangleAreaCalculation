// Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner circum = new Scanner(System.in);

        int a, b, c, u;
        double alan;

        // İlk olarak kullanıcıdan üçgenin kenarlarıını alıyoruz.

        System.out.println();
        System.out.print("1. Kenari Giriniz : ");
        a = circum.nextInt();
        System.out.print("2. Kenari Giriniz : ");
        b = circum.nextInt();
        System.out.print("3. Kenari Giriniz : ");
        c = circum.nextInt();

        // Daha sonra üçgen alan formüllerini yazarak alanı ekrana yazdırıyoruz.

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println();
        System.out.println("Kenarlari Verilen Ucgenin Alani : " + alan);

    }
}
