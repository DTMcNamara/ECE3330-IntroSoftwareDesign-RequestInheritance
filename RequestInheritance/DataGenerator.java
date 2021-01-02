package RequestInheritance;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

/**
 * The DataGenerator class is used to
 * generate all kinds of data for
 * the server to take in as requests.
 */
class DataGenerator {
    // fields to hold example data

    /**
     * The Random rand is used for
     * generating random numbers.
     */
    private Random rand;

    /**
     * The String array names is used
     * to hold the names for creating
     * requests.
     */
    private String[] names;

    /**
     * The String array encryption
     * is used to hold the encryption
     * keys for created requests.
     */
    private String[] encryption;

    /**
     * The String array videoTitles
     * is used to hold the video titles
     * for created requests.
     */
    private String[] videoTitles;

    /**
     * The String array filePaths
     * is used to hold the file paths
     * for created requests.
     */
    private String[] filePaths;

    /**
     * The String array fileTypes
     * is used to hold the file types
     * for created requests.
     */
    private String[] fileTypes;

    /**
     * The String array colors
     * is used to hold the colors
     * for created requests.
     */
    private String[] colors;

    // Constructor
    /**
     * The constructor creates a new data generator
     * and loads the data fields with default info.
     */
    DataGenerator() {
        // initialize with example data
        this.rand = new Random();
        this.names = new String[]{"Tom", "Guadalupe", "Tina", "Markus", "Michael", "Diego", "Mr. Patel", "Alex"};
        this.encryption = new String[]{"Vigenere", "One Time Pad", "RSA", "Diffie-Hellman"};
        this.videoTitles = new String[]{"Top 10 Cutest Cat Videos", "ONE Simple Trick to Pass SWD", "Java 101", "Pythonistas Pythoning with Pythons", "P == NP?!?!?!"};
        this.filePaths = new String[]{"/Users/abpwrs/puppies", "/Users/tomc/backstroke", "/Users/swd_student/question", "/Users/cie_student/question", "/Users/student/stress"};
        this.fileTypes = new String[]{"txt", "csv", "pptx", "pdf", "hs", "gif", "png", "h5"};
        this.colors = new String[]{"red", "orange", "yellow", "green", "blue", "indigo", "violet", "egg shell"};
    }

    // private utilities for data generation

    /**
     * This method selects a random name
     * from the names string array and returns
     * it.
     *
     * @return A random name from the names array.
     */
    private String getRandName() {
        return this.names[this.rand.nextInt(this.names.length)];
    }

    /**
     * This method selects a random color
     * from the color string array and returns
     * it.
     *
     * @return A random color from the color array.
     */
    private String getRandColor() {
        return this.colors[this.rand.nextInt(this.colors.length)];
    }

    /**
     * This method selects a random video name
     * from the vidNames string array and returns
     * it.
     *
     * @return A random video title from the VidTitles array.
     */
    private String getRandVideoTitle() {
        return this.videoTitles[this.rand.nextInt(this.videoTitles.length)];
    }

    /**
     * This method selects a random file type
     * from the fileTypes string array and returns
     * it.
     *
     * @return A random file type from the FileTypes array.
     */
    private String getRandFileType() {
        return this.fileTypes[this.rand.nextInt(this.fileTypes.length)];
    }

    /**
     * This method selects a random file path
     * from the filePaths string array and returns
     * it.
     *
     * @return A random file path from the FilePaths array.
     */
    private String getRandFilePath() {
        return this.filePaths[this.rand.nextInt(this.filePaths.length)];
    }

    // public data generation tools
    /**
     * This method generates a random URL
     * and returns it.
     *
     * @return A random URL.
     */
    public String getRandURL() {
        return "localhost:" + (((this.rand.nextInt(9) + 1) * 1000) + this.rand.nextInt(999));
    }

    /**
     * This method generates a random payment
     * and returns it.
     *
     * @return A random payment object.
     */
    public Payment getRandPayment() {
        return new Payment(this.getRandName(), this.rand.nextInt(10000), this.getRandName());
    }

    /**
     * This method generates a random UUID
     * and returns it.
     *
     * @return A random UUID.
     */
    public UUID getRandUUID() {
        return UUID.randomUUID();
    }

    /**
     * This method generates a random Encryption scheme
     * and returns it.
     *
     * @return A random encryption scheme.
     */
    public String getRandEncryptionScheme() {
        return this.encryption[this.rand.nextInt(this.encryption.length)];
    }

    /**
     * This method generates a random Video
     * and returns it.
     *
     * @return A random Video.
     */
    public Video getRandVideo() {
        return new Video(this.getRandURL(), this.getRandVideoTitle(), this.getRandName());
    }

    /**
     * This method generates a random File
     * and returns it.
     *
     * @return A random File.
     */
    public File getRandFile() {
        return new File(this.getRandFilePath(), this.getRandFileType());
    }

    /**
     * This method generates a random form
     * and returns it.
     *
     * @return A random form.
     */
    public Form getRandForm() {

        /**
         *
         */
        HashMap<String, String> fields = new HashMap<>();
        fields.put("Favorite color", this.getRandColor());
        fields.put("Favorite encryption scheme", this.getRandEncryptionScheme());
        fields.put("Name", this.getRandName());
        return new Form(fields);
    }


    /**
     * This method generates a random IP
     * and returns it.
     *
     * @return A random IP.
     */
    public String getRandIP() {
        return rand.nextInt(256) + "." + rand.nextInt(256) + "." + rand.nextInt(256) + "." + rand.nextInt(256);
    }

}