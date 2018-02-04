package figures;

public class Trapezium extends Triangle {

    private int sideB;

    Trapezium(){
        this.sideA = Main.random.nextInt(8)+2;
        this.sideB = Main.random.nextInt(8)+2;
    }

    protected int getSideB() {
        return sideB;
    }

    protected void draw() {
        System.out.println(color+" figures.Trapezium.");
    }

    protected double getArea() {
        return 0.5*(sideA + sideB)*super.getHeight();
    }

    public String toString(){
        return "Figure: Trapezium, side a - "+sideA+", side b - "+sideB+"" + ", height - "+super.getHeight()+
                ", area: "+this.getArea()+", color - "+super.color;
    }
}
