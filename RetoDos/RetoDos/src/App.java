
public class App {

	public static void main(String[] args) {
		
		Prenda intem[]=new Prenda[5];
		intem[0]=new Prenda(150.0, 5,"cafe");
		intem[1]=new Pantalon(150.0, 5);
		intem[2]=new Sandalia(500.0, 10,"verde","exteriores"); intem[3]=new Prenda();
		intem[4]=new Pantalon(600.0, 4, "morado", "levis"); 
		PrecioTotal analisis = new PrecioTotal(intem); 
		analisis.mostrarTotales();

		Prenda item[]=new Prenda[5]; 
		item[0]=new Prenda();
		item[1]=new Pantalon();
		item[2]=new Sandalia();
		item[3]=new Prenda();
		item[4]=new Pantalon();
		PrecioTotal analisis1 = new PrecioTotal(item); 
		analisis1.mostrarTotales();
	}
}
