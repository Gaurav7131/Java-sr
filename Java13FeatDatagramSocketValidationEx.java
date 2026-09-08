import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Java13FeatDatagramSocketValidationEx {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] buffer = "Hello UDP".getBytes();

            // Packet sent without dest.address SocketAddress/IP
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);

            // socket is unconnected,unbound packet lacks address throws IllegalArgumentExcp
            socket.send(datagramPacket);
        } catch (IllegalArgumentException e) {
            System.out.println("Proper Validation Caught:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error:" + e.getMessage());
        }
    }
}
