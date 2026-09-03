import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class Java11featuresHttpClientEx {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(2)).build();

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();

        // Synchronous send:
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println("Status code:" + response.statusCode());
        System.out.println("Body:" + response.body());
    }

}