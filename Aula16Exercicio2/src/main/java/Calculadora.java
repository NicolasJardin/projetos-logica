/**
 * @author Nicólas
 * @version 1.0
 * @since 6/3/2020 - 12:58
 */
public class Calculadora {

    public Calculadora() {
    }

    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /**
     *
     * @return Soma numero1 + numero2
     */
    public double calcularSoma() {
        return this.numero1 + this.numero2;
    }

    /**
     *
     * @return Retorna o numero1 - numero2;
     */
    public double calcularSubtracao() {
        return this.numero1 - this.numero2;
    }

    /**
     *
     * @return Retorna o numero1 * numero2;
     */
    public double calcularMultiplicacao() {
        return this.numero1 * this.numero2;
    }

    /**
     *
     * @return Retorna o numero1 / numero2;
     */
    public double calcularDivisao() {
        return this.numero1 / this.numero2;
    }

    public String escolherOperacao(int opcaoOperacao) {
        switch (opcaoOperacao) {
            case 1: return "Soma: " + this.calcularSoma();
            case 2: return "Subtração: " + this.calcularSubtracao();
            case 3: return "Multiplicação: " + this.calcularMultiplicacao();
            case 4: return "Divisão: " + this.calcularDivisao();
            case 5: return toString();
            case 6: System.exit(0);
            return null;
            default: return "Opção inválida";
        }
    }

    /**
     *
     * @return Retorna as porrinha de um toString normal po
     */
    @Override
    public String toString() {
        return "\nNumero1: " + numero1
             + "\nNumero2: " + numero2
             + "\nSoma: " + this.calcularSoma()
             + "\nSubtração: " + this.calcularSubtracao()
             + "\nMultiplicação: " + this.calcularMultiplicacao()
             + "\nDivisão: " + this.calcularDivisao();
    }
}
