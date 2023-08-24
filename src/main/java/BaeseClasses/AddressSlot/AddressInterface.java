package BaeseClasses.AddressSlot;

// Interface helps access Address class indirectly.
public interface AddressInterface {
    static Address getAddress(){
        return new Address();
    }
}
