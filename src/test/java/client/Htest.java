package client;

import com.google.gson.Gson;
import httpp.player.Players;
import org.junit.jupiter.api.Test;
import player.Player;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Htest {
    @Test
    void name() throws URISyntaxException, IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://sevsenlearn.free.beeceptor.com/employees"))
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

    }
}
