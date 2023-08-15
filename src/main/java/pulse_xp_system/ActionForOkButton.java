package pulse_xp_system;

/**
 * The interface is aimed at modifying the OK button action on each applied instance.
 */

public interface ActionForOkButton {
    /**
     *
     * @param actionEvent; Allows in the event acted upon by the Ok button.
     */
    void actionOnOkButton(javafx.event.ActionEvent actionEvent);
}
