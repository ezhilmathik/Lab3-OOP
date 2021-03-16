package Encapsulation;

public class Main
{
    public static void main(String args[])
    {
        Person human = new Person();
        human.setName("James");
        human.setAge(20);
        human.setIdNum("12343ms");
        
        System.out.print("Name : " + human.getName() + " Age : " + human.getAge());
    }
}
