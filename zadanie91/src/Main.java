import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("toyota", 2010));
        cars.add(new Car("bmw", 2003));
        cars.add(new Car("mitsubishi", 2020));
        cars.add(new Car("milk", 2007));
        cars.add(new Car("polonez", 1993));
        cars.add(new Car("skoda", 2015));
        cars.add(new Car("honda", 2006));
        cars.add(new Car("mercedes", 1990));
        cars.add(new Car("volksvagen", 2004));
        cars.add(new Car("ford", 1992));

        Collections.sort(cars);
        for (Car car : cars){
            System.out.println(car);
        }
    }
}