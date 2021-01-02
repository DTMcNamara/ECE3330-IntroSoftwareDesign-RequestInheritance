package RequestInheritance;


/**
 * The File class is used to
 * create file objects with a
 * filepath and filetype.
 */
public class File {

    /**
     * The String filepath is
     * used to hold the filepath
     * to the file object.
     */
    private String filepath;

    /**
     * The String filetype is
     * used to hold the file
     * type of the file object.
     */
    private String filetype;

    /**
     * The default empty contructor
     * is here to allow creation of
     * blank files.
     */
    public File(){}

    /**
     * The constructor take a filepath
     * and a file type as strings for
     * it to create a new file object.
     *
     * @param FilePath The parameter FilePath is used
     *                 to pass the file path as a string
     *                 to the constructor.
     * @param FileType The parameter FileType is used
     *                 to pass the file type as a string
     *                 to the constructor
     */
    public File(String FilePath, String FileType){
        this.filepath = FilePath;
        this.filetype = FileType;
    }

    /**
     * The setFilepath method is used
     * to change the file path of a file
     * object to the passed string.
     *
     * @param filepath The parameter filepath is
     *                 used to pass the new filepath
     *                 to the method.
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
     * The setFiletype method is used
     * to change the file type of a file
     * object to the passed string.
     *
     * @param filetype The parameter filetype is
     *                 used to pass the new filetype
     *                 to the method.
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    /**
     * The getFilepath method is used
     * to get the filepath field of the
     * file.
     *
     * @return The return is the file type
     *         as a string.
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * The getFiletype method is used
     * to get the file type field of the
     * file.
     *
     * @return The return is the file type
     *         as a string.
     */
    public String getFiletype() {
        return filetype;
    }
}
