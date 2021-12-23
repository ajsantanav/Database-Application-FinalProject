package edu.citytech.cst.s23370098.abcCounter;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.s23370098.service.ABCCounterService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ABCCounterController extends MasterController implements Initializable {

    @FXML
    private FlowPane fpCounter;

    @FXML
    private Label title;

    @FXML
    private RadioButton rABC;

    @FXML
    private ToggleGroup tgCounter;

    @FXML
    private RadioButton r123;

    @FXML
    private RadioButton rNone;

    @FXML
    private RadioButton r369;

    @FXML
    private RadioButton r321;

    @FXML
    private RadioButton rCBA;

    @FXML
    private RadioButton rAa;

    @FXML
    private ChoiceBox<String> cbIsVowel;

    @FXML
    private MenuBar menuBar;

    @FXML
    void mode(ActionEvent event) {

        cbIsVowel.getItems().clear();
        cbIsVowel.getItems().add("none");
        cbIsVowel.getItems().add("vowels");
        cbIsVowel.getItems().add("consonant");

        fpCounter.getChildren().clear();

        title.setText("ABC Mode");
        List<Character> list = ABCCounterService.countABC();

        for(char abc : list) {
            var label = new Label(abc + "");
            label.getStyleClass().add("displayLabel-big");
            fpCounter.getChildren().add(label);
        }
    }

    @FXML
    void mode123(ActionEvent event) {
        cbIsVowel.getItems().clear();
        cbIsVowel.getItems().add("none");
        cbIsVowel.getItems().add("even");
        cbIsVowel.getItems().add("odd");
        cbIsVowel.getItems().add("contains7");
        fpCounter.getChildren().clear();
        Integer[] list = JSONGet.submitGet("http://localhost:8080/api/abc/123", Integer[].class);
//        List<Integer> list = ABCCounterService.count123();
        title.setText("123 Mode");
        for(var abc : list) {
            var label = new Label(abc + "");
            label.getStyleClass().add("displayLabel-123");
            fpCounter.getChildren().add(label);
        }
    }
    //test portion
    @FXML
    void mode321(ActionEvent event) {
        cbIsVowel.getItems().clear();
        cbIsVowel.getItems().add("none");
        cbIsVowel.getItems().add("even");
        cbIsVowel.getItems().add("odd");
        cbIsVowel.getItems().add("every6");
        cbIsVowel.getItems().add("contains7");
        fpCounter.getChildren().clear();
        List<Integer> list = ABCCounterService.count321();
        title.setText("321 Mode");
        for(var abc : list) {
            var label = new Label(abc + "");
            label.getStyleClass().add("displayLabel-123");
            fpCounter.getChildren().add(label);
        }
    }


    @FXML
    void mode369(ActionEvent event) {
        cbIsVowel.getItems().clear();
        cbIsVowel.getItems().add("none");
        cbIsVowel.getItems().add("even");
        cbIsVowel.getItems().add("odd");
        cbIsVowel.getItems().add("every6");
        cbIsVowel.getItems().add("contains7");
        fpCounter.getChildren().clear();
        List<Integer> list = ABCCounterService.count369();

        for(var abc : list) {
            var label = new Label(abc + "");
            label.getStyleClass().add("displayLabel");
            fpCounter.getChildren().add(label);
        }
    }

    @FXML
    void modeCBA(ActionEvent event) {
        cbIsVowel.getItems().clear();
        cbIsVowel.getItems().add("none");
        cbIsVowel.getItems().add("vowels");
        cbIsVowel.getItems().add("consonant");

        fpCounter.getChildren().clear();
        List<Character> list = ABCCounterService.countCBA();

        for(char abc : list) {
            var label = new Label(abc + "");
            label.getStyleClass().add("displayLabel-big");
            fpCounter.getChildren().add(label);
        }
    }


    @FXML
    void madeAa(ActionEvent event) {
        cbIsVowel.getItems().clear();
        cbIsVowel.getItems().add("none");
        cbIsVowel.getItems().add("vow");
        cbIsVowel.getItems().add("conso");
        fpCounter.getChildren().clear();
        List<Character> list = ABCCounterService.countAa();


        for(char abc : list) {
            var label = new Label(abc + "-" + Character.toLowerCase(abc));
            label.getStyleClass().add("displayLabel");
            fpCounter.getChildren().add(label);
        }

    }

    @FXML
    void modeNone(ActionEvent event) {
        fpCounter.getChildren().clear();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fpCounter.getChildren().clear();
        cbIsVowel.getItems().add("nothing");
        cbIsVowel.setOnAction(this::selectMode);
    }

    public void selectMode(ActionEvent e) {
        String selectedItem = cbIsVowel.getSelectionModel().getSelectedItem();
        var labels = fpCounter.getChildren();

        if(selectedItem !=null && selectedItem.contains("vowels"))
        {
            for(Node currentLabel: labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-big");
                boolean isVowel = ABCCounterService.isVowel(realLabel.getText());
                if (isVowel) //do the logic to highlight vowels
                {
                    currentLabel.getStyleClass().add("isVowel");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("consonant")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-big");
                boolean isConsonant = ABCCounterService.isConsonant(realLabel.getText());
                if (isConsonant) {
                    currentLabel.getStyleClass().add("isConsonant");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("even")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-123");
                boolean isEven = ABCCounterService.isEven(Integer.parseInt(realLabel.getText()));
                if (isEven) {
                    currentLabel.getStyleClass().add("isEven");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("odd")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-123");
                boolean isOdd = ABCCounterService.isOdd(Integer.parseInt(realLabel.getText()));
                if (isOdd) {
                    currentLabel.getStyleClass().add("isOdd");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("none")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().remove("isVowel");
                realLabel.getStyleClass().remove("isConsonant");
                realLabel.getStyleClass().remove("isOdd");
                realLabel.getStyleClass().remove("isEven");
            }
        }
        else if(selectedItem !=null && selectedItem.contains("even")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-123");
                boolean isEvery6 = ABCCounterService.isEvery6(Integer.parseInt(realLabel.getText()));
                if (isEvery6) {
                    currentLabel.getStyleClass().add("isEvery6");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("every6")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-123");
                boolean isEvery6 = ABCCounterService.isEvery6(Integer.parseInt(realLabel.getText()));
                if (isEvery6) {
                    currentLabel.getStyleClass().add("isEven");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("contains7")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel-123");
                boolean isContainsSeven = ABCCounterService.isContainsSeven(Integer.parseInt(realLabel.getText()));
                if (isContainsSeven) {
                    currentLabel.getStyleClass().add("isEven");
                }
            }
        }
        //////EXAMN PORTION
        else if(selectedItem !=null && selectedItem.contains("vow"))
        {
            for(Node currentLabel: labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel");
                boolean isVowel = ABCCounterService.isVowel(realLabel.getText());
                if (isVowel) //do the logic to highlight vowels
                {
                    currentLabel.getStyleClass().add("isVowel");
                }
            }
        }
        else if(selectedItem !=null && selectedItem.contains("conso")) {
            for (Node currentLabel : labels) {
                Label realLabel = (Label) currentLabel;
                realLabel.getStyleClass().clear();
                realLabel.getStyleClass().add("displayLabel");
                boolean isConsonant = ABCCounterService.isConsonant(realLabel.getText());
                if (isConsonant) {
                    currentLabel.getStyleClass().add("isConsonant");
                }
            }
        }
        /////////////
    }
}
