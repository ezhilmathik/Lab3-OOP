package SingleInheritance;

//////////////////////////////////////////////////////
// Note:
// Here you have to use the extends
// for inherit the class from the
// main class
//////////////////////////////////////////////////////
// parent class (super class)
class Animal
{
    public void eat()
    {
        System.out.println("eating...");
    }
}


// child class (subclass)
// inherit (create another object)
// attributes and methods from another class
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("barking...");
    }

    public void jump()    // STUDENT WORK 1
        
    .............         // STUDENT WORK 2
}


public class Main
{
    public static void main(String[] args)
    {
        // creating the object from the inherit class
        Dog dog =new Dog();
        // calling the functions associated to the functions
        dog.eat();
        dog.bark();
        //dog.jump()   // STUDENT WORK 1
        //dog.run();   // STUDENT WORK 2 
    }
}
