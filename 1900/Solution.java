public class Solution {

  public int solution(int number) {
  	int solution = 0;
    number = 0;

  	while (solution < 10) {
    	solution++;

    		if (solution % 3 == 0 || solution % 5 == 0) {
    			number = number + solution(23);
    		}
    	}
	}
    	
	public static void main(String [] args) {
    	return number;
    	System.out.println(number);	
	}

}