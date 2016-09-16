package exercise82Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UserController {
	private Database db= new Database();
	
	public User loginUser(String username, String password) {
		
		User user= null;
		try(Connection conn=db.connect()){
		Statement statement=conn.createStatement();
		String sql="SELECT * FROM user WHERE username like '"+username+"' and password like '"+password+"';";
		
		
		ResultSet resultSet=statement.executeQuery(sql);
		while(resultSet.next()){
			user=new User();
			user.setUsername(resultSet.getString("username"));
			user.setPassword(resultSet.getString("password"));
			conn.close();
			break;
		}
		
		}catch (SQLException| ClassNotFoundException e) {
			//System.out.println("Error: "+e.getMessage());
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	public void addUser(User user) throws ClassNotFoundException, SQLException {
		try(Connection conn=db.connect()){
				String sql="INSERT INTO user(username,password) VALUES ('"+user.getUsername()+"','"+user.getPassword()+"');";
				PreparedStatement statement=conn.prepareStatement(sql);
				statement.execute();
			}
		}
		

}
