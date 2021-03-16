package HierarchicalInheritance;

//////////////////////////////////////////////////////
// Note:
// Here you have to use the "extends"
// for inherit the class from the
// main class
//////////////////////////////////////////////////////

// parent class (super class)
class Animal
{
    public void eat()
    {
        System.out.println("Eating...");
    }
}


// child (sub class)
// inherit (create another object)
// attributes and methods from another class
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking...");
    }
}

// child (subclass)
// inherit (create another object)
// attributes and methods from inherit class
class Cat extends Animal
{
    public void jump()
    {
        System.out.println("Jumping...");
    }
}


public class Main
{
    public static void main(String[] args)
    {
        // creating the object from the inherit class
        Dog mydog =new Dog();
        // calling the functions associated to the functions
        mydog.eat();
        mydog.bark();

        // calling the another inherit class from attributes
        // and methods from parent class
        Cat mycat =new Cat();
        mycat.eat();
        mycat.jump();
    }
}
