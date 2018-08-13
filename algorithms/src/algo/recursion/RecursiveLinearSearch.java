package algo.recursion;

public class RecursiveLinearSearch {

	public static void main(String[] args) {
		System.out.println(recursiveLinearSearch(new int[] {4,48,4,28,34,76,9,3}, 0, 3));
		System.out.println(recursiveBinarySearch(new int[] {1, 2, 3, 4, 7, 9, 12, 18}, 0, 7, 4));
	}
	
	public static int recursiveLinearSearch(int[] a, int i, int x) {
		if(i>a.length-1) return -1;
		else if(a[i] == x) return i;
		else return recursiveLinearSearch(a, i+1, x);
	}
	
	public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
		if(p>r) return -1;
		else {
			int q = (p+r)/2;
			if(x < a[q]) return recursiveBinarySearch(a, p, q-1, x);
			else if(x > a[q]) return recursiveBinarySearch(a, q+1, r, x);
			else return q;
		}
	}

}
