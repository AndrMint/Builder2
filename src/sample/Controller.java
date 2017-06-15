package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.Random;




public class Controller {
    @FXML
    private TextField input;

    @FXML
    private Label text;

    private int count =0;


    public void guessTheNumber(ActionEvent action){                     //integer.ValueOf system.exit

        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;


        String defaultValue = input.getText();

        int randomKazkas = 0;
        try {
            randomKazkas = Integer.parseInt(defaultValue);
        }catch (NumberFormatException e){
            count++;
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("ka dirbi...");
            if (count == 5){
                alert.setContentText("matau i galva nori");
            }
            alert.show();
        }





        if(randomNumber == randomKazkas){
            text.setText("Atspejai, skaicius buvo " + randomNumber);
        }else{
            text.setText("Neatspejai");
        }

    }

    public void stopButton(ActionEvent action1){
System.exit(0);
    }




}
