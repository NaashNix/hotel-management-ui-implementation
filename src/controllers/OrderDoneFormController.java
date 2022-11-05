package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OrderDoneFormController {
    public Label mainDashDate;
    public Rectangle moneyStaticBtnSqu;
    public ImageView moneyStaticsBtnimg;
    public Rectangle guestDetailsBtnSqu;
    public Rectangle settingsBtnSqu;
    public Rectangle exitBtnSqu;
    public ImageView guestDetailsIcon;
    public ImageView settingsicon;
    public ImageView exiticon;
    public Rectangle packagesOuterSQ;
    public Rectangle BreakdownOuterSq;
    public Label txtPackages;
    public Label txtBreakdowns;
    public Rectangle receptionMenu;
    public Label txtReceptionHome;
    public JFXButton btnBack;
    public AnchorPane OrderDoneContext;
    public Rectangle GuestDetailsSQ;
    public Label txtGuestDetails;


    public void initialize(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = dateFormat.format(date);
        mainDashDate.setText(strDate);

    }


    public void changeColorOfIconsMouseEntered(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(127, 140, 141, 1));
    }

    public void changeColorOfIconsMouseExited(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(186, 186, 186, 1));
    }

    public void moneyStaticBtnSquMouseEnter(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(moneyStaticBtnSqu);
    }

    public void moneyStaticBtnSquMouseExit(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(moneyStaticBtnSqu);
    }

    public void guestDetailBtnSquMouseEnter(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(guestDetailsBtnSqu);
    }

    public void guestDetailBtnSquMouseExit(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(guestDetailsBtnSqu);
    }

    public void settingsBtnSquMouseExit(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(settingsBtnSqu);
    }

    public void settingsBtnSquMouseEnter(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(settingsBtnSqu);
    }

    public void exitBtnSquMouseEnter(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(exitBtnSqu);
    }

    public void exitBtnSquMouseExit(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(exitBtnSqu);
    }

    public void exitActionPerform(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/ReserveOrder.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OrderDoneContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    //Here goes button events for menu.
    public void changeMenuColorMouseEN(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(255, 255, 255, 1));

    }

    public void changeMenuColorMouseEX(Rectangle rectangle) {
        rectangle.setFill(null);
        rectangle.setStroke(Color.rgb(255, 255, 255, 1));
    }

    public void receptionMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(receptionMenu);
        txtReceptionHome.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void receptionMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(receptionMenu);
        txtReceptionHome.setTextFill(Color.rgb(255, 255, 255, 1));
    }

    public void receptionNavigate(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/mainDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OrderDoneContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void packagesMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(packagesOuterSQ);
        txtPackages.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void packagesMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(packagesOuterSQ);
        txtPackages.setTextFill(Color.rgb(255, 255, 255, 1));
    }
    public void navigateToPackages(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/hotelPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OrderDoneContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void navigateToBreakDowns(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/ProblemBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OrderDoneContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void breakDownMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(BreakdownOuterSq);
        txtBreakdowns.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void breakDownMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(BreakdownOuterSq);
        txtBreakdowns.setTextFill(Color.rgb(255, 255, 255, 1));
    }

    public void navigateToGuestDetails(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/GuestDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) OrderDoneContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void GuestDetailsMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(GuestDetailsSQ);
        txtGuestDetails.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void GuestDetailsMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(GuestDetailsSQ);
        txtGuestDetails.setTextFill(Color.rgb(255, 255, 255, 1));
    }

}
