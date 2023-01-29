package logica;

public class Assalariado extends Empregado{
    private double horasExtras;

    public double getValorAPagar(){
        return Salario + horasExtras*Hora;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

}

