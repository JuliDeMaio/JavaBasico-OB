package practicasOB.ejercicio4OB;

public class SmartPhone extends SmartDevice {

    // atributos
    String companiaTelefonica;
    double saldoRestante;

    // constructor
    public SmartPhone() {
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "companiaTelefonica='" + companiaTelefonica + '\'' +
                ", saldoRestante=" + saldoRestante +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", bateria=" + bateria +
                '}';
    }

    public SmartPhone(String marca, String modelo, String color, int bateria, String companiaTelefonica, double saldoRestante) {
        super(marca, modelo, color, bateria);
        this.companiaTelefonica = companiaTelefonica;
        this.saldoRestante = saldoRestante;
    }
}
