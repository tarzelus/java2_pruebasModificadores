package modo2.figuras;
public class Triangulo extends FiguraGeometrica {

	public Triangulo(){};
	
	//tienen qu ser definidas como publicas para poder acceder desde el main 
	public Triangulo(double base, double altura) {
		setNombre("Triangulo");
		setBase(base);
		setAltura(altura);		
	}

	@Override public double area(){
		double area = getBase()*getAltura()/2;
		return area;
	}
	//Triángulo equilatero
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