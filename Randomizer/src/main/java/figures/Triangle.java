package figures;

public class Triangle extends Figure {

  private int sideA;
  private int height;

   Triangle() {
        this.sideA = Main.random.nextInt(8)+2;
        this.height = Main.random.nextInt(8)+2;
    }

    private int getSideA() {
        return sideA;
    }

    int getHeight() {
        return height;
    }

    protected double getArea(){
       return  0.5*sideA*height;
    }

   protected void draw() {
        System.out.println(color+" Triangle.");
   }

    public String toString(){
        return "Figure: Triangle, side a - "+sideA+
                ", height -"+getHeight()+", area: "+this.getArea()+", color - "+super.color;
    }

}
