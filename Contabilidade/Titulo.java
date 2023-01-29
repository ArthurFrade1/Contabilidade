
public class Titulo extends Conta{
   
    public double getValorAPagar(int diaPagto, int MesPagto){
        if(MesPagto>this.mes || (diaPagto>this.dia && MesPagto==this.mes)){
            return this.valor*1.1;
        }
        return valor;
    }
}
