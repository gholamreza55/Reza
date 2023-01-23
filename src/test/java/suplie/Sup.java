package suplie;

import org.junit.jupiter.api.Test;
import player.Player;
import player.PlayerTestPlayer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Sup {
    @Test
    void name() {
        Supplier<LocalDateTime> l = () -> LocalDateTime.now();
        System.out.println(l.get());

    }

    @Test
    void name1() {
        Supplier<List<Player>> p = () -> {
            List<Player> list = new ArrayList<Player>();
            list.add(new Player("gholam", 125));
            list.add(new Player("ali", 112));
            list.add(new Player("nasser", 132));
            list.add(new Player("reza", 100));
            return list;
        };
        System.out.println(p.get());


    }
}
