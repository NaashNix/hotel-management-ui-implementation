package controllers;

import customerData.Guest;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import model.GuestTM;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class GuestDetailsFormController {
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
    public Label txtReceptionHome;
    public Rectangle GuestDetailsSQ;
    public Label txtGuestDetails;
    public AnchorPane GuestDetailsContext;
    public TableColumn columnRoomID;
    public TableColumn columnGuestName;
    public TableColumn columnMealplan;
    public TableColumn columnDateLeaving;
    public TableColumn columnCancel;
    public TableView guestDetailTable;
    public Rectangle ReceptionHomeSQ;

    static ArrayList <Guest> guestArrayList = new ArrayList<Guest>();
    {
        guestArrayList.clear();
        guestArrayList.add(new Guest("LUX01","Ravindu","SLtype","July 07"));
        guestArrayList.add(new Guest("ECO03","Bhagya","INtype","July 02"));
        guestArrayList.add(new Guest("BUD07","Lalantha","EUtype","July 03"));
        guestArrayList.add(new Guest("ECO09","Kalum","EUtype","July 09"));
        guestArrayList.add(new Guest("LUX05","Yasith","SLtype","July 10"));
    }


    public void initialize(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = dateFormat.format(date);
        mainDashDate.setText(strDate);

        columnRoomID.setCellValueFactory(new PropertyValueFactory<>("roomCode"));
        columnGuestName.setCellValueFactory(new PropertyValueFactory<>("name"));
        columnMealplan.setCellValueFactory(new PropertyValueFactory<>("mealPlan"));
        columnDateLeaving.setCellValueFactory(new PropertyValueFactory<>("dateOfLeaving"));
        columnCancel.setCellValueFactory(new PropertyValueFactory<>("btn"));
        loadAllCustomerData();
    }

    public void loadAllCustomerData(){
        ObservableList<GuestTM> GusetTMObservableList = FXCollections.observableArrayList();
        GusetTMObservableList.clear();
        for (Guest temp : guestArrayList){
            Button deleteButton = new Button("Delete Resev.");
            GusetTMObservableList.add(new GuestTM(temp.getRoomCode(),temp.getName(),temp.getMealPlan(),temp.getDateOfLeaving(),deleteButton));
            deleteButton.setOnAction((e) ->{

                ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you want to CANCEL this reservation?",yes,no);
                alert.setTitle("Confirmation!");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.orElse(no)==yes){
                    guestArrayList.remove(temp);
                    loadAllCustomerData();
                }else{/*nothing here*/}
            }
            );
        }
        guestDetailTable.setItems(GusetTMObservableList);
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


    //Here goes button events for menu.
    public void changeMenuColorMouseEN(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(255, 255, 255, 1));

    }

    public void changeMenuColorMouseEX(Rectangle rectangle) {
        rectangle.setFill(null);
        rectangle.setStroke(Color.rgb(255, 255, 255, 1));
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
        Stage window = (Stage) GuestDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }


    public void navigateToBreakDowns(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/ProblemBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) GuestDetailsContext.getScene().getWindow();
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

    public void navigateToReception(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/receptionistView/mainDashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) GuestDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void receptionHomeMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(ReceptionHomeSQ);
        txtReceptionHome.setTextFill(Color.rgb(0, 0, 0, 1));
    }

    public void receptionHomeMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(ReceptionHomeSQ);
        txtReceptionHome.setTextFill(Color.rgb(255, 255, 255, 1));
    }
}
