public class ExemploForEmArrys {
    public static void main(String[] args) {
        String alunos[] = {"Jeconias", "Joatan", "Jefta", "Jeremias"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é "+alunos[x]);
        }

        //  Forma abreviada
        for (String aluno : alunos){
            // Para a variavel aluno sera adicionado um novo elemento do arrys alunos
            System.out.println("Nome do aluno é: "+aluno);
        }
    }
}