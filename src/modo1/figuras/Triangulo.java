package modo1.figuras;
public class Triangulo extends FiguraGeometrica {

	public Triangulo(){};
	
	protected Triangulo(double base, double altura) {
		setNombre("Triangulo");
		setBase(base);
		setAltura(altura);		
	}
	/*public, default (adecuado default por que es el mas restrictivo)*/
	@Override public double area(){
		double area = getBase()*getAltura()/2;
		return area;
	}
	//Triángulo equilatero
	/*public, default (adecuado default por que es el mas restrictivo)*/
	@Override public double perimetro() {
		double peri = getBase()*3;
		return peri;
	}
	
	public void mostrar() {
	    super.mostrar();
		System.out.println("\nEl area del triangulo es: " + area());
		System.out.println("\nEl perimetro del triangulo es: " + perimetro());
	}
}