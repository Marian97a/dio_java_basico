
public class ExemploForArray {

    public static void main(String[] args) {

        //em arrays ondice comeca em 0(Zero)
        /*String alunos[] = {"MARY", "JOSE", "CAROL", "MATEUS"};
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }*/
        String alunos[] = {"MARY", "JOSE", "CAROL", "MATEUS"};
        for(String aluno : alunos)
        System.out.println("Nome do aluno é: " + aluno);
    }

}
