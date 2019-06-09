package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Comm;


public class CommDao {
	public int ComAdd(Connection connection,Comm comm) throws Exception
	{
		String sql="insert into comm values(null,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, comm.getComnameString());
		preparedStatement.setString(2, comm.getComdesc());
		preparedStatement.setString(3, comm.getComtype());
		preparedStatement.setInt(4, comm.getCount());
		preparedStatement.setFloat(5, comm.getPrice());
		preparedStatement.setString(6, comm.getAuthor());
		preparedStatement.setString(7, comm.getPhone());
		preparedStatement.setString(8, comm.getSex());
		preparedStatement.setInt(9, comm.getUseyear());
		preparedStatement.setInt(10, comm.getUsemonth());
		return preparedStatement.executeUpdate();
		
	}
	public ResultSet GetComResultSet(Connection connection) throws Exception {
		String sql="select * from comm";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		return preparedStatement.executeQuery();
	}
	public ResultSet GetComResultSet(Connection connection,String s) throws Exception {
		String sql="select * from comm where comname like '%"+s+"%'";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		return preparedStatement.executeQuery();
	}
	public ResultSet GetComResultSet(Connection connection,String s,int i) throws Exception {
		String sql="select * from comm where comtype=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, s);
		return preparedStatement.executeQuery();
	}
	public ResultSet GetComResultSet(Connection connection,int s) throws Exception {
		String sql="select * from comm where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, s);
		return preparedStatement.executeQuery();
	}
	public int comdelete(Connection connection,String a) throws SQLException
	{
		String sql="delete from comm where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, Integer.parseInt(a));
		int n=preparedStatement.executeUpdate();
		return n;
	}
	public int comupdata(Connection connection,Comm comm) throws Exception
	{

		if(comdelete(connection, comm.getId()+"")==1)
		if(ComAdd(connection, comm)==1)
			return 1;
		return 0;
	}
	public int comUpdateCount(Connection connection,int s,int a) throws Exception {
		String sql="update comm set comcount=? where id=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, a);
		preparedStatement.setInt(2, s);
		return preparedStatement.executeUpdate();
	}
	
}
