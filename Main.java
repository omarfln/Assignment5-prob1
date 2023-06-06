// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[5];
        shapes[0] = new Rectangle("Red", 2,3);
        shapes[1] = new Circle("Green", 2);
        shapes[2] = new Square("Black", 2);
        shapes[3] = new Square("Yellow", 16);
        shapes[4] = new Rectangle("Blue", 20,1);

        printTotal(shapes);


    }

    public static void printTotal(Shape [] shapes){
        for (Shape s : shapes){
            System.out.println("Area of shape : "+ s.calculateArea());
            System.out.println("Perimeter of shape: " + s.calculatePerimeter());
        }

    }
}