package array2D;
import java.util.Arrays;
import java.util.Scanner;
public class LowerTriangular {
	int arr[][] = new int[3][3];
	void addArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array elements:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
	}
	void display() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	void sumOfLowerTriangular() {
		 int sum=0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i > j) {
						sum = sum + arr[i][j];
					}
				}
			}
			System.out.println("Sum of lower triangular elements :" + sum);
		}
	public static void main(String[] args) {
		LowerTriangular obj=new LowerTriangular();
		obj.addArray();
		obj.display();
		obj.sumOfLowerTriangular();
	}
}
