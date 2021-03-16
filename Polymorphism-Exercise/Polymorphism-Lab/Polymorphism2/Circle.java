package Polymorphism2;

// Child class
public class Circle extends Shape
{
    //constructor to initialize length
    Circle(double radius)
    {
        super(radius); // calling the super class constructor
    }
    //Overriding the area() method
    void area()
    {
        System.out.println("In area method of circle");
        System.out.println("Area of cirlce - " + 22/7*length*length);;
    }
}
