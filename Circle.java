public class Circle extends Shape{
    int radius;
    Circle(String color, int radius){
        super(color);
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI *radius *radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
