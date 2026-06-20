/**
 * Represents a notification method that can send a message.
 *
 * @author Joseph Van Dam
 * @version 1.0
 */
public interface NotificationMedium {

    /**
     * Sends a notification message.
     *
     * @param message the message to send
     */
    void send(String message);
}