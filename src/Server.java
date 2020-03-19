import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT = 0;

    //TODO: придумайте сообщения, которые будут выведены в консоль, когда сервер
    // ожидает клиента, установил соединение и получил сообщение,
    // далее запишите их в соответствующие константы
    private static final String WAITING_MSG = "";
    private static final String GOT_CLIENT_MSG = "";
    private static final String GOT_MSG_MSG = "";

    public static void main(String[] args) {

        try {
            //TODO: введите корректное значение константы PORT и создайте серверный сокет
            //ServerSocket serverSocket = ;
            //System.out.println(WAITING_MSG);

            //TODO: спользуйте корректный метод, чтобы сокет начал принимать сообщения
            //Socket socket = serverSocket./*МЕТОД ЗАСТАВЛЯЮЩИЙ ПРИНИМАТЬ СООБЩЕНИЯ*/();
            //System.out.println(GOT_CLIENT_MSG + "\n");

            //TODO: получите потоки ввода/вывода используя getter
            //InputStream inputStream = socket./*GETTER_NAME*/;
            //OutputStream outputStream = socket./*GETTER_NAME*/;

            //TODO: Конвертируйте потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            //DataInputStream dataInputStream = new DataInputStream(/*ПОТОК ВВОДА*/);
            //DataOutputStream dataOutputStream = new DataOutputStream(/*ПОТОК ВЫВОДА*/);

            //TODO: разработайте алгоритм, который сперва считывает строку из потока ввода,
            // а затем дополняет ее своим текстом (например "ВАМ ПРИВЕТ ОТ СЕРВЕРА")
            // и записывает ее в поток вывода.
            // для чтения/записи используйте методы readUTF() и writeUTF()
            // приминительно к потокам вводв/вывода соответственно
            String line = null;
            while (true) {

            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
