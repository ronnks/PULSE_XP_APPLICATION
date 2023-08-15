package pulse_xp_system;

/**
 * The interface is aimed at modifying the cancel button action on each applied instance.
 */
public interface ActionForCancelButton {
    /**
     *
     * @param actionEvent; Allows in the event acted upon by the Cancel button.
     */
    void actionOnCancelButton(javafx.event.ActionEvent actionEvent);
}
