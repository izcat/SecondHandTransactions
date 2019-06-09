package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.ComType;

public class ComTypeDao {
	public int ComTypeAdd(Connection connection,ComType comtype) throws Exception
	{
		String sql="insert into comtype values(null,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, comtype.getComtypename());
		preparedStatement.setString(2, comtype.getComtypedesc());
		return preparedStatement.executeUpdate();
		
	}
	public ResultSet GettypeResultSet(Connection connection) throws Exception {
		String sql="select * from comtype";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		return preparedStatement.executeQuery();
	}
	public ResultSet GettypeResultSet(Connection connection,String s) throws Exception {
		String sql="select * from comtype where comtypename like '%"+s+"%'";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		return preparedStatement.executeQuery();
	}
	public int comtypedelete(Connection connection,ComType comType) throws SQLException
	{
		String sql="delete from comtype where comtypename=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, comType.getComtypename());
		return preparedStatement.executeUpdate();
	}
	public int comtypeupdata(Connection connection,ComType comType) throws SQLException
	{
		String sql="update comtype set  comtypedesc=? where comtypename=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(2, comType.getComtypename());
		preparedStatement.setString(1, comType.getComtypedesc());
		return preparedStatement.executeUpdate();
	}
}
