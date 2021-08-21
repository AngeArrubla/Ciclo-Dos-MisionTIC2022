
public class Sandalia extends Prenda {
	 // Atributos
	protected static final String USO = "doble";
	protected String uso;
    // métodos de acceso
	
	
    // Constructores
	public Sandalia(){
		super.precioP=PRECIO_P;
		super.colorP=COLOR_P;
		super.tamanoP=TAMANO_P;
		this.uso=USO;
	}
	
	public Sandalia (Double precioP, String colorP){
		super.precioP=precioP;
    	super.tamanoP=TAMANO_P;
    	super.tipoColor(colorP);
    	this.uso=USO;
	}
	public Sandalia (Double precioP, Integer tamanoP, String colorP, String uso){
		super.precioP= precioP;
		super.tipoTamano(tamanoP);
		super.tipoColor(colorP);
		tipoUso(uso); //this.marca=MARCA;
    }
        // Métodos
	
	public boolean tipoUso(String uso) {
		if (uso.equals("doble") || uso.equals("interiores") || uso.equals("exteriores")) {
			return true;
		} else {
			return false;
		}
	}
		
		
	public double precioFinal(){
		double adicional = 0;
		switch (uso) {
		case "exteriores": 
			adicional = 50;
			break;
		case "interiores": 
			adicional = 30;
			break;
		case "doble":
			adicional = 70;
			break;
		}
			return adicional;
	}
}
	
	

	