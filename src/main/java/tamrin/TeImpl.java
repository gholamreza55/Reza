package tamrin;

import java.util.List;

public class TeImpl implements Te{
    @Override
    public List<Person> list() {
        return null;
    }

    @Override
    public void saveImp(List<Person> list) {
        for (Person person : list) {
            person.chick();
          if (person.getId() > 10)
              System.out.println(person);
        }

    }
}
