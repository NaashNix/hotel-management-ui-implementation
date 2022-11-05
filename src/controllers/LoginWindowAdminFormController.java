package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginWindowAdminFormController {
    public Label receptionChanger;
    public AnchorPane adminLoginContext;

    public void navigateToReceptionLogin(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../src/view/LoginWindowForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminLoginContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void navigateToAdminDashboard(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../src/view/adminViews/AdminDashBoard.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminLoginContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
