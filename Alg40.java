import java.util.Scanner;

public class Alg40 {
    public static void main(String[] args) {
        int dividendo, divisor;
        Scanner scanner = new Scanner(System.in);

        dividendo = scanner.nextInt();
        divisor = scanner.nextInt();

        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;

        scanner.close();

        System.out.println("dividendo: " + dividendo);
        System.out.println("divisor: " + divisor);
        System.out.println("quociente: " + quociente);
        System.out.println("resto: " + resto);
}
}
