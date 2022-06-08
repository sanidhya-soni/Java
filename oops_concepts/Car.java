package oops_concepts;

public class Car
{
    String color;
    String name;
    String ownerName;
    
    Car(String name, String color, String ownerName)
    {
        this.color = color;
        this.name = name;
        this.ownerName = ownerName;
    }

    void accelerate(int speed)
    {
        System.out.println(ownerName + "'s " + name + " of " + color + " color is accelerating with speed of " + speed);
    }

    void breaking()
    {
        System.out.println(ownerName + "'s " + name + " of " + color + " color is breaking");
    }

    public static void main(String[] args)
    {
        Car audi = new Car("Audi", "Black", "Mr.Gulabchand");
        
        /* audi.name = "Audi";
        audi.color = "Black"; */

        audi.accelerate(110);
        audi.breaking();

        Car mercedes = new Car("Mercedes", "White", "Mr.Phoolchand");

        /* mercedes.name = "Mercedes";
        mercedes.color = "White"; */

        mercedes.accelerate(160);
        mercedes.breaking();

        System.out.println(audi.color);
        System.out.println(mercedes.color);

    }

}
