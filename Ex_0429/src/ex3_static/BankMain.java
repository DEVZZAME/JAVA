package ex3_static;

public class BankMain {

	public static void main(String[] args) {
		
		Bank barclays1 = new Bank("Oxford st", "+44-123-4567");
		Bank barclays2 = new Bank("Canary Wharf", "+44-321-4567");
		Bank barclays3 = new Bank("Deptford", "+44-132-4567");
		
		barclays1.interest = 0.1f;
		
		barclays1.getBank();
		barclays2.getBank();
		barclays3.getBank();
		
	}//main

}
