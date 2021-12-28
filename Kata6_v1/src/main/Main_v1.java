package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car_v1;
import toys.SerialNumberGenerator_v1;

/**
 * @author Mele13
 * 
 * Primera versión de Kata6.
 * Creador de objetos. Patrón de diseño creacional.
 */
public class Main_v1 {
    public static void main(String[] args) {
        SerialNumberGenerator_v1 generator =  new SerialNumberGenerator_v1();
        ArrayList<Car_v1> cars = new ArrayList<>();
        
        System.out.print("Escriba para comenzar: ");
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();       
            
            if (!line.equals("exit")){
                Car_v1 car = new Car_v1(generator.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println(
                        "Built cars: " + cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")) + "\n");
                System.out.print(">>>Para salir del programa, escriba 'exit' "
                        + "\n>>>Para continuar, escriba otra cosa: ");
            }
        }
    }
}
