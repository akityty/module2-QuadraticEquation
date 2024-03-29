public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1() {
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getRoot2() {
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }
    public double getRoot(){
        return -this.b/(2*this.a);
    }
    public void calculation(){
        if(this.getDiscriminant()<0){
            System.out.println("phuong trinh vo nghiem");
        }else if(this.getDiscriminant() == 0){
            System.out.println("phuong trinh co nghiem x1 = x2 = "+this.getRoot());
        }else{
            System.out.println("phuong trinh co 2 nghiem phan biet: \n x1 = "+this.getRoot1()+"\n x2 = "+ this.getRoot2());
        }
    }
}
