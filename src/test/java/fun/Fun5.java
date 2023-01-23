package fun;

import org.junit.jupiter.api.Test;
import player.Player;
import player.PlayerTestPlayer;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Fun5 {
    @Test
    void name() {
        List<Player> players = new PlayerTestPlayer().getPlayers();

        Set<String> collect = players.stream()
                .map(Player::getName)
                .collect(toSet());
       // System.out.println(collect);

    }

    @Test
    void name1() {

    }
}
