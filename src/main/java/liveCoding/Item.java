package liveCoding;

public class Item {
    String name;
    int selin;
    int quality;

    public Item(String name, int selin, int quality) {
        this.name = name;
        this.selin = selin;
        this.quality = quality;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", selin=" + selin +
                ", quality=" + quality +
                '}';
    }
}
