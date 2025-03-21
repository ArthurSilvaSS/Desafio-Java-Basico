import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da sua agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o numero da sua conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +numeroAgencia+
                ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque");

    }
}