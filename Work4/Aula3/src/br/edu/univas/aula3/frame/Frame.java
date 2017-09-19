package br.edu.univas.aula3.frame;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class Frame extends JFrame {
	
		
		private static final long serialVersionUID = 5722342456453573880L;
		private JPanel contentPane = null;
		
		public Frame(){
			this.setSize(800,600);
			this.setTitle("Aula 3");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			addComponents();
		}
		
		private void addComponents(){
			contentPane = new JPanel();
			this.setContentPane(contentPane);
			
			
			JLabel label = new JLabel();
			label.setText("Nome: ");
			contentPane.add(label);
			
			JTextField textField = new JTextField();
			textField.setColumns(30);
			contentPane.add(textField);
			
			JLabel labelPassword = new JLabel();
			labelPassword.setText("Senha: ");
			contentPane.add(labelPassword);
			
			JPasswordField passwordField = new JPasswordField();
			passwordField.setColumns(30);
			contentPane.add(passwordField);
			
			JLabel labelDescription = new JLabel();
			labelDescription.setText("Descrição: ");
			contentPane.add(labelDescription);
			 
			JTextPane  textPane = new JTextPane();
			Dimension dimension = new Dimension(250,250);
			textPane.setPreferredSize(dimension);
			JScrollPane scroll = new JScrollPane(textPane);
			
			contentPane.add(scroll);
			
			JButton button = new JButton();
			button.setText("Clique me!!!");
			contentPane.add(button);
			
			JList<String> list = new JList<String>();
			DefaultListModel<String> modelList = new DefaultListModel<String>();
			modelList.addElement("Sistemas de Informação");
			modelList.addElement("Matematica");
			modelList.addElement("Historia");
			modelList.addElement("Medicina");
			
			
			list.setModel(modelList);
			list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			list.setPreferredSize(new Dimension(300, 300));
			list.setVisibleRowCount(10);
			
			JScrollPane scrollPaneList = new JScrollPane(list);
			scrollPaneList.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPaneList.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			
			contentPane.add(scrollPaneList);
			
			
			JComboBox<String> comboBox = new JComboBox<String>();
			comboBox.addItem("Tecnicas de Programação 4");
			comboBox.addItem("Banco de Dados");
			comboBox.addItem("Engenharia de Software");
			comboBox.addItem("Franz");
			comboBox.addItem("Eduardo");
			
			comboBox.setPreferredSize(new Dimension(400, 30));
			
			contentPane.add(comboBox);
			
			JCheckBox checkBox = new JCheckBox("Diego");
			checkBox.setSelected(true);
			JCheckBox checkBox2 = new JCheckBox("Franz");
			checkBox2.setSelected(false);
			JCheckBox checkBox3 = new JCheckBox("Rafael");
			checkBox3.setSelected(true);
			
			contentPane.add(checkBox);
			contentPane.add(checkBox2);
			contentPane.add(checkBox3);
			
			JRadioButton radioButton = new JRadioButton("Diurno");
			JRadioButton radioButton2 = new JRadioButton("Matutino");
			JRadioButton radioButton3 = new JRadioButton("Noturno");
			
			ButtonGroup group = new ButtonGroup();
			group.add(radioButton);
			group.add(radioButton2);
			group.add(radioButton3);
			
			contentPane.add(radioButton);
			contentPane.add(radioButton2);
			contentPane.add(radioButton3);
			
			Object[][] data = {
					{"Maria", "maria@gmail.com", "1234"},
					{"José", "jose@gmail.com", "9876"},
					{"João", "joao@gmail.com", "5555"},
					{"Madalena", "madalena@gmail.com", "8521"}
					
			};
			
			Object[] calumnNames = {
					"Nome", "E-mail","Matrícula"
			};
			
			JTable table = new JTable(data, calumnNames);
			table.setFillsViewportHeight(true);
			
			JScrollPane tableScroll = new JScrollPane(table);
			tableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			tableScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			tableScroll.setPreferredSize(new Dimension(400,150));
			
			contentPane.add(tableScroll);
			
			
			
			
			
			
			
			
			
			
			
		}
	}
		


