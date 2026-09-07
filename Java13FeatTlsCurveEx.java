
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Java13FeatTlsCurveEx {
    public static void main(String[] args) throws Exception {
        SSLContext context = SSLContext.getInstance("TLSv1.3");
        context.init(null, null, null);

        SSLSocketFactory factory = context.getSocketFactory();
        try (SSLSocket socket = (SSLSocket) factory.createSocket("cloudflare.com", 443)) {
            // SSLParameters parameters = socket.getSSLParameters();// getParam

            socket.startHandshake();
            System.out.println("Handshake Initiated");
            System.out.println("Protocol:" + socket.getSession().getProtocol());
            // x25519 & x448 are enabled by default
            // parameters.setNamedGroups(new String[] { "x25519", "x448" });
            // x25519 & x448 are enable bydefault socket.setSSLParameters(parameters) no
            // need to call explicit setNamedGroup()

            System.out.println("Cipher Cuite:" + socket.getSession().getCipherSuite());

        }

    }
}
