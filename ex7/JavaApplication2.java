package ex7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
  
public class JavaApplication2 {     
     public static void main(String[] args) {  
          Connection c = null;          
          Statement stmt = null;          
          try {  
             Class.forName("org.postgresql.Driver");  
             c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp", "postgres",   
               "12345678");             
   c.setAutoCommit(false);  
            System.out.println("Open Database Connection Successfully");              
stmt = c.createStatement();  
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp_detail;");               
while (rs.next()) {                  
    int id = rs.getInt("eid");  
                String name = rs.getString("ename");                  
                int age = rs.getInt("eage");  
                String address = rs.getString("eaddress");                 
    float salary = rs.getFloat("esalary");  
                System.out.println("ID = " + id);  
                System.out.println("NAME = " + name);  
                System.out.println("AGE = " + age);  
                System.out.println("ADDRESS = " + address);  
                System.out.println("SALARY = " + salary);  
                System.out.println();  
            }              
rs.close();              
stmt.close();
            c.close();  
        } catch (Exception e) {  
            System.err.println(e.getClass().getName() + ": " + e.getMessage());   
            System.exit(0);  
        }  
        System.out.println("Operation Done Successfully");  
    }  
} 
