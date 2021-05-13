package sbu.cs;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler
{
    private Socket socket;
    private DataOutputStream dataOutputStream;
    private byte[] dataBytes;

    public ClientHandler(byte[] dataBytes, String file) throws IOException
    {
        this.dataBytes = dataBytes;

        //write data in bytes format
        dataOutputStream.writeUTF(file);
        dataOutputStream.writeInt(dataBytes.length);
        dataOutputStream.write(dataBytes);

        // make socket for client
        socket = new Socket("192.198.1.1", 8080);
        dataOutputStream = new DataOutputStream(socket.getOutputStream());

        //close all
        dataOutputStream.close();
        socket.close();
    }
}
