package dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class FCommandes extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FCommandes frame = new FCommandes();
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
	public FCommandes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 102, 0));
		panel.setBounds(0, 0, 235, 577);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnCommandes = new JButton("Commande");
		btnCommandes.setContentAreaFilled(false);
		btnCommandes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCommandes.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCommandes.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		btnCommandes.setBounds(24, 11, 201, 73);
		panel.add(btnCommandes);
		
		JButton btnNewButton = new JButton("Commandes existantes");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/commande/Receipt-48.png")));
		btnNewButton.setBounds(0, 109, 225, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("  Supprimer");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_1.setBounds(0, 150, 162, 38);
		panel.add(btnNewButton_1);
		
		JButton btnSupprimerToutes = new JButton("Supprimer toutes les lignes");
		btnSupprimerToutes.setContentAreaFilled(false);
		btnSupprimerToutes.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSupprimerToutes.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnSupprimerToutes.setBounds(0, 199, 246, 35);
		panel.add(btnSupprimerToutes);
		
		JButton btnValiderLaCommande = new JButton("Valider la commande");
		btnValiderLaCommande.setContentAreaFilled(false);btnSupprimerToutes.setContentAreaFilled(false);
		btnValiderLaCommande.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnValiderLaCommande.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnValiderLaCommande.setBounds(0, 244, 212, 42);
		panel.add(btnValiderLaCommande);
		
		JButton button = new JButton("Accueil");
		button.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Home-48.png")));
		button.setRolloverEnabled(false);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setContentAreaFilled(false);
		button.setBounds(10, 484, 174, 65);
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 51));
		panel_1.setBounds(235, 0, 719, 577);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 51));
		panel_2.setBounds(0, 0, 710, 161);
		panel_1.add(panel_2);
		Border border= BorderFactory.createTitledBorder("Informations générales");
		
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(255, 102, 0), 2), "Informations g\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, Color.GRAY));
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(150, 29, 123, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(399, 29, 109, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Selectionner le Client");
		btnNewButton_2.setBackground(new Color(255, 102, 0));
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setOpaque(true);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		//btnNewButton_2.setBackground(new Color(255, 204, 51));
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Search-32.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(150, 72, 522, 58);
		panel_2.add(btnNewButton_2);
		
		JLabel lblSelectionnerLeClient = new JLabel("Nom du client");
		lblSelectionnerLeClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSelectionnerLeClient.setBounds(54, 95, 86, 14);
		panel_2.add(lblSelectionnerLeClient);
		
		JLabel lblCommandesEnCour = new JLabel("Commandes en cours");
		lblCommandesEnCour.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCommandesEnCour.setBounds(10, 32, 130, 14);
		panel_2.add(lblCommandesEnCour);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(324, 32, 46, 14);
		panel_2.add(lblDate);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(255, 102, 0), 2), "Valeurs de la commande", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128, 128)));
		panel_3.setBackground(new Color(255, 204, 51));
		panel_3.setBounds(0, 168, 710, 312);
		panel_1.add(panel_3);
		
		JButton btnSelectionnerUnActicle = new JButton("Selectionner un acticle");
		btnSelectionnerUnActicle.setBackground(new Color(255, 102, 0));
		btnSelectionnerUnActicle.setContentAreaFilled(false);
		btnSelectionnerUnActicle.setOpaque(true);
		btnSelectionnerUnActicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelectionnerUnActicle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSelectionnerUnActicle.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Search-32.png")));
		btnSelectionnerUnActicle.setBounds(10, 25, 210, 33);
		panel_3.add(btnSelectionnerUnActicle);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCode.setBounds(241, 33, 46, 14);
		panel_3.add(lblCode);
		
		textField_2 = new JTextField();
		textField_2.setBounds(309, 31, 86, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCatgorie = new JLabel("Catégorie");
		lblCatgorie.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCatgorie.setBounds(417, 34, 82, 14);
		panel_3.add(lblCatgorie);
		
		textField_3 = new JTextField();
		textField_3.setBounds(509, 31, 86, 20);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDsignation = new JLabel("Désignation");
		lblDsignation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDsignation.setBounds(10, 82, 86, 14);
		panel_3.add(lblDsignation);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 79, 114, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMontant.setBounds(241, 82, 58, 14);
		panel_3.add(lblMontant);
		
		textField_5 = new JTextField();
		textField_5.setBounds(309, 79, 86, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblQuantiter = new JLabel("Quantité");
		lblQuantiter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantiter.setBounds(417, 82, 64, 14);
		panel_3.add(lblQuantiter);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(509, 79, 86, 20);
		panel_3.add(spinner);
		
		JButton btnNewButton_3 = new JButton("Ajouter");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Add-New-48.png")));
		btnNewButton_3.setBounds(106, 110, 140, 57);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Modifier");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnNewButton_4.setBounds(451, 110, 163, 57);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Supprimer");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/Cancel-48.png")));
		btnNewButton_5.setBounds(268, 110, 163, 57);
		panel_3.add(btnNewButton_5);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 180, 690, 121);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Code", "Nom", "Prenom", "Code fidelité", "Date création"
			}
		));
		
		JLabel lblModeDeRglement = new JLabel("Mode de réglement");
		lblModeDeRglement.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/commande/ATM-32.png")));
		lblModeDeRglement.setBounds(240, 507, 139, 14);
		panel_1.add(lblModeDeRglement);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(389, 504, 85, 20);
		panel_1.add(comboBox);
		
		textField_6 = new JTextField();
		textField_6.setText("0.00 €");
		textField_6.setBackground(new Color(255, 102, 0));
		textField_6.setBounds(589, 491, 50, 33);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("Valider la commande");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_6.setContentAreaFilled(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setIcon(new ImageIcon(FCommandes.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnNewButton_6.setBounds(501, 535, 209, 31);
		panel_1.add(btnNewButton_6);
		//scrollPane.setColumnHeaderView(table);
	}
}
