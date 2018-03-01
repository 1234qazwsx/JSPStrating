
package com.test.service;

import com.test.dao.UserDao;
import com.test.dao.impl.UserDaoImpl;
import com.test.entity.User;
import com.test.util.Connectionfactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CheckUserService {

	private UserDao userDao = new UserDaoImpl();

	public boolean check(User user) {

		Connection conn = null;
		try {
			conn = Connectionfactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet resultSet = userDao.get(conn, user);
			while (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
