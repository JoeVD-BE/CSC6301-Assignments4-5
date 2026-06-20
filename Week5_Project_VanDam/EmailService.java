/**
 * Sends notifications through email.
 *
 * @author Joseph Van Dam
 * @version 1.0
 */
public class EmailService implements NotificationMedium {

    /**
     * Sends a message using email.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
