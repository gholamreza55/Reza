package tamrin;

public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void chick() {
        if (id < 1 || id > 100){
            throw new IdException();
        }
        if (name == null || name.isEmpty()){
            throw new NameException();
        }
    }
}
