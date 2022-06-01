package oops;

public class Accelerate extends Vehicle
{
    void accelerating()
    {
        int speed = super.speed;
        System.out.println(speed);
    }

    public static void main(String[] args)
    {
        Accelerate ob = new Accelerate();
        ob.accelerating();
    }
}
