package RequestInheritance;
import java.util.UUID;

/**
 * The GetRequest class inherits from
 * Request and uses a URL as a new field.
 */
public class GetRequest extends Request {

    /**
     * The getCounter int is used to keep
     * track of the amount of getRequests
     * generated.
     */
    private static int getCounter;

    /**
     * The String URL is used to
     * hold the URL of the getRequest.
     */
    private String URL;                                    //Class Attributes

    /**
     * The default constructor is here
     * in case of a no argument instance.
     */
    public GetRequest(){
        super();
        getCounter++;
    }                               //Default Constructor for Class

    /**
     * The constructor with passed uuid
     * and url is used to create objects
     * with a set UUID and URL.
     *
     * @param URLPass   The URLPass parameter is used
     *                  to pass the URL of the getRequest
     *                  to the constructor.
     * @param uuidPass  The uuidPass parameter is
     *                  used to pass the uuid of a
     *                  new getRequest object.
     */
    public GetRequest(UUID uuidPass, String URLPass){
        super(uuidPass);
        this.URL = URLPass;
        getCounter++;
    }  //Constructor with Attributes Passed

    /**
     * The getURL method is used to
     * get the URL of the getRequest
     * object.
     *
     * @return  The return is a String
     *          that is the URL of the
     *          getRequest object.
     */
    public String getURL() {
        return URL;
    }

    /**
     * The setURL method is used to set
     * the URL of a getRequest object to
     * the passed string.
     *
     * @param URL The parameter URL is
     *            the URL string to set
     *            the getRequest URL to.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * The count method is used to return the
     * total number of getRequests generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         getRequests generated.
     */
    public static int count(){
        return getCounter;
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
        return ("Get Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "URL: " + URL + "\n");
    }
}
