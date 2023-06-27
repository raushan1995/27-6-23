import java.util.ArrayList;

import java.util.List;

//find prime number from arraylist 1,34,56,3,4,7,9990,567,456,36,77,11,22,219,222,719,819
// and print all prime number


public class Cheack {
	
	static boolean isPrime(int number) {
		boolean isPrime = false;
		int i = (int) Math.ceil(Math.sqrt(number));
		while (i > 1) {
			if ((number != i) && (number % i == 0)) {
				isPrime = false;
				break;
			} else if (!isPrime)
				isPrime = true;
			--i;
		}
		return isPrime;
	}
	 
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(34);
		list.add(56);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(9990);
		list.add(567);
		list.add(456);
		list.add(36);
		list.add(77);
		list.add(11);
		list.add(22);
		list.add(219);
		list.add(222);
		list.add(719);
		list.add(819);
		
		Integer array[] = new Integer[list.size()];
		array = (Integer[]) list.toArray(array);
		System.out.println("Prime Numbers are: ");
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				System.out.println(array[i]);
			}
		}
		System.out.println("Non Prime Numbers are: ");
		for (int i = 0; i < array.length; i++) {
			if (!isPrime(array[i])) {
				System.out.println(array[i]);
			}
		}
		
	}

}
