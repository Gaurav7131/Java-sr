import java.io.InputStream;
import java.net.Socket;

public class Java13FeatNioSocketImplEx {
    public static void main(String[] args) throws Exception {
        // Java 13 replaces PlainSocketImpl(legacy) to NIOSocketImpl
        // use code look same outside(legacy)but NIO channel executed internally
        try (Socket socket = new Socket("example.com", 80)) {
            InputStream is = socket.getInputStream();
            System.out.println("Socket API Imlementation:" + is.getClass().getSimpleName());
            // Thread Interruption & Project loom(Vir.Thread) operated smoothly
        }
    }
}
