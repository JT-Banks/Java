
public class WarmUp_1 {

	public boolean sleepIn(boolean weekday, boolean vacation) {

		if(!weekday || vacation == true) 
			return true;

		else
			return false;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		if(aSmile & bSmile || !aSmile & !bSmile == true)
			return true;
		else return false;
	}

	public int sumDouble(int a, int b) {

		if(a == b)
			return (a+b)*2;
		else 
			return a+b;
	}

	public int diff21(int n) {

		if(n <= 21)
			n = n - 21;				  		  
		else 
			n = (n - 21) * 2;
		return Math.abs(n);
	}
	public boolean parrotTrouble(boolean talking, int hour) {

		return(talking && (hour < 7 || hour > 20));
	}

	public boolean makes10(int a, int b) {

		return(a==10 | b==10 | a + b == 10);
	}

	public boolean nearHundred(int n) {

		return ((Math.abs(100 - n) <= 10) || (Math.abs(200-n) <= 10));
	}

	public boolean posNeg(int a, int b, boolean negative) {

		if (negative)
			return  (a <= 0 && b <= 0);

		else {
			return ((a < 0 && b > 0 || (a > 0 && b < 0)));
		}
	}

	public String notString(String str) {
		if(str.length() >= 3 && str.substring(0, 3).equals("not"))
			return str;

		else 
			return "not " + str;
	}

	public String missingChar(String str, int n) {

		String start = str.substring(0, n);
		String end = str.substring(n+1, str.length());
		return start + end;
	}

	public String frontBack(String str) {
		if(str.length() <= 1) 
			return str;
		String mid = str.substring(1, str.length()-1);
		return str.charAt(str.length()-1) + mid + str.charAt(0);
	}

	public String front3(String str) {
		String front3;
		if(str.length() > 3)
			front3 = str.substring(0, 3);
		else
			front3 = str;
		return front3+front3+front3;
	}

	public String backAround(String str) {
		String last = str.substring(str.length() - 1);
		return last + str + last;
	}

	public boolean or35(int n) {
		if (n % 3 == 0 || n % 5 == 0)
			return true;
		else
			return false;

	}

	public String front22(String str) {

		if(str.length() >= 3) {
			String front = str.substring(0, 2);
			return front + str + front;
		}
		else 
			return str + str + str;
	}

	public boolean startHi(String str) {
		if (str.length() < 2)
			return false;
		String two = str.substring(0, 2);
		if(two.equals("hi"))
			return true;
		else
			return false;
	}

	public boolean icyHot(int temp1, int temp2) {
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			return true;
		}else
			return false;
	}

	public boolean in1020(int a, int b) {

		if(( a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
			return true;
		}
		else 
			return false;

	}

	public boolean hasTeen(int a, int b, int c) {

		if((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >=13 && c <= 19)){
			return true;
		}
		else 
			return false;
	}

	public boolean loneTeen(int a, int b) {

		boolean ape = (a >= 13 && a <= 19);
		boolean chimp =(b >= 13 && b <= 19);

		return(ape && !chimp) || (chimp && !ape);
	}

	public String delDel(String str) {

		if(str.length() >= 4 && str.substring(1, 4).equals("del")) {

			return str.substring(0,1) + str.substring(4);
		}
		return str;
	}

	public boolean mixStart(String str) {
		if(str.length() < 3)
			return false;
		if (str.substring(1,3).equals("ix"))
			return true;

		return false;

	}

	public String startOz(String str) {

		String space = "";

		if(str.length() >= 1 && str.charAt(0) == 'o')
			space = space + str.charAt(0);
		if(str.length() >= 2 && str.charAt(1) == 'z')
			space = space + str.charAt(1);
		return space;
	}

	public int intMax(int a, int b, int c) {

		int max = 0;
		if(a > b)
			max = a;
		else
			max = b;
		if(c > max)
			max = c;

		return max;
	}

	public int close10(int a, int b) {
		int secondA = Math.abs(a - 10);
		int secondB = Math.abs(b - 10);


		if(secondA < secondB)
			return a;
		if(secondA > secondB)
			return b;

		return 0;
	}

	public boolean in3050(int a, int b) {

		if(a>=30&&a<=40&&b>=30&&b<=40 || a>=40&&a<=50&&b>=40&&b<=50)
			return true;

		return false;

	}

	public int max1020(int a, int b) {

		if(b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(a >= 10 && a <= 20)
			return a;
		if(b >= 10 && b <= 20)
			return b;

		return 0;

	}

	public boolean stringE(String str) {

		int counter = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e')
				counter++;
		}
		return (counter >= 1 && counter <= 3);
	}

	public boolean lastDigit(int a, int b) {

		int aRemainder = 0;
		int bRemainder = 0;
		if(a % 10 != 0)
			aRemainder = a % 10;
		if(b % 10 != 0)
			bRemainder = b % 10;
		if(bRemainder == aRemainder)
			return true;

		return false;
	}

	public String endUp(String str) {

		if(str.length() <=3)
			return str.toUpperCase();

		int length = str.length() - 3;

		String first = str.substring(0, length);
		String second = str.substring(length);

		return first + second.toUpperCase();

	}

	public String everyNth(String str, int n) {

		String solution ="";
		for(int i = 0; i < str.length(); i = i + n)
			solution = solution + str.charAt(i);

		return solution;
	}
}
