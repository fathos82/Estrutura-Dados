import java.util.Scanner;
public class Alg23{
    public static void main(String[] args) {
        int a , d = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite um numero de 3 casas:");
        a = scanner.nextInt();
        d = a % 100 / 10;
        System.out.println("\nalgarismo da casa das dezenas: "+d+"\n");
        scanner.close();
    }


}