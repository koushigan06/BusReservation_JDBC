package JDBC;

public class Bus {
    private int Bus_No;
    private boolean AC;
    private int cap;
    Bus(int no,boolean ac,int capacity){
        this.Bus_No=no;
        this.AC=ac;
        this.cap=capacity;
    }
    public int getBusNO(){
        return Bus_No;
    }
    public boolean getAc(){
        return AC;
    }
    public int getcap(){
        return cap;
    }
