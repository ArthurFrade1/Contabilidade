package logica;


public class AssalariadoComissionado extends Comissionado{
    private double PercentualBonus; 
    public double getValorAPagar(int diaPagto, int MesPagto){
        return (valorVendas*(0.06+PercentualBonus))*1.1;
    }
    
    public void setPercentualBonus(double percentualBonus) {
        PercentualBonus = percentualBonus;
    }

}
