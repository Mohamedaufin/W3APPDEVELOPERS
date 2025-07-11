package Aufin;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleChat {
    public static void main(String[] args) {
        Thread server = new Thread(() -> {
            try (ServerSocket ss = new ServerSocket()) {
                ss.setReuseAddress(true);
                ss.bind(new InetSocketAddress(9999));
                try (Socket s = ss.accept();
                     DataInputStream dis = new DataInputStream(s.getInputStream());
                     DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                     Scanner sc = new Scanner(System.in)) {
                    while (true) {
                        String msg = dis.readUTF();
                        System.out.println("Client: " + msg);
                        if (msg.equalsIgnoreCase("bye")) break;
                        System.out.print("You: ");
                        dos.writeUTF(sc.nextLine());
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        Thread client = new Thread(() -> {
            try {
                Thread.sleep(500);
                try (Socket s = new Socket("localhost", 9999);
                     DataInputStream dis = new DataInputStream(s.getInputStream());
                     DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                     Scanner sc = new Scanner(System.in)) {
                    while (true) {
                        System.out.print("You: ");
                        dos.writeUTF(sc.nextLine());
                        String msg = dis.readUTF();
                        System.out.println("Server: " + msg);
                        if (msg.equalsIgnoreCase("bye")) break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        });

        server.start();
        client.start();
    }
}
