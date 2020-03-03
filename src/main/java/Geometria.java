import jdk.jshell.Diag;

import java.util.ArrayList;

public class Geometria {
    public Geometria() {

    }

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList();
        figuras.add(new Circulo(1.0));
        figuras.add(new Circulo(10.0));
        figuras.add(new Retangulo(5, 10));
        figuras.add(new Quadrado(10));
        figuras.add(new Trapezio(8,3,4,5,3));
        figuras.add(new Cubo(2,3,4));
        figuras.add(new Piramide(3,5,6));
        figuras.add(new Esfera(8));
        figuras.add(new Cilindro(2,3));


        for (Figura figura : figuras) {
            System.out.println("**********************");
            System.out.println(figura);
            System.out.println("Área = " + figura.area());
            if (figura instanceof Diagonal) {
                Diagonal d = (Diagonal) figura;
                System.out.println("Diagonal=" + d.diagonal());
            }if(figura instanceof Perimetro){
                Perimetro p = (Perimetro) figura;
                System.out.println("Perimetro="+ p.perimetro());
            }if(figura instanceof Volume){
                Volume v = (Volume) figura;
                System.out.println("Volume="+ v.volume());
            }

        }
    }
}
