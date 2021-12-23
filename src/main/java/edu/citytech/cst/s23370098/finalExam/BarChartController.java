package edu.citytech.cst.s23370098.finalExam;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.s23370098.abcCounter.MasterController;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class BarChartController extends MasterController implements Initializable {

    @FXML
    private BarChart<String, Number> barchartView;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TextField txtSearchYear;

    @FXML
    private Button btnSearchId;

    @FXML
    private TableView<DayInfo> tvCharView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void btnSearch(ActionEvent event) {

        final String url = "http://localhost:9215/api/summary/year/:year";

        tvCharView.refresh();
        tvCharView.getItems().clear();

        barchartView.getData().clear();
        barchartView.animatedProperty().set(false);

        String searchYear = txtSearchYear.getText();
        String newURL = url.replace(":year", searchYear);

        DayInfo[] dayInfos = JSONGet.submitGet(newURL, DayInfo[].class);
        List<DayInfo[]> dayInfoList = new ArrayList<>();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
//        ObservableList<XYChart.Series<String, Number>> DI = barchartView.getData();
        ObservableList<DayInfo> dayInfoObservableList = tvCharView.getItems();

        for(DayInfo dayInfo : dayInfos)
        {
            series.getData().add(new XYChart.Data<String, Number>(dayInfo.getDay(), dayInfo.getTotal()));

            System.out.println(dayInfo);
        }

        dayInfoObservableList.addAll(dayInfos);
        barchartView.getData().add(series);

        System.out.println(newURL);
        System.out.println(dayInfos);

    }
}
