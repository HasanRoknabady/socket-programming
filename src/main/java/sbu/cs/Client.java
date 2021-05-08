package sbu.cs;

import java.io.IOException;

public class Client {

    /**
     * Create a socket and connect to server then send fileName and after that send file to be saved on server side.
     *  in here filePath == fileName
     *
     * @param args a string array with one element
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String filePath = args[0];      // "sbu.png" or "book.pdf"
    }
}
