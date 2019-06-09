package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.SalesRecond;

public class SalesReDao {
	public int add(Connection connection,SalesRecond salesRecond) throws SQLException
	{
		String sql="insert into SalesRecond values(?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, salesRecond.getId());
		preparedStatement.setString(2, salesRecond.getComname());
		preparedStatement.setInt(3, salesRecond.getCount());
		preparedStatement.setFloat(4, salesRecond.getPrice());
		preparedStatement.setInt(5, salesRecond.getData());
		return preparedStatement.executeUpdate();
	}
	public ResultSet getResultSet(Connection connection) throws SQLException
	{
		String sql="select * from salesrecond";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		return preparedStatement.executeQuery();
	}
}
