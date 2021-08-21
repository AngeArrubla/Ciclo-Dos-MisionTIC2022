
public class Pantalon extends Prenda {
	// Atributos
	protected static final String MARCA = "adidas";
	protected String marca;
	
	// métodos de acceso
	
	// Constructores
	public Pantalon(){
		super.precioP=PRECIO_P;//herencia del padre
		super.colorP=COLOR_P;
		super.tamanoP=TAMANO_P;
		this.marca=MARCA; //atributos de su clase
	}
	
    public Pantalon (Double precioP, Integer tamanoP){
    	super.precioP=precioP;
    	super.tipoTamano(tamanoP);
    	super.colorP=COLOR_P;
    	this.marca=MARCA;
    }
    public Pantalon (Double precioP, Integer tamanoP, String colorP, String marca){
    	super.precioP= precioP;
		super.tipoTamano(tamanoP);
		super.tipoColor(colorP);
		tipoMarca(marca); //this.marca=MARCA;
    }
    
    // Métodos
    public void tipoMarca(String marca) {
    	
    	String marcas[]= {"adidas", "puma","levis"};
		boolean encontrado= false;
		
		for(int i=0; i<marcas.length; i++) {
			if(marcas[i].equals(marca)) {
				encontrado=true;
			}
		}
		if(encontrado) {
			this.marca = marca;
		}else {
			this.marca=MARCA;
		}
    }
    
    public double precioFinal(){
		double adicion= 0.0;
		switch(marca) {
		
		case "adidas":
		adicion+=50;
			break;
		case "puma":
		adicion +=30;
			break;
		case "levis":
		adicion += 70;
			break;
		}
		return adicion;
    }
}
