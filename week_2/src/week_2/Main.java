package week_2;

public class Main {

	public static void main(String[] args) {
		
		//*****QUESTION-1*****
//		int []dizi1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
//		int []dizi2 = {4, 7, 3, 9, 12, - 47, 3, 74};
//		
//		if(isUnique(dizi1))
//			System.out.println("Dizi Eþsizdir!");
//		else
//			System.out.println("Dizi Eþþiz Deðildir!");
		//*****QUESTION-1*****
		
		//*****QUESTION-2*****
//		double []dizi1 = {16.1, 12.3, 22.2, 14.4};
//		double []dizi2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
//		
//		if(isSorted(dizi2))
//			System.out.println("Dizi Sýralýdýr!");
//		else
//			System.out.println("Dizi Sýralý Deðildir!");
		//*****QUESTION-2*****
		
		//*****QUESTION-3*****
//		int [][] A = {{1,3,4},{2,4,3},{3,4,5}};
//		int [][] B = {{1,3,4},{2,4,3},{1,2,4}};
//		
//		int [][] C = matrixAdd(A, B);
//		
//		for(int i = 0; i < C.length; i++) {
//			for(int j = 0; j < C[i].length; j++) {
//				System.out.println(C[i][j] + " ");
//			}
//			
//			System.out.println();
//		}
		//*****QUESTION-3*****
		
		//*****QUESTION-4*****
//		System.out.println("Sonuc: " + sumTo(2));
		//*****QUESTION-4*****
		
		//*****QUESTION-5*****
//		writeBinary(5);
		//*****QUESTION-5*****

	}
	
	//*****QUESTION-1*****
	public static boolean isUnique(int []dizi) {
			
			for (int i = 0; i < dizi.length-1; i++) {
				for (int j = i+1; j < dizi.length; j++) {
					if(dizi[i] == dizi[j])
						return false;
				}
			}
			
			return true;
		}
	//*****QUESTION-1*****
	
	//*****QUESTION-2*****
	public static boolean isSorted(double []dizi) {
		
		if(dizi.length <= 1)
			return true;
		
		for (int i = 0; i < dizi.length-1; i++) {
			if(dizi[i] > dizi[i+1])
				return false;
		}
		
		return true;
	}
	//*****QUESTION-2*****
	
	//*****QUESTION-3*****
	public static int[][] matrixAdd(int[][] A, int[][] B) {
		
		int C[][] = new int [A.length][A[0].length];
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {		
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}
	//*****QUESTION-3*****
	
	//*****QUESTION-4*****
	public static double sumTo(int n) {
		if(n < 0)
			throw new IllegalArgumentException();
		if(n == 0)
			return 0.0;
		return (double)sumTo(n-1) + 1.0 /n;
	}
	//*****QUESTION-4*****
	
	//*****QUESTION-5*****
	public static void writeBinary(int n) {
		if(n < 0)
			throw new IllegalArgumentException();
		if(n >= 2)
			writeBinary(n/2);
		
		System.out.println(n%2);
	}
	//*****QUESTION-5*****

}
