package web.service;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImp implements CarsService {
    private final List<Cars> cars;

    public CarsServiceImp() {
        cars = new ArrayList<>();
        cars.add(new Cars("Lada", "green", 2010));
        cars.add(new Cars("Jeep", "black", 2020));
        cars.add(new Cars("Geely", "white", 2025));
        cars.add(new Cars("BMW", "blue", 2020));
        cars.add(new Cars("Mazda", "green", 2017));
    }
    @Override
    public List<Cars> getCars(int count) {
        return cars.stream()
                .limit(Math.min(count, cars.size()))
                .collect(Collectors.toList());
    }
}
