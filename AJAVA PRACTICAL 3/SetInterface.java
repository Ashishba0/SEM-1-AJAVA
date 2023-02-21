package SetInterface;

import java.util.*;


public class SetInterface {


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Set<String> set1 = new HashSet<>();
		set1.add("Prasanna");
		set1.add("Nahez");
		set1.add("Ajay");
		set1.add("Riddesh");
		set1.add("Ballal");
		System.out.println("Set 1: " + set1);


		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("Set 2: " + set2);


		Set<Integer> set3 = new HashSet<>();
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(40);
		set3.add(50);
		System.out.println("Set 3: " + set3);


		set2.addAll(set3);
		System.out.println("Union of Set 2 & Set 3: " + set2);


		set2.remove(40);
		System.out.println("Set 2 when 40 is removed: " + set2);


		System.out.println("What do You want to search in Set 1?");
		String searchText = sc.next();


		System.out.println("Question: Does my Set 1 has '" + searchText + "' in it?");
		if (set1.contains(searchText)) {
			System.out.println("Ans: YES!");
		} else {
			System.out.println("Ans: NO!");
		}
	}
}

