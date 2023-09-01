package pulse_xp_system;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 *  The class sets up full active and associated windows for the Log_in_Clock_in_SCREEN.
 */
public class Log_in_Clock_in_SCREEN_Controller{

    /**
     *  Holds buttons with login and clockin IDs.
     */
    @javafx.fxml.FXML
    public javafx.scene.control.Button login = new Button(), clockin = new Button();

    /**
     *  Holds the "Log_in_Clock_in" stage of this window.
     */
    @javafx.fxml.FXML
    private AnchorPane log_in_Clock_in_WINDOW;

    /**
     *  Holds the "ClockingINUsername" stage to be displayed when "clockin" button is pressed.
     */
    @javafx.fxml.FXML
    private javafx.stage.Stage loadingClockingINUsername_STAGE = new Stage();

    /**
     *  Holds the "log-IN" stage to be displayed when "login" button is pressed.
     */
    @javafx.fxml.FXML
    private javafx.stage.Stage loadingLogIN_STAGE = new Stage();

    public void initialize(){

    }

    /**
     *   Launches the "Log_IN" stage to be displayed when "login" button is pressed.
     */
    @javafx.fxml.FXML
    private void Log_In(javafx.event.ActionEvent actionEvent) {
        if(login.isFocused()) {
            LoadingWindows.loginUsername().show();
        }
    }

    /**
     *  Launches the "ClockingINUsername" stage to be displayed when "clockin" button is pressed.
     */
    @javafx.fxml.FXML
    private void Clock_In(javafx.event.ActionEvent actionEvent) {
        if(clockin.isFocused()){
            LoadingWindows.clock_in_ClockingINUsername().show();
        }
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void CALLER__ID(javafx.event.ActionEvent actionEvent) {
    }
}
