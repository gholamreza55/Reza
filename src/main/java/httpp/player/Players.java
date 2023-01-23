package httpp.player;

import player.Player;
import java.util.List;

public class Players {
    final List<player.Player> players;

    public Players(List<player.Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
