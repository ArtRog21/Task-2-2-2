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
    public List<Car> findCars(int count) {
        if (count >= 6) {
            allCars();
        }
        return carDao.findCars(count);
    }
}