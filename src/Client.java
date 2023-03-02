import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "127.0.0.1";
    private static final int SERVER_PORT = 34522;

    public static void main(String[] args) {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {
            Scanner scanner = new Scanner(System.in);
            String msgFromServer = input.readUTF();
            System.out.println(msgFromServer);

            int x = scanner.nextInt(), y = scanner.nextInt();
            output.writeUTF(String.valueOf(x));
            output.writeUTF(String.valueOf(x));

            msgFromServer = input.readUTF();
            System.out.println(msgFromServer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}