package RequestInheritance;


/**
 * The video class is used to hold
 * the data of a video, including
 * URL, title, and name.
 */
public class Video {

    /**
     * The String URL is used to
     * hold the URL of the video.
     */
    private String URL;

    /**
     * The String Title is used to
     * hold the title of the video.
     */
    private String Title;

    /**
     * The String Name is used to
     * hold the name of the video.
     */
    private String Name;

    /**
     * The default constructor is here
     * in case of a no argument instance.
     */
    public Video(){}

    /**
     * The full constructor is used to
     * generate a new video with the
     * passed information.
     *
     * @param URLPass   The URLPass parameter is used
     *                  to pass the URL of the video to
     *                  the constructor.
     * @param titlePass The TitlePass parameter is used
     *                  to pass the title of the video
     *                  to the constructor.
     * @param namePass  The namePass parameter is used
     *                  to pass the name of the video
     *                  to the constructor.
     */
    public Video(String URLPass, String titlePass, String namePass){
        //set values
        this.URL = URLPass;
        this.Title = titlePass;
        this.Name = namePass;
    }

    /**
     * The getURL method is used to
     * get the URL of a video object.
     *
     * @return  The return is a String
     *          that is the URL of the
     *          video object.
     */
    public String getURL() {
        return URL;
    }

    /**
     * The getTitle method is used to
     * get the Title of a video object.
     *
     * @return  The return is a String
     *          that is the title of the
     *          video object.
     */
    public String getTitle() {
        return Title;
    }

    /**
     * The getName method is used to
     * get the name of a video object.
     *
     * @return  The return is a String
     *          that is the name of the
     *          video object.
     */
    public String getName() {
        return Name;
    }

    /**
     * The setURL method is used to set
     * the URL of a video object to the
     * passed string.
     *
     * @param URL The parameter URL is
     *            the URL string to set
     *            the video URL to.
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * The setTitle method is used to set
     * the Title of a video object to the
     * passed string.
     *
     * @param title The parameter Title is
     *              the title string to set
     *              the video title to.
     */
    public void setTitle(String title) {
        Title = title;
    }

    /**
     * The setName method is used to set
     * the Name of a video object to the
     * passed string.
     *
     * @param name The parameter name is
     *             the name string to set
     *             the video name to.
     */
    public void setName(String name) {
        Name = name;
    }
}
