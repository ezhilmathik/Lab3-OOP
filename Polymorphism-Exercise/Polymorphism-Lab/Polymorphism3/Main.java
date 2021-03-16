package Polymorphism3;

class Main
{
    public static void main(String[] args)
    {
        DemoOverloading demo=new DemoOverloading();
        System.out.println(demo.add(2,3));      //method 1 called
        System.out.println(demo.add(2,3,4));    //method 2 called
        System.out.println(demo.add(2,3.4));    //method 4 called
        System.out.println(demo.add(2.5,3));    //method 3 called
    }
}
