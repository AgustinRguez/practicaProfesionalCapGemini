package ppDiaSeisFinSemana1;

import java.util.Comparator;

public class Comparar implements /*Comparable<Comparar>*/ Comparator<Persona>{ //implementamos y que dentro compare personas

	@Override //comparator mas de un criterio
	public int compare(Persona o1, Persona o2) {
		
		if(o1.getEdad()<o2.getEdad()) {
			return 1;
		}
		else if(o1.getEdad()>o2.getEdad()) {
			return -1;
		}
		else return 0;
	}

	/*@Override
	public int compareTo(Comparar o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	
}
