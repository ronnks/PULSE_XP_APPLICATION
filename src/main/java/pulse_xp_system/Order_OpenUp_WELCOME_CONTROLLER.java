package pulse_xp_system;

import BaeseClasses.AddressSlot.AddressInterface;
import BaeseClasses.CustomerSlot.CustomerInterface;
import BaeseClasses.CustomerSlot.SaveCustomer;
import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Order_OpenUp_WELCOME_CONTROLLER {

    @FXML
    private TextField address1, address2, delivery_instructions, emailString, instore_instructions, name,
            telephone_number;

    @FXML
    private Button carryout, coupns, coupon1, coupon2, coupon3, coupon4, coupon5, coupon6, coupon7
            , coupon8, customer_info,  delivery, exit, finish, order,  others, payment, rewards, welcome;

    @FXML
    void Address1(ActionEvent event) {
        String getAddress = address1+" "+address2;
        CustomerInterface.getCustomer().setTelephoneNumber(telephone_number.getText());
        CustomerInterface.getCustomer().setCustomerName(name.getText());
        AddressInterface.getAddress().
    }

    @FXML
    void Address2(ActionEvent event) {

    }

    @FXML
    void CarryOut(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION1(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION2(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION3(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION4(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION5(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION6(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION7(ActionEvent event) {

    }

    @FXML
    void Coupon_DIRECTION8(ActionEvent event) {

    }

    @FXML
    void Coupons(ActionEvent event) {

    }

    @FXML
    void Customer_Info(ActionEvent event) {

    }

    @FXML
    void Delivery(ActionEvent event) {

    }

    @FXML
    void EXIT(ActionEvent event) {

    }

    @FXML
    void Finish(ActionEvent event) {

    }

    @FXML
    void Name(ActionEvent event) {

    }

    @FXML
    void Order(ActionEvent event) {

    }

    @FXML
    void Others(ActionEvent event) {

    }

    @FXML
    void Payment(ActionEvent event) {

    }

    @FXML
    void Rewards(ActionEvent event) {

    }

    @FXML
    void Telephone_Number(ActionEvent event) {

    }

    @FXML
    void Welcome(ActionEvent event) {

    }

    @FXML
    void markEMAIL(ActionEvent event) {

    }
}
