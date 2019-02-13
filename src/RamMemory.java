import java.util.Scanner;

public class RamMemory extends Dane {
    private double memory;
    private double timing;
    private double maxTemp;
    private double temperature;

    public RamMemory(String model, String manufacturer, double serNum, double mamory, double timing, double maxTemp, double temperature) {
        super (model, manufacturer, serNum);
        this.memory = mamory;
        this.timing = timing;
        this.maxTemp = maxTemp;
        this.temperature = temperature;
    }

    double valueAdd;
    double newTiming;
    Scanner scanner = new Scanner (System.in);

    @Override
    public void increaseTiming() throws TemperatureIsMax {
        System.out.println ("Wprowadz na ile chcesz zwiększyć taktowanie dla Pamienci Ram");
        newTiming = scanner.nextDouble ();
        valueAdd = (newTiming - timing) / 100;
        temperature  = temperature + 15 * valueAdd;
        if (temperature >= maxTemp) {
            throw new TemperatureIsMax ();
        } else {
            System.out.println ("Zwieńkszenie jest dozwolone");
        }
    }
}