package Overriding;

public class Main
{
    public static void main(String args[])
    {
        Animal cat = new Animal();   // Animal reference and object
        Animal dog = new Dog();   // Animal reference but Dog object
        Rabbit(); // STUDENT WORK 1         
        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
        // STUDENT WORK 2 
    }
}
