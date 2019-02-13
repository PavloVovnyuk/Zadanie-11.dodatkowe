abstract class Dane {
    private String model;
    private String manufacturer;
    private double serNum;

    public Dane(String model, String manufacturer, double serNum) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.serNum = serNum;
    }

    public void increaseTiming() throws TemperatureIsMax {

    }
}
