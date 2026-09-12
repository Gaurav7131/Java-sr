import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class Java16HttpClientCancellationEx {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://httpbin.org/delay/10")).GET().build();

        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request,
                HttpResponse.BodyHandlers.ofString());

        // Calling cancel(true) actively halts the socket connection pipeline
        boolean cancelled = future.cancel(true);
        System.out.println("Http Exchange Dispatch:" + cancelled);
        System.out.println("Future isCancelled:" + cancelled);

    }
}
