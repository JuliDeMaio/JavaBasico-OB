package practicasOB.ejercicio3OB;
public class BucleString {
    public static void main(String[] args) {
        String[] nombres = {"Julian", "Federico", "Franco"};
        String nombresAnexados = "";

        for (String nombre : nombres) {
            nombresAnexados = nombresAnexados + nombre + " ";
        }
        System.out.println(nombresAnexados);
    }
}
