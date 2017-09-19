package br.edu.univas.si4.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tela1 extends JFrame {

	private static final long serialVersionUID = -2369527507975735998L;
	private JPanel contentPane;
	
	public Tela1(){
		this.setTitle("Gerenciador de Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 350);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	public void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		
		JPanel nortePanel = new JPanel();
		nortePanel.setBackground(Color.RED);
		nortePanel.setPreferredSize(new Dimension(0, 50));
		contentPane.add(nortePanel, BorderLayout.NORTH);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.BLUE);
		westPanel.setPreferredSize(new Dimension(50, 0));
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.GREEN);
		centerPanel.setPreferredSize(new Dimension(200,0));
		contentPane.add(centerPanel,BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.YELLOW);
		eastPanel.setPreferredSize(new Dimension(100,0));
		contentPane.add(eastPanel, BorderLayout.EAST);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.ORANGE);
		southPanel.setPreferredSize(new Dimension(0,75));
		contentPane.add(southPanel, BorderLayout.SOUTH );
		
	}
	
	

}
