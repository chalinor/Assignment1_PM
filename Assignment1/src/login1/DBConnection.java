package login1;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) {
		//accessDB();
		
		String dbUrl = "jdbc:mysql://localhost:3306/user_login";
		String user = "root";
		String password = "";
		
		try{
			//1. established the connection
			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
			
			//2. create a statement
			Statement myStmt = myConn.createStatement();
			
			//3.execute the query
			ResultSet myRs = myStmt.executeQuery("select * from student_login");
			
			//4. process the resultset object
			while(myRs.next()){
				System.out.println(myRs.getString("Username")+ " "+ myRs.getString("Password"));
			}
					
			myStmt.close();
			myConn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	
//	public static void accessDB() {
//		String dbUrl = "jdbc:mysql://localhost:3306/user_login";
//		String user = "root";
//		String password = "";
//		
//		try{
//			//1. established the connection
//			Connection myConn = DriverManager.getConnection(dbUrl, user, password);
//			
//			//2. create a statement
//			Statement myStmt = myConn.createStatement();
//			
//			//3.execute the query
//			ResultSet myRs = myStmt.executeQuery("select * from student_login");
//			
//			//4. process the resultset object
//			while(myRs.next()){
//				System.out.println(myRs.getString("Username")+ " "+ myRs.getString("Password"));
//			}
//					
//			myStmt.close();
//			myConn.close();
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}

}
