
package logica;

public class Terceirizado extends Empregado{
    private double horasTrabalhadas;

    public double getValorAPagar(){
        return horasTrabalhadas*Hora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}



