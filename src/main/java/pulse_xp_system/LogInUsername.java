package pulse_xp_system;

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
    private javafx.scene.control.Label logIN_Label;

    /**
     *   Button for verifying valid clock in.
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Button inputOk = new javafx.scene.control.Button();

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
        }
    }

    @javafx.fxml.FXML
    public void insertKey(javafx.event.ActionEvent actionEvent) {
    }

    public void changeLoginLabel(String newLableTitle){
        logIN_Label.setText(newLableTitle);
    }
}
