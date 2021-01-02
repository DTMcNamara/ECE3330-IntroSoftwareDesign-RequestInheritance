package RequestInheritance;
import java.util.UUID;

/**
 * The PostFormRequest class inherits from
 * PostRequest and uses an IP string as a
 * new field.
 */
public class PostFormRequest extends PostRequest {

    /**
     * The counter int is used to keep
     * track of the amount of
     * PostFormRequests generated.
     */
    private static int formCounter;

    /**
     * The Form form is used to
     * hold the form of the
     * postFormRequest.
     */
    private Form form;

    /**
     * The default constructor is used
     * for a blank request creation.
     */
    public PostFormRequest(){
        super();
        formCounter++;
    }

    /**
     * The constructor with passed uuid,
     * form, and url is used to create
     * objects with a set UUID, form,
     * and URL.
     *
     * @param ipPass    The ipPass parameter is used
     *                  to pass the IP of the postFormRequest
     *                  to the constructor.
     * @param uuidPass  The uuidPass parameter is
     *                  used to pass the uuid of a
     *                  new PostFormRequest object.
     * @param formPass  The formPass parameter is used
     *                  to pass the form as a hashmap to
     *                  the postFormRequest constructor.
     */
    public PostFormRequest(UUID uuidPass,String ipPass, Form formPass){
        super(uuidPass,ipPass);
        this.form=formPass;
        formCounter++;
    }

    /**
     * The getForm method is used to
     * get the form of the postRequest
     * object.
     *
     * @return  The return is a hashmap
     *          that is the form of the
     *          postFormRequest object.
     */
    public Form getForm() {
        return form;
    }

    /**
     * The setForm method is used to set
     * the Form of a getRequest object to
     * the passed string.
     *
     * @param form  The parameter form is
     *              the form hashmap to set
     *              the postFormRequest form
     *              to.
     */
    public void setForm(Form form) {
        this.form = form;
    }

    /**
     * The count method is used to return the
     * total number of postFormRequests generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         postFormRequests generated.
     */
    public static int count(){
        return formCounter;
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
        return ("Post Form Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "IP: " + super.getIP() + "\n"
                + "Form Info: " + "\n"
                + form.toString() + "\n");
    }
}
