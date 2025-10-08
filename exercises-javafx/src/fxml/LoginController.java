package fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    public void login() {
        boolean validEmail = emailField.getText().equals("aluno@cod3r.com.br");
        boolean validPassword = passwordField.getText().equals("123456");

        if(validEmail && validPassword) {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login")
                    .text("Login successful!")
                    .showInformation();
        } else {
            Notifications.create()
                    .position(Pos.TOP_RIGHT)
                    .title("Login")
                    .text("Invalid email or password!")
                    .showError();
        }
    }
}
