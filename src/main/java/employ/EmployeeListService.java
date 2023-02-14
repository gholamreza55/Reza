package employ;

import java.util.List;

public interface EmployeeListService {
    List<Fruit> findAllFruit();

    public void saveFruit(List<Fruit> fruits);
}
