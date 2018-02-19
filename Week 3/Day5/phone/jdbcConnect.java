package phone;
import java.util.*;
import java.io.*;
import java.sql.*;
class jdbcConnect
{
	public static void insertIntoTable(String name,String address,List<String> numbers )
	{
		try
		{
			int id =0;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","1234");
			String query = "insert into person (name,address) values ("+"\""+name+"\""+",\""+address+"\")";
			Statement stmt = con.createStatement();
			Integer num = stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
			ResultSet rs2 = stmt.getGeneratedKeys();
			while(rs2.next())
				id = rs2.getInt(1);

			PreparedStatement psmt=con.prepareStatement("insert into phoneNumbers values(?,?,?)");
			for(int i=0;i<numbers.size();i+=2)
			{
				psmt.setInt(1,id);
				psmt.setString(2,numbers.get(i+1));
				psmt.setLong(3,Long.parseLong(numbers.get(i)));
				psmt.executeUpdate();
			}  
			con.close();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static int search(String name , String num)
	{
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","1234");
			Statement stmt = con.createStatement();
			Statement stmt1 = con.createStatement();
			ResultSet rs1,rs2,rs;
			int flag =0;
			if(num == null)
			{
				rs = stmt.executeQuery("select * from person");
				while(rs.next())
				{
					ResultSetMetaData rsmd = rs.getMetaData();
					
					if(rs.getString(2).contains(name))
					{
						flag =1;
						System.out.println(rsmd.getColumnName(1)+" : "+rs.getString(1));
						System.out.println(rsmd.getColumnName(2)+" : "+rs.getString(2));
						System.out.println(rsmd.getColumnName(3)+" : "+rs.getString(3));
						String query = "select type,phNumber from phoneNumbers where id = "+rs.getInt(1);
						rs1 = stmt1.executeQuery(query);
						while(rs1.next())
						{
							System.out.println(rs1.getString(1)+" : "+rs1.getString(2));
						}
					}


				}
				con.close();
				return flag;
				
			}
			else
			{
				long number = Long.parseLong(num);
				String query ="select id from phoneNumbers where phNumber = "+number;
				rs1 = stmt.executeQuery(query);
				while(rs1.next())
				{
					String q = "select * from person where pid = "+rs1.getInt(1);
					rs2 = stmt1.executeQuery(q);
					ResultSetMetaData rsmd1 = rs2.getMetaData();
					while(rs2.next())
					{
						System.out.println(rsmd1.getColumnName(2)+" : "+rs2.getString(2));
						System.out.println(rsmd1.getColumnName(3)+" : "+rs2.getString(3));
					} 
				}
				con.close();
				return 1;

			}
		

			
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return 1;
		
	}

	public static void updateTable(int cpid ,int ch , String mod)
	{
		
	try
	{
		String sql="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phonebook","root","1234");
		Statement stmt = con.createStatement();
		if(ch == 1)
			sql = "update person set name = \""+mod+"\" where pid = '"+cpid+"'";
		if(ch == 2)
			sql = "update person set address = \""+mod+"\" where pid = '"+cpid+"'";
		if(ch == 3)
			sql = "update phoneNumbers set phNumber = "+mod+" where type = \"MOBILE\" and  id ='"+cpid+"'";
		if(ch == 4)
			sql = "update phoneNumbers set phNumber = "+mod+" where type = \"HOME\" and  id = "+cpid+"'";
		if(ch == 5)
			sql = "update phoneNumbers set phNumber = "+mod+" where type = \"WORK\" and  id = '"+cpid+"'";

		stmt.executeUpdate(sql);
		System.out.println("RECORDS UPDATED \n");
		con.close();
	 }
	 catch(Exception e)
	 {
	 	System.err.println(e);
	 }	
	}
}
