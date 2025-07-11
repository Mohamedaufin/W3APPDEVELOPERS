package Aufin;

import java.io.*;
import java.net.*;

public class SocketChat {
    public static void main(String[] args) {
        Thread server = new Thread(() -> {
            try {
                ServerSocket ss = new ServerSocket(9999);
                Socket s = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                String msg = dis.readUTF();
                dos.writeUTF("Hello " + msg + ", connected to server");
                ss.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread client = new Thread(() -> {
            try {
                Thread.sleep(500);
                Socket s = new Socket("localhost", 9999);
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                dos.writeUTF("Aufin");
                String reply = dis.readUTF();
                System.out.println("Server says: " + reply);
                s.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        server.start();
        client.start();
    }
}
