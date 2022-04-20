package com.nduonglong02.unit08.program;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerExample {
    public SocketServerExample(int serverPort) {
        try {
            ServerSocket serverSocket = new ServerSocket(serverPort);
            System.out.println("Server Listening ... ");
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    try (DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                         DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                    ) {
                        try {
                            System.out.println("Client Say: " + inputStream.readUTF());
                            outputStream.writeUTF("I'm a socket server !");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SocketServerExample(9245);
    }
}
