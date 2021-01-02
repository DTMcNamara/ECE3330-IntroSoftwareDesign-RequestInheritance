package RequestInheritance;
import java.util.HashMap;

/**
 * The form class is used to
 * hold data from a form in a
 * hashmap.
 */
public class Form {

    /**
     * The HashMap fields is used
     * to hold the strings pulled
     * from the fields of the form.
     */
    private HashMap<String, String> fields = new HashMap<>();

    /**
     * The default constructor is
     * made to allow for blank forms
     * to be generated.
     */
    public Form(){}

    /**
     * The constructor with a Hashmap parameter
     * uses the field of the hashmap to load data
     * on creation.
     *
     * @param fieldPass The parameter fieldPass is
     *                  used to send the hashmap with
     *                  the fields to the constructor.
     */
    public Form (HashMap fieldPass){
        fields.putAll(fieldPass);
    }

    /**
     * The getFields method is used
     * to get the hashmap of the of
     * the form.
     *
     * @return The return is a hashmap
     *         of the form.
     */
    public HashMap<String, String> getFields() {
        return fields;
    }

    /**
     * The setFields method is used
     * to set the hashmap of a form
     * to a new hashmap passed to it.
     *
     * @param fields The parameter fields is
     *               used to pass the new hashmap
     *               to the method.
     */
    public void setFields(HashMap<String, String> fields) {
        this.fields = fields;
    }
}
