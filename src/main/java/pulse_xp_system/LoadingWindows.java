package pulse_xp_system;

import javafx.stage.StageStyle;

/**
 *  Class constructs and opens up directed specified system windows from the provided static methods.
 */
public interface LoadingWindows {

    static javafx.stage.Stage logInOverride(javafx.stage.Stage openLogInOverrideWindow){
        //openLogInOverrideWindow.initStyle(StageStyle.UNDECORATED);
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Username.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            openLogInOverrideWindow.setScene(scene);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return openLogInOverrideWindow;
    }

    static javafx.stage.Stage logInOverride(){
        javafx.stage.Stage openLogInOverrideWindow = new javafx.stage.Stage();
        //openLogInOverrideWindow.initStyle(StageStyle.UNDECORATED);
        logInOverride(openLogInOverrideWindow);
        return openLogInOverrideWindow;
    }

    static javafx.stage.Stage loginUsername(javafx.stage.Stage openloginUsername){
        //openloginUsername.initStyle(StageStyle.UNDECORATED);
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Username.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            openloginUsername.setScene(scene);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return openloginUsername;
    }

    static javafx.stage.Stage loginUsername(){
        javafx.stage.Stage openloginUsername = new javafx.stage.Stage();
        //openloginUsername.initStyle(StageStyle.UNDECORATED);
        loginUsername(openloginUsername);
        return openloginUsername;
    }

    static javafx.stage.Stage orderOpenUp(javafx.stage.Stage openOrderOpenUpWindow){
        //openOrderOpenUpWindow.initStyle(StageStyle.UNDECORATED);
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Order_openUP.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            openOrderOpenUpWindow.setScene(scene);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return openOrderOpenUpWindow;
    }

    static javafx.stage.Stage orderOpenUp(){
        javafx.stage.Stage openOrderOpenUpWindow = new javafx.stage.Stage();
        //openOrderOpenUpWindow.initStyle(StageStyle.UNDECORATED);
        orderOpenUp(openOrderOpenUpWindow);
        return openOrderOpenUpWindow;
    }

    static javafx.stage.Stage logInClockIn(javafx.stage.Stage logInClockInWindow){
        //logInClockInWindow.initStyle(StageStyle.UNDECORATED);
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Clock_in_SCREEN.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            logInClockInWindow.setScene(scene);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return logInClockInWindow;
    }

    static javafx.stage.Stage logInClockIn(){
        javafx.stage.Stage logInClockInWindow = new javafx.stage.Stage();
        //logInClockInWindow.initStyle(StageStyle.UNDECORATED);
        logInClockIn(logInClockInWindow);
        return logInClockInWindow;
    }

    static javafx.stage.Stage clock_in_ClockingINUsernameckIn(javafx.stage.Stage clock_in_ClockingINUsernameWindow){
        //clock_in_ClockingINUsernameWindow.initStyle(StageStyle.UNDECORATED);
        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Clock_in_ClockingINUsername.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            clock_in_ClockingINUsernameWindow.setScene(scene);

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        return clock_in_ClockingINUsernameWindow;
    }

    static javafx.stage.Stage clock_in_ClockingINUsername(){
        javafx.stage.Stage clock_in_ClockingINUsernameWindow = new javafx.stage.Stage();
        //clock_in_ClockingINUsernameWindow.initStyle(StageStyle.UNDECORATED);
        clock_in_ClockingINUsernameckIn(clock_in_ClockingINUsernameWindow);
        return clock_in_ClockingINUsernameWindow;
    }
}
