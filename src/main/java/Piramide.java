public class Piramide extends TresD {
    private double base, alt, prof;

    public Piramide(){

    }
    public Piramide(double base, double alt, double prof){
        this.base = base;
        this.alt = alt;
        this. prof = prof;
    }

    @Override
    public double volume() {
        return (1/3)*getBase()*getAlt()*getProf();
    }

    @Override
    public String toString() {
        return "Piramide{" +
                "base=" + base +
                ", alt=" + alt +
                ", prof=" + prof +
                '}';
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getProf() {
        return prof;
    }

    public void setProf(double prof) {
        this.prof = prof;
    }
}
