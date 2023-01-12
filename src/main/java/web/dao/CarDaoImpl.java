package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCarList(Integer count) {
        return getCarList(count);
    }
}