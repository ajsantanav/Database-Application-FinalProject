package edu.citytech.cst.s23370098.customer;

import com.jbbwebsolutions.http.utility.JSONGet;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Map;

public class PieChartExperiments extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");

        String url = "http://localhost:9215/api/reports/:year/:month/:days/:price/:location";
        url = url.replace(":year", "2012")
                 .replace(":month", "1,2,3,4,5,6,7,8,9,10,11,12")
                 .replace(":days", "SATURDAY")
                 .replace(":price", "100,200")
                 .replace(":location", "A,B,C,D");

        System.out.println(url);
        Map o = JSONGet.submitGet(url, Map.class);
        System.out.println(o);

        PieChart pieChart = new PieChart();

        for(char c = 'A'; c<= 'D'; c++)
        {
            var key = "row.count.code." + c;
            var data = o.get(key).toString();
            System.out.println(c + ":" + data);
            PieChart.Data slice = new PieChart.Data(c + "", Float.parseFloat(data));
            pieChart.getData().add(slice);
        }


        pieChart.setMinHeight(800);
        pieChart.setMaxWidth(800);

        VBox vbox = new VBox(pieChart);

        Scene scene = new Scene(vbox, 800, 800);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}