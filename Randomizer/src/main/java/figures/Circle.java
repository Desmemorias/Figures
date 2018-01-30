package figures;

public class Circle extends Figure {

    private int radius;

    Circle(){
        this.radius= Main.random.nextInt(8)+2;
    }

    int getRadius(){
        return radius;
    }

    protected void draw() {
        System.out.println(color+" Circle.");
    }

    protected double getArea() {
       return Math.PI*(radius*radius);
    }

    public String toString(){
        return "Figure: .Circle "+", radius - "+radius +", area - "+this.getArea()+", color - "+super.color;
    }

}
