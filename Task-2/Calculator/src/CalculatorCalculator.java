package com.code.Calculator;
import java.util.*;
interface operations
{
	public int add(int a,int b);
	public int subtract(int a,int b);
	public int divide(int a,int b);
	public int multiply(int a,int b);
	public int modulus(int a,int b);
}
public class Calculatorcalculation implements operations {
	
	// Function to Add 2 numbers
		public int add(int a,int b) {
			return (a+b);
		}
		
		// Function to Multiply 2 Numbers
		public int multiply(int a,int b) {
			return (a*b);
		}
		
		// Function to Divide 2 Numbers
		public int divide(int a,int b) {
			return (a/b);
		}
		// Function to Divide 2 Numbers
		public int subtract(int a,int b) {
					return (a-b);
				}
				// Function to Divide 2 Numbers
	     public int modulus(int a,int b) {
					return (a%b);
				}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculatorcalculation cc=new Calculatorcalculation();
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=0;
		System.out.println("1.Addition\n"+"2.Substraction\n"+"3.Mutiplication\n"+"4.Division\n"+"5.modulus\n"+"6.Exit of the loop\n");
		while(n!=6)
		{
			System.out.println("choose any operation");
			 n=sc.nextInt();
			switch(n)
			{
			case 1:System.out.println("The Addition of Two numbers "+a+" and "+b+" is "+cc.add(a,b));break;
			case 2:System.out.println("The Subtraction of Two numbers "+a+" and "+b+" is "+cc.subtract(a,b));break;
			case 3:System.out.println("The Multiplication of Two numbers "+a+" and "+b+" is "+cc.multiply(a,b));break;
			case 4:System.out.println("The Division of Two numbers "+a+" and "+b+" is "+cc.divide(a,b));break;
			case 5:System.out.println("The Modulus of Two numbers "+a+" and "+b+" is "+cc.modulus(a,b));break;
			case 6:System.exit(0);
			default:System.exit(0);
			}
		}
		sc.close();
		
	}

}
