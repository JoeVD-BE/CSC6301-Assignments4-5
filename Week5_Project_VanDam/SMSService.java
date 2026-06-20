/**
 * Sends notifications through SMS text messages.
 *
 * @author Joseph Van Dam
 * @version 1.0
 */
public class SMSService implements NotificationMedium {

    /**
     * Sends a message using SMS.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}