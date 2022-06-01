package abstraction;

public class Restaurant
{
    public static void main(String[] args)
    {
        Burger b = new Burger();
        Pizza p = new Pizza();

        foodInfo(b);
        foodInfo(p);
    }

    public static void foodInfo(Food food)
    {
        food.quality();
        food.price();
    }
}
