package oops;

public class Break extends Vehicle
{
    void breaking()
    {
        int force = super.force;
        System.out.println(force);
    }
}
