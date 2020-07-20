package com.mavdemo.cleancode;

public class App 
{
    public static void main( String[] args )
    {
        SIandCI sici=new SIandCI();
        int si=sici.calculateSI(10000,3, 5);
        int ci=sici.calculateCI(10000,0.04,6,4);
    }
}
