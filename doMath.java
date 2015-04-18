
import java.lang.Math;

public class doMath {
	public static boolean isPrime(int Number) {
		int x = (int) Math.sqrt(Number);
		for (int i = 2; i < x; i++) {
			if (Number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isOdd(int Number) {
		if (Number % 2 == 0) {
			return false;
		}
		return true;
	}
	public static boolean isEven(int Number) {
		if (Number % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isSumOfTwoConsecutive(int a) {
		for (int i = 0, j = 1; i < a && j < a; i++, j++) {
			if (i + j == a) {
				return true;
			}
		}
		return false;
	}
	public static double Min(double a, double b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	public static int Min(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	public static double Max(double a, double b) {
		if (a > b) {
			return a;
		}
		return b;
	}
	public static int Max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}
	public static double ArraySum(double a[]) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
