package codewar02;

//Complete the square sum function so that it squares each number passed into it and then sums the results together.
//
//For example, for [1, 2, 2] it should return 9 because 

public class Kata02 {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,2};
		
		KataMethod.squareSum(a);
		
		
	}
		
}



class KataMethod{
	static int result;
	public static int squareSum(int[] n)
	  { 		
		
		 for(int b :n) {
			 System.out.println(b);
			result+=b*b; 
			System.out.println(result);
		 	}
		 return result;
		 }
	
}
	   
	  
	

