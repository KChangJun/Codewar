package codewar04;

import java.util.*;

public class Codewar04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}

}

class Kata {

	  static int[] arrayDiff(int[] a, int[] b) {
	    // Your code here.
		  ArrayList<Integer> listA= new ArrayList<Integer>();
		  for(int number01:a) {
			  for(int number02:b) {
				  if(number01!=number02) {
					  listA.add((int)number01);  
				  }
			  }  
		  }
		  
		  a = listA.toArray(new int[0]);
	    return a;
	  }

	}

//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//It should remove all values from list a, which are present in list b keeping their order.
//
//Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//If a value is present in b, all of its occurrences must be removed from the other:
//
//Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}


//public static List filterList(final List list) {
//  // Return the List with the Strings filtered out
//
//  ArrayList<Integer> list2= new ArrayList<Integer>();
//  System.out.println();
//  for (Object element: list
//       ) {/*element.getClass().equals(Integer.class)*/
//      if(element.getClass().getName().equals(Integer.class.getName()) ){
//          list2.add((Integer) element);
//      }