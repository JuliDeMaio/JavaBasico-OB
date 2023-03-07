package ejercicio5OB;

public class Main {
		public static CocheCRUD cocheCRUD = new CocheCRUDImpl();

		public static void main(String[] args) {
			
			Coche golcito = new Coche("Volkswagen", "Gol", "Gris", 1.2, 4.0);
			Coche twinguito = new Coche("Renault", "Twingo", "Rojo", 1.0, 3.0);
			Coche kangoo = new Coche("Renault", "Kangoo", "Negro", 1.6, 4.2);
			
			cocheCRUD.save(golcito);
			cocheCRUD.save(twinguito);
			cocheCRUD.save(kangoo);
			cocheCRUD.findAll();
			cocheCRUD.delete(kangoo);
			cocheCRUD.findAll();
		}
}
