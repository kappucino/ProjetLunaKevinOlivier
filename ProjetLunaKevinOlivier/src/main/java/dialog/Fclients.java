package dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextArea;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;

public class Fclients extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fclients frame = new Fclients();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fclients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 194, 546);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 255));
		panel_1.setBounds(0, 0, 194, 83);
		panel.add(panel_1);
		
		JButton btnClients = new JButton("Clients");
		btnClients.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClients.setContentAreaFilled(false);
		btnClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClients.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/client/People-64-actif.png")));
		panel_1.add(btnClients);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 153, 255));
		panel_2.setBounds(0, 78, 194, 472);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Supprimer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnNewButton_2.setBounds(30, 175, 165, 41);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("  Ajouter");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Add-New-48.png")));
		btnNewButton.setBounds(40, 11, 155, 56);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rechercher");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Search-32.png")));
		btnNewButton_1.setBounds(41, 78, 154, 34);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Modifier");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnNewButton_3.setBounds(40, 123, 155, 41);
		panel_2.add(btnNewButton_3);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setContentAreaFilled(false);
		btnAccueil.setRolloverEnabled(false); // turn on before rollovers work
		btnAccueil.setRolloverIcon(new ImageIcon(FAccueil.class.getResource("/images/gestion/Home-48-actif.png")));
		btnAccueil.setRolloverSelectedIcon(new ImageIcon(FAccueil.class.getResource("/images/gestion/Home-48-actif.png")));
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAccueil.setSelected(!btnAccueil.isSelected());
			}
		});
		btnAccueil.setIcon(new ImageIcon(Fclients.class.getResource("/images/gestion/Home-48.png")));
		btnAccueil.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAccueil.setBounds(10, 396, 174, 65);
		panel_2.add(btnAccueil);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 255));
		panel_3.setBounds(191, 0, 580, 546);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 560, 271);
		panel_4.setBackground(new Color(204, 255, 255));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(85, 31, 96, 20);
		panel_4.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(266, 31, 136, 20);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(85, 62, 96, 20);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 93, 465, 20);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(85, 124, 96, 20);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(85, 155, 465, 20);
		panel_4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(29, 34, 46, 14);
		panel_4.add(lblCode);
		
		JLabel lblNewLabel = new JLabel("Prenom");
		lblNewLabel.setBounds(29, 65, 46, 14);
		panel_4.add(lblNewLabel);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setBounds(29, 96, 46, 14);
		panel_4.add(lblAdresse);
		
		JLabel lblFixe = new JLabel("Fixe");
		lblFixe.setBounds(29, 127, 46, 14);
		panel_4.add(lblFixe);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(29, 158, 46, 14);
		panel_4.add(lblEmail);
		
		JLabel lblRemarques = new JLabel("Remarques");
		lblRemarques.setBounds(29, 196, 65, 14);
		panel_4.add(lblRemarques);
		
		JLabel lblCreerLe = new JLabel("Créé le");
		lblCreerLe.setBounds(225, 34, 46, 14);
		panel_4.add(lblCreerLe);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Carte de fidélité");
		chckbxNewCheckBox.setBackground(new Color(204, 255, 255));
		chckbxNewCheckBox.setBounds(428, 30, 122, 23);
		panel_4.add(chckbxNewCheckBox);
		
		textField_7 = new JTextField();
		textField_7.setBounds(266, 62, 136, 20);
		panel_4.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(266, 124, 136, 20);
		panel_4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(225, 65, 46, 14);
		panel_4.add(lblNom);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(225, 127, 46, 14);
		panel_4.add(lblMobile);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(85, 196, 465, 64);
		panel_4.add(textArea);
		
		
		
		JLabel lblTrierLaListe = new JLabel("Trier la liste par :");
		lblTrierLaListe.setBounds(20, 521, 89, 14);
		panel_3.add(lblTrierLaListe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(112, 518, 74, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "DSC", "ASC"}));
		panel_3.add(comboBox);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 288, 560, 227);
		panel_3.add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Code", "Nom", "Prenom", "Code fidelité", "Date création"
			}
		));
		
		String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		
	}
}
