package br.edu.univas.Aula5;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 				

public class Tela3 extends JFrame{
	
	private static final long serialVersionUID = -2345698069624638930L;
	private JPanel contentPane;
	private JLabel label;
	private int countClickButton = 0;
	
	public Tela3(){
		this.setSize(300,300);
		this.setTitle("Aprendendo Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	private void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		this.setContentPane(contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JButton button = new JButton();
		button.setText("Salvar");
		ButtonListener bListener = new ButtonListener();
		button.addActionListener(bListener);
		gbc.gridx = 0;
		gbc.gridy = 0;
		contentPane.add(button, gbc);
		
		label = new JLabel();
		updateTextLabel();
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPane.add(label, gbc);
		
		
	}
	
	private void updateTextLabel(){
		label.setText("Quantidade de clicks: " + countClickButton);
	}
	
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			countClickButton++;
			updateTextLabel();
			
		}
		
	}
		

}
