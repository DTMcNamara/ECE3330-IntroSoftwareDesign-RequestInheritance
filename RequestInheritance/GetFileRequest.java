package RequestInheritance;
import java.util.UUID;

/**
 * The GetFileRequest class inherits from
 * GetRequests and adds a field for a file
 * in the constructor and class data.
 */
public class GetFileRequest extends GetRequest{

    /**
     * The getFileCounter int is used to keep
     * track of the amount of getFileRequests
     * generated.
     */
    private static int getFileCounter;

    /**
     * The File file is used to
     * hold the file associated
     * with the getFileRequest.
     */
    private File file;

    /**
     * The default constructor is here
     * in case of a no argument instance.
     */
    public GetFileRequest(){
        super();
        getFileCounter++;
    }

    /**
     * The constructor with parameters takes
     * a UUID, and a file to create a
     * getFileRequest object with data fields
     * set.
     *
     * @param uuidPass The UUID uuidPass is used to
     *                 pass the UUID to the constructor.
     * @param filePass The File filePass is used to pass
     *                 the file to the constructor.
     */
    public GetFileRequest(UUID uuidPass, File filePass){
        super(uuidPass,filePass.getFilepath());
        this.file = filePass;
        getFileCounter++;
    }

    /**
     * The getFile method is used to
     * get the File of the getFileRequest
     * object.
     *
     * @return  The return is the file
     *          associate with the
     *          getFileRequest object.
     */
    public File getFile() {
        return file;
    }

    /**
     * The setFile method is used to set
     * the File of a getFileRequest object to
     * the passed string file path .
     *
     * @param filepath The parameter filepath is
     *                 the file path string to set
     *                 the getFileRequest file to.
     */
    public void setFile(File filepath) {
        this.file = filepath;
    }

    /**
     * The count method is used to return the
     * total number of getFileRequests generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         getFileRequests generated.
     */
    public static int count(){
        return getFileCounter;
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
        return ("Get File Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "URL: " + super.getURL() + "\n"
                + "File Path: " + file.getFilepath() + "\n"
                + "File Type: " + file.getFiletype() + "\n");
    }
}
