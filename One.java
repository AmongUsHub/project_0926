
public class One {

	public static double avg(int a, int b, int c) {
		double avg = (a + b + c) / (double) 3;
		return avg;
	}

	public static void main(String[] args) {
		double a = avg(1, 2, 3);
		System.out.println(a);

	}

}
