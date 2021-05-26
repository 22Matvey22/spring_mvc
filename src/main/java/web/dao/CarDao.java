package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDao {
    private final List<Car> cars = new ArrayList<>();

    public CarDao() {
    }

    {
        cars.add(new Car("Dodge", 1969, "Charger"));
        cars.add(new Car("Audi", 2020, "RS7"));
        cars.add(new Car("BMW", 2021, "X5M"));
        cars.add(new Car("Ford", 1970, "Mustang"));
        cars.add(new Car("Chevrolet", 1969, "Corvet"));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getFixCars(int valueCars) {
        return cars.stream().limit(valueCars).collect(Collectors.toList());
    }
}
