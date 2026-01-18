package Java_Programs_forLoop;

public class ForLoop8 {

	public static void main(String[] args) {
		// Print numbers from 1 to 100 but skip multiples of 5.
		for(int i=1; i<=100; i++) {
			if(i%5==0) {
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
