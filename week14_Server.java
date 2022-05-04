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
        System.out.println("wait connection");
       
        int c = 0;

        while (true) {
            
            Socket conn = server.accept();
            System.out.println(c + " client Connected");
            c++;


            DataInputStream fromClient = new DataInputStream(conn.getInputStream());
            DataOutputStream toServer = new DataOutputStream(conn.getOutputStream());
            toServer.writeUTF("u client number"+ c);


           

        }

    }
}
