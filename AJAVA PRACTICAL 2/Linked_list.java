package ListInterface;

import java.util.*;
public class Linked_list {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		System.out.println("Enter String elements=");
		for(int i=0;i<5;i++) {
			arr[i]=sc.next();
		}
		LinkedList<String> al=new LinkedList<String>();
		for(int i=0;i<5;i++) {
			al.add(arr[i]);
		}
		System.out.println("Elements present in LinkedList from Beginning are=");
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
		System.out.println("");
		System.out.println("Elements present in LinkedList from Ending are=");
		while(itr.hasPrevious()) {
			System.out.print(itr.previous()+"\t");
		}
	}
}
