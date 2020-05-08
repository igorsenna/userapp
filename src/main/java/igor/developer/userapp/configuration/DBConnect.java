package igor.developer.userapp.configuration;
/*
import java.sql.*;

public class DBConnect {
    public static void main(String[] args){

        try{
            String host = "jdbc:postgresql://localhost:5432/Ads_DB_Igor";
            String uName = "postgres";
            String uPass = "mysecretpassword";
            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stat = con.createStatement();
            String sql ="select * from Users";
            System.out.println("tests 000000");
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()){
                long Id = rs.getLong("Id");
                String Name = rs.getString("Name");
                String Surname = rs.getString("Surname");
                String Email = rs.getString("Email");

                String p = Id + " " + Name + " " + Surname + " " + Email;
                System.out.println(p);
            }
        }

        catch (SQLException err) {
            System.out.println(err.getErrorCode());
        }
    }
}

 */