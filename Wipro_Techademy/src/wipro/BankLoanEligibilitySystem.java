package wipro;
import java.util.*;

public class BankLoanEligibilitySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Age and cibilScore as Integer
		Integer age = 30;
		Integer cibilScore = 750;
		
		// Monthly incomes stored as Double in ArrayList
		ArrayList <Double> monthlyIncomeList = new ArrayList<>();
		
		monthlyIncomeList.add(45000.0);
		monthlyIncomeList.add(48000.0);
		monthlyIncomeList.add(52000.0);     // Autoboxing: double -> Double
		
		System.out.println("Loan Eligibility Check :");
		
		 // Calculate average income
		double totalIncome = 0.0;
		for (Double income:monthlyIncomeList) {
			totalIncome += income;      // Unboxing: Double -> double
		}
		
		double averageIncome = totalIncome / monthlyIncomeList.size();
		
		// Eligibility Check 
		if (age >= 21 && cibilScore >= 700 && averageIncome >= 40000) {
			System.out.println("Eligible for Loan");
		} else {
			System.out.println("Not Eligible for loan");
		}
		
		String ageStr = Integer.toString(age);
		String cibilStr = Integer.toString(cibilScore);
        String incomeStr = Double.toString(averageIncome);
        
        System.out.println("Age: " + ageStr);
        System.out.println("CIBIL Score: " + cibilStr);
        System.out.println("Average Income: " + incomeStr);

	}

}
