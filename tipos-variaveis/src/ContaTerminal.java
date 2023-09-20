import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String agencia;
        String nomeCliente;
        int numero;
        double saldo = 47.59;

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        agencia = entradaDados.next();

        System.out.println("Digite o número da conta: ");
        numero = entradaDados.nextInt();

        //limpa o buffer de memória
        entradaDados.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = entradaDados.nextLine();
        /* 
        Acho que pedir ao usuário para digitar o saldo é um pouco incomum, por isso deixei um valor pré-definido.
        Porém abaixo se encontra o código comentado que permite que o usuário insira seu saldo.
        
        System.out.println("Digite o saldo: ");
        saldo = entradaDados.nextDouble();
        */
        System.out.println("Olá " + nomeCliente +
        ", obrigada por criar uma conta em nosso banco, " +
        "sua agência é " + agencia + ", conta " + numero +
        " e seu saldo " + saldo + " já está disponível para saque.");

    } 
}
