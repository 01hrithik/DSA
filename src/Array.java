import java.util.Arrays;
import java.sql.*;
public class Array {
    public static void main(String[] args) throws Exception {
        String url ="";
        String Name = "root";
        String pass="";
         Class.forName("com.mongodb.jdbc.java.sql.Driver");
         Connection con= DriverManager.getConnection(url,Name,pass);

    }
}
/*
1.import
2.load&register driver
3.cerate conncetion
4.create statement
5.excuteion querry
6.procsees restult
7.close
 */