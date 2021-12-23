package edu.citytech.cst.s23370098.customer;

import edu.citytech.cst.s23370098.abcCounter.MasterController;
import javafx.application.Application;
import javafx.stage.Stage;

public class CustomerPurchasesMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        new MasterController().getFXML(stage, "title two",
                "/fxml/CustomerPurchasesView.fxml");

//        String name = "CustomerPurchasesView.fxml";
//        Parent root = FXMLLoader.load(getClass().getResource(name));
//        stage.setScene(new Scene(root));
//        stage.setTitle("Table View by Adrian Santana");
//        stage.show();
    }
}