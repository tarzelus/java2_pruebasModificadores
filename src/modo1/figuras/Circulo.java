package modo1.figuras;
public class Circulo extends FiguraGeometrica {

	protected Circulo(){};
	
	protected Circulo(double radio) {
		setNombre("Circulo");
		setBase(0);
		setAltura(0);
		setRadio(radio);
	}
		/*public, default (adecuado default por que es el mas restrictivo)*/
	@Override protected  double area() {

		double area = Constantes.PI*getRadio()*getRadio();
		return area;
	}
	   /*public, default (adecuado default por que es el mas restrictivo)*/
	@Override protected double perimetro() {
		double peri = 2*Constantes.PI*getRadio();
		return peri;
	}
	
	final public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del circulo es: " + area());
		System.out.println("\nEl perimetro del circulo es: " + perimetro());
	}
}