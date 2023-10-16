import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;

        System.out.println("Digite o número da conta: ");
        numeroConta = entrada.nextInt();

        System.out.println("Digite a agência(Digite com o - : ");
        numeroAgencia = entrada.next();

        entrada.nextLine();

        System.out.println("Digite o nome completo: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Digite o saldo que irá depositar: ");
        double saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, numeroAgencia, numeroConta, saldo);

}
}
