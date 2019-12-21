package Top100Questions;

public class First {


	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE + "   " + Integer.MAX_VALUE);
		System.out.println(1534236469 > Integer.MAX_VALUE);
		System.out.println(reverse(1534236469));
	}

	public static int reverse(int x) {

		long reverseX = 0;

		while (x != 0) {
			reverseX = reverseX * 10 + x % 10;
			x = x / 10;
		}

		if (reverseX < Integer.MIN_VALUE || reverseX > Integer.MAX_VALUE)
			return 0;
		else
			return (int)reverseX;

	}
}
