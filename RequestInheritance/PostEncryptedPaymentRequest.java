package RequestInheritance;
import java.util.UUID;

/**
 * The PostEncryptedPaymentRequest class
 * inherits from PostPaymentRequest and uses
 * an encryption scheme as a new field.
 */
public class PostEncryptedPaymentRequest extends PostPaymentRequest {

    /**
     * The counter int is used to keep
     * track of the amount of
     * PostEncryptedPaymentRequests generated.
     */
    private static int encryptPaymentCount;

    /**
     * The String encryptionScheme
     * is used to hold the encryptionScheme
     * of the postEncryptedPaymentRequest.
     */
    private String encryptionScheme;

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public PostEncryptedPaymentRequest(){
        super();
        encryptPaymentCount++;
    }

    /**
     * The constructor with passed uuid,
     * form, and payment is used to create
     * objects with a set UUID, payment,
     * EncryptionScheme, and URL.
     *
     * @param ipPass      The ipPass parameter is used
     *                    to pass the IP of the
     *                    postEncryptedPaymentRequest to
     *                    the constructor.
     * @param uuidPass    The uuidPass parameter is
     *                    used to pass the uuid of a
     *                    new PostEncryptedPaymentRequest object.
     * @param pmtPass     The pmtPass parameter is used
     *                    to pass the Payment to
     *                    the postEncryptedPaymentRequest constructor.
     * @param encryptPass The encryptPass parameter is used
     *                    to pass the encryption scheme to the
     *                    constructor.
     */
    public PostEncryptedPaymentRequest(UUID uuidPass, String ipPass, Payment pmtPass, String encryptPass){
        super(uuidPass, ipPass, pmtPass);
        this.encryptionScheme = encryptPass;
        encryptPaymentCount++;
    }

    /**
     * The getEncryptionScheme method is used to
     * get the encryption scheme of the
     * postEncryptedPaymentRequest object.
     *
     * @return  The return is a String
     *          that hold the encryptionScheme
     *          that is associated with the
     *          postEncryptedPaymentRequest object.
     */
    public String getEncryptionScheme() {
        return encryptionScheme;
    }

    /**
     * The setPmt method is used to set
     * the payment of a postPaymentRequest
     * object to the passed payment.
     *
     * @param encryptionScheme The parameter encryptionScheme
     *                         is the encryptionScheme to set
     *                         the postEncryptedPaymentRequest
     *                         encryptionScheme field to.
     */
    public void setEncryptionScheme(String encryptionScheme) {
        this.encryptionScheme = encryptionScheme;
    }

    /**
     * The count method is used to return the
     * total number of postEncryptedPaymentRequests
     * generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         postEncryptedPaymentRequests
     *         generated.
     */
    public static int count(){
        return encryptPaymentCount;
    }

    /**
     * The toString method overrides the
     * default toString method to allow
     * all the data to be printed.
     *
     * @return The return is a string
     *         containing all the data
     *         fields.
     */
    @Override
    public String toString(){
        return ("Post Encrypted Payment Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "IP: " + super.getIP() + "\n"
                + "Sender: " + super.getPmt().getSender() + "\n"
                + "Receiver: " + super.getPmt().getReceiver() + "\n"
                + "Amount: " + super.getPmt().getAmount() + "\n"
                + "Encryption Key: " + encryptionScheme + "\n");
    }
}
