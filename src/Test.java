import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer ();
        try {
            computer.procesor.increaseTiming ();
            computer.ramMemory.increaseTiming ();
            computer.hardDrive.increaseTiming ();
        } catch (TemperatureIsMax e) {
            System.out.println (e.getMessage ());
        }
    }
}
