package toys;

public class Helicopter_v3 {
    private final Integer serialNumber;
    final String type = "helicopter";
    
    /**
     * Constructor al que se le pasa el parámetro que referencia el serial de 
     * un helicóptero.
     * 
     * @param serialNumber 
     */
    public Helicopter_v3(Integer serialNumber) {
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
    
    /**
     * Getter que devuelve el tipo de juguete.
     * 
     * @return type
     */
    public String getType() {
        return this.type;
    }
       
    public void pack() {
        System.out.printf("\nPacking %s '%d'\n", this.type, this.serialNumber);
    }
    
    public void label() {
        System.out.printf("Labelling %s '%d'\n", this.type, this.serialNumber);
    }
}
