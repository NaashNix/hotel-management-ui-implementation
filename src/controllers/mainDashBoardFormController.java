package controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class mainDashBoardFormController {

    public AnchorPane mainDashBoardContext;
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
    public  Label mainDashDate;
    public JFXButton reserveButtonSQ;
    public Label greetingText;
    public JFXButton reportProblemButton;
    public Rectangle GuestDetailsSQ;
    public Label txtGuestDetails;
    public Label mainDashBoardTime;

    public void initialize(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = dateFormat.format(date);
        mainDashDate.setText(strDate);
        setMainBoardTime();
    }

    public void setMainBoardTime(){
                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm: a");
                Date date = new Date();
                String time = formatter.format(date);
                mainDashBoardTime.setText(time);
    }

    // --> --> --> --> --> --> --> --> --> --> --> --> --> MENU BUTTONS
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

    public void moneyStaticIconMEx(MouseEvent mouseEvent) {
        moneyStaticBtnSquMouseExit(mouseEvent);
    }

    public void moneyStaticsIconMEn(MouseEvent mouseEvent) {
        moneyStaticBtnSquMouseEnter(mouseEvent);
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

    public void guestDetailsMouseEn(MouseEvent mouseEvent) {
        guestDetailBtnSquMouseEnter(mouseEvent);
    }

    public void guestDetailsMouseEx(MouseEvent mouseEvent) {
        guestDetailBtnSquMouseExit(mouseEvent);
    }

    public void settingsMouseEn(MouseEvent mouseEvent) {
        settingsBtnSquMouseEnter(mouseEvent);
    }

    public void settingsMouseEx(MouseEvent mouseEvent) {
        settingsBtnSquMouseExit(mouseEvent);
    }

    public void exitActionPerform(MouseEvent mouseEvent) throws IOException {
        ButtonType yes = new ButtonType("YES" , ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("CANCEL" , ButtonBar.ButtonData.CANCEL_CLOSE);


        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to logout?",yes,no);
        alert.setTitle("Confirmation!");
        Optional<ButtonType> result = alert.showAndWait();
        if (result.orElse(no)==yes){
            URL resource = getClass().getResource("../view/LoginWindowForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) mainDashBoardContext.getScene().getWindow();
            window.setScene(new Scene(load));
        }else{/*nothing here*/}
    }

    public void exitMouseEn(MouseEvent mouseEvent) {
        exitBtnSquMouseEnter(mouseEvent);
    }

    public void exitMouseEx(MouseEvent mouseEvent) {
        exitBtnSquMouseExit(mouseEvent);
    }


    //Here goes button events for menu.
    public void changeMenuColorMouseEN(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(255, 255, 255, 1));

    }

    public void changeMenuColorMouseEX(Rectangle rectangle) {
        rectangle.setFill(null);
        rectangle.setStroke(Color.rgb(255, 255, 255, 1));
    }

    public void packagesSqMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(packagesOuterSQ);
        txtPackaesMouseEN(mouseEvent);
    }

    public void breakDownSqMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(BreakdownOuterSq);
        txtBreakdownMouseEN(mouseEvent);
    }

    public void packagesSqMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(packagesOuterSQ);
        txtPackaesMouseEX(mouseEvent);
    }

    public void breakDownSqMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(BreakdownOuterSq);
        txtBreakdownMouseEX(mouseEvent);
    }

    public void txtPackaesMouseEN(MouseEvent mouseEvent) {
        txtPackages.setTextFill(Color.rgb(0, 0, 0, 1));
        packagesOuterSQ.setFill(Color.rgb(255, 255, 255, 1));

    }

    public void txtPackaesMouseEX(MouseEvent mouseEvent) {
        txtPackages.setTextFill(Color.rgb(255, 255, 255, 1));
    }

    public void txtBreakdownMouseEN(MouseEvent mouseEvent) {
        BreakdownOuterSq.setFill(Color.rgb(255, 255, 255, 1));
        txtBreakdowns.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void txtBreakdownMouseEX(MouseEvent mouseEvent) {
        txtBreakdowns.setTextFill(Color.rgb(255, 255, 255, 1));
    }

    // --> --> --> --> --> --> --> --> --> --> --> --> --> MENU BUTTONS
     //Reserve Button Action
    public void reserveMouseButtonAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/ReserveOrder.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mainDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void packagesNav(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/hotelPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mainDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void navigateToBreakDowns(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/ProblemBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mainDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void navigateToGuestDetails(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/GuestDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mainDashBoardContext.getScene().getWindow();
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
