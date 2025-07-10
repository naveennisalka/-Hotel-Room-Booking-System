package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class customerDashboardFormController {

    @FXML
    private ComboBox<String> comboRoomType;

    @FXML
    private DatePicker dpCheckIn;

    @FXML
    private DatePicker dpCheckOut;

    @FXML
    private Spinner<Integer> gustCon;

    @FXML
    private Label lblRoomCost;

    @FXML
    private Label lblTAX;

    @FXML
    private Label lblTotalPrice;

    @FXML
    private TextField txtNIC;

    @FXML
    private TextField txtName;

    @FXML
    public void initialize() {
        comboRoomType.getItems().addAll("Single", "Double", "Suite");
        comboRoomType.setPromptText("Choose a Room Type");
        txtName.setPromptText("Ex: JP Naveen Nisalka");
        txtNIC.setPromptText("Ex: 2020222222");
        gustCon.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,6,1));
    }

    @FXML
    void funBookRoom(ActionEvent event) {

    }

    @FXML
    void funCalPrice(ActionEvent event) {

        String roomType = comboRoomType.getValue();
        int gustCount = gustCon.getValue();
        int days = (int) (dpCheckOut.getValue().toEpochDay() - dpCheckIn.getValue().toEpochDay());

        // calculate room price
        double roomPrice = days * roomPrice(roomType)* gustCount;
        double tax = roomPrice * 0.18;

        lblRoomCost.setText(""+roomPrice);
        lblTAX.setText(""+tax);
        lblTotalPrice.setText("Rs. "+(roomPrice+tax));
    }

    @FXML
    void funClearForm(ActionEvent event) {
        comboRoomType.getSelectionModel().clearSelection();
        dpCheckIn.setValue(null);
        dpCheckOut.setValue(null);
        gustCon.getValueFactory().setValue(1);
        lblRoomCost.setText("0.00");
        lblTAX.setText("0.00");
        lblTotalPrice.setText("Rs. 0.00");
        txtNIC.clear();
        txtName.clear();
    }

    public double roomPrice(String type){
        if (type.equals("Single")) return 1000.0;
        else if(type.equals("Double")){
            return 2000.0;
        }else if(type.equals("Suite")){
            return 3000.0;
        }else{
            return 0;
        }
    }

}
