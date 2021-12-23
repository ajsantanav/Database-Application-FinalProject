package edu.citytech.cst.s23370098.abcCounter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

import java.io.IOException;

public class MasterController {

    @FXML
    private MenuBar menuBar;
    public void getFXML(Stage stage, String title, String location) {

        stage.setTitle(title);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(location));
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void item1(ActionEvent event) {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        getFXML(stage,"title one", "/fxml/ABCCounterView.fxml");
    }

    @FXML
    void item2(ActionEvent event) {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        getFXML(stage, "title two", "/fxml/CustomerPurchasesView.fxml");
    }

    @FXML
    void item3(ActionEvent event) {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        getFXML(stage, "title three", "/fxml/SearchByIdView.fxml");
    }

    @FXML
    void item4(ActionEvent event) {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        getFXML(stage,"title four", "/fxml/FinalGradeView.fxml");
    }

    @FXML
    void item5(ActionEvent event) {
        Stage stage = (Stage) menuBar.getScene().getWindow();
        getFXML(stage,"title five", "/fxml/BarChartView.fxml");
    }
}
