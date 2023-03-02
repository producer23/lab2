import java.io.*;
import java.net.*;

public class Server {
    private static final int PORT = 34522;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Сервер запущен и готов к работе...");
            while (true) {
                Session session = new Session(server.accept());
                session.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Session extends Thread {
    private final Socket socket;

    public Session(Socket socketForClient) {
        this.socket = socketForClient;
    }

    public void run() {
        try (
                DataInputStream input = new DataInputStream(socket.getInputStream());
                DataOutputStream output = new DataOutputStream(socket.getOutputStream())
        ) {
            output.writeUTF("Введите X и Y:");
            int x = Integer.parseInt(input.readUTF()), y = Integer.parseInt(input.readUTF());
            output.writeUTF("Результат: " + Calc.func(x, y));
            System.out.println("Функция с X = " + x + ", Y = " + y + " посчитана");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}