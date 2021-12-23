package edu.citytech.cst.s23370098.customer;

import com.google.gson.Gson;
import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.s23370098.abcCounter.MasterController;
import edu.citytech.cst.s23370098.model.CustomerPurchases;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

public class CustomerPurchasesController extends MasterController implements Initializable {

    @FXML
    private TableView<CustomerPurchases> tvCustomerPurchases;

    @FXML
    private AnchorPane apYear;

    @FXML
    private Button btSearch;

    @FXML
    private Label lbMessage;

    @FXML
    private AnchorPane apMonths;

    @FXML
    private AnchorPane apDays;

    @FXML
    private AnchorPane apLocation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void search(final String url) {

        Map map = JSONGet.submitGet(url, Map.class);
        var data = (List) map.get("row.data");

        if (data == null || data.size() == 0) {
            lbMessage.setText("No Data was found for: " + lbMessage.getText());
            return;
        }

        ObservableList<CustomerPurchases> cp = tvCustomerPurchases.getItems();

        final Gson gson = new Gson();
        List<CustomerPurchases> customerPurchases = new ArrayList<>();
        for (Object row : data)
        {
            var model = gson.fromJson(row.toString(), CustomerPurchases.class);
            customerPurchases.add(model);
        }

        cp.addAll(customerPurchases);
    }

    @FXML
    void search(ActionEvent event) {

        final String sURL = "http://localhost:9215/api/reports/:year/1,2,3,4,5,6,7,8,9,10,11,12/:days/100,200/A,B,C,D";

        tvCustomerPurchases.refresh();
        tvCustomerPurchases.getItems().clear();
        //logic for year
        var children = apYear.getChildren();

        List<String> list = new ArrayList<>();
        for(Node child: children)
        {
            if(child instanceof CheckBox)
            {
                var current = (CheckBox)child;
                if (current.isSelected()){
                    list.add(current.getText());
                }
            }
        }

        String queryForYears = String.join(",",list);
        var url = sURL.replace(":year", queryForYears);


        // LOGIC FOR DAYS
        children = apDays.getChildren();
        list.clear();
        for(Node child: children)
        {
            if(child instanceof CheckBox)
            {
                var current = (CheckBox)child;
                if (current.isSelected()){
                    list.add(current.getUserData().toString());
                }
            }
        }

        String queryForDays = String.join(",",list);
        url = url.replace(":days", queryForDays);

        lbMessage.setText(url);
        search(url);
    }
}
