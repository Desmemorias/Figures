package figures;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

 public abstract class Figure {

     Color color;

      Figure(){
        List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(Color.values()));
        this.color = VALUES.get(Main.random.nextInt(VALUES.size()));
    }

    protected Color getColor(){
            return color;
    }

    protected abstract void draw();

    protected abstract double getArea();

}
