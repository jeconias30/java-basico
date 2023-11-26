public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepIncalidoException e) {
            // TODO: handle exception
            e.printStackTrace();
        }   
    }
     static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();

            // simulando um cep Formatado
            return "23.765-064";
    }
}
