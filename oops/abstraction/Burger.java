package oops.abstraction;

public class Burger extends Food
{

    @Override
    public void quality()
    {
        System.out.println("Burger quality is good");
    }

    @Override
    public void price()
    {
        System.out.println("Burger = 100");
    }    
}
