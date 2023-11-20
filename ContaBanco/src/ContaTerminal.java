import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO : Conhecer e importar as classes Scanner

        // Exibir as mensagens para o nosso Usuario

        // Obter pela Scanner os valores digitados no terminal.

        // exibir a mensagem conta criada.
        Scanner usuario = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;
        

        System.out.println("----Vamos criar uma conta----");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("Por favor, diga seu nome: ");
        // Nome do novo usuário
        nomeCliente = usuario.next();
        System.out.println("Por favor, digite o número da agência: ");
        //informando o numero da agencia
        agencia = usuario.next();
        System.out.println("Informe o número de usuário: ");
        //informando o numero da conta
        numero = usuario.nextInt();

        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======= Muito bem "+nomeCliente+" =========");
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("Para finalizar deposite qualquer valor para render 110% no CDI");

        //colocando um valor para ter saldo positivo em conta
        System.out.println("Isira o valor R$ ");
        saldo = usuario.nextDouble();
        System.out.println("----CONTA FEITA COM SUCESSO----");
        System.out.println("================");
        System.out.println("================");
        System.out.println("================");
        // Mostrando na tela os dados criados.
        System.out.println(nomeCliente+" Sua agencia é "+agencia+" de número "+numero+" com um saldo em conta: R$"+saldo);
    }
}
