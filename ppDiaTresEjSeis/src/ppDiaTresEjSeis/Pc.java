package ppDiaTresEjSeis;

public class Pc extends Item{
	public int nroSerie;
	public boolean esNotebook;
	

	public Pc(int nroSerie, boolean esNotebook){
		//tipo = TipoItem.PC;
		this.nroSerie = nroSerie;
		this.esNotebook = esNotebook;
		
	}
	public int getID () {
		switch (tipo) {
		case PC:
			return nroSerie;
		default:
			throw new AssertionError();

		}
	}

}
