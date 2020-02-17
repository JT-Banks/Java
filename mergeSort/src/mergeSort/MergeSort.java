package mergeSort;

public class MergeSort {

	public static void main(String[] args) {
		int [] array = {1 , 5, 10, 14, 99, -4, 66};
		mergeSort(array);
		
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		

	}
	
	public static void mergeSort(int[] array) {
		
		if(array.length<2)
			return;
		int mid = array.length/2;
		int[] l = new int[mid];
		int[] r = new int[array.length-mid];
		
		for(int i = 0; i < mid; i++) 
			l [i] = array [i];
		for(int j = mid; j < array.length; j++)
			r [j-mid] = array [j];
		mergeSort(l);
		mergeSort(r);
		mergeSort(array);
	}
	
	public static void merge(int [] array, int [] l, int [] r, int left, int right) {
			int i = 0;
			int j = 0;
			int k = 0;
			
			while (i < left && j < right)
			{
				if (l[i] <= r[j])
					array [k] = l[i];
				i++;
			}else
			{
				array[k] = r[j];
				j++;
			}
			k++;
		
		while (i < left)
			array[k++] = l [i++];
		while (i < right)
			array[k++] = r[j++];
	}
}

