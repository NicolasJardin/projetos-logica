import java.util.List;
/**
 * @author Nicólas
 * @version 1.0
 * @since 06/06/2020 - 15:10
 */
public interface BancoArrayInterface {

    public void cadastrar(Produto produto);
    public List<Produto> buscar();
    public void excluir(int index);
    public void alterar(int index, Produto produto);
    public Produto filtrar(Produto produto, int filtro);
    public int verificarQuantidade();
    public void apagarAgenda();
}
