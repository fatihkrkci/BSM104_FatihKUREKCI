package week_12;

import java.util.*;

public class ReferenceMystery {

	public static void main(String[] args) {

		BasicPoint p = new BasicPoint(11, 22);
		int[] a = {33, 44};
		int n = 55;
		
		System.out.println(p.x + ", " + p.y + " " + Arrays.toString(a) + " " + n);
		mystery(p, a, n);
		System.out.println(p.x + ", " + p.y + " " + Arrays.toString(a) + " " + n);
		a[0] = a[1];
		p.x = p.y;
		mystery(p, a, n);
		System.out.println(p.x + ", " + p.y + " " + Arrays.toString(a) + " " + n);

	}
	
	// 11, 22 [33, 44] 55
	// 44, 22 [44, 77] 0
	// 44, 22 [44, 77] 55
	// 55, 22 [88, 77] 0
	// 55, 22 [88, 77] 55
	
	public static int mystery(BasicPoint p, int[] a, int n) {
		n = 0;
		a[0] = a[0] + 11;
		a[1] = 77;
		p.x = p.x + 33;
		System.out.println(p.x + ", " + p.y + " " + Arrays.toString(a) + " " + n);
		return n;
	}

}
