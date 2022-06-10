package week_14;

public class SelectionSort {
	
	void sort(int array[]) {
		for(int index=0; index<array.length-1; index++) {
			int min_index = index;
			for(int j=index+1; j<array.length; j++) {
				if(array[j] < array[min_index]) {
					min_index=j;
				}
			}
			int tmp = array[min_index];
			array[min_index] = array[index];
			array[index] = tmp;
		}
	}
	
	void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int[] array = {15, 12, 14, 20, 30, 5};
		SelectionSort ob = new SelectionSort();
		ob.sort(array);
		System.out.println("Sýralý Dizi: ");
		ob.printArray(array);
		
	}

}
