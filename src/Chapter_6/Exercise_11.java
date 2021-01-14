public class Exercise_11 {
	public static void main(String[] args) {
		System.out.printf("%1s%20s\n", "Sales Amount", "Commission");
		System.out.println("_________________________________");

		for(double salesAmount = 10000; salesAmount<=100000; salesAmount+=5000){
			System.out.printf("%-10s%20.1f\n", salesAmount, computeCommission(salesAmount)); 
		}
	}
	
	public static double computeCommission(double salesAmount) {
		int percent = 900;
		if(salesAmount<10000){
			return 400;
		}else if (salesAmount==10000) {
			return 900;
		}else{
			return 900 + ((salesAmount - 10000) * 0.12);
		}
		

	}
}