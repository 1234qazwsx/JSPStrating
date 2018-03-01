

package com.test.dao.impl;

import com.test.dao.UserDao;
import com.test.entity.User;
import java.sql.*;

public class UserDaoImpl
    implements UserDao
{

    public UserDaoImpl()
    {
    }

    public void save(Connection conn, User user)
        throws SQLException
    {
        PreparedStatement ps = conn.prepareCall("Insert into tbl_user(name, password, email) values (?,?,?)");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPasswword());
        ps.setString(3, user.getEmail());
        ps.execute();
    }

    public void update(Connection conn, Long id, User user)
        throws SQLException
    {
        String updatesql = "update tbl_sql set name = ? ,password = ?,email = ? where id = ?";
        PreparedStatement ps = conn.prepareStatement(updatesql);
        ps.setString(1, user.getName());
        ps.setString(2, user.getPasswword());
        ps.setString(3, user.getEmail());
        ps.setLong(4, id.longValue());
        ps.execute();
    }

    public void delete(Connection conn, User user)
        throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("delete from tbl_user where id = ?");
        ps.setLong(1, user.getId());
        ps.execute();
    }

    public ResultSet get(Connection conn, User user)
        throws SQLException
    {
        PreparedStatement ps = conn.prepareStatement("select * from tbl_user where name = ? and password = ?");
        ps.setString(1, user.getName());
        ps.setString(2, user.getPasswword());
        return ps.executeQuery();
    }
}
