package RequestInheritance;
import java.util.UUID;

/**
 * The Request class is used to form
 * requests from the data generator and
 * many classes in the package inherit
 * from this class.
 */
public class Request{

    /**
     * The counter int is used to keep
     * track of the amount of requests
     * generated.
     */
    private static int counter;

    /**
     * The UUID uuid is used to hold
     * the UUID of a given request.
     */
    private UUID uuid;                                   //Class Attributes

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public Request(){
        counter++;
    }                       //Default Constructor

    /**
     * The constructor with a uuid as
     * a parameter allows for creation
     * of Request object with a UUID.
     *
     * @param uuidPass The uuidPass parameter is
     *                 used to pass the uuid of a
     *                 new Request object.
     */
    public Request(UUID uuidPass) { //Constructor with UUID Passed
        this.uuid = uuidPass;
        counter++;
    }                               //Constructor with Attributes Passed

    /**
     * The getUuid method is used to get
     * the UUID of a request as a string.
     *
     * @return The return is the UUID of
     *         the request as a string.
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * The setUuid method is used to set
     * the UUID of a request to the passed
     * string.
     *
     * @param uuid The uuid parameter is used
     *             to pass the new uuid of the
     *             method.
     */
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * The count method is used to return the
     * total number of requests generated.
     *
     * @return The return is an int value
     *         equal to the number of requests
     *         generated.
     */
    public static int count(){
        return counter;
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
    public String toString(){
        return ("Request\n"
                + "UUID: " + uuid + "\n");
    }
}
