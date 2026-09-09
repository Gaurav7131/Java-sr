import java.io.IOException;
import java.net.Socket;

public class Java13FeatSocketImplEx {
    public static void main(String[] args) throws IOException {
        // Modern NioSocketImpl runs underneath; ancient pre-1.4 implementations fail
        try (Socket socket = new Socket()) {
            System.out.println("Default Socket Class:" + socket.getClass().getSimpleName());
        }
    }
}
