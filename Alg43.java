import java.util.Scanner;

public class Alg43 {
    public static void main(String[] args) {
        double num, log;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o logaritmando: ");

        num = scanner.nextDouble();
        log = Math.log(num) / Math.log(10);

        System.out.println("Logaritmo: " + log);

        scanner.close();
    }
}
