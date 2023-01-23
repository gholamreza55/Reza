package bi;

import org.junit.jupiter.api.Test;
import player.Player;
import player.PlayerTestPlayer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiCon {
    @Test
    void name() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Java");
        map.put(1, "C++");
        map.put(3, "Rost");
        map.put(4, "Payton");
        map.put(5, "JavaScrip");

        BiConsumer<Integer, String> biconsumer = (k, v) ->
            System.out.println("K : "+k+ ", V : "+ v);

        map.forEach(biconsumer);
    }

    @Test
    void name1() {
        List<Player> map = new PlayerTestPlayer().getPlayers();
        Consumer<Player> bi = System.out::println;
        map.forEach(bi);


    }
}
