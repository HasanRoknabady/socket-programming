package sbu.cs;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerHandler
{
    private Socket socket;
    private ServerSocket serverSocket;
    private DataInputStream dataInputStream;
    private byte[] bytes;
    private String read;

    public ServerHandler() throws IOException
    {
        serverSocket = new ServerSocket(8080);
        socket = serverSocket.accept();
        dataInputStream = new DataInputStream(socket.getInputStream());


        //reading
        read = dataInputStream.readUTF();
        int size = dataInputStream.readInt();
        dataInputStream.readFully(bytes);

        //closing
        serverSocket.close();
        socket.close();
        dataInputStream.close();
    }

    public void handle_files(String directory) throws IOException {
        File file = new File(directory);
        if(!file.exists())
        {
            file.mkdir();
        }
        FileOutputStream out = new FileOutputStream(directory + "/" + read);
        out.write(bytes);
        out.close();
    }

}
