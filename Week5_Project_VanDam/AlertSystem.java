import java.util.ArrayList;

/**
 * Manages user alerts using a flexible notification medium.
 * Uses composition to allow notification services to be
 * swapped without changing the AlertSystem class.
 *
 * @author Joseph Van Dam
 * @version 1.0
 */
public class AlertSystem {

    private NotificationMedium medium;
    private ArrayList<String> messageLog;

    /**
     * Creates an AlertSystem with an initial notification medium.
     *
     * @param medium the notification medium to use
     */
    public AlertSystem(NotificationMedium medium) {
        this.medium = medium;
        this.messageLog = new ArrayList<>();
    }

    /**
     * Changes the notification medium.
     *
     * @param medium the new notification medium
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a message and stores it in the log.
     *
     * @param message the message to send
     */
    public void notifyUser(String message) {
        medium.send(message);
        messageLog.add(message);
    }

    /**
     * Displays all messages sent during the session.
     */
    public void printLog() {
        System.out.println("\nMessage Log:");
        for (String message : messageLog) {
            System.out.println("- " + message);
        }
    }

    /**
     * Main method used to test the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        AlertSystem alertSystem = new AlertSystem(new EmailService());

        alertSystem.notifyUser("Your appointment is tomorrow.");

        alertSystem.setMedium(new SMSService());

        alertSystem.notifyUser("Your verification code is 123456.");

        alertSystem.setMedium(new WhatsAppService());

        alertSystem.notifyUser("Your order has shipped.");

        alertSystem.printLog();
    }
}