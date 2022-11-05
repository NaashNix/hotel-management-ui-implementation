package controllers;

import com.sun.org.apache.xpath.internal.objects.XNull;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginWindowFormController {

    public Label adminChanger;
    public ImageView receptionLogin;

    public void navigateToAdminLogin(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginWindowAdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionLogin.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void receptionLoginButton(MouseEvent mouseEvent) throws IOException {
        //URL resource = getClass().getResource("../view/receptionistView/mainDashBoardForm.fxml");
        URL resource = getClass().getResource("/view/receptionistView/mainDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionLogin.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
