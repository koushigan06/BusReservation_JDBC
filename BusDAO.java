package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BUSBAO {
    public void displayInfo() throws SQLException{
        String query="Select * from bus";
        Connection con=Busresv_JDBC.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.println("Bus No: "+rs.getInt(1));
            if(rs.getInt(2)==1){
                System.out.println("Ac");
            }
            else{
                System.out.println("Non Ac");
            }
            System.out.println("Capacity:"+rs.getInt(3));
        }
    }
    public int getCapacity(int target) throws SQLException{
        String query="Select capacity from bus where id="+ target;
        Connection con=Busresv_JDBC.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
