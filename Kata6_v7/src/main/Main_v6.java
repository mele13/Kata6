package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy_v7;
import business.ToyBusiness_v7;
import factories.regionalfactories.*;

/**
 * @author Mele13
 * 
 * Séptima versión de Kata6.
 * Creador de objetos. Patrón de diseño creacional.
 */
public class Main_v6 {
    public static void main(String[] args) {
        ToyBusiness_v7 business = new ToyBusiness_v7();
        business.add("car", new AmericanCarToyFactory_v7());
        business.add("helicopter", new AsianHelicopterToyFactory_v7());
        ArrayList<Toy_v7> toys = new ArrayList<>();
        
        System.out.print("Para construir un coche, escriba 'car',\n");
        System.out.print("para un helicóptero, escriba 'helicopter': ");
        Scanner in = new Scanner(System.in);
        String line = "";
        
        while(!line.equals("exit")){
            line = in.nextLine();      
            
            switch(line){
                case "car":                    
                case "helicopter":
                case "submarine":
                    toys.add(business.produceToy(line));
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