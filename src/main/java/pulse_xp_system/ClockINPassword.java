package pulse_xp_system;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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
    private javafx.stage.Stage ClockInPAssword_STAGE = new Stage();
    private String getPassword;
    public void initialize(){
        inputEnter.setDisable(true);
    }

    public void verifyManagerpasswordTextArea(javafx.scene.input.MouseEvent mouseEvent) {
    }

    @Override
    public void actionOnEnterButton(javafx.event.ActionEvent actionEvent) {
        getPassword = passwordTextArea.getText();

        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        for(PulseApplication.Employee employee : employeesList){
            for(String username : clockedInUser_List){
                if(username.equals(employee.getUserName()) && getPassword.equals(employee.getPassword())){
                    PulseApplication.EmployeeTesting.verifiedClockedInUser_List.add(getPassword);
                    ClockInPAssword_STAGE.close();
                }else {
                    infoLabel.setText("Invalid Login");
                    passwordTextArea.clear();
                }
            }
        }
    }

    public void verifyPassword(javafx.scene.input.MouseEvent mouseEvent) {
    }

    public void actionOnCancelButton(ActionEvent actionEvent) {
        if(inputCancel.isFocused()) {
            ClockInPAssword_STAGE = (javafx.stage.Stage) passwordAnchorPane.getScene().getWindow();
            ClockInPAssword_STAGE.close();
        }
    }
     public void getLogINPassword(KeyEvent event) {
        getPassword = passwordTextArea.getText();

        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();


        if(!getPassword.isBlank() && !getPassword.isEmpty()) {
            inputEnter.setDisable(false);
        }else {
            inputEnter.setDisable(true);
        }
    }
}