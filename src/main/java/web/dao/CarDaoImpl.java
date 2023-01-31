package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Audi R8", "red", 2012));
        cars.add(new Car("Audi TT", "grey", 2004));
        cars.add(new Car("Carra GS7", "grey", 2018));
        cars.add(new Car("Nissan", "white", 2006));
        cars.add(new Car("RAM1500", "blue", 2012));
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