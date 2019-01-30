import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class CirculoPanel extends JPanel{
	
	private final Circulo circ;
	private final int eixoX;
	private final int eixoY;
	
	public CirculoPanel(double raio, int eixoX, int eixoY) {
		super();
		this.circ = new Circulo(raio);
		this.eixoX = eixoX;
		this.eixoY = eixoY;
	}

	public Circulo getCirc() {
		return circ;
	}

	public int getEixoX() {
		return eixoX;
	}

	public int getEixoY() {
		return eixoY;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		setBackground(Color.WHITE);
		
		g2d.draw(new Ellipse2D.Double(getEixoX(), getEixoY(), circ.getDiametro(), circ.getDiametro()));
		g.drawString(String.format("Raio: %.1f", circ.getRaio()),  getEixoX() + (int) circ.getDiametro(), getEixoY() + (int) circ.getDiametro()/2);
		g.drawString(String.format("Diâmetro: %.1f", circ.getDiametro()),  getEixoX() + (int) circ.getDiametro(), getEixoY() + (int) circ.getDiametro()/2 + 10);
		g.drawString(String.format("Circunferência: %.1f", circ.getCircunferencia()),  getEixoX() + (int) circ.getDiametro(), getEixoY() + (int) circ.getDiametro()/2 + 20);
		g.drawString(String.format("Área: %.1f", circ.getArea()),  getEixoX() + (int) circ.getDiametro(), getEixoY() + (int) circ.getDiametro()/2 + 30);
		
		repaint();
		
	}
	
}
