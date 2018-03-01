
package test.jdbc;

//import java.io.PrintStream;
import java.sql.*;

public class TransactionTest
{

    public TransactionTest()
    {
    }

    public static Connection getconnection()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "12345");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }

    public static void insertUserdate()
    {
        Connection conn = getconnection();
        try
        {
            String sql = "insert into tbl_user(id,name,password,email)values(10,'Tom','1224563','tom@qq.com')";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println((new StringBuilder("向用户表中插入了 ")).append(count).append(" 条用户记录").toString());
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void insertAddressdate()
    {
        Connection conn = getconnection();
        try
        {
            String sql = "insert into tbl_address(id,city,country,user_id)values(1,'Suyuan','china','10')";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println((new StringBuilder("\u5411\u5730\u5740\u8868\u4E2D\u63D2\u5165\u4E86 ")).append(count).append(" \u6761\u6570\u636E\u8BB0\u5F55").toString());
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        insertUserdate();
        insertAddressdate();
    }
}
