package pulse_xp_system;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.stream.Stream;

import static pulse_xp_system.PulseApplication.EmployeeTesting.clockedInUser_List;
import static pulse_xp_system.PulseApplication.EmployeeTesting.teamMemberInsertion;

/**
 *     the class features a full description for verification to
 *     the password entry which is the next process of the clock in entry
 */

public class Clock_in_ClockingINUsername_Controller implements ActionForCancelButton, ActionForClockINButton {

    /**
     *
     * This is the label / title for the window.
     */
    @javafx.fxml.FXML
    public Label loginLabel;
    /**
     * This is the label for the summary title.
     */
    @javafx.fxml.FXML
    public Label summaryLabel;
    /**
     * This is the label which shows the employee's name on clocking in.
     */
    @javafx.fxml.FXML
    public Label nameLabel_TITLE;
    /**
     * This is the label which represents the time the employee clocked in.
     */
    @javafx.fxml.FXML
    public Label timeClockedIN_Label_TITLE;
    /**
     * This is the label holding the job position for the employee clocking in.
     */
    @javafx.fxml.FXML
    public Label label_TITLE_ForPosition;
    /**
     * This label 3 is an option label for other info to be represented in future.
     */
    @javafx.fxml.FXML
    public Label option3_Label;
    /**
     * This is the result from the label 3 option label.
     */
    @javafx.fxml.FXML
    public Label option3_Input;
    /**
     * This label holds the date for the current date the employee clocked in.
     */
    @javafx.fxml.FXML
    public Label dateLabel;
    /**
     * This label describes more information about an employee's status in the PULSE SYSTEM, it's optional.
     */
    @javafx.fxml.FXML
    public Label moreINFO_Label;
    /**
     * This is the button ID for cancel BUTTON.
     */
    @javafx.fxml.FXML
    public Button inputCancel1;
    /**
     *  This is the entire area for the employee clocking in summary for the current day.
     */
    public Label summaryBOX;
    /**
     * THIS IS THE MAIN WINDOW.
     */
    @javafx.fxml.FXML
    private AnchorPane ClockInUsername_WINDOW;

    /**
     * THIS IS STAGE WHICH HOLDS THE MAIN WINDOW.
     */
    private Stage ClockInUsername_STAGE;

    /**
     *  the text area holds the clock in value for username
     */
    @javafx.fxml.FXML
    private javafx.scene.control.TextArea usernameClockIN;

    /**
     *  the buttons hold all appropreiate interface button for holding values and excuting action
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Button inputCancel, inputClockIN;

    /**
     *  the labels hold all appropreiate interface labels for holding values and excuting action
     */
    @javafx.fxml.FXML
    private javafx.scene.control.Label nameLabel = new Label(), timeClockedIN_Label = new Label(), labelForPosition = new Label(), option1_Label = new Label(), option2_Label = new Label(), option1_Input = new Label(), option2_Input = new Label(), alertLabel = new Label();

    private javafx.stage.Stage UsernameCLOCKINstage = new Stage();

    /**
     *  Accessing the username for the clocking in employee.
     */
    static protected String username;

