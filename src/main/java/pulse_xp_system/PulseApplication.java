package pulse_xp_system;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The class launches and opens up the "PULSE_XP_SYSTEM" for production.
 */

public class PulseApplication extends javafx.application.Application {
    @Override
    public void start(javafx.stage.Stage stage) throws java.io.IOException {
        /**
         *   RUNNING THE APP IN PROGRESS.....
         */


        try{
            javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(PulseApplication.class.getResource(("Log_in_Clock_in_SCREEN.fxml")));
            javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
            stage.setScene(scene);
            stage.show();

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    /**
     *
     * @param args; Contains and runs the entire launch program.
     */
    public static void main(String[] args) {
        launch();
    }


    /**
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------
     *
            *  This Class describes the Employee functionality.
            */

    public static class Employee {
        private  String firstName;
        private  String lastName;
        private  String positionShort;
        private  String userName;
        private  String password;

        public Employee(String firstName, String lastName, String positionShort, String userName, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.positionShort = positionShort;
            this.userName = userName;
            this.password = password;
        }

        public Employee() {

        }

        public  String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public  String getLastName() {
            return this.lastName;
        }

        public  void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public  String getPositionShort() {
            return positionShort;
        }

        public  void setPositionShort(String positionShort) {
            this.positionShort = positionShort;
        }

        public  String getUserName() {
            return userName;
        }

        public  void setUserName(String userName) {
            this.userName = userName;
        }

        public  String getPassword() {
            return password;
        }

        public  void setPassword(String password) {
            this.password = password;
        }


        public  String getFullName() {
            return firstName+" "+lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Employee that)) return false;
            return java.util.Objects.equals(getFirstName(), that.getFirstName()) && java.util.Objects.equals(getLastName(), that.getLastName()) && java.util.Objects.equals(getPositionShort(), that.getPositionShort()) && java.util.Objects.equals(getUserName(), that.getUserName()) && java.util.Objects.equals(getPassword(), that.getPassword());
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(getPassword());
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", positionShort='" + positionShort + '\'' +
                    ", username='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }

    /**
     *
     * -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
     *  The class helps out to using the Tester employee categories for the project initializaion.
     */
    public static class EmployeeTesting{

        /**
         *   LinkedHashMap ---> For mapping scheduled team members {Employees}.
         */
        static public java.util.LinkedHashMap<String, String> onScheduleTeam = new java.util.LinkedHashMap<>();

        /**
         *   LinkedHashMap ---> For mapping team members already in the system {Employees}.
         */
        static public java.util.LinkedHashMap<String, String> inSystemTeam = new java.util.LinkedHashMap<>();

        /**
         *   HashMap ---> For mapping job position short forms to their full forms. Full job titles.
         */
        static public java.util.HashMap<String, String> fullJobPositionTitleMapper = new java.util.HashMap<>();

        /**
         *   HashMap ---> For mapping users usernames to their passwords.
         */
        static public java.util.HashMap<String, String> USER_userName_Password_Map = new java.util.HashMap<>();

       /**
         *   Team member List.
         */
        public static java.util.List<Employee> employeesList = new java.util.ArrayList<>();

        /**
         *   Clocked in Team member List. These are employees who have put in a correct clock in username.
         */
        public static java.util.List<String> clockedInUser_List = new java.util.ArrayList<>();

        /**
         *   VerifiedClocked in Team member List. There are employees who have succefully clocked in.
         */
        public static java.util.List<String> verifiedClockedInUser_List = new java.util.ArrayList<>();

        /**
         *  Method for holding some functionality to be used in test outs of some project stage insertions and
         *  verifications.
         */
        public static void teamMemberInsertion(){
            /**
             *  Adding employees to the List.
             */
            employeesList.add(new Employee("Ronald", "Kato", "AM", "4367", "15"));
            employeesList.add(new Employee("Peter", "Charles", "DR", "8809", "89"));
            employeesList.add(new Employee("Marco", "Cobos", "GM", "0584", "05"));
            employeesList.add(new Employee("Juan", "Tuyub", "INS", "1147", "117"));
            employeesList.add(new Employee("Emilia", "Cruz", "AM", "3334", "334"));
            employeesList.add(new Employee("Walter", "Otega", "INS", "6330", "330"));
            employeesList.add(new Employee("Carlos", "Manche", "DR", "6997", "67"));
            employeesList.add(new Employee("Nabil", "Ehranfgian", "INS", "5044", "504"));
            employeesList.add(new Employee("Carsten", "Artez", "DR", "5673", "56"));

             /**
             * Short to full name of the position.
             */
            fullJobPositionTitleMapper.put("DM", "District Manager");
            fullJobPositionTitleMapper.put("GM", "General Manager");
            fullJobPositionTitleMapper.put("AM", "Assistant Manager");
            fullJobPositionTitleMapper.put("DR", "Driver Expert");
            fullJobPositionTitleMapper.put("INS", "Insider");

            for (Employee employee : employeesList) {
                inSystemTeam.put(employee.getUserName(), employee.getFullName());
            }

            for (int i = 0; i < 4; i++) {
                onScheduleTeam.put(employeesList.get(i).getUserName(), employeesList.get(i).getFullName());
            }

            for (Employee employee : employeesList) {
                USER_userName_Password_Map.put(employee.getUserName(), employee.getPassword());
            }
        }

        public static void main(String[] args) {

            System.out.println(EmployeeTesting.clockedInUser_List);
            System.out.println(EmployeeTesting.verifiedClockedInUser_List);

        }
    }

    /**
     * --------------------------------------------------------------------------------------------------------------------------------------------------------------------
     *
     *  Class helps in accessing the initial user logins.
     *
     *
     */


    public static class VerifyUserLog_IN {
        public static String userLogIN_USERNAME;
        public static String getUserLogIN_PASSWORD;

        public VerifyUserLog_IN(String USERNAME, String PASSWORD) {
            userLogIN_USERNAME = USERNAME;
            getUserLogIN_PASSWORD = PASSWORD;
        }


        public VerifyUserLog_IN(){

        }

        public static String getUserLogIN_USERNAME() {
            return userLogIN_USERNAME;
        }

        public static void setUserLogIN_USERNAME(String USERNAME) {
            userLogIN_USERNAME = USERNAME;
        }

        public static String getGetUserLogIN_PASSWORD() {
            return getUserLogIN_PASSWORD;
        }

        public static void setGetUserLogIN_PASSWORD(String PASSWORD) {
            getUserLogIN_PASSWORD = PASSWORD;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof VerifyUserLog_IN that)) return false;
            return java.util.Objects.equals(getUserLogIN_USERNAME(), that.getUserLogIN_USERNAME()) && java.util.Objects.equals(getGetUserLogIN_PASSWORD(), that.getGetUserLogIN_PASSWORD());
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(getGetUserLogIN_PASSWORD());
        }

        @Override
        public String toString() {
            return "VerifyUserLog_IN{" +
                    "userLogIN_USERNAME='" + userLogIN_USERNAME + '\'' +
                    ", getUserLogIN_PASSWORD='" + getUserLogIN_PASSWORD + '\'' +
                    '}';
        }
    }
}