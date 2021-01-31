package ppDiaCuatro;

public class Main {

	public static void main(String[] args) { // eje 8
		metodoA objM = new metodoA();
		try {
			objM.a();
			System.out.println("todo bien con A");
		} catch (claseException e) {
			// TODO Auto-generated catch block
			System.out.println("hubo problema");
		}
		objM.b();
	}

}
