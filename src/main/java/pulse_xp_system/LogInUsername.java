package pulse_xp_system;

<<<<<<< HEAD
import javafx.scene.control.Label;

import static pulse_xp_system.PulseApplication.EmployeeTesting.USER_userName_Password_Map;
import static pulse_xp_system.PulseApplication.EmployeeTesting.teamMemberInsertion;

=======
>>>>>>> 3f0bb5f52f2e28456de37fcec414e7585a435211
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
<<<<<<< HEAD
    private javafx.scene.control.Label logIN_Label = new Label();
=======
    private javafx.scene.control.Label logIN_Label;
>>>>>>> 3f0bb5f52f2e28456de37fcec414e7585a435211

    /**
     *   Button for verifying valid clock in.
     */
    @javafx.fxml.FXML
<<<<<<< HEAD
    private javafx.scene.control.Button inputOK = new javafx.scene.control.Button();
=======
    private javafx.scene.control.Button inputOk = new javafx.scene.control.Button();
>>>>>>> 3f0bb5f52f2e28456de37fcec414e7585a435211

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

<<<<<<< HEAD
    private String getUsername; // Stores the input username of a user / employee

    public void setLogIN_Label(String text){
        this.logIN_Label.setText(text);
    }

=======
>>>>>>> 3f0bb5f52f2e28456de37fcec414e7585a435211
    @Override
    public void actionOnCancelButton(javafx.event.ActionEvent actionEvent) {
        if(inputCancel.isFocused()) {
            logIN_Username_STAGE = (javafx.stage.Stage) logIN_Username_WINDOW.getScene().getWindow();
            logIN_Username_STAGE.close();
        }
    }
    @javafx.fxml.FXML
    public void verifyLogIN(javafx.scene.input.MouseEvent mouseEvent) {
    }

    @Override
    public void actionOnOkButton(javafx.event.ActionEvent actionEvent) {
<<<<<<< HEAD
        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        if(ClockINPassword.ifUserClocked){
            LoadingWindows.logInClockIn().close();
            logIN_Username_STAGE = (javafx.stage.Stage) logIN_Username_WINDOW.getScene().getWindow();
            logIN_Username_STAGE.close();
            LoadingWindows.orderOpenUp();
        }else {
            logIN_Label.setText("Invalid Login");
=======
        /**
         * Stage to create and display the "Order_openUP".
         */
        javafx.stage.Stage loadingOrder_openUP_STAGE = new javafx.stage.Stage();

        if(inputOk.isFocused()) {

            for(String confirmUser_Username : PulseApplication.EmployeeTesting.clockedInUser_List){
                if (logIN_Field.getText().equals(confirmUser_Username)) {

                    try {
                        javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Order_openUP.fxml")));
                        javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
                        loadingOrder_openUP_STAGE.setScene(scene);
                        loadingOrder_openUP_STAGE.show();

                    } catch (Exception exception) {
                        System.out.println(exception.getMessage());
                    }
                }else {
                    logIN_Label.setText("Not Clocked In");
                    logIN_Username_STAGE = (javafx.stage.Stage) logIN_Username_WINDOW.getScene().getWindow();
                    logIN_Username_STAGE.close();
                }
            }
>>>>>>> 3f0bb5f52f2e28456de37fcec414e7585a435211
        }
    }

    @javafx.fxml.FXML
    public void insertKey(javafx.event.ActionEvent actionEvent) {
    }

    public void changeLoginLabel(String newLableTitle){
        logIN_Label.setText(newLableTitle);
    }
}
