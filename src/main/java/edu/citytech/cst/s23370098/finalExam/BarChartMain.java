package edu.citytech.cst.s23370098.finalExam;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.s23370098.abcCounter.MasterController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Map;

public class BarChartMain extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        new MasterController().getFXML(stage,"title five", "/fxml/BarChartView.fxml");


//        String name = "BarChartView.fxml";
//        Parent root = FXMLLoader.load(getClass().getResource(name));
//        stage.setScene(new Scene(root));
//        stage.setTitle("BarChart");
//        stage.show();
    }

}

   /*
       String url = "http://localhost:9215/api/summary/:year/";
        url = url.replace(":year", "2012");

        System.out.println(url);
        Map o = JSONGet.submitGet(url, Map.class);
        System.out.println(o);
     */