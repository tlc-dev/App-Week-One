
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//item prices
		double itemPrice = 4.99;
		System.out.println("Item price is: $" + itemPrice);
		double itemCost = 8.99;
		System.out.println("Current item cost: $" + itemCost);
		
		//wallet totals before buying item
		double moneyInWallet = 20.50; 
		System.out.println("I have: $" + moneyInWallet + " in my wallet");
		double walletFunds = 45.55;
		System.out.println("my current wallet funds before purchase: $" + walletFunds);
				
		//money after item purchase
		double walletBalance = moneyInWallet - itemPrice;
		System.out.println("You have $" + walletBalance + " left after your purchase");
		double moneyLeft = walletFunds - itemCost;
		System.out.println("After purchase, I have: $" + moneyLeft + " left in my wallet.");
		
		//Friends
		int friendTotal = 10; //Current number of friends
		System.out.println("I have " + friendTotal + " friends.");
		int friendAmount = 20; //second friend total
		System.out.println("I currently have " + friendAmount + " friends!");
		
		//Ages
		double ageInYears = 21;
		System.out.println("I am " + ageInYears + " years old");
		double yearsOld = 30;
		System.out.println("Someone is " + yearsOld + " years old");
		
		//Friends Gained over time
		double friendsGained = friendTotal / ageInYears; //Friends gained per year as a whole number. 
		System.out.println("I am gaining " + friendsGained + " friends per year!");
		double friendRate = friendAmount / yearsOld;
		System.out.println("Someone is making " + friendRate + " friends per year");
		
		//names 
		String firstName = "Tristan";
		String lastName = "Chester";
		char middleInitial = 'L';
		String fullName = firstName + " " + middleInitial + " " + lastName;//Concatenation of first, middle, and last names
		System.out.println("My name is " + fullName);
	}

}


