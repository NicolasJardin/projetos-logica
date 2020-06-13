import java.util.Scanner;

public class Principal {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\fDigite o nome do titular:");
        String titularContaCorrente = scanner.nextLine();
        System.out.println("Digite o numero de telefone: ");
        String numeroContaCorrente = scanner.nextLine();
        System.out.println("Digite o nome da agencia:");
        String agenciaContaCorrente = scanner.nextLine();
        System.out.println("Digite o seu saldo:");
        double saldoContaCorrente = scanner.nextDouble();
        System.out.println("Digite a taxa:");
        double taxa = scanner.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(titularContaCorrente, numeroContaCorrente, agenciaContaCorrente, 
                                                        saldoContaCorrente, taxa );
        System.out.println(contaCorrente);
        
        
        System.out.println("\nDigite o nome do titular:");
        String titularContaPoupanca = scanner.next();
        System.out.println("Digite o numero de telefone: ");
        String numeroContaPoupanca = scanner.next();
        System.out.println("Digite o nome da agencia:");
        String agenciaContaPoupanca = scanner.next();
        System.out.println("Digite o seu saldo:");
        double saldoContaPoupanca = scanner.nextDouble();
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(titularContaPoupanca, numeroContaPoupanca, agenciaContaPoupanca, 
                                                        saldoContaPoupanca);
        System.out.println(contaPoupanca);
    }
}