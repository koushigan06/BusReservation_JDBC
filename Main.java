package JDBC;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException, SQLException{
    Scanner sc= new Scanner(System.in);
    // ArrayList<Bus> busses=new ArrayList<Bus>();
    // ArrayList<Booking> bookings=new ArrayList<Booking>();
    // busses.add(new Bus(1,true,5));
    // busses.add(new Bus(2,false,4));
    // busses.add(new Bus(3,true,3));
    // for(Bus b:busses)
    // {
    //     b.displayInfo();
    // }
    BUSBAO busdao=new BUSBAO();
    busdao.displayInfo();
    int option=1;
    while(option==1)
    {
        System.out.println("Enter 1 for booking or Enter 2 for exit");
        option=sc.nextInt();
        if(option==1)
        {
            Booking booking=new Booking();
            if(booking.isAvalilable())
            {
                BookingDAO bd=new BookingDAO();
                bd.addBook(booking);
                System.out.println("Booking is sucessful!!!!!!!!!!!!!");
            }
            else{
                System.out.println("Sorry Better Luck Next Time");
            }
        }
        sc.close();
    }
}
}
