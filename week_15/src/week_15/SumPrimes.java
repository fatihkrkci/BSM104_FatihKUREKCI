package week_15;

import java.util.*;
import java.util.stream.*;

public class SumPrimes {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		System.out.println("Kaç Tane Asal Sayý Toplamak Ýstiyorsunuz?");
		int count = console.nextInt();
		int sum = sumPrimes(count);
		System.out.println("sum = " +sum);

	}
	
	public static int sumPrimes(int count) {
		if(count <= 0)
			return 0;
		else {
			long start = System.currentTimeMillis();
			int sum = IntStream.iterate(1, n -> n+2)
					.filter(SumPrimes::isPrime2)
					.limit(count-1)
					.sum()+2;
			double elapsed = (System.currentTimeMillis() - start)/1000.0;
			System.out.println();
			System.out.println("time = " + elapsed);
			return sum;
		}
	}
	
	//time = 14.052		sum = 496165411
	//time = 7.985		sum = 496165411
	
	public static boolean isPrime(int n) {
		return IntStream.range(1, n+1)
				.filter(x -> n%x == 0)
				.count() == 2;
	}
	
	//time = 0.106		sum = 496165411
	//time = 0.055		sum = 496165411
	
	public static boolean isPrime2(int n) {
		if(n==1)
			return false;
		else {
			int root = (int)Math.sqrt(n);
			return IntStream.range(1, root+1)
					.filter(x -> n%x==0)
					.count()==1;		
		}
	}

}
