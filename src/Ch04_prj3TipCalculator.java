
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ch04_prj3TipCalculator {

	public static void main(String[] args) {		
		String choice = "y";
		
		System.out.println(); 
		System.out.println("*** Tip Calculator ***\n");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		   

		while (choice.equalsIgnoreCase("y")) {
			System.out.println();
			System.out.print("Enter cost of meal. Then press ENTER. $");
			
			BigDecimal cost = sc.nextBigDecimal();
			BigDecimal tipFifteen = new BigDecimal(".15");
			tipFifteen = cost.multiply(tipFifteen);
			BigDecimal totalFifteen = cost.add(tipFifteen);
//			totalFifteen.setScale(2, BigDecimal.ROUND_CEILING);
			   totalFifteen.setScale(2, RoundingMode.HALF_UP);

			BigDecimal tipTwenty = new BigDecimal(".20");
			tipTwenty = cost.multiply(tipTwenty);
			BigDecimal totalTwenty = cost.add(tipTwenty);
//			totalTwenty.setScale(2, BigDecimal.ROUND_CEILING);
			   totalTwenty.setScale(2, RoundingMode.HALF_UP);

			BigDecimal tipTwentyFive = new BigDecimal(".25");
			tipTwentyFive = cost.multiply(tipTwentyFive);
			BigDecimal totalTwentyFive = cost.add(tipTwentyFive);
//			totalTwentyFive.setScale(2, BigDecimal.ROUND_CEILING);
			   totalTwentyFive.setScale(2, RoundingMode.HALF_UP);


			System.out.println();
			System.out.println();
			System.out.println("\t15% tip");
			System.out.println("\tTip amount: \t$" + tipFifteen);
			System.out.println("\tTotal amount: \t$" + totalFifteen);
			System.out.println();

			System.out.println("\t20% tip");
			System.out.println("\tTip amount: \t$" + tipTwenty);
			System.out.println("\tTotal amount: \t$" + totalTwenty);
			System.out.println();

			System.out.println("\t25% tip");
			System.out.println("\tTip amount: \t$" + tipTwentyFive);
			System.out.println("\tTotal amount: \t$" + totalTwentyFive);
			System.out.println();
			System.out.println();	
			
			System.out.print("\tContinue? (y/n): ");
			choice = sc.next();
		}
		

		System.out.println("Bye");
		
	

	}
}
			   
//			   double tip20 = .20;
//			   double tipTwenty = cost*tip20;
//			   double totalTwenty = cost + tipTwenty;
//			   
//			   double tip25 = .25;
//			   double tipTwentyFive = cost*tip25;
//			   double totalTwentyFive = cost + tipTwentyFive;
//			   
//			  BigDecimal cost = BigDecimal
//			   
			   
			   
//			   tipFifteen = new BigDecimal(tipFifteen).setScale(2, RoundingMode.HALF_UP);
//			   tipTwenty = new BigDecimal(tipTwenty).setScale(2, RoundingMode.HALF_UP);
//			   tipTwentyFive = new BigDecimal(tipTwentyFive).setScale(2, RoundingMode.HALF_UP);
//			   totalFifteen = new BigDecimal(totalFifteen).setScale(2, RoundingMode.HALF_UP);
//			   totalTwenty = new BigDecimal(totalTwenty).setScale(2, RoundingMode.HALF_UP);
//			   totalTwentyFive = new BigDecimal(totalTwentyFive).setScale(2, RoundingMode.HALF_UP);
//			 
//			   
			   //BigDecimal tip25 = new BigDecimal(.25);
			   //BigDecimal tipTwentyFive = cost.multiply(tip15);
			   //BigDecimal totalTwentyFive = cost.add(tipTwentyFive);	
			   		  
			   	  
   
			  