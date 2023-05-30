package ch10;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Function2Demo {
    public static void main(String[] args) {
        Function<String, Object> f1 = c -> c.getBytes();
        ToIntFunction<Car> f2 = c -> c.getAge();

        for (Car car : Car.Cars) {
            System.out.println("(" + f1.apply(car + "," + f2.applyAsInt(car) + ") "));
        }
        System.out.println();

        double averageAge = average(Car.Cars, c -> c.getAge());
        double averageMileage = average(Car.Cars, c -> c.getMileage());

        System.out.println("평균 연식 = " + averageAge);
        System.out.println("평균 주행거리 = " + averageMileage);
    }

    static public double average(List<Car> cars, ToIntFunction<Car> f) {
        double sum = 0.0;
        for (Car car : cars) {
            sum += f.applyAsInt(car);
        }
        return sum/cars.size();
    }
}
