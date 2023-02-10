package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> allCars() {
        return carDao.allCars();
    }

    @Override
    public List<Car> findCars(Integer count) {
        if (count == null || count > 5 || count < 1) {
            return allCars();
        }
        return carDao.findCars(count);
    }
}