import java.util.Scanner;

public class EntradaSaiaLendoePulandoNomes {

        /* Desafio
Faça um programa com as características abaixo:

Leia 10 nomes, sem espaço em branco;
Imprima o terceiro nome da lista;
Imprima o sétimo nome da lista;
Imprima o nono nome da lista.
Entrada
A entrada consiste vários arquivos de teste, cada um com dez linhas e em cada linha tem um nome de no até 30 caracteres e sem espaço em branco. Conforme mostrado no exemplo de entrada a seguir.

Saída
Para cada arquivo da entrada, terá um arquivo de saída. E como mencionado no Desafio, gere três linhas conforme os procedimentos 2, 3 e 4. Use o exemplo abaixo para clarear o que está sendo pedido.

 
Exemplos de Entrada	Exemplos de Saída
USP

UFPE

UFCG

UFRN

UFRJ
IME

ITA

UNIOESTE

URI

UFG

UFCG*/


// resposta

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];
        
        for(int i=0 ; i<10 ; i++)
            nomes[i] = sc.nextLine().trim();
            
            // imprimindo o terceiro nome
            System.out.println(nomes[2]);
            
            // imprimindo o sétimo nome
            System.out.println(nomes[6]);
            
            // imprimindo o nono nome
            
            System.out.println(nomes[8]);
    }
    
        
}