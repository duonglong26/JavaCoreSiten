package com.nduonglong02.unit08.program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketClientExample {
    public static void main(String[] args) {
        Socket socket = null;
        try {
            socket = new Socket("localhost", 9245);
            System.out.println("Client start sending ...");
            try (
                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            ){
                output.writeUTF("Hello Server");
                System.out.println("Server say: " + input.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
