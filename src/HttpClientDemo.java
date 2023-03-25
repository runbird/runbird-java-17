import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpClientDemo {

    public static void main(String[] args) throws IOException, InterruptedException {
        demo01();
    }

    private static void demo01() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(8L))
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.baidu.com"))
                .setHeader("User-Agent", "Java 11 Httpclient Bot")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        HttpHeaders headers = response.headers();
        headers.map().forEach((k,v) -> System.out.println(k + " : " + v));

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
