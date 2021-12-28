package toyproduct.models;

import toyproduct.Toy_v6;

public class AmericanCarToy_v6 implements Toy_v6 {
    private final Integer serialNumber;
    final String type = "car";
    
    /**
     * Constructor al que se le pasa el parámetro que referencia el serial de 
     * un coche.
     * 
     * @param serialNumber 
     */
    public AmericanCarToy_v6(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }   
    
    /**
     * Getter para el serial de un juguete.
     * 
     * @return serialNumber
     */
    @Override
    public Integer getSerialNumber() {
        return this.serialNumber;
    }
    
    /**
     * Getter que devuelve el tipo de juguete.
     * 
     * @return type
     */
    public String getType() {
        return this.type;
    }
       
    @Override
    public void pack() {
        System.out.printf("\nPacking %s '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public void label() {
        System.out.printf("Labelling %s '%d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public String toString() {
        return "AmericanCarToy {" + "serialNumber = " + serialNumber + '}';
    }
}