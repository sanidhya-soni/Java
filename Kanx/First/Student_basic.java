package First;

public class Student_basic
{
    String student_name, father_name, city;
    long mobile_number;
    int roll_no;

    public Student_basic(String student_name, String father_name, String city, long mobile_number, int roll_no)
    {
        this.student_name = student_name;
        this.father_name = father_name;
        this.city = city;
        this.mobile_number = mobile_number;
        this.roll_no = roll_no;
    }

    public void show_basic()
    {
        System.out.println("Student's Name: " + this.student_name);
        System.out.println("Father's Name: " + this.father_name);
        System.out.println("City: " + this.city);
        System.out.println("Mobile Number: " + this.mobile_number);
        try
        {
            if(this.roll_no < 100);
            {
                throw new Roll_No_Exception("Invalid Roll");
            }
        }
        catch(Roll_No_Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Student_basic ob = new Student_basic("Sani", "Null", "Null", 9999999999l, 10);
        ob.show_basic();
    }
}

class Roll_No_Exception extends Exception
{
    Roll_No_Exception(String s)
    {
        super(s);
    }
}