package ashwins;

public class MathUtils {
	public static int factorial (int n){
		if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
		else if(n > 16) {
			throw new IllegalArgumentException("Factorial is not defined for numbers greater than 16.");
		}
 
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}