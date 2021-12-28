package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car_v2;
import toys.Helicopter_v2;
import toys.SerialNumberGenerator_v2;

/**
 * @author Mele13
 * 
 * Segunda versión de Kata6.
 * Creador de objetos. Patrón de diseño creacional.
 */
public class Main_v2 {
    public static void main(String[] args) {
        SerialNumberGenerator_v2 generator =  new SerialNumberGenerator_v2();
        ArrayList<Car_v2> cars = new ArrayList<>();
        ArrayList<Helicopter_v2> helicopters = new ArrayList<>();
        
        System.out.print("Para construir un coche, escriba 'car',\n");
        System.out.print("para un helicóptero, escriba 'helicopter': ");
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();      
            
            switch(line){
                case "car":
                    Car_v2 car = new Car_v2(generator.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.print(
                        "Built cars: " + cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")) + 
                                "\n\n>>>Para salir del programa, escriba 'exit' "
                                + "\n>>>Para continuar, escriba otra cosa: ");
                    break;
                case "helicopter":
                    Helicopter_v2 helicopter = new Helicopter_v2(generator.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.print(
                        "Built helicopters: " + helicopters.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")) + 
                                "\n\n>>>Para salir del programa, escriba 'exit' "
                                + "\n>>>Para continuar, escriba otra cosa: ");
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command unknown!");
              
            }
            if (!line.equals("exit")){}
        }
    }    
}