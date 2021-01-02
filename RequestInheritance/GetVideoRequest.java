package RequestInheritance;
import java.util.UUID;

/**
 * The GetVideoRequest class inherits from
 * GetRequests and adds a field for a video
 * in the constructor and class data.
 */
public class GetVideoRequest extends GetRequest {

    /**
     * The getVidCounter int is used to keep
     * track of the amount of getVideoRequests
     * generated.
     */
    private static int getVidCounter;

    /**
     * The String vidTitle is used to
     * hold the title of the video.
     */
    private String vidTitle;

    /**
     * The default constructor is here
     * in case of a no argument instance.
     */
    public GetVideoRequest(){
        super();
        getVidCounter++;
    }

    /**
     * The constructor with parameters takes
     * a UUID, and a file to create a
     * getFileRequest object with data fields
     * set.
     *
     * @param uuidPass The UUID uuidPass is used to
     *                 pass the UUID to the constructor.
     * @param vidPass  The video vidPass is used to pass
     *                 the video to the constructor.
     */
    public GetVideoRequest(UUID uuidPass,Video vidPass){
        super(uuidPass,vidPass.getURL());
        this.vidTitle = vidPass.getTitle();
        getVidCounter++;
    }

    /**
     * The getVidTitle method is used to
     * get the Title of the video in the
     * getVideoRequest object.
     *
     * @return  The return is a String
     *          that is the title of the
     *          video in the getVideoRequest
     *          object.
     */
    public String getVidTitle() {
        return vidTitle;
    }

    /**
     * The setTitle method is used to set
     * the Title of a video object to the
     * passed string.
     *
     * @param vidTitle The parameter vidTitle is
     *                 the title string to set
     *                 the video title to.
     */
    public void setVidTitle(String vidTitle) {
        this.vidTitle = vidTitle;
    }

    /**
     * The count method is used to return the
     * total number of getVideoRequests generated.
     *
     * @return The return is an int value
     *         equal to the number of
     *         getVideoRequests generated.
     */
    public static int count(){
        return getVidCounter;
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
        return ("Get Video Request\n"
                + "UUID: " + super.getUuid() + "\n"
                + "URL: " + super.getURL() + "\n"
                + "Video Title: " + vidTitle + "\n");
    }
}
