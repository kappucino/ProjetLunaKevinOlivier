package dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import connexion.Article;

import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;

public class FArticle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField txtEerer;
	private final JLabel lblNewLabel_3 = new JLabel("Rechercher");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FArticle frame = new FArticle();
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
	public FArticle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 0));
		panel.setBounds(0, 0, 182, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/article/Product-64-actif.png")));
		lblNewLabel.setBounds(10, 11, 64, 64);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aperçu");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Preview-48.png")));
		btnNewButton.setBounds(10, 147, 150, 31);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Imprimer");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Printer-48.png")));
		btnNewButton_1.setBounds(10, 189, 150, 31);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Export");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Data-Export-48.png")));
		btnNewButton_2.setBounds(10, 231, 150, 31);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Acceuil");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FArticle.this.setVisible(false);
				FAccueil frame = new FAccueil();
			    frame.setVisible(true);
			}
		});
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Home-48.png")));
		btnNewButton_3.setBounds(10, 369, 150, 60);
		panel.add(btnNewButton_3);
		
		JLabel lblArticles = new JLabel("Articles");
		lblArticles.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblArticles.setBounds(85, 11, 97, 64);
		panel.add(lblArticles);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(192, 11, 509, 163);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setBounds(10, 11, 46, 14);
		panel_1.add(lblCode);
		
		// CODE ARTICLE
		textField = new JTextField();
		textField.setBounds(48, 8, 190, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblCatgorie = new JLabel("Catégorie");
		lblCatgorie.setBounds(248, 11, 71, 14);
		panel_1.add(lblCatgorie);
		
		// CATEGORIE ARTICLE
		textField_1 = new JTextField();
		textField_1.setBounds(329, 8, 170, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Désignation");
		lblNewLabel_1.setBounds(10, 36, 90, 14);
		panel_1.add(lblNewLabel_1);
		
		
		// DESIGNATION ARTICLE
		textField_2 = new JTextField();
		textField_2.setBounds(77, 33, 328, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblQuantit = new JLabel("Quantité");
		lblQuantit.setBounds(10, 68, 46, 14);
		panel_1.add(lblQuantit);
		
		JSlider slider = new JSlider();
		slider.setSnapToTicks(true);
		slider.setValue(0);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(10);
		slider.setBounds(66, 61, 172, 26);
		panel_1.add(slider);
		slider.setBackground(Color.LIGHT_GRAY);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBounds(248, 68, 43, 14);
		panel_1.add(label_1);
		
		JLabel lblPrixUnitaire = new JLabel("Prix unitaire");
		lblPrixUnitaire.setBounds(285, 68, 71, 14);
		panel_1.add(lblPrixUnitaire);
		
		// PRIX UNITAIRE
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setBounds(366, 65, 90, 20);
		panel_1.add(textField_3);
		textField_3.setText("0.00");
		textField_3.setColumns(10);
		
		JLabel label = new JLabel("€");
		label.setBounds(466, 66, 33, 18);
		panel_1.add(label);
		
		Article article = new Article();
		JButton lblAjouter = new JButton("Ajouter");
		lblAjouter.setContentAreaFilled(false);

		lblAjouter.setBounds(20, 98, 134, 48);
		panel_1.add(lblAjouter);
		lblAjouter.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Add-New-48.png")));
		
		JButton lblModifier = new JButton("Modifier");
		lblModifier.setContentAreaFilled(false);

		lblModifier.setBounds(164, 98, 127, 48);
		panel_1.add(lblModifier);
		lblModifier.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Data-Edit-48.png")));
		
		JButton lblNewLabel_2 = new JButton("Supprimer");
		lblNewLabel_2.setContentAreaFilled(false);
		lblNewLabel_2.setBounds(302, 98, 154, 48);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Garbage-Open-48.png")));
		
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(190, 185, 521, 193);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter(){
		    public void mouseClicked(MouseEvent evnt) {
		        int row = table.rowAtPoint(evnt.getPoint());
		        textField.setText("" + table.getValueAt(row, 0));
		        textField_1.setText("" + table.getValueAt(row, 1));
		        textField_2.setText("" + table.getValueAt(row, 2));
		        textField_3.setText("" + table.getValueAt(row, 4));
		    }
		});
		scrollPane.setViewportView(table);
		table.setColumnSelectionAllowed(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Code", "Code Cat\u00E9gorie", "D\u00E9signation", "Quantit\u00E9", "Prix"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}

			


		});

		article.GetArticle(table);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		panel_2.setBounds(181, 393, 530, 50);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Trier par");
		btnNewButton_4.setBounds(-17, 8, 125, 41);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEADING);
		panel_2.add(btnNewButton_4);
		lblNewLabel_3.setBounds(266, 4, 119, 48);
		lblNewLabel_3.setIcon(new ImageIcon(FArticle.class.getResource("/images/gestion/Search-48.png")));
		panel_2.add(lblNewLabel_3);
		
		txtEerer = new JTextField();
		txtEerer.setBounds(395, 18, 125, 20);
		panel_2.add(txtEerer);
		txtEerer.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Code");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(100, 17, 67, 23);
		panel_2.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				article.GetArticle(table, "code_article");
			}
		});



		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Catégorie");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(169, 17, 104, 23);
		panel_2.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				article.GetArticle(table, "categorie");
			}
		});
		
		lblAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int getCode = Integer.parseInt(textField.getText());
				String getCategorie = textField_1.getText();
				String getDesignation = textField_2.getText();
				double getPrixUnit = Double.parseDouble(textField_3.getText());
				
				article.NewArticle(getCode, getCategorie, getDesignation, 50, getPrixUnit);
				
				System.out.println(getCode + " " + getCategorie + "  " + getDesignation + " " + getPrixUnit);
				if (rdbtnNewRadioButton.isSelected()) {
				article.GetArticle(table, "code_article"); } else if (rdbtnNewRadioButton_1.isSelected()) {
				article.GetArticle(table, "categorie");
				} else {
				article.GetArticle(table);
				}
			}
		});
		
		lblModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			article.ModifArticle(Integer.parseInt(textField.getText()), textField_1.getText(), textField_2.getText(), Double.parseDouble(textField_3.getText()));
			
			
			if (rdbtnNewRadioButton.isSelected()) {
			article.GetArticle(table, "code_article"); } else if (rdbtnNewRadioButton_1.isSelected()) {
			article.GetArticle(table, "categorie");
			} else {
			article.GetArticle(table);
			}
			}
		});
		
		lblNewLabel_2.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				article.SupprArticle(Integer.parseInt(textField.getText()));
				article.GetArticle(table);
				
				if (rdbtnNewRadioButton.isSelected()) {
					article.GetArticle(table, "code_article"); } else if (rdbtnNewRadioButton_1.isSelected()) {
					article.GetArticle(table, "categorie");
					} else {
					article.GetArticle(table);
					}
			}
		});
	}
}
