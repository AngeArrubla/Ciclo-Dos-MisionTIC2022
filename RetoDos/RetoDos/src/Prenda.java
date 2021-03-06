
public class Prenda {
	// Atributos
   
	protected static final Double PRECIO_P=100.0;
	protected static final String COLOR_P="negro";
	protected static final Integer TAMANO_P= 1;//?
	
	protected Double precioP;
	protected String colorP;
	protected Integer tamanoP;
	
	// Constructores
	
	public Prenda(){
		this.precioP=PRECIO_P;
		this.colorP=COLOR_P;
		this.tamanoP=TAMANO_P;
	}
	
	public Prenda(Double precioP, Integer tamanoP){
		this.precioP= precioP;
		tipoTamano(tamanoP);
		this.colorP=COLOR_P;	
	}
	
	public Prenda(Double precioP, Integer tamanoP, String colorP){
		this.precioP= precioP;
		tipoTamano(tamanoP);
		tipoColor(colorP); 
	}
	
	// Metodos
	
	public void tipoTamano(Integer tamano) {
		
		if(tamano>0 && tamano<=6) {
			this.tamanoP = tamano;
		}else {
			this.tamanoP=TAMANO_P;
		}
	}
	
	public void tipoColor(String color) {
		
		String colores[]= {"negro", "cafe","blanco", "rojo"};
		boolean encontrado= false;
		
		for(int i=0; i<colores.length; i++) {
			if(colores[i].equals(color)) {
				encontrado=true;
			}
		}
		
		if(encontrado) {
			this.colorP = color;
		}else {
			this.colorP=COLOR_P;
		}
	}
	
	
	public double precioFinal(){
		double adicion= 0.0;
		switch(colorP) {
		
		case "negro":
		adicion+=100;
			break;
		case "cafe":
		adicion +=80;
			break;
		case "Blanco":
		adicion += 70;
			break;
		case "rojo":
		adicion += 50;
			break;
		}		
	
	
		if(tamanoP==1) {
			adicion+=200;
		}
		else if(tamanoP==2) {
			adicion+=300;
		}
		else if(tamanoP==3) {
			adicion+=400;
		}
		else if(tamanoP==4) {
			adicion+=500;
		}
		else if(tamanoP==5) {
			adicion+=600;
		}
		else if(tamanoP==6) {
			adicion+=700;
		}
		return precioP + adicion;
		//public double adicionalTamaño(){
		//double return 
	}
}
