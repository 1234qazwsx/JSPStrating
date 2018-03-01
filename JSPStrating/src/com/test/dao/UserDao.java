package com.test.dao;

import com.test.entity.User;
import java.sql.*;

public interface UserDao
{

    public abstract void save(Connection connection, User user)
        throws SQLException;

    public abstract void update(Connection connection, Long long1, User user)
        throws SQLException;

    public abstract void delete(Connection connection, User user)
        throws SQLException;

    public abstract ResultSet get(Connection connection, User user)
        throws SQLException;
}
