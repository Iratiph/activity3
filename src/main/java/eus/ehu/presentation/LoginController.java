package eus.ehu.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    private Label messageLabel;

    @FXML
    private TextField messageLogin;

    @FXML
    private PasswordField messagePassword;

    @FXML
    private void handleButtonClick() {
        if (messageLogin.getText().equals("admin") && messagePassword.getText().equals("123456")) {
            messageLabel.setText("Correct!");
            messageLabel.getStyleClass().setAll("alert", "alert-success");
            messageLabel.setVisible(true);
        } else {
            messageLabel.setText("Try again :)"); 
            messageLabel.getStyleClass().setAll("alert", "alert-danger");
            messageLabel.setVisible(true);
        }
    }

    
}
