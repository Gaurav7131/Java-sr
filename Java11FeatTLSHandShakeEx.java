import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Java11FeatTLSHandShakeEx {
    public static void main(String[] args) throws Exception {
        // Initilitaiting context TLS v1.3 thats holds over TlsV1.2 resolves security
        // vulnerbilities,performace bottleneck(2 RTT-1RTT)
        SSLContext context = SSLContext.getInstance("TLSv1.3");
        context.init(null, null, null);

        SSLSocketFactory factory = context.getSocketFactory();
        try (SSLSocket socket = (SSLSocket) factory.createSocket("cloudflare.com", 443)) {
            socket.startHandshake();
            System.out.println("Handshake Completed");
            System.out.println("Negotiated Protocol:" + socket.getSession().getProtocol());
            System.out.println("Cipher Suite:" + socket.getSession().getCipherSuite());

        }

    }
}
