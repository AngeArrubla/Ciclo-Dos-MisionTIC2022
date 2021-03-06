
public class PrecioTotal {
	// Atributos
	double totalPrendas;
	double totalPantalon;
	double totalSandalia;
	Prenda[]listaPrendas;
	// métodos de acceso
	// Constructores
	public PrecioTotal(Prenda[] listaPrendas) {
		this.listaPrendas = listaPrendas;
		totalPrendas();
		calculaTotalSandalia();
		calculaTotalPantalon();
	}
	// métodos
	public void mostrarTotales() {
		System.out.println("La suma del precio de las Prendas es de " + totalPrendas);
		System.out.println("La suma del precio de los Pantalones es de " + totalPantalon);
		System.out.println("La suma del precio de las SAndalias es de " + totalSandalia);
	}
	// En caso de ser necesarios metodos adicionales
	public void totalPrendas() {
		//Prenda prendas = new Prenda();
		double acum = 0;
		
		for (int i = 0; i < listaPrendas.length; i++) {
			acum = acum + listaPrendas[i].precioFinal();
		}
		this.totalPrendas = acum;
	}
	
	public void calculaTotalSandalia() {
		Sandalia sandalia = new Sandalia();
		double acum = 0;
		
		for (int i = 0; i < listaPrendas.length; i++) {
			if (listaPrendas[i].getClass() == sandalia.getClass()) {
				acum = acum + listaPrendas[i].precioFinal();
			}
		}
		this.totalSandalia = acum;
	}
	
	public void calculaTotalPantalon() {
		Pantalon pantalon = new Pantalon();
		double acum = 0;
		
		for (int i = 0; i < listaPrendas.length; i++) {
			if (listaPrendas[i].getClass() == pantalon.getClass()) {
				acum = acum + listaPrendas[i].precioFinal();
			}
		}
		this.totalPantalon = acum;
	}
}