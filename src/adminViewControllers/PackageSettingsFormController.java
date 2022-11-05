package adminViewControllers;

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

public class PackageSettingsFormController {
    public Label mainDashDate;
    public Rectangle viewReportsSQ;
    public ImageView viewReportsIcon;
    public Rectangle roomSettingsSQ;
    public ImageView roomSettingsIcon;
    public Rectangle mealSettingsSQ;
    public Rectangle backSQ;
    public ImageView backIcon;
    public Rectangle IncomeReportsSQ;
    public Label txtIncomeReports;
    public ImageView mealSettingsIcon;
    public Rectangle AdminDashboardSQ;
    public Label txtAdminDashboard;
    public Label txtMealSettings;
    public AnchorPane PackageSettingsContext;
    public Rectangle MealSettingsSQ;


    public void initialize(){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = dateFormat.format(date);
        mainDashDate.setText(strDate);
    }


    //Change colors of bottom menu icon
    public void changeBottomMouseEN(Rectangle rectangle){
        rectangle.setFill(Color.rgb(127, 140, 141, 1));
    }

    public void changeBottomMouseEX(Rectangle rectangle){
        rectangle.setFill(Color.rgb(186, 186, 186, 1));
    }



    //Function and colors change of bottom view report icon
    public void navigateToViewReports(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/adminViews/MonthlyIncomeForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) PackageSettingsContext.getScene().getWindow();
        window.setScene(new Scene(load));//TO BE DONE
    }

    public void viewReportsMouseEN(MouseEvent mouseEvent) {
        changeBottomMouseEN(viewReportsSQ);
    }

    public void viewReportsMouseEX(MouseEvent mouseEvent) {
        changeBottomMouseEX(viewReportsSQ);
    }


    //Functions and colors change of room settings icon
    public void navigateToRoomSettings(MouseEvent mouseEvent) {     //TO BE DONE
    }

    public void roomSettingsMouseEN(MouseEvent mouseEvent) {
        changeBottomMouseEN(roomSettingsSQ);
    }

    public void roomSettingsMouseEX(MouseEvent mouseEvent) {
        changeBottomMouseEX(roomSettingsSQ);
    }


    //Functions and colors change of MEAL SETTINGS icon
    public void navigateToMealSettings(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/adminViews/MealSettingsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) PackageSettingsContext.getScene().getWindow();
        window.setScene(new Scene(load));//TO BE DONE
    }

    public void mealSettingsMouseEN(MouseEvent mouseEvent) {
        changeBottomMouseEN(mealSettingsSQ);
    }

    public void mealSettingsMouseEX(MouseEvent mouseEvent) {
        changeBottomMouseEX(mealSettingsSQ);
    }


    //Functions and colors change of BACK icon
    public void navigateToBack(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/adminViews/AdminDashBoard.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) PackageSettingsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backIconMosueEN(MouseEvent mouseEvent) {
        changeBottomMouseEN(backSQ);
    }

    public void backIconMosueEX(MouseEvent mouseEvent) {
        changeBottomMouseEX(backSQ);
    }


    ///////////// Here Goes Side Menu Functions and Color Changes

    //Change Colors Of Side Menu
    public void changeMenuColorMouseEN(Rectangle rectangle) {
        rectangle.setFill(Color.rgb(255, 255, 255, 1));

    }

    public void changeMenuColorMouseEX(Rectangle rectangle) {
        rectangle.setFill(null);
        rectangle.setStroke(Color.rgb(255, 255, 255, 1));
    }

    public void changeTextColorMouseEN(Label label){
        label.setTextFill(Color.rgb(0, 0, 0, 1));
    }
    public void changeTextColorMouseEX(Label label){
        label.setTextFill(Color.rgb(255, 255, 255, 1));
    }


    //Functions and color changes of side menu ADMIN DAHSBOARD


    //Functions and color changes of side menu INCOME REPORTS
    public void SIncomeReportsMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(IncomeReportsSQ);
        changeTextColorMouseEN(txtIncomeReports);
    }

    public void SIncomeReportsMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(IncomeReportsSQ);
        changeTextColorMouseEX(txtIncomeReports);
    }


    //Functions and color changes of side menu ADMIN DASHBOARD
    public void navigateToAdminDashboard(MouseEvent mouseEvent) throws IOException {
        URL resource = getClass().getResource("../view/adminViews/AdminDashBoard.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) PackageSettingsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void AdminDashboardMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(AdminDashboardSQ);
        changeTextColorMouseEN(txtAdminDashboard);
    }

    public void AdminDashboardMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(AdminDashboardSQ);
        changeTextColorMouseEX(txtAdminDashboard);
    }

    //Functions and color changes of side menu MEAL SETTINGS
    public void SMealSettingsMouseEN(MouseEvent mouseEvent) {
        changeMenuColorMouseEN(MealSettingsSQ);
        changeTextColorMouseEN(txtMealSettings);
    }

    public void SMealSettingsMouseEX(MouseEvent mouseEvent) {
        changeMenuColorMouseEX(MealSettingsSQ);
        changeTextColorMouseEX(txtMealSettings);
    }


}
