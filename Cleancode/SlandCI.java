package com.mavdemo.cleancode;

public class SIandCI {
	public int calculateSI(int principal,int rateofinterest,int time)
	{
		return ((principal*rateofinterest*time)/100);
	}

	public int calculateCI(int principal,double rateofinterest,int time,int compound)
	{
		return (int) ((principal*(1+(Math.pow((1+(int)(rateofinterest/compound)), compound*time)))));
	}
}
