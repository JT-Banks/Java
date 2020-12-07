public class Solution {
	
	public static void main(String[] args) {
		int array[] = {10, 10, 10, 10, 2, 2, 50,};
		if(solution(array) > -1) 
		System.out.println("The Candidate is: " + solution(array) + ".");	
		else
			System.out.println("No candidate found.");
	}	
	static int solution(int[] array) {
		int n = array.length;
		int[] L = new int[n+1];
		L[0] = -1;
		
		for(int i = 0; i < n; i++) {
			L[i + 1] = array[i];
		}	
		int count =0; 
		int pos = (n + 1) / 2;
		int candidate = L[pos];
		for(int i = 1; i <=n; i++) {
			if(L[i] == candidate)
				count = count +1;
		}		
		if(2*count > n)
			return candidate;
		else
		return -1;	
	}
}
