package Polymorphism1;

// example for dynamics polymorphism

public class Main
{
    public static void main(String args[])
    {        
        Animal a1,a2,a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new Puppy();
        a1.eat();
        a2.eat();
        a3.eat();
        
        // another possible way
        /*
        Animal a;
        a = new Animal();
        a.eat();
        a = new Dog();
        a.eat();
        a = new Puppy();
        a.eat();
        */
    }
}  
