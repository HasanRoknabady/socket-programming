package sbu.cs;


import java.io.IOException;

public class Server {

    /**
     * Create a server here and wait for connection to establish,
     *  then get file name and after that get file and save it in the given directory
     *
     * @param args an string array with one element
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        // below is the name of directory which you must save the file in it
        String directory = args[0];     // default: "server-database"

        ServerHandler serverHandler = new ServerHandler();
        serverHandler.handle_files(directory);
    }
}
