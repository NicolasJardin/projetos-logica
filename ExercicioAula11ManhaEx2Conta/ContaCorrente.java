public class ContaCorrente extends Conta {

    private double taxa;
    
    public ContaCorrente(String titularContaCorrente,String numeroContaCorrente,String agenciaContaCorrente,
                         double saldoContaCorrente, double taxa) {
        this.titular = titularContaCorrente;
        this.numero = numeroContaCorrente;
        this.agencia = agenciaContaCorrente;
        this.saldo = saldoContaCorrente;
        this.taxa = taxa;
    }
    
    public double getTaxa() {
        return this.taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
    @Override
    public double sacar() {
        return this.saldo - this.saldo * (this.taxa/100);
    }
    
    @Override
    public double depositar() {
        return this.saldo - this.saldo * (this.taxa/100);
    }
    
    public double gerarExtrato() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + this.titular
             + "\nNumero de telefone: " + this.numero
             + "\nAgencia: " + this.agencia
             + "\nSaldo: " + this.saldo
             + "\nTaxa: " + this.taxa
             + "\nSacar: " + this.sacar()
             + "\nDepositar: " + this.depositar()
             + "\nGerar extrato: " + this.gerarExtrato();
    }
}