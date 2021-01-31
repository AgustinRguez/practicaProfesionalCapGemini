package ppDiaCuatroEjercicio9;

public enum sistemaSolar {
	MERCURIO("MERCURIO","3.303e+23","2.4397e6"), VENUS("VENUS","4.869e+24","6.0518e6"), TIERRA("TIERRA","5.976e+24","6.37814e6"), MARTE("MARTE","6.421e+23","3.3972e6")
	, JUPITER("JUPITER ","1.9e+27","7.1492e7"), SATURNO("SATURNO","5.688e+26","6.0268e7"), URANO("URANO ","8.686e+25","2.5559e7"), NEPTUNO("NEPTUNO","1.024e+26","2.4746e7"); 
	
	public String nombre;
	public String masa;
	public String radio;
	
	private sistemaSolar(String nombre, String masa, String radio) {
		this.nombre = nombre;
		this.masa = masa;
		this.radio = radio;
	}

	public String getNombre() {
		return nombre;
	}
	public String getMasa() {
		return masa;
	}
	public String getRadio() {
		return radio;
	}

};
