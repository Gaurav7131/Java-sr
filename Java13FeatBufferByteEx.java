import java.nio.ByteBuffer;
import java.util.Arrays;

public class Java13FeatBufferByteEx {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(16);
        byte[] payload = { 11, 22, 33, 44 };

        // put(int index,byte[]src,int offset,int length)
        // java 13 start at actual index without altering bookmrk buffer.position
        buffer.put(4, payload, 0, payload.length);
        System.out.println("Buffer Position:" + buffer.position());// 0

        // get(int index,byte[] dest,int offset,int length)
        byte[] output = new byte[4];
        buffer.get(4, output, 0, 4);
        System.out.println("Extracted:" + Arrays.toString(output));
        System.out.println("Buffer Position Still:" + buffer.position());// 0

    }
}
