package RequestInheritance;
import java.util.UUID;

/**
 * The PostRequest class inherits from
 * Request and uses an IP string as a
 * new field.
 */
public class PostRequest extends Request {

    /**
     * The counter int is used to keep
     * track of the amount of
     * PostRequests generated.
     */
    private static int postCounter;

    /**
     * The String IP is used to
     * hold the IP of the postRequest.
     */
    private String IP;

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public PostRequest(){
        super();
        postCounter++;
    }

    /**
     * The constructor with passed uuid
     * and url is used to create objects
     * with a set UUID and URL.
     *
     * @param ipPass    The ipPass parameter is used
     *                  to pass the IP of the postRequest
     *                  to the constructor.
     * @param uuidPass  The uuidPass parameter is
     *                  used to pass the uuid of a
     *                  new postRequest object.
     */
    public PostRequest(UUID uuidPass,String ipPass){
        super(uuidPass);
        this.IP = ipPass;
        postCounter++;
    }

    /**
     * The getIP method is used to
     * get the IP of the postRequest
     * object.
     *
     * @return  The return is a String
     *          that is the IP of the
     *          postRequest object.
     */
    public String getIP() {
        return IP;
    }

    /**
     * The setURL method is used to set
     * the URL of a getRequest object to
     * the passed string.
     *
     * @param IP  The parameter IP is
     *            the IP string to set
     *            the postRequest IP to.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * The count method is used to return the
     * total number of postRequests generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         postRequests generated.
     */
    public static int count(){
        return postCounter;
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
        return ("Post Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "IP: " + IP + "\n");
    }
}
