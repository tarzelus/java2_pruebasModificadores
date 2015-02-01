package modo1.figuras;
public class Rectangulo extends FiguraGeometrica {

	protected Rectangulo(){};
	
	protected Rectangulo(double base, double altura) {
		setNombre("rectangulo");
		setBase(base);
		setAltura(altura);
	}
		/*public, default (adecuado default por que es el mas restrictivo)*/
	@Override protected  double area() {
		double area = getBase()*getAltura();
		return area;
	}
	   /*public, default (adecuado default por que es el mas restrictivo)*/
	@Override protected double perimetro() {
		double peri = 2*getBase()+2*getAltura();
		return peri;
	}
	
	final public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del rectangulo es: " + area());
		System.out.println("\nEl perimetro del rectangulo es: " + perimetro());
	}
}