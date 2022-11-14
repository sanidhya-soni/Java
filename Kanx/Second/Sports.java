package Second;

import First.Student_basic;
import First.info;

public class Sports extends Student_basic implements info
{
    double height, weight;
    String game;

    public Sports(String student_name, String father_name, String city, long mobile_number, int roll_no, double height, double weight, String game)
    {
        super(student_name, father_name, city, mobile_number, roll_no);
        this.height = height;
        this.weight = weight;
        this.game = game;
    }

    public void show()
    {
        show_basic();
    }

    public void calculate_performance()
    {
        System.out.println("Performance in Sports is Improving!");
    }
}
