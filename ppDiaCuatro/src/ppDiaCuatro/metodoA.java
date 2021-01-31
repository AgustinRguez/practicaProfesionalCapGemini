package ppDiaCuatro;

public class metodoA {

	public metodoA() {

	}

	public void a() throws claseException {

	}

	public void b() {
		try {
			int[] array = { 0, 5, 9, 2, 56, 1 };
			for (int i = 0; i <= 145; i++) {
				System.out.println(array[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("se pico el limite, te pasaste con B");
		} catch (Exception ie) {
			System.out.println("hubo error");
		}

	}
}
