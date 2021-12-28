package factories;

public class SerialNumberGenerator_v8 {
    
    private Integer serialNumber = -1;
    static private SerialNumberGenerator_v8 instance = null;
    
    private SerialNumberGenerator_v8(){}
        
    public static SerialNumberGenerator_v8 getInstance(){
        if(instance == null){
            instance = new SerialNumberGenerator_v8();
        }
        return instance;
    }
    
    public int next(){
        serialNumber += 1;
        return serialNumber;
    }
}