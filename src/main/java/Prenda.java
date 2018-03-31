public class Prenda{
	
	private String nombre;
	
	public Prenda (String nombre) {
		//super();  para llamar al constructor padre
		this.nombre = nombre;
	} 
	
	
	
	public String nombreFancy() {
		return "super duper " + nombre;
	}
}