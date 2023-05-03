package put;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Player p = new Player("ali", 60, "tabriz");
        Player p1 = new Player("ali", 60, "tabriz");
        Player p2 = new Player("ali", 60, "tabriz");

        List<Player> players = new ArrayList<>();
        players.add(p);
        players.add(p1);
        players.add(p2);

       // System.out.println(players);

        Team t = new Team();
        t.setPlayers(players);

        int totalScore = t.getScore();
        System.out.println(totalScore);


    }
}
