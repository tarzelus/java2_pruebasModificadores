package figuras;
public abstract class FiguraGeometrica {
	private String nombre;
	private Double base, altura;

	protected void setBase(double base) {
		this.base = base;
	 }	
	protected double getBase() {
		return base;
	}
	
	protected void setAltura(double altura) {
		this.altura = altura;
	 }
	protected double getAltura() {
		return altura;
	}
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	 }
	protected String getNombre() {
		return nombre;
	}
	
	protected abstract double area();
	protected abstract double perimetro();
	
	public void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}