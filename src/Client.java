//import java.net.*;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private static final int PORT = 0;
    private static final String HOST_name="";
    public static void main(String[] ar) {

        try {
            //TODO: создайте объект InetAddress, который будет содержать имя хоста (ip адресс)
            //InetAddress ipAddress = InetAddress.getByName(HOST_name);

            //TODO: создайте сокет используя адрес и номер порта
            //Socket socket = ;

            //TODO: получить потоки/ввода от созданного сокета, используя getter
            //InputStream inputStream = socket./*GETTER*/;
            //OutputStream outputStream = socket./*GETTER*/;

            //TODO: конвертировать потоки данных, для более удобной работы в дальнейшем
            //DataInputStream dataInputStream = new DataInputStream(/*ПОТОК ВВОДА*/);
            //DataOutputStream dataOutputStream = new DataOutputStream(/*ПОТОК ВЫВОДА*/);

            /**
             * далее нам потребуется считывать ввод с клавиатуры
             * для этого рекомендуется использовать классы BufferedReader, InputStreamReader
             * и системный поток ввода
             */

            //TODO: создайте новый экземпляр BufferedReader,
            // используя экемпляр InputStreamReader и системный поток ввода
            //BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            //String line = null;
            //System.out.println("введите сообщение для отправки на сервер" + "\n");

            //TODO: разработайте алгоритм, который сперва считает строку пользовательского ввода,
            // затем запишет ее в поток вывода сокета (writeUTF(String string), flush()), после чего
            // считает ответ от сервера (readUTF() и выведет его)
            while (true) {

            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}