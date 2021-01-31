package ppDiaTresEjSeis;

public class Silla extends Item {
	public boolean conRueditas;
	public int lote;
	public int numeroDentroDeLote;

	public Silla(boolean conRueditas, int lote, int numeroDentroDeLote){
		//tipo = TipoItem.SILLA;
		this.conRueditas = conRueditas;
		this.lote = lote;
		this.numeroDentroDeLote = numeroDentroDeLote;
}
	public int getID () {
		switch (tipo) {
		case SILLA:
			return lote*1000 + numeroDentroDeLote;
		default:
			throw new AssertionError();
		}
	}
}
