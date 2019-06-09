package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;

public class UserDao {
	public boolean login(Connection connection,User user) throws SQLException
	{
		String sql="select * from user where ?=username and ?=password";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getPassword());
	    ResultSet resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
		{
			return true;
		}
		return false;
	}
	public int register(Connection connection,User user) throws SQLException
	{
		String sql="insert into user values(null,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getPassword());
		return preparedStatement.executeUpdate();
	}
	public int userupdate(Connection connection,User user) throws SQLException
	{
		String sql="update user set password=? where username=? ";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, user.getPassword());
		preparedStatement.setString(2, user.getUsername());
		return preparedStatement.executeUpdate();
	}
	
}
