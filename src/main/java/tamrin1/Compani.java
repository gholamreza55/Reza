package tamrin1;

public class Compani {
    private int id;
    private String name;
    private int pass;
    private String adress;

    public Compani(int id, String name, int pass, String adress) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPass() {
        return pass;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Compani{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass=" + pass +
                ", adress='" + adress + '\'' +
                '}';
    }
}
