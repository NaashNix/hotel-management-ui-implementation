package customerData;

public class Guest {
    private String roomCode;
    private String name;
    private String mealPlan;
    private String dateOfLeaving;

    public Guest(String roomCode, String name, String mealPlan, String dateOfLeaving) {
        this.roomCode = roomCode;
        this.name = name;
        this.mealPlan = mealPlan;
        this.dateOfLeaving = dateOfLeaving;
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
}
