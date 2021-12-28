package main;

import business.ToyBuisness_v8;
import factories.regionalfactories.AmericanCarToyFactory_v8;
import factories.regionalfactories.AsianHelicopterToyFactory_v8;
import factories.regionalfactories.AsianSubmarineToyFactory_v8;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.Toy_v8;

/**
 * @author Mele13
 * 
 * Octava versión de Kata6.
 * Creador de objetos. Patrón de diseño creacional.
 */
public class Main_v8 {

    public static void main(String[] args) {

            ToyBuisness_v8 business = new ToyBuisness_v8();
            business.add("car", new AmericanCarToyFactory_v8());
            business.add("helicopter", new AsianHelicopterToyFactory_v8());
            business.add("submarine", new AsianSubmarineToyFactory_v8());
            ArrayList<Toy_v8> toys = new ArrayList<>();
            
            System.out.print("Para construir un coche, escriba 'car',\n");
            System.out.print("para un helicóptero, escriba 'helicopter': ");
            Scanner in = new Scanner(System.in);
            String line = "";
            while(!line.equals("exit")){
                line = in.nextLine();
                
                switch(line){
                    case "submarine":
                    case "car":
                    case "helicopter":
                        toys.add(business.produceToy(line));
                        System.out.print(
                                "Built toys: "+toys.stream()
                                .map(c -> c.toString())
                                .collect(Collectors.joining(", ")) + 
                                "\n\n>>>Para salir del programa, escriba 'exit' "
                                + "\n>>>Para continuar, escriba otra cosa: ");
                     
                        break;
                        
                    case "exit":
                        System.out.println("Exiting program");
                        break;
                        
                    default:
                        System.out.println("Error");
                        break;                
                }            
            }
    }    
}