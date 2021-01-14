public class Exercise_16 {
	public static void main(String[] args) {
		for(int i=2000; i<+2020; i++){
			System.out.println("Year: " + i + " days: " + numberOfDaysInAYear(i));
		}
	}
	
	public static int numberOfDaysInAYear(int year) {
		if(year%4==0){
			return 366;
		}else{
			return 355;
		}
	}
}