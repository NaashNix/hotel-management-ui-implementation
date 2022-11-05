package model;

import javafx.scene.control.Button;

import javax.swing.*;

public class GuestTM {
    private String roomCode;
    private String name;
    private String mealPlan;
    private String dateOfLeaving;
    private Button btn;

    public GuestTM(String roomCode, String name, String mealPlan, String dateOfLeaving,Button deleteButton)
    {
        this.roomCode = roomCode;
        this.name = name;
        this.mealPlan = mealPlan;
        this.dateOfLeaving = dateOfLeaving;
        this.btn = deleteButton;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(String mealPlan) {
        this.mealPlan = mealPlan;
    }

    public String getDateOfLeaving() {
        return dateOfLeaving;
    }

    public void setDateOfLeaving(String dateOfLeaving) {
        this.dateOfLeaving = dateOfLeaving;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}

