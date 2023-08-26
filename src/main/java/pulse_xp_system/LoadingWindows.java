package pulse_xp_system;

import javafx.stage.StageStyle;

/**
 *  Class constructs and opens up directed specified system windows from the provided static methods.
 */
public interface LoadingWindows {

    static javafx.stage.Stage logInOverride(){
        javafx.stage.Stage openLogInOverrideWindow = new javafx.stage.Stage();
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Username.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            openLogInOverrideWindow.setScene(scene);
            openLogInOverrideWindow.show();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return openLogInOverrideWindow;
    }

    static javafx.stage.Stage loginUsername(javafx.stage.Stage openloginUsername){
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Username.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            openloginUsername.setScene(scene);
            openloginUsername.initStyle(StageStyle.UNDECORATED);
            openloginUsername.show();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return openloginUsername;
    }

    static javafx.stage.Stage orderOpenUp(){
        javafx.stage.Stage openOrderOpenUpWindow = new javafx.stage.Stage();
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Order_openUP.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            openOrderOpenUpWindow.setScene(scene);
            openOrderOpenUpWindow.show();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return openOrderOpenUpWindow;
    }

    static javafx.stage.Stage logInClockIn(){
        javafx.stage.Stage logInClockInWindow = new javafx.stage.Stage();
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Clock_in_SCREEN.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            logInClockInWindow.setScene(scene);
            logInClockInWindow.show();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return logInClockInWindow;
    }
}
