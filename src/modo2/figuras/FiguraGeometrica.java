package modo2.figuras;
public abstract class FiguraGeometrica {
	protected String nombre;
	protected Double base, altura;

	/*public protected y defaut no sirven por que no se podria acceder a los metodos desd el main*/
	public void setBase(double base) {
		this.base = base;
	 }	
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	 }
	public double getAltura() {
		return altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	public String getNombre() {
		return nombre;
	}
	
	public abstract double area();
	public abstract double perimetro();
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}