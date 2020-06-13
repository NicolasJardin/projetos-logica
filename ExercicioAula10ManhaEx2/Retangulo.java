public class Retangulo implements FiguraGeometricaInterface {

    private double altura;
    private double base;
    private String nomeFigura;
    
     @Override
    public String getNomeFigura() {
        return this.nomeFigura;
    }
    
    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }
    
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return (this.base + this.altura) * 2;
    }
    
    @Override
    public String toString() {
        return "\nBase do retangulo: " + this.base
             + "\nAltura do retangulo: " + this.altura
             + "\nNome da figura: " + this.nomeFigura
             + "\nCalculo da area: " + this.calcularArea()
             + "\nCalculo do perimetro: " + this.calcularPerimetro();
    }
}