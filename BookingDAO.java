package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class BookingDAO {
    public int getBookedCount(int target, Date targed) throws SQLException{
        String query="select count(pasname) from booking where busno=? and travel_date=?";
        Connection cont=Busresv_JDBC.getConnection();
        PreparedStatement pst=cont.prepareStatement(query);
        if(targed!=null){
        java.sql.Date sqldate=new java.sql.Date(targed.getTime());
        pst.setInt(1, target);
        pst.setDate(2, sqldate);        
        ResultSet rs=pst.executeQuery();
        rs.next();
        return rs.getInt(1);
        }
        else{
            return 0;
        }
    }
    public void addBook(Booking bk) throws SQLException{
        String query="Insert into booking values(?,?,?)";
        Connection cont=Busresv_JDBC.getConnection();
        PreparedStatement pst=cont.prepareStatement(query);
        pst.setString(1, bk.passName);
        pst.setInt(2,bk.busNo);
        if(bk.tate!=null){
        java.sql.Date sqldate=new java.sql.Date(bk.tate.getTime());
        pst.setDate(3, sqldate);
        pst.executeUpdate();
    }
    }
}
