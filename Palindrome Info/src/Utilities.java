import java.io.*; 
import java.util.*; 

public class Utilities {

	public static void SortNames(String[] names) throws FileNotFoundException {   	
		int i,j; 
		String key;   	
		for (j = 1; j < names.length; j++) {
			key = names[j];
			i = j -1;
			while (i >= 0) {
				//Compare
				if (key.compareToIgnoreCase(names[i]) > 0) {
					break;
				}
				names [i + 1] = names[i];
				i--;
			}
			names[i+1] = key;
		}
	}

	public static int BinarySearchNames(String[] names, String target) {

		int l = 0, r = names.length - 1;
		while (l <= r) 
		{

			int m = l + (r - l) / 2;

			int res = target.compareTo(names[m]);

			if (res == 0)
				return m;

			if (res > 0)
				l = m + 1;

			else
				r = m - 1;
		}	    	
		return 0;	    
	}   

	public static boolean isPalendrome(String input) {         
		//Iterative way to do palendrome
		int i = 0, j = input.toLowerCase().length() - 1;         
		while (i < j) { 

			if (input.toLowerCase().charAt(i) != input.toLowerCase().charAt(j)) 
				return false;              
			i++; 
			j--; 
		}           
		return true; 
	}  

	public static String myFirstBornName(String[] arr) throws FileNotFoundException {

		ArrayList<String> names = loadNames();
		Random rand = new Random();
		String randomName = names.get(rand.nextInt(names.size()));    	
		return randomName;

	}

	public static String nameToHex(String name) {
		char[] chars = name.toCharArray();               
		//Loading the MAP with the hexadecimal codes of each character in the alphabet
		Map<Character, String> hexCodes = new TreeMap<>(); 
		hexCodes.putAll(loadHexMap());
		StringBuffer f = new StringBuffer();

		for (char c: chars) {
			f.append(hexCodes.get(c));
		}
		return f.toString();
	}			                                                    
	//A method which loads a map of each letter and its equivalent hexadecimal code 
	public static Map<Character, String> loadHexMap() {

		Map<Character, String> hexCodes = new TreeMap<>(); 
		hexCodes.put('a', "61"); 
		hexCodes.put('b', "62"); 
		hexCodes.put('c', "63"); 
		hexCodes.put('d', "64"); 
		hexCodes.put('e', "65"); 
		hexCodes.put('f', "66"); 
		hexCodes.put('g', "67"); 
		hexCodes.put('h', "68"); 
		hexCodes.put('i', "99"); 
		hexCodes.put('j', "6A"); 
		hexCodes.put('k', "6B"); 
		hexCodes.put('l', "6C"); 
		hexCodes.put('m', "6D"); 
		hexCodes.put('n', "6E"); 
		hexCodes.put('o', "6F"); 
		hexCodes.put('p', "70"); 
		hexCodes.put('q', "71"); 
		hexCodes.put('r', "72"); 
		hexCodes.put('s', "73"); 
		hexCodes.put('t', "74"); 
		hexCodes.put('u', "75"); 
		hexCodes.put('v', "76"); 
		hexCodes.put('w', "77"); 
		hexCodes.put('x', "78"); 
		hexCodes.put('y', "79"); 
		hexCodes.put('z', "7A");     
		hexCodes.put('A', "41"); 
		hexCodes.put('B', "42"); 
		hexCodes.put('C', "43"); 
		hexCodes.put('D', "44"); 
		hexCodes.put('E', "45"); 
		hexCodes.put('F', "46"); 
		hexCodes.put('G', "47"); 
		hexCodes.put('H', "48"); 
		hexCodes.put('I', "49"); 
		hexCodes.put('J', "4A"); 
		hexCodes.put('K', "4B"); 
		hexCodes.put('L', "4C"); 
		hexCodes.put('M', "4D"); 
		hexCodes.put('N', "4E"); 
		hexCodes.put('O', "4F"); 
		hexCodes.put('P', "50"); 
		hexCodes.put('Q', "51"); 
		hexCodes.put('R', "52"); 
		hexCodes.put('S', "53"); 
		hexCodes.put('T', "54"); 
		hexCodes.put('U', "55"); 
		hexCodes.put('V', "56"); 
		hexCodes.put('W', "57"); 
		hexCodes.put('X', "58"); 
		hexCodes.put('Y', "59"); 
		hexCodes.put('Z', "5A"); 

		return hexCodes;          
	}

	public static void printArray(String[] arr) {
		for(String a: arr)
			System.out.println(a);
	}

	public static String[] GetStringArray(ArrayList<String> arr) { 

		String str[] = new String[arr.size()]; 

		for (int j = 0; j < arr.size(); j++) { 
			str[j] = arr.get(j); 
		} 

		return str; 
	} 

	public static ArrayList<String> loadNames() throws FileNotFoundException {

		File inputFile = new File("names.txt"); 
		Scanner in = new Scanner(inputFile); 

		ArrayList<String> names = new ArrayList<>(); 

		while(in.hasNext())
			names.add(in.next()); 
		in.close();
		return names; 
	}  
}