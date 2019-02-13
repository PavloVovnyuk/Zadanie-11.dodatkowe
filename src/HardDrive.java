public class HardDrive extends Dane {
   private double capacity;

    public HardDrive(String model, String manufacturer, double serNum, double capacity) {
        super (model, manufacturer, serNum);
        this.capacity = capacity;
    }
}

