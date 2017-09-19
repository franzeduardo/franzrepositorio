package br.edu.univas.exercicio1;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 9069557162197780644L;
	
	private JPanel contentPane = null;
	
	public Exercicio1(){
		this.setSize(635, 620);
		this.setTitle("Aprendendo Swing");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponets();
	}

	private void addComponets() {
		
		contentPane = new JPanel();
		this.setContentPane(contentPane);
		
		JLabel label = new JLabel();
		label.setText("Nome: ");
		contentPane.add(label);
		
		JTextField textField = new JTextField();
		textField.setColumns(20);
		contentPane.add(textField);
		
		JLabel labelEmail = new JLabel();
		labelEmail.setText("E-mail: ");
		contentPane.add(labelEmail);
		
		JTextField emailField = new JTextField();
		emailField.setColumns(26);
		contentPane.add(emailField);
		
		JLabel endLabel = new JLabel();
		endLabel.setText("Endereço: ");
		contentPane.add(endLabel);
		
		JTextField endField = new JTextField();
		endField.setColumns(40);
		contentPane.add(endField);
		
		JLabel numLabel = new JLabel();
		numLabel.setText("Nº: ");
		contentPane.add(numLabel);
		
		JTextField numField = new JTextField();
		numField.setColumns(5);
		contentPane.add(numField);
		
		JLabel bairroLabel = new JLabel();
		bairroLabel.setText("Bairro: ");
		contentPane.add(bairroLabel);
		
		JTextField bairroField = new JTextField();
		bairroField.setColumns(50);
		contentPane.add(bairroField);
		
		JRadioButton masculino = new JRadioButton("Masculino");
		JRadioButton feminino = new JRadioButton("Feminino");
		
		ButtonGroup group = new ButtonGroup();
		group.add(masculino);
		group.add(feminino);
		
		contentPane.add(masculino);
		contentPane.add(feminino);
		
		JButton button = new JButton();
		button.setText("Salvar");
		button.setPreferredSize(new Dimension(520, 30));
		contentPane.add(button);
		
		Object data [][] = {
			{"Maria", "maria@gmail.com", "Feminino"},
			{"Livia", "livia@gmail.com", "Feminino"},
			{"Luiza", "luiza@gmail.com",  "Feminino"},
			{"Joao", "joao@gmail.com","Masculino"}
			
		};
		
		Object[] calunmName = {
				"Nome", "Email", "Sexo"
		};
		
		JTable table = new JTable(data, calunmName);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollTable = new JScrollPane(table);
		scrollTable.setVerticalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollTable.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		
		
	
		
	}
	
	
	
	
		
	
	
	

}
