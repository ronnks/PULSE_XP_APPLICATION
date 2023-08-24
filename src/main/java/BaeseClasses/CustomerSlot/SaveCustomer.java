package BaeseClasses.CustomerSlot;

import java.util.ArrayList;
import java.util.List;

public class SaveCustomer {
    public static final List<Customer> customersList = new ArrayList<>();

    public static List<Customer> getCustomersList(){
        return customersList;
    }

    public static void saveCustomer(Customer customer) {
        customersList.add(customer);
    }
}
