package Polymorphism2;

public class Main
{
    public static void main(String[] args)
    {
        Shape shape;
        // shape dynamically bound to the Square object referenced by square
        shape = new Square(5.0);
        shape.area();
        
        // shape dynamically bound to the Circle object referenced by circle
        shape = new Circle(5.0);
        shape.area();           
    }
}
