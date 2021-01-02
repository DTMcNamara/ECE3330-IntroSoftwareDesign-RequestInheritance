package RequestInheritance;
import java.util.UUID;

/**
 * The PostEncryptedFormRequest class
 * inherits from PostFormRequest and uses
 * an encryption scheme as a new field.
 */
public class PostEncryptedFormRequest extends PostFormRequest {

    /**
     * The counter int is used to keep
     * track of the amount of
     * PostEncryptedFormRequests generated.
     */
    private static int encryptFormCounter;

    /**
     * The String encryptionKey
     * is used to hold the encryption key
     * of the postEncryptedFormRequest.
     */
    private String encryptionKey;

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public PostEncryptedFormRequest(){
        super();
        encryptFormCounter++;
    }

    /**
     * The constructor with passed uuid,
     * form, and payment is used to create
     * objects with a set UUID, payment,
     * EncryptionScheme, and URL.
     *
     * @param ipPass      The ipPass parameter is used
     *                    to pass the IP of the
     *                    postEncryptedFormRequest to
     *                    the constructor.
     * @param uuidPass    The uuidPass parameter is
     *                    used to pass the uuid to the
     *                    Constructor.
     * @param formPass    The formPass parameter is used
     *                    to pass the form to
     *                    the constructor.
     * @param encryptPass The encryptPass parameter is used
     *                    to pass the encryption scheme to the
     *                    constructor.
     */
    public PostEncryptedFormRequest(UUID uuidPass, String ipPass, Form formPass, String encryptPass){
        super(uuidPass,ipPass,formPass);
        this.encryptionKey=encryptPass;
        encryptFormCounter++;
    }

    /**
     * The getEncryptionKey method is used to
     * get the encryption key of the
     * postEncryptedFormRequest object.
     *
     * @return  The return is a String
     *          that hold the encryption key
     *          that is associated with the
     *          postEncryptedFormRequest object.
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * The setPmt method is used to set
     * the payment of a postPaymentRequest
     * object to the passed payment.
     *
     * @param encryptionKey    The parameter encryptionKey
     *                         is the encryptionKey to set
     *                         the postEncryptedFormRequest
     *                         encryptionKey field to.
     */
    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * The count method is used to return the
     * total number of postEncryptedFormRequests
     * generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         postEncryptedFormRequests
     *         generated.
     */
    public static int count(){
        return encryptFormCounter;
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
                + "Form Info: " + "\n"
                + super.getForm().toString() + "\n"
                + "Encryption Key: " + encryptionKey + "\n");
    }
}
