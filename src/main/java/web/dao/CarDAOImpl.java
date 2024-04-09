package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", "Black"));
        cars.add(new Car("BMW", "X5", "Red"));
        cars.add(new Car("Mercedes", "Benz", "White"));
        cars.add(new Car("Volkswagen", "Tiguan", "Gray"));
        cars.add(new Car("Nissan", "Tiida", "Silver"));
    }
    @Override
    public List<Car> getCars(int num) {
        return cars.subList(0, num);
    }
}
