package employ;

import java.util.List;

public class EmployeeListServiceImpl implements EmployeeListService{
    @Override
    public List<Fruit> findAllFruit() {
        return null;
    }

    @Override
    public void saveFruit(List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            fruit.check();

        }

    }
}
