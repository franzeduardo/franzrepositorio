package br.edu.univas.Aula5;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela1 extends JFrame implements ActionListener  {
	private static final long serialVersionUID = -316954948466161805L;
	private JPanel contentPane;
	private JLabel label;
	private int countClickButton = 0;
	
	public Tela1(){
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
		button.addActionListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		countClickButton++;
		updateTextLabel();
		
	}

}
