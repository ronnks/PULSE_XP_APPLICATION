package pulse_xp_system;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import static pulse_xp_system.PulseApplication.EmployeeTesting.*;

/**
 *  This Class Launches the "ClockInOverridepasswordTextArea" Window.
 */
public class ClockINPassword implements ActionForEnterButton{

    @javafx.fxml.FXML
    private javafx.scene.control.Button inputCancel, inputEnter;
    @javafx.fxml.FXML
    public Label passwordLabel, infoLabel;

    @javafx.fxml.FXML
    private javafx.scene.layout.AnchorPane passwordAnchorPane;

    @javafx.fxml.FXML
    private javafx.scene.control.TextArea passwordTextArea;
    private javafx.stage.Stage clockInPassword_STAGE = new Stage();
    private String getPassword;
    public static boolean ifUserClocked;
    public void initialize(){
        inputEnter.setDisable(true);
    }

    public void verifyManagerpasswordTextArea(javafx.scene.input.MouseEvent mouseEvent) {
    }

    @Override
    public void actionOnEnterButton(javafx.event.ActionEvent actionEvent) {
        System.out.println("Inside actionOnEnterButton(javafx.event.ActionEvent actionEvent) method");
        getPassword = passwordTextArea.getText();
        PulseApplication.VerifyUserLog_IN.getUserLogIN_PASSWORD = getPassword;

        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        /**
         * Variable streams the map, mapping each key to comparing it to the input password to produce a boolean
         *   value to be used in the `IF:` validation.
         */
        var ifBothUsername_PasswordMatchForAnEmp = USER_userName_Password_Map.entrySet().stream().map(entry -> entry)
                .anyMatch(entry -> entry.getKey().equals(PulseApplication.VerifyUserLog_IN.userLogIN_USERNAME) &&
                        entry.getValue().equals(PulseApplication.VerifyUserLog_IN.getUserLogIN_PASSWORD));

        if(ifBothUsername_PasswordMatchForAnEmp){
            PulseApplication.EmployeeTesting.verifiedClockedInUser_List.add(getPassword);
            clockInPassword_STAGE = (javafx.stage.Stage) passwordAnchorPane.getScene().getWindow();
            clockInPassword_STAGE.close();
        }else {
            infoLabel.setText("Invalid Login");
            passwordTextArea.clear();
        }
        ifUserClocked = ifBothUsername_PasswordMatchForAnEmp;
        System.out.println("Done with actionOnEnterButton(javafx.event.ActionEvent actionEvent) method");
    }

    public void verifyPassword(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void actionOnCancelButton(ActionEvent actionEvent) {
        System.out.println("Inside actionOnCancelButton(ActionEvent actionEvent) method");
        if(inputCancel.isFocused()) {
            clockInPassword_STAGE = (javafx.stage.Stage) passwordAnchorPane.getScene().getWindow();
            clockInPassword_STAGE.close();
        }
        System.out.println("Done with actionOnCancelButton(ActionEvent actionEvent) method");
    }
     public void getLogINPassword(KeyEvent event) {
        System.out.println("Inside getLogINPassword(KeyEvent event) method");
        getPassword = passwordTextArea.getText();

        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        if(!getPassword.isBlank() && !getPassword.isEmpty()) {
            inputEnter.setDisable(false);
        }else {
            inputEnter.setDisable(true);
        }
        System.out.println("Done with getLogINPassword(KeyEvent event) method");
    }
}