interface A{
	 int x = 1;
}

public class Test implements A{
	

	public static void main(String[] args) {

		int x = 22;
		System.out.println(A.x);
	}

}
