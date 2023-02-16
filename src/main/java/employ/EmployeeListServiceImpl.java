package employ;

import java.util.List;

public class EmployeeListServiceImpl implements EmployeeListService{
    final EmployeeListServiceDAO employeeListServiceDAO;

    public EmployeeListServiceImpl(EmployeeListServiceDAO employeeListServiceDAO) {
        this.employeeListServiceDAO = employeeListServiceDAO;
    }

    @Override
    public List<Fruit> findAllFruit() {

        return employeeListServiceDAO.findAllFruit();
    }

    @Override
    public void saveFruit(List<Fruit> fruits) {
        for (Fruit fruit : fruits) {
            fruit.check();

        }
        employeeListServiceDAO.saveFruit(fruits);

    }
}
