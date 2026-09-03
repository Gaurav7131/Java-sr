public class NegotiateDHkeyEx {
    // Conceptual handshake negotiation
    public int negotiateDhKeySize(int clientMaxSupported, int serverMaxSupported) {
        // Both sides select the strongest mutually supported group parameter (e.g.,
        // 2048)
        int agreedBits = Math.min(clientMaxSupported, serverMaxSupported);
        if (agreedBits < 2048) {
            throw new SecurityException("Insecure Diffie-Hellman group size rejected!");
        }
        return agreedBits;
    }

    public static void main(String[] args) {
        NegotiateDHkeyEx ex = new NegotiateDHkeyEx();
        // insecure parameter(<2048) resolved with try-catch
        try {
            System.out.println("Attempting negotiation with 1024 & 4096");
            int bits = ex.negotiateDhKeySize(1024, 4096);
            System.out.println("Negotiated key size:" + bits);

        } catch (SecurityException e) {
            System.out.println("Handshake failed:" + e.getMessage());
        }

        // Secured parameter (>= 2048)
        try {
            System.out.println("Attempting negotiation with 2048 & 4096");
            int agreedBits = ex.negotiateDhKeySize(2048, 4096);
            System.out.println("Negotiated Key Size:" + agreedBits);
        } catch (SecurityException e) {
            System.out.println("Handshake failed:" + e.getMessage());
        }
    }
}
