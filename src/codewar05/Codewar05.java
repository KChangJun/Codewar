package codewar05;

//Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
public class Codewar05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
public class Kata
{
  public static String reverseWords(final String original)
  { 
    String[] array = original.split(" ");
    
    if(array.length == 0) 
        return original;
    
    
    int i = 0;
    for(String string : array){
        array[i] = new StringBuilder(string).reverse().toString();
        i++;
    }
    
    return String.join(" ",array);
  }
  