package toys;

public class Car_v1 {
    private final Integer serialNumber;
    
    /**
     * Constructor al que se le pasa el parámetro que referencia el serial de 
     * un juguete.
     * 
     * @param serialNumber 
     */
    public Car_v1(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     * Getter para el serial de un juguete.
     * 
     * @return serialNumber
     */
    public Integer getSerialNumber() {
        return this.serialNumber;
    }
       
    public void pack() {
        System.out.printf("\nPacking car '%d'\n", this.serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling car '%d'\n", this.serialNumber);
    }
}
