/**
 * @author Nicólas
 * @version 1.0
 * @since 31/05/2020 - 11:27 
 */

public class Mes {
    
    private int mes;
    
    public Mes() {
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * @return Retorna o respectivo mês escrito.
     * O usuario digita um número e o metodo retorna o mes respectivo
     */
    public String validarMes() {
        switch(this.mes) {
            
            case 1: return"Janeiro";
            case 2: return "Fevereiro";
            case 3: return "Março";
            case 4: return "Abril";
            case 5: return "Maio";
            case 6: return "Junho";
            case 7: return "Julho";
            case 8: return "Agosto";
            case 9: return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
    }
    
    @Override
    public String toString() {
        return this.validarMes();
    }
    
    
    
}