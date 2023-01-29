

import java.util.ArrayList;

public class ControlePagamento {
    private ArrayList<Passivo> pagamentos=new ArrayList<Passivo>();
    public void adicionar(Passivo a){
        pagamentos.add(a);
        
    }
    public ArrayList<Passivo> getPagamentos() {
        return pagamentos;
    }
    
}