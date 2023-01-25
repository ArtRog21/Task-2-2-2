package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDao;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> carList;
    {   carList = new ArrayList<>();
        carList.add(new Car("Audi R8", "red", 2012));
        carList.add(new Car("Audi TT", "grey", 2004));
        carList.add(new Car("Carra GS7", "grey", 2018));
        carList.add(new Car("Nissan", "white", 2006));
        carList.add(new Car("RAM1500", "blue", 2012));
    }

    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> allCars() {
        return carDao.allCars();
    }

    @Override
    public List<Car> findCars(int count) {
        return carDao.findCars(count);
    }
}