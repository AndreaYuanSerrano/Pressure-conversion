import java.util.Scanner;

public class PressureDemo{
     
	public static void main(String[] args){
	System.out.println("Hello World");
	
	Scanner myPressure = new Scanner (System.in);
	
	System.out.print("Enter your name:");
	String name = myPressure.nextLine();
	
	System.out.print("Enter the unit pressure of pascal:");
	double unitpressureofpascal = myPressure.nextDouble();
	System.out.print("Enter the unit pressure of bar:");
	double unitpressureofbar2 = myPressure.nextDouble();
	
	double totalunitpressure = unitpressureofpascal + unitpressureofbar2;																															
	System.out.println("Hello" + name + "\n" +
	"unitpressureofpascal" + unitpressureofpascal + "\n" +
	"unitpressureofbar2" + unitpressureofbar2 + "\n" +
	"Total unitofpressure:" + totalunitpressure);
	
	}
	
}
	