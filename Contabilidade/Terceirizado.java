public class Terceirizado extends Empregado{
    private double horasTrabalhadas;

    public double getValorAPagar(int diaPagto, int MesPagto){
        return horasTrabalhadas*Hora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
}



