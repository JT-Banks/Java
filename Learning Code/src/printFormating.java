
public class printFormating {
	
	 public static void sort(int[] a)
	 {
		 for(int i = 2; i < a.length - 1; i++) {
			 
		 
		 int minPos = minimumPosition(a, i);
		 int temp = a[minPos];
		 a[minPos] = a[i];
		 a[i] = temp;
	 }
	 }
	   
	 private static int minimumPosition(int[] a, int from) {
		 int minPos= from;
		 for(int i = from +1; i < a.length; i++) {
			 if (a[i] < a[minPos]) {minPos = i;}
		 }
		 return minPos;
	 }
	 
}
