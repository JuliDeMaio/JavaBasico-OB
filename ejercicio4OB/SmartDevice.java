package practicasOB.ejercicio4OB;

public abstract class SmartDevice {

    //atributos
    String marca;
    String modelo;
    String color;
    double bateria;


    //contructores
    public SmartDevice() {
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", bateria=" + bateria +
                '}';
    }

    public SmartDevice(String marca, String modelo, String color, int bateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.bateria = bateria;
    }

    //comportamiento
    public void usar(double tiempoDeUsoEnMinutos){
        this.bateria = bateria - (tiempoDeUsoEnMinutos*0.25);
    }
}
