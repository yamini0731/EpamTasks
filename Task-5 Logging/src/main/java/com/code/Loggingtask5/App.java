package com.code.Loggingtask5;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger Logger = LogManager.getLogger(App.class);
	static {
		SimpleandCompound sci = new SimpleandCompound();
		ConstructionCost cc = new ConstructionCost();
		Scanner sc=new Scanner(System.in);
		Logger.info("Enter choice for folllowing operations : \n1.Simple and Compound Interest\n2.Construction Cost Calculation");
		Scanner scan=new Scanner(System.in);

		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			        Logger.info("Enter Principal,Rate and Time of interest\n");
			        Double Principal=sc.nextDouble();
			        Double Rate=sc.nextDouble();
					Double Time=sc.nextDouble();
					Logger.info("Enter choice for folllowing operations : \n1.Simple Interest\n2.Compound Interest\n");
					int choice2=sc.nextInt();
					switch(choice2) 
					{
						case 1:Logger.debug("The Value of Simple Interest:\n"+sci.simpleInterest(Principal,Rate,Time));
							   break;
						case 2:Logger.info("The Value of Compound Interest:\n"+sci.compoundInterest(Principal,Rate,Time));
							   break;
						default:Logger.warn("Enter either 1 or 2");break;
					}
					Logger.warn("Enter either 1 or 2");break;
			case 2:
					Logger.info("Enter value For the Construction Material type from the Following : \n Standard \nAboveStandard Type\nHighStandard\nFullyAutomated\n");
					String material=sc.next();
					Logger.info("Enter value fFr the Area:\n");
					double area=sc.nextDouble();
					Logger.info("Enter value For the Automation(true or false):\n");
					boolean automation=sc.nextBoolean();
					Logger.debug("Cost for the Construction :\n"+cc.costForConstructionMaterial(material,area,automation));
			default:Logger.warn("Enter either 1 or 2");break;
		}
		sc.close();
     }
	 public static void main(String[] args) {
	  }
}
