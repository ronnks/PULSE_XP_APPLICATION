package pulse_xp_system;

/**
 * The interface is aimed at modifying the "clock in" button action on each applied instance.
 */

public interface ActionForClockINButton {

    /**
     *
     * @param actionEvent; Allows in the event acted upon by the clock_in button.
     */
    void actionOnClockINButton(javafx.event.ActionEvent actionEvent);
}
