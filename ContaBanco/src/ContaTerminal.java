import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero = 0;
        String agencia = "NULL";
        String nomeCliente = "NULL";
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da agencia: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome da agencia: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo do cliente: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
