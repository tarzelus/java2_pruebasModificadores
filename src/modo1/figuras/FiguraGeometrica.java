package modo1.figuras;
public abstract class FiguraGeometrica {
	private String nombre;
	public Double base, altura, radio;
	
	/*public, default (adecuado default por que es el mas restrictivo en todos los metodos)*/
	
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

	protected void setRadio(double radio) {
		this.radio = radio;
	 }
	protected double getRadio() {
		return radio;
	}
	
	protected abstract double area();
	protected abstract double perimetro();
	
	protected void mostrar() {
		System.out.println("\nDatos de la figura geometrica: ");
	}
	
}