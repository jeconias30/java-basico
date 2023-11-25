package estruturawhile;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        /* Estrutura do controle de fluxo do while 
         * 
         * do
         * {
         *      comando que sera executado ate que a
         *      expressao de validação torne-se falsa
         * }
         * while (expressao booleana de validação);
        */
        System.out.println("Discando...");

        // Usando a estrutura de controle
        do {
            // executando repetidas vezes ate alguem atender.
            System.out.println("Telefone tocando");
        }while(tocando());
        System.out.println("Alô !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+ atendeu);
        // negando a ato de continuar tocando
        return ! atendeu;
    }
}
