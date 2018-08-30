package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Controller {

    @FXML
    private Label scoreLabel;

    @FXML
    private TextField heightField;

    @FXML
    private TextField weightField;


    @FXML
    private void handleButtonAction(ActionEvent event){
        System.out.println("Kliknięto przycisk");

        double height  = Integer.parseInt(heightField.getText())/100.0;
        int weight =Integer.parseInt(weightField.getText());

        double score = weight/(height*height);

        scoreLabel.setText(String.format("Wskaznik BMI wynosi: %.2f",score));
    }


}

