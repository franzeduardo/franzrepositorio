package br.edu.univas.si4.exercicio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class frame extends JFrame {

	private static final long serialVersionUID = 1633195822360613847L;

	
	private JPanel contentPane = null;
	private JPanel contentPane1 = null;
	private JPanel contentPane2 = null;
	
	
	public frame(){
		this.setSize(635,420);
		this.setTitle("Aprendendo Swing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
		
	}
	
	public void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		contentPane1 = new JPanel();
		contentPane1.setBackground(Color.GRAY);
		contentPane1.setPreferredSize(new Dimension(150,110));
		contentPane.add(contentPane1,BorderLayout.NORTH);
		
		JButton button1 = new JButton();
		button1.setText("Produtos");
		button1.setPreferredSize(new Dimension(150,100));
		contentPane1.add(button1);
		
		JButton button2 = new JButton();
		button2.setText("Produtos");
		button2.setPreferredSize(new Dimension(150,100));
		contentPane1.add(button2);
		
		JButton button3 = new JButton();
		button3.setText("Produtos");
		button3.setPreferredSize(new Dimension(150,100));
		contentPane1.add(button3);
		
		contentPane2= new JPanel();
		
		contentPane2.setLayout(new GridBagLayout());
		this.setContentPane(contentPane);
		
		GridBagConstraints gbc = new GridBagConstraints();
		JLabel labelname = new JLabel();
		labelname.setText("Nome");
		
		
		
		
	}
	
	

}
