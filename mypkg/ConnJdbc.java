package mypkg;

import java.sql.*;

public class ConnJdbc
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root", "admin");
            Statement stmt = conn.createStatement();
            stmt.execute("create table students(roll_no int, name varchar(20));");
            // System.out.println(rs + "Hello");
            
            // while (rs.next())
            // {
            //     int pcode = rs.getInt("PCODE");
            //     int weigh = rs.getInt("WEIGGH");
            //     String color = rs.getString("COLOR");
            //     double cost = rs.getDouble("COST");
            //     double sp = rs.getDouble("SELLINGPRICE");
            //     System.out.println(pcode + "\t\t" + weigh + "\t\t" + color + "\t\t" + cost + "\t\t" + sp);
            // }
        }
        catch (Exception e)
        {

        }
    }
}
