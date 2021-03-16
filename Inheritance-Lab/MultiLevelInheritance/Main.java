package MultiLevelInheritance;


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


// child (sub class)
// inherit (create another object)
// attributes and methods from another class
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("barking...");
    }
}

// child (subclass)
// inherit (create another object)
// attributes and methods from inherit class
class Puppy extends Dog
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
        Puppy mydog =new Puppy();
        // calling the functions associated to the functions
        mydog.eat();
        mydog.bark();
        mydog.jump();
    }
}
