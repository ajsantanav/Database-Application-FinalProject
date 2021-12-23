package edu.citytech.cst.s23370098.abcCounter;

import javafx.application.Application;
import javafx.stage.Stage;

public class ABCCounterMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        new MasterController().getFXML(stage, "title one",
                "/fxml/ABCCounterView.fxml");


//        String name = "ABCCounterView.fxml";
//        Parent root = FXMLLoader.load(getClass().getResource(name));
//        stage.setScene(new Scene(root));
//        stage.setTitle("Counter by Adrian Santana");
//        stage.show();
    }
}