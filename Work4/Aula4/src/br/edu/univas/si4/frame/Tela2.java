package br.edu.univas.si4.frame;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela2 extends JFrame {

	private static final long serialVersionUID = -3239605662654597460L;
	private JPanel contentPane = null;
	
	public  Tela2(){
		this.setTitle("Aprendendo Layout");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
	}
	
	public void addComponents(){
		contentPane = new JPanel();
		contentPane.setLayout(new FlowLayout());
		this.setContentPane(contentPane);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText("Nome: ");
		nameLabel.setPreferredSize(new Dimension(300, 30));
		contentPane.add(nameLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setPreferredSize(new Dimension(450, 30));
		contentPane.add(nameTextField);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail");
		emailLabel.setPreferredSize(new Dimension(300,30));
		contentPane.add(emailLabel);
		
		JTextField emailTextField = new JTextField();
		emailTextField.setPreferredSize(new Dimension(450, 30));
		contentPane.add(emailTextField);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		saveButton.setPreferredSize(new Dimension(100,30));
		contentPane.add(saveButton);
		
		
		
	}

}
