package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionDatabase {

    // Change only these properties if necessary
    String DatabaseName="diu_blood_management_db";
    String db_user="root";
    String db_pass="";










    //******  Do not change anything below ******//

    String url="jdbc:mysql://localhost/"+DatabaseName;
    Connection con;
    Statement st;

    public ConnectionDatabase() {
        try{
            this.con= DriverManager.getConnection(url,db_user,db_pass);
            this.st=con.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public Statement getDbStatement(){
        return this.st;
    }


    public String getUser() {
        return db_user;
    }

    public String getPass() {
        return db_pass;
    }
}
