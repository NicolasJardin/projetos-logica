public class ContaPoupanca extends Conta {
    
    
    public ContaPoupanca(String titularContaPoupanca,String numeroContaPoupanca,String agenciaContaPoupanca,
                         double saldoContaPoupanca) {
        this.titular = titularContaPoupanca;
        this.numero = numeroContaPoupanca;
        this.agencia = agenciaContaPoupanca;
        this.saldo = saldoContaPoupanca;
    }
    
    @Override
    public double sacar() {
        return saldo;
    }
    
    @Override
    public double depositar() {
        return saldo;
    }
    
    public double gerarExtrato() {
        return saldo * 1.04;
    }
    
    @Override
    public String toString() {
        return "Titular: " + this.titular
             + "\nNumero de telefone: " + this.numero
             + "\nAgencia: " + this.agencia
             + "\nSaldo: " + this.saldo
             + "\nSacar: " + this.sacar()
             + "\nDepositar: " + this.depositar()
             + "\nGerar extrato: " + this.gerarExtrato();
    }
    
}