package edu.citytech.cst.s23370098.finalgrade;

import edu.citytech.cst.s23370098.abcCounter.MasterController;
import edu.citytech.cst.s23370098.service.GradeCalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Date;

public class FinalGradeController extends MasterController {

    @FXML
    private Label title;

    @FXML
    private Label status;

    @FXML
    private TextField txtScore;

    @FXML
    private TextField txtGPA;

    @FXML
    private Button txtCalculate;

    @FXML
    private TextField txtLetter;

    @FXML
    private Button txtClear;


    @FXML
    void calculateGrade(ActionEvent event) {

        try {
            float score = Float.parseFloat(txtScore.getText());
            float gpa = GradeCalculator.getFinalGrade(score);
            String letterGrade = GradeCalculator.getFinalLetter(score);
            txtGPA.setText(gpa + "");
            txtLetter.setText(letterGrade);
            status.setText(" " + new Date());

        }
        catch (NumberFormatException e) {

            txtLetter.clear();
            txtLetter.setText(" ");
            txtGPA.clear();
            txtGPA.setText("0.0");
            txtScore.clear();
            status.setText("Something went wrong, wrong input perhaps");
        }
    }

    @FXML
    void clearOutput(ActionEvent event) {

        txtLetter.clear();
        txtLetter.setText(" ");
        txtGPA.clear();
        txtGPA.setText("0.0");
        txtScore.clear();


    }

}