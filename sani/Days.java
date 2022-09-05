package sani;

public class Days
{
    public static void main(String[] args)
    {
        String date = "04 08 2021";
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        int year = Integer.parseInt(date.substring(6));
        System.out.println(day + " " + month + " " + year);


    }
}
