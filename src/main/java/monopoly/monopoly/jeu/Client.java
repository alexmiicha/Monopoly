package monopoly.monopoly.jeu;

import javafx.application.Application;
import monopoly.monopoly.plateau.scenes.ConfigurationPartie;
import monopoly.monopoly.plateau.scenes.MenuSelectionPersonnage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import static monopoly.monopoly.jeu.ClientHandler.clientHandlers;

public class Client {

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String username;


    public Client(Socket socket) {
        try {
            this.socket=socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }catch (Exception e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }



    public void sendMessage() {
        try {
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner sc = new Scanner(System.in);
            while(socket.isConnected()) {
                String messageToSend = sc.nextLine();
                bufferedWriter.write(username + " : " + messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (Exception e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void listenForMessage() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgFromGroupChat;

                while(socket.isConnected()) {
                    try {
                        msgFromGroupChat = bufferedReader.readLine();
                        System.out.println(msgFromGroupChat);
                    }catch (Exception e) {
                        closeEverything(socket, bufferedReader, bufferedWriter);
                    }
                }

            }
        }).start();
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        try{
            if(bufferedReader != null) {
                bufferedReader.close();
            }
            if(bufferedWriter != null) {
                bufferedWriter.close();
            }
            if(socket != null) {
                socket.close();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 1234);
            Client client = new Client(socket);


            if(clientHandlers.size()==0){
                Application.launch(ConfigurationPartie.class, args);
            }else {
                Application.launch(MenuSelectionPersonnage.class, args);
            }

            //client.listenForMessage();
            //client.sendMessage();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
