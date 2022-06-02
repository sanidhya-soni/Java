package cca_pro.stages;

import java.util.Scanner;
import java.sql.*;

public class Stage5
{
    public static void main(String[] args)throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root", "admin");
        Statement stmt = conn.createStatement();
        try
        {
            stmt.execute("create table directory(name varchar(20), ph_no varchar(10), mail varchar(50));");
        }
        catch(Exception e)
        {
            System.out.println("Table Already Exists");
        }

        Scanner sc = new Scanner(System.in);
        boolean will_continue = true;
        String name = "";
        String ph_no = "";
        String mail = "";
        while(will_continue)
        {
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Ph.No: ");
            ph_no = sc.nextLine();
            System.out.print("Mail: ");
            mail = sc.next();
            System.out.println("insert into directory(name, ph_no, mail) values('" + name + "', '" + ph_no + "', '" + mail + "');");
            String sql = "insert into directory(name, ph_no, mail) values('" + name + "', '" + ph_no + "', '" + mail + "');";
            stmt.executeUpdate(sql);
            System.out.print("Enter 0 to stop or other number to give more entries: ");
            if(sc.nextInt() == 0)
            {
                will_continue = false;
            }
            sc.nextLine();
        }
        stmt.close();
        conn.close();
        sc.close();
    }  
}
