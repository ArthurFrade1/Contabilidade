package logica;

public abstract class Conta implements Passivo{
    protected int dia=10;
    protected int mes=10;
    protected double valor=0;

    public void setValor(double val) {
        valor=val;
    }
}