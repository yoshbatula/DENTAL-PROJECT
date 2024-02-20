package org.example.cce107;

import java.io.IOException;
import java.time.Duration;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Button login;
    @FXML
    private PasswordField pass;
    @FXML
    private TextField user;
    @FXML
    private Label t;
    @FXML
    private Label wrong;

    @FXML
    private Label label_wrong;

    public void login(ActionEvent event) {
        String username = "admin";
        String password = "admin123";

        System.out.println("yosh");

        Alert alert;

        if  (user.getText().isBlank() && pass.getText().isBlank()) {
            alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("INFORMATION");
            alert.setTitle("ERROR!");
            alert.setContentText("PLEASE FILL IN THE BLANK");
            alert.showAndWait();

        } if (username.equals(user.getText()) && password.equals(pass.getText())) {

            login.getScene().getWindow().hide();

            Parent root = null;
            try {
                root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Stage stage = new Stage();
            Scene scene = new Scene(root);

            stage.setScene(scene);
            stage.show();

        } else {
            label_wrong.setText("WRONG PASSWORD!");

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Platform.runLater(() -> label_wrong.setText(""));
                    timer.cancel();
                }
            }, 1000);
        }
    }


}
