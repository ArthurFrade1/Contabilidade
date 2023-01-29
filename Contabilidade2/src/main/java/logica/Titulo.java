package logica;

public class Titulo extends Conta{
    private int MesPagto, diaPagto;
   
    public double getValorAPagar(){
        if(MesPagto>this.mes || (diaPagto>this.dia && MesPagto==this.mes)){
            return this.valor*1.1;
        }
        return valor;
    }
   

    public void setData(int diaPagto, int MesPagto){
        this.diaPagto=diaPagto;
        this.MesPagto=MesPagto;
    }
}
