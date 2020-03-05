public class Triangulo  extends Poligono implements Perimetro{
	private double l1, l2,l3;
	
	public Triangulo (double l1, double l2, double l3, double base, double altura) {
		super (base, altura);
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		
}

		
		public double area() {
			return(getBase()*getAltura())/2;
			
				
			}
		@Override
		public double perimetro() {
			return l1+l2+l3;
		}

	@Override
	public String toString() {
		return "Triangulo{" +
				"l1=" + l1 +
				", l2=" + l2 +
				", l3=" + l3 +
				'}';
	}
}
