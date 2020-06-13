/**
 * @author Nicólas
 * @version 1.0
 * @since 01/06/2020 - 00:44
 */
public class Principal {
    public static void main(String args[]) {
        Aluno aluno = new Aluno();
        
        aluno.setNome("Ze");
        aluno.setNota1(8.6);
        aluno.setNota2(7.2);
        aluno.setTotalAulas(6);
        aluno.setNumeroPresencas(5);
        
        System.out.println(aluno);
        
    }
}