package loopingstatement;

public class Star_Pattern {
	void starPattern1() {
		int r = 4;
		for (int i = 1; i <= r; i++) // i=1 i=2 i=3 i=4 i=5
		{// t t t t f
			for (int j = 1; j <= i; j++)// j=1,2 j=1,2,3 j=1,2,3,4 j=1,2, 3,4,5
			{// t f t t f t t t f t t t t f
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	// *
	// * *
	// * * *
	// * * * *
	//

	// a
	// ab
	// abc
	// abcd

	void charPattern() {
		for (char i = 'a'; i <= 'd'; i++) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void downStarPattern() {
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void charDownPattern() {
		for (char i = 'd'; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void numberPattern() {
		for (int i = 1; i <= 4; i++) // i=1 i=2
		{
			for (int j = 1; j <= i; j++)// j=1,2 j=1,2,3
			{
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	void numberPatternDown() {
		for (int i = 1; i <= 4; i++) // i=1 i=2
		{
			for (int j = 1; j <= i; j++)// j=1,2 j=1,2,3
			{
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}

		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++)// j=1,2 j=1,2,3
			{
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		

		Star_Pattern obj = new Star_Pattern();
		obj.starPattern1();
		obj.charPattern();

		obj.downStarPattern();

	    obj.charDownPattern();
	    obj.numberPattern();
		 obj.numberPatternDown();

	}
}
