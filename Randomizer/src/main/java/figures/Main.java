package figures;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// The range of randomly generated integer values for object's parameters is 2-10.
// I decided to inherit Trapezium form Trianlge only because they have the same field "sideA", actually Trapezium is not Triangle.

public class Main {

    final static Random random = new Random();

    public static void main(String[] args){

        List<Figure> list = new ArrayList<>();

    for(int i=0; i<random.nextInt(8)+2; i++){
        switch (random.nextInt(4)){
        case 0:
            list.add(new Circle());
            break;
        case 1:
            list.add(new Square());
            break;
        case 2:
            list.add(new Triangle());
            break;
        case 3:
            list.add(new Trapezium());
            break;
    }
}
list.forEach(System.out::println);
    }
}
