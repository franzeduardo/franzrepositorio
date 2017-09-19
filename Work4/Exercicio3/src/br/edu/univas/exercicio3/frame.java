package br.edu.univas.exercicio3;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class frame extends JFrame {

	private static final long serialVersionUID = -4075743205996243476L;
	private JPanel contentPane;
	private JTextArea textarea;
	private int cont = 1;
	
	public frame(){
		this.setTitle("Aprendendo Swing");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocale(null);
		addComponentes();
	}
	
	public void addComponentes(){
		
		
		contentPane = new JPanel();
		this.setContentPane(contentPane);
		textarea = new JTextArea();
		textarea.setPreferredSize(new Dimension(350,220));
		contentPane.add(textarea);
		
		Button1 b1 = new Button1();
		
		
		JButton button1 = new JButton();
		button1.setText("Adicionar Texto");
		button1.addActionListener(b1);
		contentPane.add(button1);
		
		Button2 b2 = new Button2();
		JButton button2 = new JButton();
		button2.setText("Limpar Texto");
		button2.addActionListener(b2);
		contentPane.add(button2);
	}
	
	private class Button1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			textarea.append("Novo texto "+ cont++ + "\n");	
			
		}
		
	}
	
	private class Button2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			textarea.setText("");
			cont=1;
		}
		
	}
	

}
