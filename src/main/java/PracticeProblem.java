public class PracticeProblem {

	public static void main(String args[]) {
		int q1 = sum(3, 4);
		System.out.println(q1);
		int q2 = difference(3,4);
		System.out.println(q2);
		double q3 = product(3.0, 4.0);
		System.out.println(q3);
		String q4 = removeFirst("Hello");
		System.out.println(q4);
		int q5 = combinedLength("Hello", "World");
		System.out.println(q5);
		boolean q6 = isEven(426);
		System.out.println(q6);
		boolean q7 = isOdd(327);
		System.out.println(q7);
		boolean q8 = isPositive(5);
		System.out.println(q8);
		boolean q9 = isNegative(-3);
		System.out.println(q9);

	}
	
	public static int sum(int num1, int num2){
		int result = num1 + num2;
		return result;
	}
	
	public static int difference(int num1, int num2){
		int result = num1 - num2;
		return result;
	}
	
	public static double product(double num1, double num2){
		double result = num1*num2;
		return result;
	}
	
	public static String removeFirst(String word){
		String result = word.substring(1);
		return result;
	}
	
	public static int combinedLength(String word1, String word2){
		int length1 = word1.length();
		int length2 = word2.length();
		return length1 + length2;
	}

	public static boolean isEven(int num){
		boolean numEven = false;
		if(num%2 == 0){
			numEven = true;
		}
		return numEven;
	}

	public static boolean isOdd(int num){
		boolean numOdd = false;
		if(num%2 != 0){
			numOdd = true;
		}
		return numOdd;
	}

	public static boolean isPositive(int num){
		boolean positiveNum = false;
		if(num > 0){
			positiveNum = true;
		}
		return positiveNum;
	}

	public static boolean isNegative(int num){
		boolean negativeNum = false;
		if(num < 0){
			negativeNum = true;
		}
		return negativeNum;
	}
}
