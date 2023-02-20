import java.util.Scanner;

public class Alg41 {
    public static void main(String[] args) {
        double a, b, c, d, mp = 0.0;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();

        mp = (a * 1 + b * 2 + c * 3 + d * 4) / 10;

        System.out.println("media ponderada: " + mp);

        scanner.close();
    }
}
