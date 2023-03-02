package practicasOB.ejercicio4OB;

public class SmartMain {
    public static void main(String[] args) {
        SmartDevice smartphoneSamsung = new SmartPhone("Samsung", "A27", "Negro", 97, "Movistar", 100);
        SmartDevice smartWatchXiaomi = new SmartWatch("Xiaomi", "Mi Band 4", "Rosa", 98, "Aguja", true, 0);

        smartphoneSamsung.usar(60.0);
        smartWatchXiaomi.usar(40.0);

        System.out.println(smartphoneSamsung);
        System.out.println(smartWatchXiaomi);
    }
}
