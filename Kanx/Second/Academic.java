package Second;

import First.Student_basic;
import First.info;

public class Academic extends Student_basic implements info
{
    double marks1, marks2, marks3;

    Academic(String student_name, String father_name, String city, long mobile_number, int roll_no, double marks1, double marks2, double marks3)
    {
        super(student_name, father_name, city, mobile_number, roll_no);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void show()
    {
        show_basic();
    }

    public void calculate_performance()
    {
        System.out.println("Performance in Academics is Improving!");
    }
}
