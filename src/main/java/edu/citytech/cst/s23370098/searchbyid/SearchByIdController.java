package edu.citytech.cst.s23370098.searchbyid;

import com.jbbwebsolutions.http.utility.JSONGet;
import com.jbbwebsolutions.http.utility.URLUtility;
import edu.citytech.cst.s23370098.abcCounter.MasterController;
import edu.citytech.cst.s23370098.dto.ClientInfo;
import edu.citytech.cst.s23370098.dto.Items;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.*;

public class SearchByIdController extends MasterController implements Initializable {

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtSearchById;

    @FXML
    private TableView<Items> tvCustomerInfo;

    @FXML
    private Label dataLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Button btnRewards;

    @FXML
    private Label rewardsLbl;

    @FXML
    private Button btnTaxes;

    @FXML
    private Label taxesLbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { }

    @FXML
    void btnSearch(ActionEvent event){

        final String url = "http://localhost:3613/customer/api/query/:_id";

        tvCustomerInfo.refresh();
        tvCustomerInfo.getItems().clear();

        String searchById = txtSearchById.getText();
        String newURL = url.replace(":_id", searchById);

        ClientInfo clientInformation = JSONGet.submitGet(newURL, ClientInfo.class);
        var itemsInfo = clientInformation.getItems();


        ObservableList<Items> itemsx = tvCustomerInfo.getItems();
        itemsx.addAll(itemsInfo);

        System.out.println(newURL);
        System.out.println(clientInformation);

    }

    @FXML
    void btnRewards(ActionEvent event) {

        final String url = "http://localhost:3613/customer/api/update/rewards";

        tvCustomerInfo.refresh();
        tvCustomerInfo.getItems().clear();


        String searchById = txtSearchById.getText();
        int id = Integer.parseInt(searchById);

        ClientInfo clientInformation = JSONGet.submitGet(url, ClientInfo.class);
        var itemsInfo = clientInformation.getRewards();

        Map<String,Object> map = new HashMap<>();
        map.put("id",1101);
        map.put("year",2020);
        map.put("day",2);
        map.put("month",15);
        var x = URLUtility.put(url, map, ClientInfo.class, 3);
        System.out.println(x);
        //rewardsLbl.setText();
    }



//    @FXML
//    void btnTaxes(ActionEvent event) {
//
//    }
}
