/**
 * Sends notifications through WhatsApp.
 *
 * @author Joseph Van Dam
 * @version 1.0
 */
public class WhatsAppService implements NotificationMedium {

    /**
     * Sends a WhatsApp message.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending message: " + message);
    }
}