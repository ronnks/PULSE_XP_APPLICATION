package pulse_xp_system;

/**
 *     the class features a full description for the controlling of the window and components of the "Order_OpenUp_CONTROLLER".
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Order_OpenUp_CONTROLLER {
    @FXML
    private Button callerID1, callerID2, callerID3, callerID4, callerids, coupns, finish, giftcard
            , logout, order, orders, others, payment, quickPAYMENT, take_order, training, welcome;


    public void initialize(){
        order.setDisable(true);
        coupns.setDisable(true);
        finish.setDisable(true);
        others.setDisable(true);
        payment.setDisable(true);
        welcome.setDisable(true);
    }
    public void Log_Out(ActionEvent actionEvent) {
    }

    public void Gift_Card(ActionEvent actionEvent) {
    }

    public void Orders(ActionEvent actionEvent) {
    }

    public void Quick_Payment(ActionEvent actionEvent) {
    }

    public void Caller_IDS(ActionEvent actionEvent) {
    }

    public void Training(ActionEvent actionEvent) {
    }

    public void Welcome(ActionEvent actionEvent) {
    }

    public void Order(ActionEvent actionEvent) {
    }

    public void Others(ActionEvent actionEvent) {
    }

    public void Coupons(ActionEvent actionEvent) {
    }

    public void Payment(ActionEvent actionEvent) {
    }

    public void Finish(ActionEvent actionEvent) {
    }

    public void CALLER__ID(ActionEvent actionEvent) {
    }

    public void Take_CarryoutORDER(ActionEvent actionEvent) {
    }
}
