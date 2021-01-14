public class Exercise_10 {
	public static void main(String[] args) {
	    int z=0; 
  		for (int i=1; i<=10000; i++) {
       		if (isPrime(i)){
           		z++;
       		}
    	}
    System.out.print(z+"\n");
	}
	public static boolean isPrime(int n){
       	for(int i=2; i<=n/2; i++){
      	    if(n%i==0){
      	    	return false;
      	    }
   	    }
        return true;
	}
}