    public void initialize(){
        inputClockIN.setDisable(true);
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void verifyUsernameCLOCKIN(KeyEvent mouseEvent) {
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void insertKey(javafx.event.ActionEvent actionEvent) {
        System.out.println("Inside insertKey(javafx.event.ActionEvent actionEvent) method");
        /**
         *  Before there is any text in the "usernameClockIN" textArea, keep the ""Clock in" disabled.
         *  */
        if(usernameClockIN.getText() == null){
            inputClockIN.setDisable(true);
        }
        System.out.println("Done with insertKey(javafx.event.ActionEvent actionEvent) method");
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void update_LABEL(javafx.scene.input.MouseEvent mouseEvent) {
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void update_INPUT(javafx.scene.input.MouseEvent mouseEvent) {
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void updateLabel(javafx.scene.input.MouseEvent mouseEvent) {
    }

    /**
     *
     */
    @javafx.fxml.FXML
    private void updateAlertLabel(javafx.scene.input.MouseEvent mouseEvent) {
    }

    @Override
    public void actionOnCancelButton(javafx.event.ActionEvent actionEvent) {
        System.out.println("Inside actionOnCancelButton(javafx.event.ActionEvent actionEvent) method");
        if(inputCancel.isFocused()) {
            ClockInUsername_STAGE = (javafx.stage.Stage) ClockInUsername_WINDOW.getScene().getWindow();
            ClockInUsername_STAGE.close();
        }
        System.out.println("Done with actionOnCancelButton(javafx.event.ActionEvent actionEvent) method");
    }

    private void clockINButtonHelper1(){
        /**
         * matches the predicate to find if the entered pattern matches any username in "onScheduleTeam".
         */
        var ifUsernameIN_onScheduleTeam = PulseApplication.EmployeeTesting.onScheduleTeam.keySet()
                .stream()
                .map(_username -> _username)
                .anyMatch(_username -> _username.equals(username));

        /**
         * IF: text in the textArea is equal to any employee usernames in the "onScheduleTeam";
         *      Switch to the "Clock_in_Password" stage for the next process.
         */
        if (ifUsernameIN_onScheduleTeam) {
            PulseApplication.EmployeeTesting.clockedInUser_List.add(username);

            ClockInUsername_STAGE = (javafx.stage.Stage) ClockInUsername_WINDOW.getScene().getWindow();
            ClockInUsername_STAGE.close();
            try {

                javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Clock_in_Password.fxml")));
                javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
                UsernameCLOCKINstage.setScene(scene);
                UsernameCLOCKINstage.show();

            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        }

    }

    private void clockINButtonHelper2(){
        var ifUsernameIN_onScheduleTeam = PulseApplication.EmployeeTesting.onScheduleTeam.keySet()
                .stream()
                .map(_username -> _username)
                .anyMatch(_username -> _username.equals(username));

        /**
         * matches the predicate to find if the entered pattern matches any username in "onScheduleTeam".
         */
        var ifUsernameIN_inSystemTeam = PulseApplication.EmployeeTesting.inSystemTeam.keySet()
                .stream()
                .map(_username -> _username)
                .anyMatch(_username -> _username.equals(username));

        if (!ifUsernameIN_onScheduleTeam && ifUsernameIN_inSystemTeam) {
            /**
             *   if a user is not scheduled for the day, they require manager's authorization to pass by the clock in passage.
             */
            alertLabel.setText("Not Scheduled for today!");

            try {
                LoadingWindows.openLogInOverride().getClass();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }

    private void clockINButtonHelper3(){
        var ifUsernameIN_onScheduleTeam = PulseApplication.EmployeeTesting.onScheduleTeam.keySet()
                .stream()
                .map(_username -> _username)
                .anyMatch(_username -> _username.equals(username));

        var ifUsernameIN_inSystemTeam = PulseApplication.EmployeeTesting.inSystemTeam.keySet()
                .stream()
                .map(_username -> _username)
                .anyMatch(_username -> _username.equals(username));

        if (!ifUsernameIN_onScheduleTeam && !ifUsernameIN_inSystemTeam) {
            /**
             *   if an user is not in the "inSystemTeam" Map which is the registered employee database , they shoud first be registered in the system.
             */
            alertLabel.setText("Invalid Login");
            usernameClockIN.clear();
        }
    }

    @Override
    public void actionOnClockINButton(javafx.event.ActionEvent actionEvent) {
        System.out.println("Inside actionOnClockINButton(javafx.event.ActionEvent actionEvent) method");
        username = usernameClockIN.getText();
        PulseApplication.VerifyUserLog_IN.userLogIN_USERNAME = username;

        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        clockINButtonHelper1();
        clockINButtonHelper2();
        clockINButtonHelper3();

        System.out.println("Done with actionOnClockINButton(javafx.event.ActionEvent actionEvent) method");
    }

    public void getLogIN(KeyEvent event) {
        System.out.println("Inside getLogIN(KeyEvent event) method");
        username = usernameClockIN.getText();

        new PulseApplication.EmployeeTesting();
        teamMemberInsertion();

        //Keeping track of the clockin time.
        LocalDateTime localDateTime = LocalDateTime.now();
        String pattern = "E MM:dd:YYYY -- h:m";
        var dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        String getFormatter = dateTimeFormatter.toString();

        /**
         * value --> is the fullname of the employee logging in accessed and retrived based on the corresponding
         *           key value entered which is related to the username.
         */
       String getFullName = null;

        for (PulseApplication.Employee employee : PulseApplication.EmployeeTesting.employeesList) {
            if(employee.getUserName().equals(username)){
                getFullName = employee.getFullName();
            }
        }

        /**
         * IF: to control what actions happen when the user is entering keys in the "usernameClockIN"
         */
        if(!username.isBlank() && !username.isEmpty()) {
            //updating labels
            nameLabel.setText(getFullName);
            timeClockedIN_Label.setText(getFormatter);
            inputClockIN.setDisable(false);
        }else {
            nameLabel.setText("");
            timeClockedIN_Label.setText("");
            inputClockIN.setDisable(true);
        }
        System.out.println("Done with getLogIN(KeyEvent event) method");
    }
}
