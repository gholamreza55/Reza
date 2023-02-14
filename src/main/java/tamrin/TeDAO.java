package tamrin;

import java.util.List;

public interface TeDAO {
    List<Person> list();

    public void saveImp(List<Person> list);

}
