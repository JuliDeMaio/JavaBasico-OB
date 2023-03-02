package practicasOB.ejercicio4OB;

public class SmartWatch extends SmartDevice {

    //atributos
    String tipoDeReloj;
    boolean esDeportivo;
    int pulsoDelDueño;

    //constructor
    public SmartWatch() {

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoDeReloj='" + tipoDeReloj + '\'' +
                ", esDeportivo=" + esDeportivo +
                ", pulsoDelDueño=" + pulsoDelDueño +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", bateria=" + bateria +
                '}';
    }

    public SmartWatch(String marca, String modelo, String color, int bateria, String tipoDeReloj, boolean esDeportivo, int pulsoDelDueño) {
        super(marca, modelo, color, bateria);
        this.tipoDeReloj = tipoDeReloj;
        this.esDeportivo = esDeportivo;
        this.pulsoDelDueño = pulsoDelDueño;
    }
}
