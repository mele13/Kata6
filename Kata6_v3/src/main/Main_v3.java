package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Car_v3;
import toys.Helicopter_v3;
import toys.ToyBusiness_v3;

/**
 * @author Mele13
 * 
 * Tercera versión de Kata6.
 * Creador de objetos. Patrón de diseño creacional.
 */
public class Main_v3 {
    public static void main(String[] args) {
        ToyBusiness_v3 toyBusiness = new ToyBusiness_v3();
        ArrayList<Car_v3> cars = new ArrayList<>();
        ArrayList<Helicopter_v3> helicopters = new ArrayList<>();
        
        System.out.print("Para construir un coche, escriba 'car',\n");
        System.out.print("para un helicóptero, escriba 'helicopter': ");
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();      
            
            switch(line){
                case "car":
                    cars.add(toyBusiness.createCar());
                    System.out.print(
                        "Built cars: " + cars.stream()
                                .map(c -> c.getSerialNumber().toString())
                                .collect(Collectors.joining(", ")) + 
                                "\n\n>>>Para salir del programa, escriba 'exit' "
                                + "\n>>>Para continuar, escriba otra cosa: ");
                    break;
                case "helicopter":
                    helicopters.add(toyBusiness.createHelicopter());
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