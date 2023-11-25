package estruturafor;

public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break; // tambem podemos usar o continue
                       // Continue so muda o fluxo.
            System.out.println(numero);
        }

        System.out.println("Parou!");
    }
}
