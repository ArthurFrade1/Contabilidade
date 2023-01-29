import javax.management.timer.TimerNotification;
import javax.sound.sampled.SourceDataLine;

import java.util.ArrayList;

public class SistemaPagamentoTeste {
    public static void main(String[] args){
        ControlePagamento Controle = new ControlePagamento();
        int soma=0;
        //PAGAMENTOS
        Passivo T1=  new Titulo();
        Controle.adicionar(T1);
        Passivo T2=  new Terceirizado();
        ((Terceirizado)T2).setHorasTrabalhadas(10);
        Controle.adicionar(T2);
        Passivo T3=  new Comissionado();
        ((Comissionado)T3).setvalorVendas(200);
        Controle.adicionar(T3);
        Passivo T4=  new Assalariado();
        ((Assalariado)T4).setHorasExtras(20);
        Controle.adicionar(T4);
        Passivo T5=  new AssalariadoComissionado();
        ((AssalariadoComissionado)T5).setPercentualBonus(20);
        Controle.adicionar(T5);
        Passivo T6=  new Concessionaria();
        Controle.adicionar(T6);


        ArrayList <Passivo> pagamentos = Controle.getPagamentos();
        for (Passivo b: pagamentos)
            soma+=b.getValorAPagar(11, 0);
        System.out.println("Valor total a ser pago: "+soma);
        System.out.println("Valor total a ser pago pelos funcionarios: "+(T3.getValorAPagar(11, 0)+T2.getValorAPagar(11, 0)+T4.getValorAPagar(11, 0)+ T5.getValorAPagar(11, 0)));
        System.out.println("Valor total a ser pago para as contas:" +(T1.getValorAPagar(11, 0)+T6.getValorAPagar(11, 0)));
    }

    
}

