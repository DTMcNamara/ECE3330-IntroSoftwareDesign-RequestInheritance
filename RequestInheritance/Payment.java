package RequestInheritance;


/**
 * The class Payment is used to form
 * Payment objects for the server to pass.
 */
public class Payment{

    /**
     * The String Sender holds
     * the sender name as a string.
     */
    private String Sender;

    /**
     * The int amount hold the amount to
     * be sent in the payment.
     */
    private int amount;

    /**
     * The String receiver holds the
     * recipient of the payment.
     */
    private String Receiver;

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public Payment(){}

    /**
     * The full constructor is used to
     * generate a new payment with the
     * passed information.
     *
     * @param senderPass   The senderPass parameter is used
     *                     to pass the sender of the payment to
     *                     the constructor.
     * @param amountPass   The amountPass parameter is used
     *                     to pass the amount of the payment
     *                     to the constructor.
     * @param receiverPass The receiverPass parameter is used
     *                     to pass the name of the receiver
     *                     to the constructor.
     */
    public Payment(String senderPass, int amountPass, String receiverPass){
        this.Sender = senderPass;
        this.amount = amountPass;
        this.Receiver = receiverPass;
    }

    /**
     * The getSender method is used to get
     * the sender of a payment as a string.
     *
     * @return The return is the Sender of
     *         the Payment as a string.
     */
    public String getSender() {
        return Sender;
    }

    /**
     * The getAmount method is used to get
     * the amount of a payment as an int.
     *
     * @return The return is the amount of
     *         the Payment as an int.
     */
    public int getAmount() {
        return amount;
    }

    /**
     * The getReceiver method is used to get
     * the Receiver of a payment as a string.
     *
     * @return The return is the receiver of
     *         the Payment as a string.
     */
    public String getReceiver() {
        return Receiver;
    }

    /**
     * The setSender method is used to set
     * the sender of a payment to the passed
     * string.
     *
     * @param sender The sender parameter is used
     *               to pass the new sender of the
     *               payment to the method.
     */
    public void setSender(String sender) {
        Sender = sender;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * The setReceiver method is used to set
     * the receiver of a payment to the passed
     * string.
     *
     * @param receiver The receiver parameter is used
     *                 to pass the new receiver of the
     *                 payment to the method.
     */
    public void setReceiver(String receiver) {
        Receiver = receiver;
    }
}
