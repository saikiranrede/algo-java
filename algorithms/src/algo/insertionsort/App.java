package algo.insertionsort;

public class App {

	public static void main(String[] args) {
		int[] myArray = insertionSort(new int[] {9,8,99, 110, 8,87,637, 8,3,13,87,12,99});
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}

	}
	
	public static int[] insertionSort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int ele = a[i]; // element variable contains the data we intend on bringing over to sorted side
			int j = i-1; // j contains the index position of last value in sorted area
			while(j>=0 && a[j]>ele) {
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = ele;
		}
		
		return a;
	}
}
