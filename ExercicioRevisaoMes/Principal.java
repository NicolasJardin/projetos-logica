import java.util.Scanner;
/**
 * @author Nicólas
 * @version 1.0
 * @since 31/05/2020 - 11:41
 */
public class Principal {
    public static void main(String args[]) {    
        Mes mes = new Mes();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\fEscolha um mês"
                         + "\n1-Janeiro"
                         + "\n2-Fevereiro"
                         + "\n3-Março"
                         + "\n4-Abril"
                         + "\n5-Maio"
                         + "\n6-Junho"
                         + "\n7-Julho"
                         + "\n8-Agosto"
                         + "\n9-Setembro"
                         + "\n10-Outubro"
                         + "\n11-Novembro"
                         + "\n12-Dezembro");
        mes.setMes(scanner.nextInt());
        System.out.println(mes);
    }
}