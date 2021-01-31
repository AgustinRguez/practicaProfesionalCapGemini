package ppDiaTres;

import java.util.ArrayList;

public class Orquesta extends Instrumentos{
	private ArrayList instrumentos = new ArrayList();
	
	
	public Orquesta() {
		instrumentos.add(new Guitarra());
		instrumentos.add(new Guitarra());
		instrumentos.add(new Piano());
		instrumentos.set(0, "GuitarraUno -" );
		instrumentos.set(1, " GuitarraDos -" );
		instrumentos.set(2, " Piano" );
	}
	
	public void sonarEnConjunto() {
		System.out.println("Estan sonando: " + instrumentos.get(0) + instrumentos.get(1) + instrumentos.get(2));
	}
}
