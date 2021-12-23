package edu.citytech.cst.s23370098.finalgrade;

import edu.citytech.cst.s23370098.abcCounter.MasterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FinalGradeMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        new MasterController().getFXML(stage, "title four",
                "/fxml/FinalGradeView.fxml");


//        String name = "FinalGradeView.fxml";
//        Parent root = FXMLLoader.load(getClass().getResource(name));
//        stage.setScene(new Scene(root,361,206));
//        stage.show();
    }
}