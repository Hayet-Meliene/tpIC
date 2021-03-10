package connection;

import java.sql.DriverManager;

public class Connection {
	Connection con;

	public Connection(){
		try{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Class.forName("com.mysql.jdbc.Driver");
		//Connection con = DriverManager.getConnection(database, "", "");
		con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/biblio","root","");
			
			System.out.println("connected!!");
	       }
		catch(Exception e){
			System.out.println("pas encore!");
			
		}

}
	public Connection connecion(){
		return con;
	}
}