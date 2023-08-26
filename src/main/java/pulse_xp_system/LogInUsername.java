package pulse_xp_system;

import javafx.scene.control.Label;

import static pulse_xp_system.PulseApplication.EmployeeTesting.USER_userName_Password_Map;
import static pulse_xp_system.PulseApplication.EmployeeTesting.teamMemberInsertion;

/**
 *  The Class controls the "ClockInUsername" Window where the user can log in for use only after verifying clock in.
 */

public class LogInUsername implements ActionForCancelButton, ActionForOkButton{

    /**
     *   TextArea Title for the AnchorPane of the Window.
     */
    @javafx.fxml.FXML
    private javafx.scene.control.TextArea logIN_Field;

    /**
     *   Label which holds the window title text.
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Label logIN_Label = new Label();

    /**
     *   Button for verifying valid clock in.
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Button inputOK = new javafx.scene.control.Button();

    /**
     *   AnchorPane with which the main Stage of this Window.
     */
    @javafx.fxml.FXML
    private javafx.scene.layout.AnchorPane logIN_Username_WINDOW;

    /**
     *  Stage for this. window.
     */
    javafx.stage.Stage logIN_Username_STAGE;

    /**
     *  Control "inputCancel" Button, event action to be implemented in the implemented method of actionForCancelButton
     *  interface.
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Button inputCancel;

    private String getUsername; // Stores the input username of a user / employee

    public void setLogIN_Label(String text){
        this.logIN_Label.setText(text);
    }

    @Override
    public void actionOnCancelButton(javafx.event.ActionEvent actionEvent) {
        if(inputCancel.isFocused()) {
            LoadingWindows.loginUsername((javafx.stage.Stage) logIN_Username_WINDOW.getScene().getWindow()).close();
        }
    }
    @javafx.fxml.FXML
    public void verifyLogIN(javafx.scene.input.MouseEvent mouseEvent) {
    }

    @Override
    public void actionOnOkButton(javafx.event.ActionEvent actionEvent) {
        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        if(ClockINPassword.ifUserClocked){
            LoadingWindows.loginUsername((javafx.stage.Stage) logIN_Username_WINDOW.getScene().getWindow()).close();
            LoadingWindows.orderOpenUp().show();
        }else {
            logIN_Label.setText("Invalid Login");
        }
    }

    @javafx.fxml.FXML
    public void insertKey(javafx.event.ActionEvent actionEvent) {
    }

    public void changeLoginLabel(String newLableTitle){
        logIN_Label.setText(newLableTitle);
    }
}
