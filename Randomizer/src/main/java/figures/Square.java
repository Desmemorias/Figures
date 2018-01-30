package figures;

public class Square extends Figure {

   private int side;

    Square(){
    this.side = Main.random.nextInt(8)+2;
    }

    protected void draw() {
        System.out.println(color+" Square.");
    }

    private int getSide(){return side;}

    protected double getArea() {
        return side*side;
    }


    public String toString(){
        return "Figure: Square "+", side - "+side +", area - "+this.getArea()+", color - "+super.color;
    }
}
