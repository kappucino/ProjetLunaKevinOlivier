package dialog;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JLabel;

public class FAccueil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FAccueil frame = new FAccueil();
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
	public FAccueil() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FAccueil.class.getResource("/images/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 846, 587);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenu mnVues = new JMenu("Vues");
		menuBar.add(mnVues);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 217, 528);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 0, 217, 66);
		panel.add(panel_2);
		
		JLabel lblSarlLuna = new JLabel("SARL Luna");
		lblSarlLuna.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_2.add(lblSarlLuna);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.GRAY);
		panel_3.setBounds(0, 419, 217, 119);
		panel.add(panel_3);
		
		JButton BoutonQuitterAccueil = new JButton("Quitter");
		panel_3.add(BoutonQuitterAccueil);
		BoutonQuitterAccueil.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		BoutonQuitterAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BoutonQuitterAccueil.setForeground(Color.BLACK);
		BoutonQuitterAccueil.setIcon(new ImageIcon(FAccueil.class.getResource("/images/connection/Stop-48.png")));
		BoutonQuitterAccueil.setBackground(Color.GRAY);
		BoutonQuitterAccueil.setContentAreaFilled(false);
		BoutonQuitterAccueil.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(215, 0, 615, 549);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(209, 179, 170, 140);
		panel_1.add(panel_4);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setRolloverEnabled(false); // turn on before rollovers work
		btnNewButton_3.setRolloverIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Diagram-128-actif.png")));
		btnNewButton_3.setRolloverSelectedIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Diagram-128-actif.png")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setSelected(!btnNewButton_3.isSelected());
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Diagram-128.png")));
		panel_4.add(btnNewButton_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(209, 24, 170, 147);
		panel_1.add(panel_5);
		
		JButton button = new JButton("");
		button.setBackground(Color.GRAY);
		button.setContentAreaFilled(false);
		button.setRolloverEnabled(false); // turn on before rollovers work
		button.setRolloverIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Product-128-actif.png")));
		button.setRolloverSelectedIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Product-128-actif.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setSelected(!button.isSelected());
			}
		});
		button.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Product-128.png")));
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 179, 165, 147);
		panel_1.add(panel_6);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/People-128.png")));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setRolloverEnabled(false); // turn on before rollovers work
		btnNewButton.setRolloverIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/People-128-actif.png")));
		btnNewButton.setRolloverSelectedIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/People-128-actif.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setSelected(!button.isSelected());
				
			   // FAccueil.this.setVisible(false);
			    Fclients frame = new Fclients();
			    frame.setVisible(true);
			}
			
		});
		panel_6.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(418, 179, 165, 147);
		panel_1.add(panel_7);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setRolloverIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Shopping-Bag-128-actif.png")));
		btnNewButton_2.setRolloverSelectedIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Shopping-Bag-128-actif.png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setSelected(!btnNewButton_2.isSelected());
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		panel_7.add(btnNewButton_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(214, 346, 165, 147);
		panel_1.add(panel_8);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setRolloverIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Settings-02-128-actif.png")));
		btnNewButton_1.setRolloverSelectedIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Settings-02-128-actif.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setSelected(!btnNewButton_1.isSelected());
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(FAccueil.class.getResource("/images/accueil/Settings-02-128.png")));
		panel_8.add(btnNewButton_1);
		
	}
}
