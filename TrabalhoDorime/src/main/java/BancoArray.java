import java.util.ArrayList;
import java.util.List;

/**
 * @author Nicólas
 * @version 1.0
 * @since 06/06/2020 - 15:17
 */
public class BancoArray implements BancoArrayInterface{

    List<Produto> agenda;

    public BancoArray() {
        agenda = new ArrayList<>();
    }

    @Override
    public void cadastrar(Produto produto) {
        this.agenda.add(produto);
    }

    @Override
    public List<Produto> buscar() {
        return this.agenda;
    }

    @Override
    public void excluir(int index) {
        this.agenda.remove(index);
    }

    @Override
    public void alterar(int index, Produto produto) {
        this.agenda.add(index, produto);
    }

    @Override
    public Produto filtrar(Produto produto, int filtro) {
        switch(filtro) {
            case 1:
                for(Produto produtoAuxiliar : this.agenda) {
                    if(produtoAuxiliar.getNome().contains(produto.getNome())) {
                        return produtoAuxiliar;
                    }
                }
                break;
            case 2:
                for(Produto produtoAuxiliar : this.agenda) {
                    if(produtoAuxiliar.getClassificacao().contains(produto.getClassificacao())) {
                        return produtoAuxiliar;
                    }
                }
                break;
            case 3:
                for(Produto produtoAuxiliar : this.agenda) {
                    if(produtoAuxiliar.getDataDeValidade().contains(produto.getDataDeValidade())){
                        return produtoAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.agenda.size();
    }

    @Override
    public void apagarAgenda() {
        this.agenda.clear();
    }
}
