import java.util.Scanner;
/**
 * @author Nicólas
 * @version 1.0
 * @since 06/06/2020 - 14:58
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoArray agenda= new BancoArray();
        Produto produto = null;

        int opcao = 0;
        do {
            System.out.println("Escolha a opção desejada: "
                            +  "\n1-Cadastrar"
                            +  "\n2-Visualizar agenda"
                            +  "\n3-Excluir"
                            +  "\n4-Filtrar"
                            +  "\n5-Ver quantidade de produtos"
                            +  "\n6-Limpar agenda"
                            +  "\n7-Sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    produto = new Produto();
                    System.out.println("Digite o nome do produto: ");
                    produto.setNome(scanner.next());
                    System.out.println("Digite a classificação do produto: ");
                    produto.setClassificacao(scanner.next());
                    System.out.println("Digite a data de validade do produto: ");
                    produto.setDataDeValidade(scanner.next());
                    System.out.println("Digite o valor do produto: ");
                    produto.setValor(scanner.nextDouble());
                    System.out.println("Digite a quantidade de produtos");
                    produto.setQuantidade(scanner.nextInt());
                    agenda.cadastrar(produto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    if(agenda.verificarQuantidade() != 0) {
                        agenda.buscar().forEach(System.out::println);
                    } else {
                        System.out.println("Não há produtos no estoque...");
                    }
                    break;
                case 3:
                    if(agenda.verificarQuantidade() != 0) {
                        System.out.println("Digite uma posição para excluir: ");
                        int index = scanner.nextInt();
                        agenda.excluir(index);
                        System.out.println("Produto excluido com sucesso!");
                    } else {
                        System.out.println("Não há produtos para excluir");
                    }
                    break;
                case 4:
                    produto = new Produto();

                    System.out.println("Escolha de qual forma você dedeja filtrar: "
                                    +  "\n1-Nome"
                                    +  "\n2-Classificação"
                                    +  "\n3-Data de validade");
                    int opcaoFiltro = scanner.nextInt();
                    switch(opcaoFiltro) {
                        case 1:
                            System.out.println("Digite o nome do produto que deseja filtrar: ");
                            produto.setNome(scanner.next());
                            produto = agenda.filtrar(produto, 1);
                            System.out.println(produto != null ? produto : "Produto não encontrado!");
                            break;
                        case 2:
                            System.out.println("Digite a clasificação do produto: ");
                            produto.setClassificacao(scanner.next());
                            produto = agenda.filtrar(produto, 2);

                            System.out.println(produto != null ? produto : "Produto não encontrado!");
                            break;
                        case 3:
                            System.out.println("Digite a data de validade do produto: ");
                            produto.setDataDeValidade(scanner.next());
                            produto = agenda.filtrar(produto, 3);
                            System.out.println(produto != null ? produto : "Produto não encontrado");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Há " + agenda.verificarQuantidade() + " Produto(s)");
                    break;
                case 6:
                    agenda.apagarAgenda();
                    System.out.println("Agenda apagada com sucesso!");
                    break;
                case 7:
                    System.exit(0);
                    break;
            }

        } while(opcao != 7);
    }
}
