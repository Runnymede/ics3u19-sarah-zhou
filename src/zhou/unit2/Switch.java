package zhou.unit2;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		int even = num%2;
		boolean evenYes;
		switch(even) {
		case (0):
			System.out.println("even");
		break;
		default:
			System.out.println("odd");
		}
	}

}
