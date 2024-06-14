import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Introdução do programa
        System.out.println("======================================================================================");
        System.out.println("--------------------------------------BANCO PAYMENTS----------------------------------");
        System.out.println("======================================================================================");
        System.out.println("                              Bem-vindo ao Banco Payments                             ");

        //Collhendo dados via terminal
        Scanner conta = new Scanner(System.in);
        System.out.println("Por favor, nos diga seu nome completo: ");
        String nomeCliente = conta.nextLine();
        System.out.println("Agora, "+ nomeCliente +", digite o número da sua agência: ");
        String agencia = conta.nextLine();
        System.out.println("Digite também o número da conta: ");
        int numero = conta.nextInt();
        System.out.println("E para finalizar, digite seu saldo bancário (utilizando a vírgula): ");
        Double saldo = conta.nextDouble();

        System.out.println("======================================================================================");

        //Printando dados colhidos via terminal
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Conta:  " + numero);
        System.out.println("E seu saldo: " + saldo + ", já está disponível para saque!");

    }
}
