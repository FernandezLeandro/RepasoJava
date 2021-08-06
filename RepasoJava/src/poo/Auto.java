package poo;

public class Auto {
	private String color;
	private int pesoPlataforma;
	private int motor;
	private int ancho;
	private int largo;
	private int ruedas;
	private int pesoFinal;
	private boolean asientosCuero, climatizador;
	//private String peso;
	
	public int getPesoPlataforma () {
		return pesoPlataforma;
	}
	
	public String getColor () {
		return color;
	}
	
	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPesoPlataforma(int peso) {
		this.pesoPlataforma = peso;
	}
	
	
	public int getPesoFinal() {
		return pesoFinal;
	}

	public void setPesoFinal(int pesoFinal) {
		this.pesoFinal = pesoFinal;
	}

	public boolean isAsientosCuero() {
		return asientosCuero;
	}

	public void setAsientosCuero(boolean asientosCuero) {
		this.asientosCuero = asientosCuero;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}

	public Auto () {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;
		
	}
	public String datosGenerales () {
		return "La plataforma tiene " + this.ruedas + " ruedas, mide " + this.largo/1000 + " metros de ancho,"
				+ " es de color " + this.getColor() + " y con un peso de " + this.getPesoPlataforma() + " kilos.";
	}
	
	public String datoAsientos () {
		if (this.asientosCuero) {
			return "Tiene asientos de cuero";
		}else
			return "No tiene asientos de cuero";
	}
}
