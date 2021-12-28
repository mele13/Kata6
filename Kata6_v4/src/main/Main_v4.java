package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy_v4;
import toys.ToyBusiness_v4;

/**
 * @author Mele13
 * 
 * Cuarta versión de Kata6.
 * Creador de objetos. Patrón de diseño creacional.
 */
public class Main_v4 {
    public static void main(String[] args) {
        ToyBusiness_v4 toyBusiness = new ToyBusiness_v4();
        ArrayList<Toy_v4> toys = new ArrayList<>();
        
        System.out.print("Para construir un coche, escriba 'car',\n");
        System.out.print("para un helicóptero, escriba 'helicopter': ");
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();      
            
            switch(line){
                case "car":                    
                case "helicopter":
                    toys.add(toyBusiness.createToy(line));
                    System.out.print(
                        "Built toys: " + toys.stream()
                                .map(c -> c.toString())
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