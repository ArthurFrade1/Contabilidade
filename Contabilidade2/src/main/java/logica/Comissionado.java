package logica;

public class Comissionado extends Empregado{
    public double valorVendas;

    public double getValorAPagar(){
        return valorVendas*0.06;
    }

    public void setvalorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    } 
}

