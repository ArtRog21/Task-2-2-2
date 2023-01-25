package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars;

    @Autowired
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> allCars() {
        return cars;
    }

    @Override
    public List<Car> findCars(int count) {
        return cars.subList(0, count);
    }
}