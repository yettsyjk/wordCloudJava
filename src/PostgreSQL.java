import java.sql.*;

import java.sql.Connection;
import java.sql.DriveManager;
import java.sql.Statement;

public class PostgreSQL {
  public static void main(String[] args ){
    Connection c = null;
    Statement stmt = null;

    try {
      Class.forName("org.postgreql.Driver");
      c = DriveManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "manisha", "123");
      System.out.println("Opened database successfully");
      stmt = c.createStatement();
      String sql = "CREATE TABLE COMPANY" +
        "(ID INT PRIMARY KEY  NOT NULL," +
        "NAME   TEXT  NOT NULL, " +
        "AGE   TEXT  NOT NULL, " +
        "ADDRESS   CHAR(50), "+
        "SALARY    REAL)";
      stmt.executeUpdate(sql);
      stmt.close();
      c.close();
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName()+": " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Table database successfully");
  }
}
