package pulse_xp_system;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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
           //clockin.setDisable(true);
           try {
                Parent fxmlLoader = FXMLLoader.load(getClass().getResource(("Log_in_Username.fxml")));
                javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader);
                loadingLogIN_STAGE.setScene(scene);
                loadingLogIN_STAGE.show();

            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     *  Launches the "ClockingINUsername" stage to be displayed when "clockin" button is pressed.
     */
    @javafx.fxml.FXML
    private void Clock_In(javafx.event.ActionEvent actionEvent) {
        if(clockin.isFocused()){
            //login.setDisable(true);
            try{
                javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Clock_in_ClockingINUsername.fxml")));
                javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
                loadingClockingINUsername_STAGE.setScene(scene);
                loadingClockingINUsername_STAGE.show();

            }catch (Exception exception){
                System.out.println(exception.getMessage());
            }
        }
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void CALLER__ID(javafx.event.ActionEvent actionEvent) {
    }
}
