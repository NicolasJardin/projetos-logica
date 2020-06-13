import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\fDigite o nome do aluno:");
        aluno.setNome(scanner.next());
        System.out.println("Digite a nota 1:");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite a nota 2:");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite o total de aulas:");
        aluno.setTotalDeAulas(scanner.nextDouble());
        System.out.println("Digite o total de presenças:");
        aluno.setNumeroDePresencas(scanner.nextInt());
        System.out.println(aluno);
    }
}