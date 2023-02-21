package ListInterface;
import java.util.*;
public class intArray {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements=");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<5;i++) {
			al.add(arr[i]);
		}
		System.out.println("Elements present in ArrayList are=");
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}
}
