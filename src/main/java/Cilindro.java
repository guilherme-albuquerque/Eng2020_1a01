public class Cilindro extends TresD {
    private double alt, raio;

    public Cilindro(){

    }
    public Cilindro(double raio, double alt){
        this.raio = raio;
        this.alt = alt;

    }

    @Override
    public double volume() {
        return Math.PI*Math.pow(getRaio(),3)*getAlt();
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "alt=" + alt +
                ", raio=" + raio +
                '}';
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
