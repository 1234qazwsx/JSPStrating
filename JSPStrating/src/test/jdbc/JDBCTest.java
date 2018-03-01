package test.jdbc;

//import java.io.PrintStream;
import java.sql.*;

public class JDBCTest
{

    public JDBCTest()
    {
    }

    public static Connection getConnection()
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

    public static void insert()
    {
        Connection conn = getConnection();
        try
        {
            String sql = "insert into tbl_user(name, password, email)values('Gash','457989','gash@qq.com')";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println((new StringBuilder("向用户表中插入了  ")).append(count).append(" 条数据记录").toString());
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void update()
    {
        Connection conn = getConnection();
        try
        {
            String sql = "update tbl_user set email = 'gash@163.com' where name ='gash' ";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println((new StringBuilder("\u5728\u7528\u6237\u8868\u4E2D\u66F4\u65B0\u4E86 ")).append(count).append(" \u6761\u6570\u636E\u8BB0\u5F55").toString());
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void delete()
    {
        Connection conn = getConnection();
        try
        {
            String sql = "delete from tbl_user where name ='gash' ";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println((new StringBuilder("\u4ECE\u7528\u6237\u8868\u4E2D\u5220\u9664\u4E86 ")).append(count).append(" \u6761\u6570\u636E\u8BB0\u5F55").toString());
            conn.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        delete();
    }
}
