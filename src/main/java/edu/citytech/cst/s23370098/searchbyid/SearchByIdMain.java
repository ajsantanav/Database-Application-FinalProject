package edu.citytech.cst.s23370098.searchbyid;

import edu.citytech.cst.s23370098.abcCounter.MasterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SearchByIdMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        new MasterController().getFXML(stage, "title three",
                "/fxml/SearchByIdView.fxml");


//        String name = "SearchByIdView.fxml";
//        Parent root = FXMLLoader.load(getClass().getResource(name));
//        stage.setScene(new Scene(root));
//        stage.setTitle("Search by Id by Adrian Santana");
//        stage.show();
    }
}