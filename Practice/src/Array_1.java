public class Array_1 {

	public boolean firstLast6(int[] nums) {

		int first = nums[0];
		int last = nums[nums.length-1];
		for(int i = 0; i < nums.length; i++)
			if(first == 6 || last == 6)
				return true;

		return false;
	}

	public boolean sameFirstLast(int[] nums) {

		if (nums.length < 1)
			return false;
		int first = nums[0];
		int last = nums[nums.length-1];
		for(int i = 0; i < nums.length; i++)
			if(first == last)
				return true;

		return false;
	}

	public int[] makePi() {

		int[] array = {3, 1, 4};
		return array;
	}

	public boolean commonEnd(int[] a, int[] b) {

		int firstA = a[0];
		int lastA = a[a.length-1];
		int firstB = b[0];
		int lastB = b[b.length - 1];
		for(int i = 0; i < a.length; i++)
			if(firstA == firstB || lastA == lastB)
				return true;

		return false; 
	}

	public int sum3(int[] nums) {
		int sum = 0;

		for(int i = 0; i < nums.length; i++)
			sum += nums[i];
		return sum;
	}
	/*
	 * Still needs work 
	 */
	public int[] rotateLeft3(int[] nums) {

		return new int[] {nums[1], nums[2], nums[0]};
	}

	public int[] reverse3(int[] nums) {

		return new int[] { nums[1], nums[2], nums[0] };
	}

	public int[] maxEnd3(int[] nums) {

		int[] answer = new int[3];
		if(nums[0] >= nums[2]) {
			answer[0] = nums[0];
			answer[1] = nums[0];
			answer[2] = nums[0];
		}
		else if(nums[1] >= nums[0]) {
			answer[0] = nums[2];
			answer[1] = nums[2];
			answer[2] = nums[2];
		}
		return answer;
	}

	public int sum2(int[] nums) {

		int sum = 0;
		
		if(nums == null)
			return 0;
		if(nums.length == 1) {
			sum = nums[0];
			return sum;
		}
		
		if (nums.length >= 2) {
			for(int i = 0; i < nums.length; i++)
				sum = nums[0] + nums[1];
			return sum;
		}
		return 0;
	}

	public int[] middleWay(int[] a, int[] b) {

		int[] middle = {a[1], b[1]};

		return middle;
	}

	public int[] makeEnds(int[] nums) {

		return new int[] {nums[0], nums[nums.length - 1]};

	}

	public boolean has23(int[] nums) {

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 2 || nums[i] == 3)
				return true;
		}
		return false;
	}

	public boolean no23(int[] nums) {

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 2 || nums[i] == 3)
				return false;
		}
		return true;
	}

	public int[] makeLast(int[] nums) {

		int[] doubleArray = new int[nums.length * 2];
		doubleArray[nums.length * 2 - 1] = nums[nums.length - 1];
		return doubleArray;
	}

	public boolean double23(int[] nums) {

		if(nums.length == 2) {
			if(nums[0] == 2 && nums[1] == 2) 
				return true;

			if(nums[0] == 3 && nums[1] == 3)
				return true;
		}
		return false;
	}

	public int[] fix23(int[] nums) {

		if(nums[0] == 2 && nums[1] == 3)
			nums[1] = 0;
		if(nums[1] == 2 && nums[2] == 3)
			nums[2] = 0;
		return nums;
	}
	
	public int start1(int[] a, int[] b)	 {
		int count = 0;

		if(a.length > 0 && a[0] == 1)
			count++;

		if(b.length > 0 && b[0] == 1)
			count++;

		return count;
	}

	public int[] biggerTwo(int[]a, int[] b) {

		int firstArraySum = a[0] + a[1];
		int secondArraySum = b[0] + b[1];
		if(firstArraySum == secondArraySum)
			return a;
		else if(firstArraySum > secondArraySum)
			return a;
		else if(secondArraySum > firstArraySum)
			return b;

		return null;  
	}

	public int[] plusTwo(int[] a, int[] b) {

		return new int[] {a[0], a[1], b[0], b[1]};
	}

	public int[] swapEnds(int[] nums) {

		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;

		return nums;
	}

	public int[] midThree(int[] nums) {

		int[] halfArray = new int[3];
		int half = nums.length/2;
		halfArray[0] = nums[half-1];
		halfArray[1] = nums[half];
		halfArray[2] = nums[half+1];
		return halfArray;
	}

	public int maxTriple(int[] nums) {

		int largest = 0;
		int first = nums[0];
		int middle = nums[(nums.length/2)];
		int last = nums[nums.length - 1];
		if(first > middle && first > last)
			largest = first;
		if(middle > first && middle > last)
			largest = middle;
		if(last > middle && last > first)
			largest = last;
		//debugging...
		System.out.println("First Element: " +first+ " Middle element: " +middle+ " Last element: " +last);
		return largest;
	}

	public int[] frontPiece(int[] nums) {

		if(nums.length >= 2)
			return new int[] {nums[0], nums[1]};
		if(nums.length < 2)
			return nums;
		return null;
	}

	public boolean unlucky1(int[] nums) {

		if(nums.length > 1) {
			if(nums[0] == 1 && nums[1] == 3)
				return true;
			if(nums[1] == 1 && nums[2] == 3)
				return true;
			if(nums[nums.length -2] == 1 && nums[nums.length - 1] == 3)
				return true;
		}

		return false;
	}

	public int[] make2(int[] a, int[] b) {

		int[] array = new int[2];
		if(a.length >= 2) {
			array[0] = a[0];
			array[1] = a[1];
		}
		else if(a.length == 1) {
			array[0] = a[0];
			array[1] = b[0];
		} else {
			array[0] = b[0];
			array[1] = b[1];
		}
		return array;
	}

	public int[] front11(int[] a, int[] b) {

		int[] array = new int[2];
		if( a.length == 0 && b.length == 0)
			return new int[] {};
		if(a.length == 0) {
			array = new int[1];
			array[0] = b[0];
		}
		else if(b.length == 0) {
			array = new int[1];
			array[0] = a[0];
		}
		else if(a.length >= 1 && b.length >= 1) {
			array[0] = a[0];
			array[1] = b[0];
		} 
		return array;
	}
}