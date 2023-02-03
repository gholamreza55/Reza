package client;

import com.google.gson.Gson;
import httpp.player.Players;
import org.junit.jupiter.api.Test;
import player.Player;
import player.ResponseStatuse;
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
                .uri(new URI("https://sevsenlearn.free.beeceptor.com/players"))
                .build();
        System.out.println(request);
        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        Gson gson = new Gson();
        Players players = gson.fromJson(body, Players.class);
        players.getPlayers().forEach(System.out::println);

    }

    @Test
    void name1() throws URISyntaxException, IOException, InterruptedException {
        String play = new Gson().toJson(new Player("Gholamreza", 252));
        System.out.println(play);

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(new URI("https://sevsenlearn.free.beeceptor.com/players"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(play))
                .build();
        System.out.println(request);

        HttpResponse<String> response = HttpClient
                .newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        System.out.println(body);

        Gson gson = new Gson();
        ResponseStatuse responseStatuse = gson.fromJson(body, ResponseStatuse.class);
        System.out.println(responseStatuse);
    }
}

