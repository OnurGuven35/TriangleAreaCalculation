import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        int a, b, c, u;
        double alan;

        Scanner circum = new Scanner(System.in);

        System.out.print("Birinci Kenari Giriniz : ");
        a = circum.nextInt();
        System.out.print("Ikinci Kenari Giriniz : ");
        b = circum.nextInt();
        System.out.print("Ucuncu Kenari Giriniz : ");
        c = circum.nextInt();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Kenarlari Verilen Ucgenin Alani : " + alan);

    }
}
