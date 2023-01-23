package liveCoding;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GilderRozeTest {
    @Test
    void should_update_quality() {
        String[] name = new String[]{"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert"};
        Integer[] selin = new Integer[]{0, -1, 1, 11, 12};
        Integer[] quality = new Integer[]{0, 1, 2, 50, 49, -1};
        //Item output = Updatability(foo, selin, quality);
        CombinationApprovals.verifyAllCombinations(this::Updatequlity, name, selin, quality);
    }

    private String Updatequlity(String name, int selin, int quality) {
        Item[] items = new Item[]{new Item(name, selin, quality)};
        GilderRoze app = new GilderRoze(items);
        app.updatequality();
       // Item output = app.items[0];
        return app.items[0].toString();
    }
}
