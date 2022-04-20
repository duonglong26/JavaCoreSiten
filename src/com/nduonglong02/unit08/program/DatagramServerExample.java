package com.nduonglong02.unit08.program;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramServerExample implements Runnable {
    DatagramSocket socket = null;
    public DatagramServerExample() {
        try {
            socket = new DatagramSocket(4444);
            System.out.println("Data Server listening ...");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        byte[] bytes = new byte[1024*4];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        try {
            socket.receive(packet);
            System.out.println("From Client: " + new String(packet.getData(), 0 , packet.getLength()));
            bytes = "Server say hello".getBytes();
            socket.send(new DatagramPacket(bytes, bytes.length, packet.getAddress(), packet.getPort()));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            socket.close();
        }
    }

    public static void main(String[] args) {
        new Thread(new DatagramServerExample()).start();
    }
}
