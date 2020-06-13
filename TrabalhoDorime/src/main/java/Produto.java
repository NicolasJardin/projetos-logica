/**
 * @author Nicólas
 * @version 1.0
 * @since 06/06/2020 - 14:27
 */
public class Produto {

    private String nome;
    private String classificacao;
    private String dataDeValidade;
    private double valor;
    private int quantidade;

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     *
     * @return Retorna o valor da compra (quantidade * valor)
     */
    public double calcularCompra() {
        return this.quantidade * this.valor;
    }

    @Override
    public String toString() {
        return "Produto: "
             + "\nNome: " + nome
             + "\nClassificação: " + classificacao
             + "\nData de validade: " + dataDeValidade
             + "\nValor: " + valor
             + "\nQuantidade: " + quantidade
             + "\nValor da compra: " + calcularCompra();
    }
}
