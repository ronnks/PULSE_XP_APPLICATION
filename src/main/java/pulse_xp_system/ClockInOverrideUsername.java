package pulse_xp_system;

/**
 *  The Class controls the "ClockInOverrideUsername" Window with implemented button control methods.
 */

public class ClockInOverrideUsername implements ActionForCancelButton {
    /**
     *   AnchorPane with which the main Stage of this Window.
     */
    @javafx.fxml.FXML
    private javafx.scene.layout.AnchorPane clockInOverrideUsername_WINDOW;

    /**
     *  Control "inputCancel" Button, event action to be implemented in the implemented method of actionForCancelButton
     *  interface.
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Button inputCancel;

    @Override
    public void actionOnCancelButton(javafx.event.ActionEvent actionEvent) {
        javafx.stage.Stage ClockInOverrideUsername_STAGE;
        if(inputCancel.isFocused()) {
            ClockInOverrideUsername_STAGE = (javafx.stage.Stage) clockInOverrideUsername_WINDOW.getScene().getWindow();
            ClockInOverrideUsername_STAGE.close();
        }
    }
}
