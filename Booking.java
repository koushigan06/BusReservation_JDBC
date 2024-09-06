package JDBC;
import java.util.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
    String passName;
    int busNo;
    Date tate;
    Booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Passenger Name");
        passName=sc.nextLine();
        System.out.println("Enter Bus Number");
        busNo=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the date in the format DD-MM-YYYY");
        String s=sc.nextLine();
        SimpleDateFormat Dateform=new SimpleDateFormat("dd-MM-yyyy");
        if(!s.isEmpty()){
        try {
            tate=Dateform.parse(s);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    else{
        System.out.println("Empty String entered");
    }
        sc.close();
    }
    public boolean isAvalilable() throws SQLException{
        int capac=0;
        BUSBAO bod=new BUSBAO();
        capac=bod.getCapacity(busNo);
        int c=0;
        BookingDAO bdo=new BookingDAO();
        c=bdo.getBookedCount(busNo,tate);
        if(c<capac){
            return true;
        }
        else{
            return false;
        }
    }
}
