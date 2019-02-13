import java.util.Scanner;

public class Procesor extends Dane {
    private double timing;
    private double maxTemp;
    private double temperature;

    public Procesor(String model, String manufacturer, double serNum, double timing, double maxTemp, double temperature) {
        super (model, manufacturer, serNum);
        this.timing = timing;
        this.maxTemp = maxTemp;
        this.temperature = temperature;
    }
    Scanner scanner = new Scanner (System.in);
    double valueAdd;
    double newTiming;

    @Override
    public void increaseTiming() throws TemperatureIsMax {
        System.out.println ("Wprowadz do ilu chcesz zwiększyć taktowanie dla procesora");
        newTiming = scanner.nextDouble ();
        valueAdd = (newTiming - timing) / 100;
        temperature = temperature + 10 * valueAdd;
        if (temperature >= maxTemp) {
            throw new TemperatureIsMax ();
        } else {
            System.out.println ("Zwieńkszenie jest dozwolone ");
        }

    }

}

