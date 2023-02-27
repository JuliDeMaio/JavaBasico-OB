package ejercicio2OB;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(getPrecioConIVA(200));
    }
    private static double getPrecioConIVA(int precioOriginal) {
        return precioOriginal + (precioOriginal * 0.21);
    }
}