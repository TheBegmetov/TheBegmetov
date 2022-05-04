package com.example.demo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import java.util.Scanner;

public class week14_Server {
    public static void main (String[] args) throws IOException{
        ServerSocket server = new ServerSocket(8081);
        System.out.println("waiting connection");
       
        int cnt = 0;

        while (true) {
            
            Socket conn = server.accept();
            System.out.println(cnt + " client Connected");
            cnt++;


            DataInputStream fromClient = new DataInputStream(conn.getInputStream());
            DataOutputStream toServer = new DataOutputStream(conn.getOutputStream());
            toServer.writeUTF("u client number"+ cnt);


            Scanner send = new Scanner(System.in);

        }

    }
}
