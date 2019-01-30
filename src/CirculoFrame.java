import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CirculoFrame extends JFrame {
	
	private final JPanel panelControle; 
	private CirculoPanel panelCirculo;

	private final JLabel labelRaio;
	private final JLabel labelEixoX;
	private final JLabel labelEixoY;
	
	private final JTextField fieldRaio;
	private final JTextField fieldEixoX;
	private final JTextField fieldEixoY;
	
	private final JButton buttonCalcular;
	

	
	public CirculoFrame() {
		
		super("Circulo");
		
		panelControle = new JPanel(new FlowLayout());
		panelCirculo = new CirculoPanel(50, 50, 50);
		
		labelRaio = new JLabel("Raio: ");
		labelEixoX = new JLabel("Eixo X: ");
		labelEixoY = new JLabel("Eixo Y: ");
		
		fieldRaio = new JTextField(5);
		fieldRaio.setText("50");
		fieldEixoX =  new JTextField(5);
		fieldEixoX.setText(Integer.toString(panelCirculo.getEixoX()));
		fieldEixoY =  new JTextField(5);
		fieldEixoY.setText(Integer.toString(panelCirculo.getEixoY()));
		
		buttonCalcular = new JButton("Calcular");
		
		panelControle.add(labelRaio);
		panelControle.add(fieldRaio);
		
		panelControle.add(labelEixoX);
		panelControle.add(fieldEixoX);
		
		panelControle.add(labelEixoY);
		panelControle.add(fieldEixoY);
		
		panelControle.add(buttonCalcular);
		
		add(panelControle, BorderLayout.NORTH);
		add(panelCirculo, BorderLayout.CENTER);
		
		buttonCalcular.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						if(fieldRaio.getText().equals("") || fieldEixoX.getText().equals("") || fieldEixoY.getText().equals("")) {
							throw new IllegalArgumentException("campos em branco");
						}
						
						if(Integer.parseInt(fieldRaio.getText()) <= 0 || Integer.parseInt(fieldEixoX.getText()) < 0 || Integer.parseInt(fieldEixoY.getText()) < 0) {
							throw new IllegalArgumentException("argumetos inválido");
						}
						
						remove(panelCirculo);
						panelCirculo = new CirculoPanel(Double.parseDouble(fieldRaio.getText()), Integer.parseInt(fieldEixoX.getText()), Integer.parseInt(fieldEixoY.getText()));
						add(panelCirculo);
						
						validate();
						repaint();
						
					}
					
					
					
				}
				
		);
	}
	
	
}
