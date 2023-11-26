import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
        // Criando um Objeto Scanner
        
        Scanner saidaDados = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite seu nome: ");
        String nome = saidaDados.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = saidaDados.next();

        System.out.println("Digite sua idade: ");
        int idade = saidaDados.nextInt();

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(idade);

        /*exeçoes que podem acontecer
         * 
         * Nao informar o nome e sobrenome
         * O valor da idade ter uma caractere NAO numerico
         * O valor da altura ter uma virgula ou inves de ser ponto (conforme o padrao americano)
         * try{entrada do codigo para tratamento}
         * catch(entrada do erro){ saida informando o erro}
        */}catch(InputMismatchException e){
            System.out.println("Os campos: Idade e altura devem ser numericos.");
        }

    }
}
