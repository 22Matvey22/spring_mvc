package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.ServiceCar;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final ServiceCar serviceCar;

    @Autowired
    public CarsController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping()
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> fixCar;
        if (count == null || count >= 5) {
            fixCar = serviceCar.getCars();
        } else {
            fixCar = serviceCar.getFixCars(count);
        }
        model.addAttribute("cars", fixCar);
        return "/cars";
    }

}
