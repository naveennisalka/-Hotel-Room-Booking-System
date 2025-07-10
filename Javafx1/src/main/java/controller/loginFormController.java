package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginFormController {
    Stage coustomerDashboardStage = new Stage();
    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField tfPwd;

    @FXML
    private TextField tfUserName;

    @FXML
    void loginAction(ActionEvent event) {
        System.out.println(tfUserName.getText());
        System.out.println(tfPwd.getText());

        try {
            coustomerDashboardStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customerDashboard_form.fxml"))));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        coustomerDashboardStage.show();
    }

}
