import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int opcaoOperacao = 1;
        do {
            System.out.println("Digite o valor do numero 1: ");
            calculadora.setNumero1(scanner.nextDouble());
            System.out.println("Digite o valor do numero 2: ");
            calculadora.setNumero2(scanner.nextDouble());

            System.out.println("Escolha a operação: "
                    + "\n1-Somar"
                    + "\n2-Subtrair"
                    + "\n3-Multiplicar"
                    + "\n4-Dividir"
                    + "\n5-Todos"
                    + "\n6-Sair");
            opcaoOperacao = scanner.nextInt();
            System.out.println(calculadora.escolherOperacao(opcaoOperacao));
        } while (opcaoOperacao != 6);

//        System.out.println(calculadora);
    }
}
