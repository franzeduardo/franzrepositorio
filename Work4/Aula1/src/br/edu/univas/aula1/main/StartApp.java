package br.edu.univas.aula1.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton();
		
		button.setText("Não clique aqui!");
		frame.getContentPane().add(button);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Primeira aula de Swing");
		frame.setSize(300, 300);
		frame.setVisible(true);
		

	}

}
