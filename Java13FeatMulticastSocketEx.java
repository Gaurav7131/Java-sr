import java.io.IOException;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.StandardSocketOptions;

public class Java13FeatMulticastSocketEx {
    public static void main(String[] args) throws IOException {
        try (MulticastSocket socket = new MulticastSocket()) {
            NetworkInterface ni = socket.getOption(StandardSocketOptions.IP_MULTICAST_IF);

            // if no explcit interface assigned return null instead of exception
            System.out.println("Default fallback:" + ni);
        }
    }
}
