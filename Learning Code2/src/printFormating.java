public class printFormating {

	public static void main(String[] args) { 
		
		int max = 9999;
		int min = 1;
		int med = 4999;
		System.out.printf("Max = %d \nMin = %d \nMed = %d" , max, min, med);
		Tommy();
	}
		
		public static void Tommy() {
			String user = "Tommy";
			String status = "Tommy is a badass";
			String where = "Everywhere";
			
		 System.out.printf("\nName: %s \nWho is Tommy? %s \nWhere is Tommy? %s", user, status, where);
			
		}
}