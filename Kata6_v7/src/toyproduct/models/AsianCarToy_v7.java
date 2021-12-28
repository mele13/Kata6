package toyproduct.models;

import toyproduct.Toy_v7;

public class AsianCarToy_v7 implements Toy_v7 {
    private final Integer serialNumber;
    final String type = "car";
    
    /**
     * Constructor al que se le pasa el parámetro que referencia el serial de 
     * un coche.
     * 
     * @param serialNumber 
     */
    public AsianCarToy_v7(Integer serialNumber) {
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
        return "AsianCarToy {" + "serialNumber = " + serialNumber + '}';
    }
}