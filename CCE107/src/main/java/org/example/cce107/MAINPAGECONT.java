package org.example.cce107;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MAINPAGECONT {

    @FXML
    private Button addBTN;

    @FXML
    private Button doctorBTN;

    @FXML
    private Button homeBTN;

    @FXML
    private AnchorPane home_form;

    @FXML
    private AnchorPane home_form1;

    @FXML
    private AnchorPane doc_form;

    @FXML
    private AnchorPane add_form;
    public void switchForm(ActionEvent event) {

        if (event.getSource() == homeBTN) {
            home_form.setVisible(true);
            home_form1.setVisible(true);
            add_form.setVisible(false);
            doc_form.setVisible(false);

            home_form.setStyle("-fx-background-color: white");
            home_form1.setStyle("-fx-background-color: #D0E3FF");
            add_form.setStyle("-fx-background-color: transparent");
            doc_form.setStyle("-fx-background-color: transparent");

        } else if (event.getSource() == addBTN) {
            add_form.setVisible(true);
            home_form.setVisible(false);
            home_form1.setVisible(false);
            doc_form.setVisible(false);

            add_form.setStyle("-fx-background-color: #f7f2eb");
            doc_form.setStyle("-fx-background-color: transparent");
            home_form1.setStyle("-fx-background-color: transparent");
            home_form.setStyle("-fx-background-color: transparent");

        } else if (event.getSource() == doctorBTN) {
            doc_form.setVisible(true);
            add_form.setVisible(false);
            home_form1.setVisible(false);
            home_form.setVisible(false);

            doc_form.setStyle("-fx-background-color: #37A1C3");
            add_form.setStyle("-fx-background-color: transparent");
            home_form1.setStyle("-fx-background-color: transparent");
            home_form.setStyle("-fx-background-color: transparent");
        }
    }

}
