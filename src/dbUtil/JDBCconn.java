package dbUtil;

import java.sql.*;
import java.util.*;

public class JDBCconn {
	private static final String tag = "connect-database";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/dbbook2?user=root&password=123456&useUnicode=true&characterEncoding=utf-8&useSSL=true";
	
	
	public static Connection getConnection() throws ClassNotFoundException
	{
		
		try {
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url);
			if (connection != null)
			{
				System.out.println("数据库连接成功");
			}else
			{
				System.out.println("数据库连接失败");
			}
			
			return connection;
		}catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
		
	}

}
