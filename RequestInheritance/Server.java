package RequestInheritance;
import java.util.Random;
import java.util.Stack;

/**
 * The sever class is use to simulate a server
 * sending random requests.
 */
public class Server {

    /**
     * The integer NUM_REQ_TYPES is used to
     * generate 9 requests.
     */
    private static final Integer NUM_REQ_TYPES = 9;

    /**
     * The main method is to start the server generating
     * requests.
     */
    public static void main(String argv[]) {

        /**
         * The Stack requestStack is used to hold
         * the requests in a data structure.
         */
        Stack<Request> requestStack = new Stack<>();

        /**
         * The Random random is a random generator
         * used to get values for generating cases.
         */
        Random random = new Random();

        /**
         * The DataGenerator data is used to get
         * new data to be made into requests.
         */
        DataGenerator data = new DataGenerator();

        // Request instantiation should be more specific for each type, but you get the idea

        //load stack with random requests
        for (int i = 0; i < NUM_REQ_TYPES; i++) {
            switch (i) {
                case 0:
                    requestStack.push(new Request(data.getRandUUID()));
                    break;
                case 1:
                    requestStack.push(new GetRequest(data.getRandUUID(), data.getRandURL()));
                    break;
                case 2:
                    requestStack.push(new PostRequest(data.getRandUUID(), data.getRandIP()));
                    break;
                case 3:
                    requestStack.push(new PostFormRequest(data.getRandUUID(), data.getRandIP(), data.getRandForm()));
                    break;
                case 4:
                    requestStack.push(new PostEncryptedFormRequest(data.getRandUUID(), data.getRandIP(), data.getRandForm(), data.getRandEncryptionScheme()));
                    break;
                case 5:
                    requestStack.push(new PostPaymentRequest(data.getRandUUID(), data.getRandIP(), data.getRandPayment()));
                    break;
                case 6:
                    requestStack.push(new PostEncryptedPaymentRequest(data.getRandUUID(), data.getRandIP(), data.getRandPayment(), data.getRandEncryptionScheme()));
                    break;
                case 7:
                    requestStack.push(new GetFileRequest(data.getRandUUID(), data.getRandFile()));
                    break;
                case 8:
                    requestStack.push(new GetVideoRequest(data.getRandUUID(), data.getRandVideo()));
                    break;
                default:
                    System.out.println("\n\n\nERROR: RANDOM GENERATOR FAILED\n\n\n");
            }
        }

        // print diagnostic info about each request in the stack
        while (!requestStack.isEmpty()) {
            Request req = requestStack.pop();
            System.out.println(req.toString());
            System.out.println();
        }

        // Server summary:
        System.out.println("Server summary:");
        System.out.println("Total Requests: " + Request.count());
        System.out.println("Get Requests: " + GetRequest.count());
        System.out.println("Post Requests: " + PostRequest.count());
        System.out.println("Post Form Requests: " + PostFormRequest.count());
        System.out.println("Post Encrypted Form Requests: " + PostEncryptedFormRequest.count());
        System.out.println("Post Payment Requests: " + PostPaymentRequest.count());
        System.out.println("Post Encrypted Payment Requests: " + PostEncryptedPaymentRequest.count());
        System.out.println("Get File Requests: " + GetFileRequest.count());
        System.out.println("Get Video Requests: " + GetVideoRequest.count());
    }
}
