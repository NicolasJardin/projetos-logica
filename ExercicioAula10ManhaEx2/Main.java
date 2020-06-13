import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        
        Quadrado quadrado = new Quadrado();
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        
        System.out.println("\fEscolha: "
                         + "\n1-Quadrado"
                         + "\n2-Retangulo");
        byte opcaoFiguraGeometrica = scanner.nextByte();
        switch(opcaoFiguraGeometrica) {
            case 1: quadrado.setNomeFigura("Quadrado"); 
            System.out.println("\fDigite o lado do quadrado: ");
            quadrado.setLado(scanner.nextDouble());
            System.out.println(quadrado);
            break;
            case 2: retangulo.setNomeFigura("Retangulo");
                    System.out.println("Digite a base do retangulo: ");
                    retangulo.setBase(scanner.nextDouble());
                    System.out.println("Digite a altura do retangulo: ");
                    retangulo.setAltura(scanner.nextDouble());
                    System.out.println(retangulo);
            break;
            default: System.out.println("Opção inválida");
        }
        

        

        
    } 
}