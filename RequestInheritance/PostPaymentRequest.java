package RequestInheritance;
import java.util.UUID;

/**
 * The PostPaymentRequest class inherits from
 * PostRequest and uses a payment as a
 * new field.
 */
public class PostPaymentRequest extends PostRequest {

    /**
     * The counter int is used to keep
     * track of the amount of
     * PostPaymentRequests generated.
     */
    private static int payCounter;

    /**
     * The Payment pmt is used
     * to hold the payment of
     * the postPaymentRequest.
     */
    private Payment pmt;

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public PostPaymentRequest(){
        super();
        payCounter++;
    }

    /**
     * The constructor with passed uuid,
     * form, and payment is used to create
     * objects with a set UUID, payment,
     * and URL.
     *
     * @param ipPass    The ipPass parameter is used
     *                  to pass the IP of the postPaymentRequest
     *                  to the constructor.
     * @param uuidPass  The uuidPass parameter is
     *                  used to pass the uuid of a
     *                  new PostPaymentRequest object.
     * @param pmtPass   The pmtPass parameter is used
     *                  to pass the Payment to
     *                  the postPaymentRequest constructor.
     */
    public PostPaymentRequest(UUID uuidPass,String ipPass, Payment pmtPass){
        super(uuidPass, ipPass);
        this.pmt = pmtPass;
        payCounter++;
    }

    /**
     * The getPmt method is used to
     * get the payment of the postPaymentRequest
     * object.
     *
     * @return  The return is a Payment
     *          that is associated with
     *          the postPaymentRequest object.
     */
    public Payment getPmt() {
        return pmt;
    }

    /**
     * The setPmt method is used to set
     * the payment of a postPaymentRequest
     * object to the passed payment.
     *
     * @param pmt   The parameter pmt is
     *              the payment to set
     *              the postPaymentRequest
     *              payment field to.
     */
    public void setPmt(Payment pmt) {
        this.pmt = pmt;
    }

    /**
     * The count method is used to return the
     * total number of postPaymentRequests generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         postPaymentRequests generated.
     */
    public static int count(){
        return payCounter;
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
        return ("Post Payment Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "IP: " + super.getIP() + "\n"
                + "Sender: " + pmt.getSender() + "\n"
                + "Receiver: " + pmt.getReceiver() + "\n"
                + "Amount: " + pmt.getAmount() + "\n");
    }
}
