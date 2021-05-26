package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class ServiceCar {

    private final CarDao carDao;

    @Autowired
    public ServiceCar(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars() {
        return carDao.getCars();
    }

    public List<Car> getFixCars(int valueCars) {
        return carDao.getFixCars(valueCars);
    }
}
