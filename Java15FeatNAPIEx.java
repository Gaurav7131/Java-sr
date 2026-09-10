//Linux devices used New APi(NAPI)polling to interrupt service,Napi allows the option of high performace secret code sharing to inspect NIC queue processing.Pinning the thread while eliminate CPu context switching and high data plane throughput.

import java.io.IOException;
import java.nio.channels.SocketChannel;

public class Java15FeatNAPIEx {
    public static void main(String[] args) throws IOException {
        try (SocketChannel channel = SocketChannel.open()) {

            // support for linux kernel devices
            boolean supported = channel.supportedOptions().stream()
                    .allMatch(option -> option.name().equals("SO_INCOMING_NAPI_ID"));
            System.out.println("Is Supported:" + supported);
        }
    }
}
