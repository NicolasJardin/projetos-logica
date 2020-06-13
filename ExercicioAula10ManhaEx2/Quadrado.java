public class Quadrado implements FiguraGeometricaInterface {

    private double lado;
    private String nomeFigura;
    
    public double getLado() {
        return this.lado;
    }
    
    public void setLado(double lado) {
        this.lado = lado;    
    }
    
    @Override
    public String getNomeFigura() {
        return this.nomeFigura;
    }
    
    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return this.lado * 4;
    }
    
    @Override
    public String toString() {
        return "\nLado do quadrado: " + this.lado
             + "\nNome da figura: " + this.nomeFigura
             + "\nCalculo da area: " + this.calcularArea()
             + "\nCalculo do perimetro: " + this.calcularPerimetro();
    }
}