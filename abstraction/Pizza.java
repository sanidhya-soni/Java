package abstraction;

public class Pizza extends Food
{

    @Override
    public void quality()
    {
        System.out.println("Pizza quality is good");    
    }

    @Override
    public void price()
    {
        System.out.println("Pizza = 250");    
    }
    
}
