
package com.test.daoTest;

import com.test.dao.UserDao;
import com.test.dao.impl.UserDaoImpl;
import com.test.entity.User;
import com.test.util.Connectionfactory;
import java.sql.Connection;
import java.sql.SQLException;

public class UserDaoTest
{

    public UserDaoTest()
    {
    }

    public static void main(String args[])
        throws SQLException
    {
        Connection conn = null;
        try
        {
            conn = Connectionfactory.getInstance().makeConnection();
            conn.setAutoCommit(false);
            UserDao userdao = new UserDaoImpl();
            User tom = new User();
            tom.setName("Tom");
            tom.setPasswword("123456789");
            tom.setEmail("Tom@qq.com");
            userdao.save(conn, tom);
            conn.commit();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            try
            {
                conn.rollback();
            }
            catch(Exception e2)
            {
                e2.printStackTrace();
            }
        }
        conn.close();
    }
}
