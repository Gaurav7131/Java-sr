
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

public class Java13FeatServerCipherSuitePrefEx {
    public static void main(String[] args) throws Exception {
        SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        try (SSLServerSocket socket = (SSLServerSocket) ssf.createServerSocket()) {
            SSLParameters param = socket.getSSLParameters();

            // Java 13:Server enforces priority of selecting cipher preference default
            boolean serverPref = param.getUseCipherSuitesOrder();// true
            System.out.println("Server Enforces Cipher Preference Default:" + serverPref);
        }
    }
}
