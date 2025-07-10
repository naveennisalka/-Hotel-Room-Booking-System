package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class roomDetailsFormController {

    @FXML
    private TableColumn<?, ?> colAvailability;

    @FXML
    private TableColumn<?, ?> colDiscription;

    @FXML
    private TableColumn<?, ?> colFloor;

    @FXML
    private TableColumn<?, ?> colMaxGus;

    @FXML
    private TableColumn<?, ?> colPPN;

    @FXML
    private TableColumn<?, ?> colRoomId;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableView<?> tblRoomDetails;

    @FXML
    void loadTable(ActionEvent event) {
        colRoomId.setCellValueFactory(new PropertyValueFactory<>(""));
    }

}
