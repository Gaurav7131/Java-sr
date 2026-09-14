import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.SimpleFileServer;
import java.net.InetSocketAddress;
import java.nio.file.Path;

public class Java18FeatEmbeddedServerEx {
    public static void main(String[] args) {
        /*
         * jwebserver allows the developers the way to serve quick,zero-config
         * static,config,html files
         * without downloading embedded sever(Apache Tomcat) config or config
         * springbootappln
         * Java 18:bundles the lightwt static file server directly in jdk via
         * jwebserver& SimpleFileServer
         */

        HttpServer server = SimpleFileServer.createFileServer(
                new InetSocketAddress(8080),
                Path.of(".").toAbsolutePath(),
                SimpleFileServer.OutputLevel.INFO);

        server.start();
        System.out.println("Server running on http://localhost:8080");
        server.stop(1); // Stop after validation
    }
}