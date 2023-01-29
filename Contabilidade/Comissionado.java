
public class Comissionado extends Empregado{
    public double valorVendas;

    public double getValorAPagar(int diaPagto, int MesPagto){
        return valorVendas*0.06;
    }

    public void setvalorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
    public double getHorasExtras() {
        return valorVendas;
    }
    
}

