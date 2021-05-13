package sbu.cs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {

    /**
     * Create a socket and connect to server then send fileName and after that send file to be saved on server side.
     *  in here filePath == fileName
     *
     * @param args a string array with one element
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        String filePath = args[0];      // "sbu.png" or "book.pdf"
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        //make one object from client Handler
        ClientHandler clientHandler = new ClientHandler(bytes, filePath);
    }
}
