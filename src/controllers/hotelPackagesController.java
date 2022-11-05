package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
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

public class hotelPackagesController {

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
    public Label mainDashDate;
    public Rectangle receptionMenu;
    public AnchorPane PackageContext;
    public Label txtReceptionHome;
    public Rectangle GuestDetailsSQ;
    public Label txtGuestDetails;

    public void initialize(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = dateFormat.format(date);
        mainDashDate.setText(strDate);
    }


    // --> --> --> --> --> --> --> --> --> --> --> --> --> MENU BUTTONS
    public void changeColorOfIconsMouseEntered(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(127, 140, 141, 1));
    }

    public void changeColorOfIconsMouseExited(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(186, 186, 186, 1));
    }

    public void moneyStaticMouseEN(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(moneyStaticBtnSqu);
    }

    public void moneyStaticMouseEX(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(moneyStaticBtnSqu);
    }

    public void guestDetailsMouseEN(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(guestDetailsBtnSqu);
    }

    public void guestDetailsMouseEX(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(guestDetailsBtnSqu);
    }

    public void settingsMouseEX(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(settingsBtnSqu);
    }

    public void settingsMouseEN(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(settingsBtnSqu);
    }

    public void exitBtnSquMouseEN(MouseEvent mouseEvent) {
        changeColorOfIconsMouseEntered(exitBtnSqu);
    }

    public void exitBtnSquMouseEX(MouseEvent mouseEvent) {
        changeColorOfIconsMouseExited(exitBtnSqu);
    }

    public void exitActionPerform(MouseEvent mouseEvent) {
        System.exit(0);
    }

    //Here goes button events for menu.
    public void changeMenuColorMouseEN(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(255, 255, 255, 1));

    }

    public void changeMenuColorMouseEX(Rectangle rectangle) {
        rectangle.setFill(null);
        rectangle.setStroke(Color.rgb(255, 255, 255, 1));
    }


    public void breakDownSqMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(BreakdownOuterSq);
        txtBreakdownMouseEN(mouseEvent);
    }


    public void breakDownSqMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(BreakdownOuterSq);
        txtBreakdownMouseEX(mouseEvent);
    }



    public void txtBreakdownMouseEN(MouseEvent mouseEvent) {
        BreakdownOuterSq.setFill(Color.rgb(255, 255, 255, 1));
        txtBreakdowns.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void txtBreakdownMouseEX(MouseEvent mouseEvent) {
        txtBreakdowns.setTextFill(Color.rgb(255, 255, 255, 1));
    }

    // --> --> --> --> --> --> --> --> --> --> --> --> --> MENU BUTTONS
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
        Stage window = (Stage) PackageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void navigateToBreakDowns(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/ProblemBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) PackageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
    public void navigateToGuestDetails(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/GuestDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) PackageContext.getScene().getWindow();
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
