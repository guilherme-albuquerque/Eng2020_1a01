public class Cubo extends TresD {
    private double alt, base, prof;

    public Cubo(){

    }
    public Cubo(double alt, double base, double prof){
        this.alt = alt;
        this.base = base;
        this.prof = prof;
   }
    @Override
    public double volume(){

        return getBase() * getAlt() * getProf();
    }
    @Override
    public double area(){
        return 6*volume();
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "alt=" + alt +
                ", base=" + base +
                ", prof=" + prof +
                '}';
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getProf() {
        return prof;
    }

    public void setProf(double prof) {
        this.prof = prof;
    }
}
