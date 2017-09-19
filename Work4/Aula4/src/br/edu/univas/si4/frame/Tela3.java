package br.edu.univas.si4.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela3 extends JFrame{

	private static final long serialVersionUID = -339542878923421427L;
	private JPanel contentPanel = null;
	
	public Tela3(){
		this.setTitle("GridBagLayout");
		this.setSize(450, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		addComponents();
		
	}
	
	public void addComponents(){
		contentPanel = new JPanel();
		contentPanel.setLayout(new GridBagLayout());
		this.setContentPane(contentPanel);
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel labelName = new JLabel();
		labelName.setText("Nome: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		contentPanel.add(labelName, gbc);
		
		JTextField nameTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15,0,10,15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		contentPanel.add(nameTextField, gbc);
		
		JLabel emailLabel = new JLabel();
		emailLabel.setText("Email:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0.0;
		gbc.insets = new Insets(15,15,10,15);
		gbc.anchor = GridBagConstraints.LINE_END;
		contentPanel.add(emailLabel, gbc);
		
		JTextField emailTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15,0,10,15);
		gbc.anchor = GridBagConstraints.CENTER;
		contentPanel.add(emailTextField, gbc);
		
		JButton saveButton = new JButton();
		saveButton.setText("Salvar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15,15,15,15);
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		contentPanel.add(saveButton, gbc);
		
		
		
		
		
		
	}

}
