
import java.sql.*;
import java.util.Arrays;

public class BatchDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        
        Connection con = null;
        PreparedStatement ps = null;
        String query = "insert into employee (id, name) values (?,?)";
        
        try {
        	DBUtils.loadDriver();
        	
         
              con=DriverManager.getConnection(
            		  DBUtils.connectionUrl);
            System.out.println("Connected to the database");
        	
              
            ps = con.prepareStatement(query);
             
             
            ps.setInt(1, 101);
            ps.setString(2, "101");
            ps.addBatch();
             
            ps.setInt(1, 102);
            ps.setString(2, "102");
            ps.addBatch();
             
            ps.setInt(1, 103);
            ps.setString(2, "103");
            ps.addBatch();
             
            int[] results = ps.executeBatch();
             
            System.out.println(Arrays.toString(results));
             
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
