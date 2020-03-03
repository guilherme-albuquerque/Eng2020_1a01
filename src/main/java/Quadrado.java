public class Quadrado extends Poligono implements Diagonal{

    public Quadrado(double lado){
        super(lado,lado);
    }

    @Override
    public double diagonal() {
        return getAltura()*Math.sqrt(2);
    }

    @Override
    public double area() {
        return getAltura()*getBase();
    }
}
