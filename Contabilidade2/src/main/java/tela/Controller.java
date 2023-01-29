package tela;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import logica.*;

public class Controller implements Initializable{

  
    private Empregado T1;
    private Conta T2;
    private ArrayList<Passivo> gastos = new ArrayList<>();
    private ArrayList<Empregado> funcionarios = new ArrayList<>();
    private ArrayList<Conta> contas = new ArrayList<>();

   
    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnNovo;

    

    @FXML
    private Button btnSair;

    @FXML
    private Button btnCalc;

    @FXML
    private RadioButton Concessionaria;

    @FXML
    private RadioButton Titulo;

    @FXML
    private RadioButton Terceirizado;

    @FXML
    private RadioButton Comissionado;

    @FXML
    private RadioButton AssalariadoComissionado;

    @FXML
    private RadioButton Assalariado;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;
    
    @FXML
    private TextField Txt1;

    @FXML
    private TextField Txt2;

    @FXML
    private TextField Txt3;

    @FXML
    private TextField Txt4;

    @FXML
    private TextField Txt5;

    @FXML
    private TextField Txt6;

    @FXML
    private TextField Txt7;

    @FXML
    private TextField TxT1;

    @FXML
    private TextField TxT2;

    @FXML
    private TextField TxT3;

    
    private TextField[] txt= new TextField[12];
   


    private boolean vai1, vai2;

    @FXML
    void TituloIS(ActionEvent event) {
        vai1=true;
        vai2=false;
    
    }

    @FXML
    void concessionariaIS(ActionEvent event) {
        vai2=true;
        vai1=false;
    }

    @FXML
    void novoClick(ActionEvent event) {
        if(vai1){
            try{
                String[] str=txt[0].getText().split("/");
                T2=new Titulo(); 
                T2.setValor(Double.parseDouble(txt[1].getText()));
                ((Titulo)T2).setData(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
                contas.add(T2);
                gastos.add(T2);
                msgAdd();
            }
            catch(Exception e){
                msgErro("Data no formato _/_/_ \nValor");
            }
            
        }
        if(vai2){
            try{
                T2=new Concessionaria();    
                T2.setValor(Double.parseDouble(txt[1].getText()));
                contas.add(T2);
                gastos.add(T2);
                msgAdd();
            }
            catch(Exception e){
                msgErro("Valor");
            }
        }
        
    }

    @FXML
    void novoClick2(ActionEvent event) {
        if(Vai1){
            try{
                int num=Integer.parseInt(txt[5].getText());   
                T1=new Terceirizado();
                ((Terceirizado)T1).setHorasTrabalhadas(num);
                funcionarios.add(T1);
                gastos.add(T1);
                msgAdd();
            }
            catch(Exception e){
                msgErro("Nome \nSobrenome \nNúm.Identidade \nHoras Trabalhadas");
            }
        }
        if(Vai2){
            try{
                int num=Integer.parseInt(txt[7].getText());   
                T1=new Comissionado();
                ((Comissionado)T1).setvalorVendas(num);
                funcionarios.add(T1);
                gastos.add(T1);
                msgAdd();
            }
            catch(Exception e){
                msgErro("Nome \nSobrenome \nNúm.Identidade \nTotal em Vendas");
            }
           
        }
        if(Vai3){
            try{
                int num=Integer.parseInt(txt[7].getText());   
                double num2=Double.parseDouble(txt[8].getText());   
                T1=new AssalariadoComissionado();
                ((AssalariadoComissionado)T1).setvalorVendas(num);
                ((AssalariadoComissionado)T1).setPercentualBonus(num2);
                funcionarios.add(T1);
                gastos.add(T1);
                msgAdd();
            }
            catch(Exception e){
                msgErro("Nome \nSobrenome \nNúm.Identidade \nTotal em Vendas\nBonus");
            }
        }
        if(Vai4){
            try{
                int num=Integer.parseInt(txt[6].getText());  
                T1=new Assalariado();
                ((Assalariado)T1).setHorasExtras(num);
                funcionarios.add(T1);
                gastos.add(T1);
                msgAdd();
            }
            catch(Exception e){
                msgErro("Nome \nSobrenome \nNúm.Identidade \nHoras-Extras");
            }
        }
        
    }

    @FXML
    void calcClick(ActionEvent event) {
        int soma=0, soma2=0, soma3=0;
        for(Passivo P: gastos){
            soma+=P.getValorAPagar();
        }
        for(Conta C: contas){
            soma2+=C.getValorAPagar();
        }
        for(Empregado E: funcionarios){
            soma3+=E.getValorAPagar();
        }
        
        txt[9].setText(""+soma2);
        txt[10].setText(""+soma3);
        txt[11].setText(""+soma);
    }

    private boolean Vai1, Vai2, Vai3, Vai4;

    @FXML
    void TerceirizadoIS(ActionEvent event) {
        Vai1=true;
        Vai2=false;
        Vai3=false;
        Vai4=false;
    }

    @FXML
    void ComissionadoIS(ActionEvent event) {        
        Vai1=false;
        Vai2=true;
        Vai3=false;
        Vai4=false;
    
    }

    @FXML
    void AssalariadoComissionadoIS(ActionEvent event) {
        Vai1=false;
        Vai2=false;
        Vai3=true;
        Vai4=false;
    
    }

    @FXML
    void AssalariadoIS(ActionEvent event) {
        Vai1=false;
        Vai2=false;
        Vai3=false;
        Vai4=true;
    
    }

    @FXML
    void btnLimparClick(ActionEvent event) {
        for(int cont=0; cont<2; cont++)
            txt[cont].setText("");
    }

    @FXML
    void btnLimpar2Click(ActionEvent event) {
        for(int cont=2; cont<9; cont++)
            txt[cont].setText("");
    }

    @FXML
    void SairClick(ActionEvent event) {
        System.exit(0);
    }

    public void msgErro(String str){
        JOptionPane.showMessageDialog(null, "Insira informações nos campos:\n"+str, "ERRO", JOptionPane.ERROR_MESSAGE);

    }
    public void msgAdd(){
        JOptionPane.showMessageDialog(null, "Adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     
        txt[0]=txt1;
        txt[1]=txt2;
        txt[2]=Txt1;
        txt[3]=Txt2;
        txt[4]=Txt3;
        txt[5]=Txt4;
        txt[6]=Txt5;
        txt[7]=Txt6;
        txt[8]=Txt7;
        txt[9]=TxT1;
        txt[10]=TxT2;
        txt[11]=TxT3;
    
        
    }
}
