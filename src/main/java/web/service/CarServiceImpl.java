package web.service;


import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "BMW", "black"));
        cars.add(new Car(++CARS_COUNT, "Audi", "red"));
        cars.add(new Car(++CARS_COUNT, "Honda", "yellow"));
        cars.add(new Car(++CARS_COUNT, "Mercedes", "green"));
        cars.add(new Car(++CARS_COUNT, "Toyota", "blue"));
    }


    @Override
    public List<Car> getCars(int count) {
        return cars.stream()
                .filter(car -> car.getId() <= count)
                .toList();
    }
}
