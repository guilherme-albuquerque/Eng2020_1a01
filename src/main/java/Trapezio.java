public class Trapezio extends Poligono implements Perimetro{
    private double baseM, l1,l2;
        public Trapezio(double baseMenor, double baseM, double altura, double l1, double l2){
            super(altura,baseMenor);
            this.baseM = baseM;
            this.l1 = l1;
            this.l2 = l2;

        }





        @Override
        public double perimetro(){
            l1 = (this.baseM - this.getBase())/2;
            l2 = (Math.sqrt(Math.pow(2,l1)+Math.pow(2,getAltura())));
            return this.baseM + this.getBase()+ l2*2;

        }
        public double area() {
           return (getBaseM()+getBase()+getAltura()/2);
    }

    @Override
    public String toString() {
        return "Trapezio{" +
                "baseM=" + baseM +
                ", l1=" + l1 +
                ", l2=" + l2 +
                '}';
    }

    public double getBaseM() {
        return baseM;
    }

    public void setBaseM(double baseM) {
        this.baseM = baseM;
    }
}
