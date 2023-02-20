import java.util.Scanner;

public class Alg26 {
    public static void main(String[] args) {
        int data, dia, mes, ano, ndata = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite a data no formato DDMMAA: ");

        data = scanner.nextInt();
        scanner.close();

        dia = data / 10000;

        mes = data % 10000 / 100;

        ano = data % 100;

        ndata = mes * 10000 + dia * 100 + ano;

        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("ANO: " + ano);

        System.out.println("Data no formato MMDDAA: " + ndata);
    }
}
