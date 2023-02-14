package employ;

import java.util.List;

public interface EmployeeListServiceDAO {
    List<Fruit> findAllFruit();

    public void saveFruit(List<Fruit> fruits);
}
