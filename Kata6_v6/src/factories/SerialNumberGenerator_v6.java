package factories;


public class SerialNumberGenerator_v6 {
    private Integer serialNumber = 0;
    
    /**
     * Método que incrementa el serial de los juguetes.
     * 
     * @return serialNumber serial de un juguete
     */
    public Integer next() {
        return this.serialNumber++;
    }
}
