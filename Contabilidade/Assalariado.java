
public class Assalariado extends Empregado{
    private double horasExtras;

    public double getValorAPagar(int diaPagto, int MesPagto){
        return Salario + horasExtras*Hora;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }
    public double getHorasExtras() {
        return horasExtras;
    }
}

