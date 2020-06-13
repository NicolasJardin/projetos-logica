/**
 * @author Nicólas
 * @version 1.0
 * @since 01/06/2020 - 00:07
 */

public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;
    private double totalAulas;
    private double numeroPresencas;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double getTotalAulas() {
        return this.totalAulas;
    }
    
    public void setTotalAulas(double totalAulas) {
        this.totalAulas = totalAulas;
    }
    
    public double getNumeroPresencas() {
        return this.totalAulas;
    }
    
    public void setNumeroPresencas(double numeroPresencas) {
        this.numeroPresencas = numeroPresencas;
    }
    
    /**
     * @return Retorna o numero de presenças do aluno
     */
    public double calcularFrequencia() {
        return (this.numeroPresencas/this.totalAulas)*100;
    }
    
    /**
     * @return Retorna a media do aluno
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    /**
     * @return Retorna se o aluno está aprovado ou reprovado considerando apenas a media do aluno
     */
    public String verificarAprovacao() {
        if(this.calcularMediaAritmetica() >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }
    
    /**
     * @return Retorna se o aluno está aprovado ou reprovado considerando a media e a frequencia do aluno
     */
    public String verificarAprovacaoMediaEFrequencia() {
        if(this.calcularMediaAritmetica() >= 6 && this.calcularFrequencia() >= 75) {
            return "Aprovado";
        }
        return "Reprovado";
    }
    
    /**
     * @return Retorna o conceito do aluno, podendo ser: A,B,C ou D
     */
    public String verificarConceito() {
        if(this.calcularMediaAritmetica() >= 9 && this.calcularMediaAritmetica() <= 10) {
            return "A";
        } else if(this.calcularMediaAritmetica() >= 7 && this.calcularMediaAritmetica() < 9) {
            return "B";
        } else if(this.calcularMediaAritmetica() >= 6 && this.calcularMediaAritmetica() < 7) {
            return "C";
        }
        return "D";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2             
             + "\nNúmero de presenças: " + this.numeroPresencas
             + "\nTotal de aulas: " + this.totalAulas
             + "\nMédia: " + this.calcularMediaAritmetica()              
             + "\nFrequência: " + this.calcularFrequencia();
    }
    

    
}