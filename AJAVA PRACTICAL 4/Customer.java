package Map;

import java.util.*;

public class Customer {
	int Account_no;
	String Name;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, String> customer = new HashMap<Integer, String>();

		customer.put(101, "Prasanna");
		customer.put(102, "Nahez");
		customer.put(103, "Riddesh");
		customer.put(104, "Ballal");
		customer.put(105, "Ajay");

		System.out.print(customer);

		System.out.print("\n Which Customer Account Number you want to Search?");
		int searchMap = sc.nextInt();

		System.out.print("Does account Number " + searchMap + " exists");
		if (customer.containsKey(searchMap)) {
			System.out.print("\nYes");
			System.out.print("\n Name for Customer with Account No. " + searchMap + ":- " + customer.get(searchMap));
		} else {
			System.out.print("\nNo");
		}
	}
}
