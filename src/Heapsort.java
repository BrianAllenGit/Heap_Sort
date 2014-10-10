import java.util.*;

public class Heapsort {

	public static void main(String[] args) {
		int[] a = new int[100];
		int i = 4, print = 1, temp, check = 0, var = 9, total = 0, loop1= 0, loop2=1, loop3=2, loop4=3;
		double count = 3.5;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 9 numbers: ");
		for (int bb = 1; bb < 10; bb++)
			a[bb] = scan.nextInt();

		while (total < 8) {
			while (check < 3) {
				while (count >= loop1) {
					while (count >= loop2) {
						while (count >= loop3) {
							while (count >= loop4) {
								i = 4;
								if (a[i] < a[2 * i + 1] && count > 3.1) {
									temp = a[i];
									a[i] = a[2 * i + 1];
									a[2 * i + 1] = temp;
								}
								if (a[i] < a[2 * i]) {
									temp = a[i];
									a[i] = a[2 * i];
									a[2 * i] = temp;
								}
								loop4=5;
							}
							i = 3;
							if (a[i] < a[2 * i + 1] && count > 2.1) {
								temp = a[i];
								a[i] = a[2 * i + 1];
								a[2 * i + 1] = temp;
							}
							if (a[i] < a[2 * i]) {
								temp = a[i];
								a[i] = a[2 * i];
								a[2 * i] = temp;
							}
							loop3=5;
						}
						i = 2;
						if (a[i] < a[2 * i + 1] && count > 1.1) {
							temp = a[i];
							a[i] = a[2 * i + 1];
							a[2 * i + 1] = temp;
						}
						if (a[i] < a[2 * i]) {
							temp = a[i];
							a[i] = a[2 * i];
							a[2 * i] = temp;
							}
						loop2=5;
					}
					i = 1;
					if (a[i] < a[2 * i + 1] && count > .1) {
						temp = a[i];
						a[i] = a[2 * i + 1];
						a[2 * i + 1] = temp;
					}
					if (a[i] < a[2 * i]) {
						temp = a[i];
						a[i] = a[2 * i];
						a[2 * i] = temp;
					}
					loop1=5;
				}
				loop1=0;
				loop2=1;
				loop3=2;
				loop4=3;
				check = check + 1;
			}
			count -= .5;
			check = 0;
			temp = a[1];
			a[1] = a[var];
			a[var] = temp;
			var -= 1;
			total += 1;
		}
		while (print < 10) {
			System.out.println(a[print]);
			print++;
		}
	}

}
