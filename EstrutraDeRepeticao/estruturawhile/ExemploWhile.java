package estruturawhile;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        /* Estrutura de controle de fluxo while
         * 
         * While (expressao booleana de validação)
         * {
         *      comando que sera executado ate que 
         *      a expressao de validação torne-se falsa.
         * }
         */
        double mesada = 50.0;
        // usando o while "enquanto."
        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce dovalor: "+valorDoce+ " Adicionado no carrinho ");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Joaozinho gastou toda sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
