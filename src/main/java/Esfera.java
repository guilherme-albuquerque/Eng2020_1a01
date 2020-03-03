public class Esfera extends TresD {
    private double raio;

    public Esfera(){

    }
    public Esfera(double raio){
        this.raio = raio;
    }
    @Override
    public double volume(){
        return (4/3)*Math.PI*Math.pow(getRaio(),3);
    }

    @Override
    public String toString() {
        return "Esfera{" +
                "raio=" + raio +
                '}';
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}

