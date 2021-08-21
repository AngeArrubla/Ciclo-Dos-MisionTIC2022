public class NuevaInversion {
   // ---------------------------------------------
	// Atributos
	// ---------------------------------------------
	public NuevaInversion() {
		
	}

	// ---------------------------------------------
	// Métodos
	// ---------------------------------------------
	
	/**
	* Método para comparar la diferencia en el total de
	* intereses generados para el proyecto.
	* @return Respuesta al Reto.
	*/
	public String compararInversion ( int pTiempo, double pCapital, double pInteres){
		/* Cálcular los diferentes intereses y su diferencia*/
		double interesSimple = interesSimple(pTiempo, pCapital, pInteres);
		double interesCompuesto = interesCompuesto(pTiempo, pCapital, pInteres);
		String resultado;
		resultado = "El interés simple es: " + interesSimple + ", el interés compuesto es: " + interesCompuesto + ", La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: " + (interesCompuesto - interesSimple);
		System.out.println(resultado);
		return resultado;
	}
	
	public double interesSimple (int pTiempo, double pCapital, double pInteres) {
		double resultado;
		resultado = pCapital * (pInteres / 100) * pTiempo;
		return Math.round(resultado);
	}
	
	public double interesCompuesto(int pTiempo, double pCapital, double pInteres) {
		double resultado;
		resultado = pCapital * (Math.pow((1+ pInteres/100), pTiempo) - 1);
		return resultado;
	}
}

