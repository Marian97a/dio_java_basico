
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US
        );
        System.out.println(" Por favor, digite o nome cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println(" Por favor, digite o numero da agencia ");
        String agencia = scanner.nextLine();

        System.out.println(" Por favor, digite o numero da conta ");
        int numeroConta = scanner.nextInt();

        System.out.println(" Por favor, digite o saldo da sua conta");
        Double saldoConta = scanner.nextDouble();

        System.out.println("Ola, " + nomeCliente + " Seu numero da conta é " + numeroConta + " e o da agencia é "
                + agencia + " e seu saldo pronto para saque e de R$ " + saldoConta + "(reais) ");

        scanner.close();

    }

}
