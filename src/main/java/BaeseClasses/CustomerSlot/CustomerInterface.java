package BaeseClasses.CustomerSlot;

import BaeseClasses.AddressSlot.Address;

//Interface helps access customer class indirectly.
public interface CustomerInterface {
    static Customer getCustomer(){
        return new Customer();
    }
}
