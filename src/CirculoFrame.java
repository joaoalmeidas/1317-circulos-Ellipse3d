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
		
		labelRaio = new JLabel("Raio: ");
		labelEixoX = new JLabel("Eixo X: ");
		labelEixoY = new JLabel("Eixo Y: ");
		
		fieldRaio = new JTextField(5);
		fieldEixoX =  new JTextField(5);
		fieldEixoY =  new JTextField(5);
		
		buttonCalcular = new JButton("Calcular");
		
		panelControle.add(labelRaio);
		panelControle.add(fieldRaio);
		
		panelControle.add(labelEixoX);
		panelControle.add(fieldEixoX);
		
		panelControle.add(labelEixoY);
		panelControle.add(fieldEixoY);
		
		panelControle.add(buttonCalcular);
		
		add(panelControle, BorderLayout.NORTH);
		
		buttonCalcular.addActionListener(
				
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					
					
				}
				
		);
	}
	
	
}
