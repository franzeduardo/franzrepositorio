package br.edu.univas.aula2.frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela1 extends JFrame {
	
	private static final long serialVersionUID = 1954360997051943701L;
	
	private JPanel contentPanel = null;

	public Tela1() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Aprendendo Swing");
		 
	 }
	
	public Tela1(int width, int height){
		this.setSize(width, height);
	

	}
	
	public Tela1(String title, int width, int height){
		configureFrame(title, width,height);
	}
	public void configureFrame(String title, int width, int height){
		this.setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(title);
		setContentPanel();
		addComponents();
	}
	
	public void setContentPanel(){
		contentPanel = new JPanel();
		this.setContentPane(contentPanel);
	}
	
	public void addComponents(){
		JButton button = new JButton();
		button.setText("Clique aqui");
		contentPanel.add(button);
		
	}
	
}
