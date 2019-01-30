
public class Circulo {
	
	private double raio;
	private double diametro;
	private double circunferencia;
	private double area;
	
	public Circulo(double raio) {
		
		super();
		this.raio = raio;
		this.diametro = 2 * raio;
		this.circunferencia = 2 * Math.PI * raio;
		this.area = Math.PI * Math.pow(raio, 2);
		
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
}
