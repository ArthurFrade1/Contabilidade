//Cabeçalho: cabeça de alho
//Arthur Afonso Frade de Aquino e Arthur Miranda Moreira

package com.mycompany.contabilidade2;
        
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
 
public class App extends Application {
    public static void main(String[] args) throws Exception{
    
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
    
        FXMLLoader a = new FXMLLoader(getClass().getResource("arq.fxml"));
        Parent root = a.load();
        Scene tela= new Scene(root);
        primaryStage.setTitle("Contabilidade");  
        primaryStage.setScene(tela);
        primaryStage.show();


    }
}