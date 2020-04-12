package graphicaluserinterface;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import database.Library;
import function.Function;
import function.Save;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import static function.Function.*;
import static javax.swing.JOptionPane.*;
import static database.Strings.*;
import static database.Log.*;
import static java.util.logging.Level.*;
/**
 * @author Roman
 *
 */
public class GraphicalUserInterface {
	//TODO
	private JFrame frmRentCalc;
	private JTextField textField_1_0;
	private JTextField textField_1_1;
	private JTextField textField_1_2;
	private JTextField textField_2_0;
	private JTextField textField_2_1;
	private JTextField textField_4;
	private boolean err = false;

	private ArrayList<JCheckBox> vd = new ArrayList<JCheckBox>();
	private ArrayList<JTextField> vt = new ArrayList<JTextField>();
	private ArrayList<JTextField> et = new ArrayList<JTextField>();
	private ArrayList<JLabel> vl = new ArrayList<JLabel>();
	private ArrayList<JLabel> el = new ArrayList<JLabel>();
	private ArrayList<JRadioButton> er = new ArrayList<JRadioButton>();
	
	private JButton btnNewButton_1;
	private JButton btnNewButton_0;
	private JTextField textField_6_0_0;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_5_1_0;
	private JTextField textField_5_1_1;
	private JTextField textField_5_1_2;
	private JLabel lblNewLabel_5_1_0;
	private JLabel lblNewLabel_5_1_1;
	private JLabel lblNewLabel_5_1_2;
	private int toggle = 0; 
	private JRadioButton rdbtnNewRadioButton_0;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel_1_0;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_2_0;
	private JLabel lblNewLabel_6_0_0;
	private JLabel lblNewLabel_2_1;


	/**
	 * Launch the application.
	 */
	public static void start() {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphicalUserInterface window = new GraphicalUserInterface();
					window.frmRentCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GraphicalUserInterface() {
		// TODO Auto-generated method stub
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// TODO Auto-generated method stub
		frmRentCalc = new JFrame();
		frmRentCalc.setResizable(false);
		frmRentCalc.setTitle("\u0420\u0430\u0441\u0447\u0435\u0442 \u043A\u0432\u0430\u0440\u043F\u043B\u0430\u0442\u044B");
		frmRentCalc.setBounds(100, 100, 765, 540);
		frmRentCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRentCalc.getContentPane().setLayout(null);
		
		JPanel panel_0 = new JPanel();
		panel_0.setToolTipText("\u0423\u0441\u043B\u0443\u0433\u0438");
		panel_0.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_0.setBounds(10, 10, 170, 460);
		frmRentCalc.getContentPane().add(panel_0);
		panel_0.setLayout(null);
		
		JLabel lblLabel_0 = new JLabel("  \u0423\u0441\u043B\u0443\u0433\u0438");
		lblLabel_0.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLabel_0.setBounds(0, 0, 170, 14);
		panel_0.add(lblLabel_0);
		
		JPanel panel_0_0 = new JPanel();
		panel_0_0.setBounds(10, 25, 150, 425);
		panel_0.add(panel_0_0);
		GridBagLayout gbl_panel_0_0 = new GridBagLayout();
		gbl_panel_0_0.columnWidths = new int[]{0, 0};
		gbl_panel_0_0.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_0_0.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_0_0.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_0_0.setLayout(gbl_panel_0_0);
		
		JCheckBox chckbxNewCheckBox_0 = new JCheckBox("\u0421\u043E\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435");
		GridBagConstraints gbc_chckbxNewCheckBox_0 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_0.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_0.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_0.gridx = 0;
		gbc_chckbxNewCheckBox_0.gridy = 0;
		panel_0_0.add(chckbxNewCheckBox_0, gbc_chckbxNewCheckBox_0);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\u0423\u0431. \u043C\u0435\u0441\u0442 \u043E\u0431\u0449. \u043F\u043E\u043B\u044C\u0437.");
		GridBagConstraints gbc_chckbxNewCheckBox_1 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_1.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_1.gridx = 0;
		gbc_chckbxNewCheckBox_1.gridy = 1;
		panel_0_0.add(chckbxNewCheckBox_1, gbc_chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\u0425\u0412\u0421 \u043F\u0440\u0438 \u0421\u041E\u0418");
		GridBagConstraints gbc_chckbxNewCheckBox_2 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_2.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_2.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_2.gridx = 0;
		gbc_chckbxNewCheckBox_2.gridy = 2;
		panel_0_0.add(chckbxNewCheckBox_2, gbc_chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("\u0425\u0412 \u043D\u0430 \u0413\u0412\u0421 \u043F\u0440\u0438 \u0421\u041E\u0418");
		GridBagConstraints gbc_chckbxNewCheckBox_3 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_3.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_3.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_3.gridx = 0;
		gbc_chckbxNewCheckBox_3.gridy = 3;
		panel_0_0.add(chckbxNewCheckBox_3, gbc_chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\u0422\u042D \u0413\u0412\u0421 \u043F\u0440\u0438 \u0421\u041E\u0418");
		GridBagConstraints gbc_chckbxNewCheckBox_4 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_4.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_4.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_4.gridx = 0;
		gbc_chckbxNewCheckBox_4.gridy = 4;
		panel_0_0.add(chckbxNewCheckBox_4, gbc_chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("\u041E\u0442\u0432. \u0441\u0442. \u0432. \u0425 \u043F\u0440\u0438 \u0421\u041E\u0418");
		GridBagConstraints gbc_chckbxNewCheckBox_5 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_5.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_5.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_5.gridx = 0;
		gbc_chckbxNewCheckBox_5.gridy = 5;
		panel_0_0.add(chckbxNewCheckBox_5, gbc_chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("\u041E\u0442\u0432. \u0441\u0442. \u0432. \u0413 \u043F\u0440\u0438 \u0421\u041E\u0418");
		GridBagConstraints gbc_chckbxNewCheckBox_6 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_6.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_6.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_6.gridx = 0;
		gbc_chckbxNewCheckBox_6.gridy = 6;
		panel_0_0.add(chckbxNewCheckBox_6, gbc_chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("\u042D\u043B. \u044D\u043D. \u043F\u0440\u0438 \u0421\u041E\u0418");
		GridBagConstraints gbc_chckbxNewCheckBox_7 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_7.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_7.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_7.gridx = 0;
		gbc_chckbxNewCheckBox_7.gridy = 7;
		panel_0_0.add(chckbxNewCheckBox_7, gbc_chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("\u041E\u0442\u043E\u043F\u043B\u0435\u043D\u0438\u0435");
		GridBagConstraints gbc_chckbxNewCheckBox_8 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_8.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_8.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_8.gridx = 0;
		gbc_chckbxNewCheckBox_8.gridy = 8;
		panel_0_0.add(chckbxNewCheckBox_8, gbc_chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("\u0425\u043E\u043B. \u0432\u043E\u0434\u043E\u0441\u043D\u0430\u0431\u0436\u0435\u043D\u0438\u0435");
		GridBagConstraints gbc_chckbxNewCheckBox_9 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_9.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_9.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_9.gridx = 0;
		gbc_chckbxNewCheckBox_9.gridy = 9;
		panel_0_0.add(chckbxNewCheckBox_9, gbc_chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("\u0425\u0412 \u043D\u0430 \u043D\u0443\u0436\u0434\u044B \u0413\u0412\u0421");
		GridBagConstraints gbc_chckbxNewCheckBox_10 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_10.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_10.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_10.gridx = 0;
		gbc_chckbxNewCheckBox_10.gridy = 10;
		panel_0_0.add(chckbxNewCheckBox_10, gbc_chckbxNewCheckBox_10);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("\u0422\u0435\u043F\u043B. \u044D\u043D\u0435\u0440\u0433\u0438\u044F \u0413\u0412\u0421");
		GridBagConstraints gbc_chckbxNewCheckBox_11 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_11.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_11.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_11.gridx = 0;
		gbc_chckbxNewCheckBox_11.gridy = 11;
		panel_0_0.add(chckbxNewCheckBox_11, gbc_chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("\u041E\u0442\u0432. \u0441\u0442\u043E\u0447. \u0432\u043E\u0434 \u0425\u0412");
		GridBagConstraints gbc_chckbxNewCheckBox_12 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_12.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_12.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_12.gridx = 0;
		gbc_chckbxNewCheckBox_12.gridy = 12;
		panel_0_0.add(chckbxNewCheckBox_12, gbc_chckbxNewCheckBox_12);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("\u041E\u0442\u0432. \u0441\u0442\u043E\u0447. \u0432\u043E\u0434 \u0413\u0412");
		GridBagConstraints gbc_chckbxNewCheckBox_13 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_13.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_13.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_13.gridx = 0;
		gbc_chckbxNewCheckBox_13.gridy = 13;
		panel_0_0.add(chckbxNewCheckBox_13, gbc_chckbxNewCheckBox_13);
		
		JCheckBox chckbxNewCheckBox_14 = new JCheckBox("\u041E\u0431\u0440\u0430\u0449\u0435\u043D\u0438\u0435 \u0441 \u0422\u041A\u041E");
		GridBagConstraints gbc_chckbxNewCheckBox_14 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_14.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_14.gridx = 0;
		gbc_chckbxNewCheckBox_14.gridy = 14;
		panel_0_0.add(chckbxNewCheckBox_14, gbc_chckbxNewCheckBox_14);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(190, 10, 270, 105);
		frmRentCalc.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLabel_1 = new JLabel("  \u0421\u0447\u0435\u0442\u0447\u0438\u043A \u0432\u043E\u0434\u044B");
		lblLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLabel_1.setBounds(0, 0, 270, 14);
		panel_1.add(lblLabel_1);
		
		JPanel panel_1_0 = new JPanel();
		panel_1_0.setBounds(10, 25, 250, 70);
		panel_1.add(panel_1_0);
		GridBagLayout gbl_panel_1_0 = new GridBagLayout();
		gbl_panel_1_0.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1_0.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1_0.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1_0.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1_0.setLayout(gbl_panel_1_0);
		
		lblNewLabel_1_0 = new JLabel("\u041E\u0442\u043E\u043F\u043B\u0435\u043D\u0438\u0435");
		GridBagConstraints gbc_lblNewLabel_1_0 = new GridBagConstraints();
		gbc_lblNewLabel_1_0.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1_0.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_0.gridx = 0;
		gbc_lblNewLabel_1_0.gridy = 0;
		panel_1_0.add(lblNewLabel_1_0, gbc_lblNewLabel_1_0);
		
		textField_1_0 = new JTextField();
		textField_1_0.setToolTipText("");
		textField_1_0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, vt.get(1));
			}
		});
		GridBagConstraints gbc_textField_1_0 = new GridBagConstraints();
		gbc_textField_1_0.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1_0.fill = GridBagConstraints.BOTH;
		gbc_textField_1_0.gridx = 1;
		gbc_textField_1_0.gridy = 0;
		panel_1_0.add(textField_1_0, gbc_textField_1_0);
		textField_1_0.setColumns(10);
		
		lblNewLabel_1_1 = new JLabel("\u0425\u043E\u043B\u043E\u0434\u043D\u0430\u044F \u0432\u043E\u0434\u0430");
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 0;
		gbc_lblNewLabel_1_1.gridy = 1;
		panel_1_0.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		textField_1_1 = new JTextField();
		textField_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, vt.get(2));
			}
		});
		GridBagConstraints gbc_textField_1_1 = new GridBagConstraints();
		gbc_textField_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1_1.gridx = 1;
		gbc_textField_1_1.gridy = 1;
		panel_1_0.add(textField_1_1, gbc_textField_1_1);
		textField_1_1.setColumns(10);
		
		lblNewLabel_1_2 = new JLabel("\u0413\u043E\u0440\u044F\u0447\u0430\u044F \u0432\u043E\u0434\u0430");
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1_2.gridx = 0;
		gbc_lblNewLabel_1_2.gridy = 2;
		panel_1_0.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		textField_1_2 = new JTextField();
		textField_1_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, vt.get(3));
			}
		});
		GridBagConstraints gbc_textField_1_2 = new GridBagConstraints();
		gbc_textField_1_2.fill = GridBagConstraints.BOTH;
		gbc_textField_1_2.gridx = 1;
		gbc_textField_1_2.gridy = 2;
		panel_1_0.add(textField_1_2, gbc_textField_1_2);
		textField_1_2.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(190, 125, 270, 85);
		frmRentCalc.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblLabel_2 = new JLabel("  \u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440\u044B \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u044B");
		lblLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLabel_2.setBounds(0, 0, 270, 14);
		panel_2.add(lblLabel_2);
		
		JPanel panel_2_0 = new JPanel();
		panel_2_0.setBounds(10, 25, 250, 50);
		panel_2.add(panel_2_0);
		GridBagLayout gbl_panel_2_0 = new GridBagLayout();
		gbl_panel_2_0.columnWidths = new int[]{0, 0, 0};
		gbl_panel_2_0.rowHeights = new int[]{0, 0, 0};
		gbl_panel_2_0.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2_0.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_2_0.setLayout(gbl_panel_2_0);
		
		lblNewLabel_2_0 = new JLabel("\u041F\u043B\u043E\u0449\u0430\u0434\u044C");
		GridBagConstraints gbc_lblNewLabel_2_0 = new GridBagConstraints();
		gbc_lblNewLabel_2_0.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2_0.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2_0.gridx = 0;
		gbc_lblNewLabel_2_0.gridy = 0;
		panel_2_0.add(lblNewLabel_2_0, gbc_lblNewLabel_2_0);
		
		textField_2_0 = new JTextField();
		textField_2_0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, vt.get(0));
			}
		});
		GridBagConstraints gbc_textField_2_0 = new GridBagConstraints();
		gbc_textField_2_0.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2_0.fill = GridBagConstraints.BOTH;
		gbc_textField_2_0.gridx = 1;
		gbc_textField_2_0.gridy = 0;
		panel_2_0.add(textField_2_0, gbc_textField_2_0);
		textField_2_0.setColumns(10);
		
		lblNewLabel_2_1 = new JLabel("\u0416\u0438\u043B\u044C\u0446\u044B");
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2_1.gridx = 0;
		gbc_lblNewLabel_2_1.gridy = 1;
		panel_2_0.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		
		textField_2_1 = new JTextField();
		textField_2_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e,textField_2_1);
			}
		});
		GridBagConstraints gbc_textField_2_1 = new GridBagConstraints();
		gbc_textField_2_1.fill = GridBagConstraints.BOTH;
		gbc_textField_2_1.gridx = 1;
		gbc_textField_2_1.gridy = 1;
		panel_2_0.add(textField_2_1, gbc_textField_2_1);
		textField_2_1.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(190, 220, 270, 95);
		frmRentCalc.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblLabel_3 = new JLabel("  \u041F\u0440\u043E\u0447\u0438\u0435");
		lblLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLabel_3.setBounds(0, 0, 270, 14);
		panel_3.add(lblLabel_3);
		
		JPanel panel_3_0 = new JPanel();
		panel_3_0.setBounds(10, 25, 250, 60);
		panel_3.add(panel_3_0);
		GridBagLayout gbl_panel_3_0 = new GridBagLayout();
		gbl_panel_3_0.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3_0.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_3_0.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3_0.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_3_0.setLayout(gbl_panel_3_0);
		
		JCheckBox chckbxNewCheckBox_15 = new JCheckBox("\u041E\u0431\u0441\u043B. \u0422\u0410");
		GridBagConstraints gbc_chckbxNewCheckBox_15 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_15.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_15.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_15.gridx = 0;
		gbc_chckbxNewCheckBox_15.gridy = 0;
		panel_3_0.add(chckbxNewCheckBox_15, gbc_chckbxNewCheckBox_15);
		
		JCheckBox chckbxNewCheckBox_18 = new JCheckBox("\u0413\u0430\u0437");
		GridBagConstraints gbc_chckbxNewCheckBox_18 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_18.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_18.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_18.gridx = 1;
		gbc_chckbxNewCheckBox_18.gridy = 0;
		panel_3_0.add(chckbxNewCheckBox_18, gbc_chckbxNewCheckBox_18);
		
		JCheckBox chckbxNewCheckBox_16 = new JCheckBox("\u0417\u041F\u0423");
		GridBagConstraints gbc_chckbxNewCheckBox_16 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_16.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_16.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox_16.gridx = 0;
		gbc_chckbxNewCheckBox_16.gridy = 1;
		panel_3_0.add(chckbxNewCheckBox_16, gbc_chckbxNewCheckBox_16);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(190, 335, 270, 114);
		frmRentCalc.getContentPane().add(panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{46, 0, 0};
		gbl_panel_4.rowHeights = new int[]{14, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblLabel_4 = new JLabel("  \u0418\u0442\u043E\u0433\u043E:");
		lblLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblLabel_4 = new GridBagConstraints();
		gbc_lblLabel_4.fill = GridBagConstraints.BOTH;
		gbc_lblLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_4.gridx = 0;
		gbc_lblLabel_4.gridy = 0;
		panel_4.add(lblLabel_4, gbc_lblLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e,textField_4);
			}
		});
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 0;
		panel_4.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		
		
		JCheckBox chckbxNewCheckBox_17 = new JCheckBox("\u0420\u0430\u0434\u0438\u043E");
		GridBagConstraints gbc_chckbxNewCheckBox_17 = new GridBagConstraints();
		gbc_chckbxNewCheckBox_17.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox_17.fill = GridBagConstraints.BOTH;
		gbc_chckbxNewCheckBox_17.gridx = 1;
		gbc_chckbxNewCheckBox_17.gridy = 1;
		panel_3_0.add(chckbxNewCheckBox_17, gbc_chckbxNewCheckBox_17);
		
		vd.add(0, chckbxNewCheckBox_0);
		vd.add(1, chckbxNewCheckBox_1);
		vd.add(2, chckbxNewCheckBox_2);
		vd.add(3, chckbxNewCheckBox_3);
		vd.add(4, chckbxNewCheckBox_4);
		vd.add(5, chckbxNewCheckBox_5);
		vd.add(6, chckbxNewCheckBox_6);
		vd.add(7, chckbxNewCheckBox_7);
		vd.add(8, chckbxNewCheckBox_8);
		vd.add(9, chckbxNewCheckBox_9);
		vd.add(10, chckbxNewCheckBox_10);
		vd.add(11, chckbxNewCheckBox_11);
		vd.add(12, chckbxNewCheckBox_12);
		vd.add(13, chckbxNewCheckBox_13);
		vd.add(14, chckbxNewCheckBox_14);
		vd.add(15, chckbxNewCheckBox_15);
		vd.add(16, chckbxNewCheckBox_16);
		vd.add(17, chckbxNewCheckBox_17);
		vd.add(18, chckbxNewCheckBox_18);
		
		btnNewButton_0 = new JButton("\u0420\u0430\u0441\u0441\u0447\u0438\u0442\u0430\u0442\u044C");
		btnNewButton_0.setForeground(new Color(0, 0, 0));
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					// TODO: handle exception
					Function.initialize(vd, vt, vl, toggle, et, el);
					activateSaveBP(get(false));
				} catch (Exception ex) {
					// TODO: handle exception
					setErr(true);
				} finally {
					// TODO: handle exception
					if (!Function.isError()) {
						textField_4.setText(String.valueOf(Function.getValue()));
						activateSaveBP(get(true));
					}
				} 
			}
		});
		GridBagConstraints gbc_btnNewButton_0 = new GridBagConstraints();
		gbc_btnNewButton_0.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_0.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_0.gridx = 0;
		gbc_btnNewButton_0.gridy = 1;
		panel_4.add(btnNewButton_0, gbc_btnNewButton_0);
		
		btnNewButton_1 = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					Save.initialize(getA1(), getA2(), getA3(), getA4(), getB1(), getB2(), getB3(), getB4(), toggle);
				} catch (Exception ex) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton_1.setVisible(false);
		
		JButton btnNewButton = new JButton("\u0412\u0441\u0435 \u0443\u0441\u043B\u0443\u0433\u0438");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO: handle exception
				logp(INFO, getClassName(GraphicalUserInterface.class), "actionPerformed", "Выбор всех");
				for (JCheckBox v : vd) {
					v.setSelected(get(true));
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 1;
		panel_4.add(btnNewButton, gbc_btnNewButton);
		btnNewButton_1.setEnabled(false);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panel_4.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(470, 10, 270, 200);
		frmRentCalc.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_5_0 = new JLabel("  \u0422\u0430\u0440\u0438\u0444 \u044D\u043B\u0435\u043A\u0442\u0440\u0438\u0447\u0435\u0441\u0442\u0432\u0430");
		lblNewLabel_5_0.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_0.setBounds(0, 0, 270, 14);
		panel_5.add(lblNewLabel_5_0);
		
		JPanel panel_5_0 = new JPanel();
		panel_5_0.setBounds(10, 25, 250, 70);
		panel_5.add(panel_5_0);
		GridBagLayout gbl_panel_5_0 = new GridBagLayout();
		gbl_panel_5_0.columnWidths = new int[]{0, 0};
		gbl_panel_5_0.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_5_0.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_5_0.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_5_0.setLayout(gbl_panel_5_0);
		
		rdbtnNewRadioButton_0 = new JRadioButton("\u041E\u0434\u043D\u043E\u0441\u0442\u0430\u0432\u043E\u0447\u043D\u044B\u0439 \u0442\u0430\u0440\u0438\u0444");
		rdbtnNewRadioButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toggle = 1;
				toggle(toggle);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_0);
		GridBagConstraints gbc_rdbtnNewRadioButton_0 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_0.fill = GridBagConstraints.BOTH;
		gbc_rdbtnNewRadioButton_0.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_0.gridx = 0;
		gbc_rdbtnNewRadioButton_0.gridy = 0;
		panel_5_0.add(rdbtnNewRadioButton_0, gbc_rdbtnNewRadioButton_0);
		
		rdbtnNewRadioButton_1 = new JRadioButton("\u0422\u0430\u0440\u0438\u0444 \u043F\u043E \u0434\u0432\u0443\u043C \u0437\u043E\u043D\u0430\u043C");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toggle = 2;
				toggle(toggle);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.fill = GridBagConstraints.BOTH;
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 1;
		panel_5_0.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("\u0422\u0430\u0440\u0438\u0444 \u043F\u043E \u0442\u0440\u0435\u043C \u0437\u043E\u043D\u0430\u043C");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				toggle = 3;
				toggle(toggle);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_2);
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.fill = GridBagConstraints.BOTH;
		gbc_rdbtnNewRadioButton_2.gridx = 0;
		gbc_rdbtnNewRadioButton_2.gridy = 2;
		panel_5_0.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBounds(10, 115, 250, 70);
		panel_5.add(panel_5_1);
		GridBagLayout gbl_panel_5_1 = new GridBagLayout();
		gbl_panel_5_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_5_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5_1.setLayout(gbl_panel_5_1);
		
		lblNewLabel_5_1_0 = new JLabel("\u0422\u0430\u0440\u0438\u0444\u043D\u0430\u044F \u0437\u043E\u043D\u0430 1");
		GridBagConstraints gbc_lblNewLabel_5_1_0 = new GridBagConstraints();
		gbc_lblNewLabel_5_1_0.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_1_0.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5_1_0.gridx = 0;
		gbc_lblNewLabel_5_1_0.gridy = 0;
		panel_5_1.add(lblNewLabel_5_1_0, gbc_lblNewLabel_5_1_0);
		
		textField_5_1_0 = new JTextField();
		textField_5_1_0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, et.get(0));
			}
		});
		GridBagConstraints gbc_textField_5_1_0 = new GridBagConstraints();
		gbc_textField_5_1_0.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5_1_0.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5_1_0.gridx = 1;
		gbc_textField_5_1_0.gridy = 0;
		panel_5_1.add(textField_5_1_0, gbc_textField_5_1_0);
		textField_5_1_0.setColumns(10);
		
		lblNewLabel_5_1_1 = new JLabel("\u0422\u0430\u0440\u0438\u0444\u043D\u0430\u044F \u0437\u043E\u043D\u0430 2");
		lblNewLabel_5_1_1.setEnabled(false);
		lblNewLabel_5_1_1.setVisible(false);
		GridBagConstraints gbc_lblNewLabel_5_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_1_1.gridx = 0;
		gbc_lblNewLabel_5_1_1.gridy = 1;
		panel_5_1.add(lblNewLabel_5_1_1, gbc_lblNewLabel_5_1_1);
		
		textField_5_1_1 = new JTextField();
		textField_5_1_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, et.get(1));
			}
		});
		textField_5_1_1.setEnabled(false);
		textField_5_1_1.setVisible(false);
		GridBagConstraints gbc_textField_5_1_1 = new GridBagConstraints();
		gbc_textField_5_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5_1_1.gridx = 1;
		gbc_textField_5_1_1.gridy = 1;
		panel_5_1.add(textField_5_1_1, gbc_textField_5_1_1);
		textField_5_1_1.setColumns(10);
		
		lblNewLabel_5_1_2 = new JLabel("\u0422\u0430\u0440\u0438\u0444\u043D\u0430\u044F \u0437\u043E\u043D\u0430 3");
		lblNewLabel_5_1_2.setEnabled(false);
		lblNewLabel_5_1_2.setVisible(false);
		GridBagConstraints gbc_lblNewLabel_5_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_5_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5_1_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_5_1_2.gridx = 0;
		gbc_lblNewLabel_5_1_2.gridy = 2;
		panel_5_1.add(lblNewLabel_5_1_2, gbc_lblNewLabel_5_1_2);
		
		textField_5_1_2 = new JTextField();
		textField_5_1_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, et.get(2));
			}
		});
		textField_5_1_2.setEnabled(false);
		textField_5_1_2.setVisible(false);
		GridBagConstraints gbc_textField_5_1_2 = new GridBagConstraints();
		gbc_textField_5_1_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5_1_2.gridx = 1;
		gbc_textField_5_1_2.gridy = 2;
		panel_5_1.add(textField_5_1_2, gbc_textField_5_1_2);
		textField_5_1_2.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("  \u0421\u0447\u0435\u0442\u0447\u0438\u043A \u044D\u043B\u0435\u043A\u0442\u0440\u0438\u0447\u0435\u0441\u0442\u0432\u0430");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(0, 100, 270, 14);
		panel_5.add(lblNewLabel_5_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(470, 220, 270, 95);
		frmRentCalc.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6_0 = new JLabel("  \u0421\u0447\u0435\u0442\u0447\u0438\u043A \u0433\u0430\u0437\u0430");
		lblNewLabel_6_0.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_0.setBounds(0, 0, 270, 14);
		panel_6.add(lblNewLabel_6_0);
		
		JPanel panel_6_0 = new JPanel();
		panel_6_0.setBounds(10, 25, 250, 60);
		panel_6.add(panel_6_0);
		GridBagLayout gbl_panel_6_0 = new GridBagLayout();
		gbl_panel_6_0.columnWidths = new int[]{0, 0, 0};
		gbl_panel_6_0.rowHeights = new int[]{0, 0};
		gbl_panel_6_0.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6_0.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_6_0.setLayout(gbl_panel_6_0);
		
		lblNewLabel_6_0_0 = new JLabel("\u0413\u0430\u0437");
		GridBagConstraints gbc_lblNewLabel_6_0_0 = new GridBagConstraints();
		gbc_lblNewLabel_6_0_0.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6_0_0.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6_0_0.gridx = 0;
		gbc_lblNewLabel_6_0_0.gridy = 0;
		panel_6_0.add(lblNewLabel_6_0_0, gbc_lblNewLabel_6_0_0);
		
		textField_6_0_0 = new JTextField();
		textField_6_0_0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				event(e, vt.get(4));
			}
		});
		GridBagConstraints gbc_textField_6_0_0 = new GridBagConstraints();
		gbc_textField_6_0_0.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6_0_0.gridx = 1;
		gbc_textField_6_0_0.gridy = 0;
		panel_6_0.add(textField_6_0_0, gbc_textField_6_0_0);
		textField_6_0_0.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		frmRentCalc.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_0 = new JMenu("\u041D\u0430\u0432\u0438\u0433\u0430\u0446\u0438\u044F");
		menuBar.add(mnNewMenu_0);
		
		JMenuItem mntmNewMenuItem_0_0 = new JMenuItem("\u0417\u0430\u0433\u043E\u0442\u043E\u0432\u043A\u0430");
		mnNewMenu_0.add(mntmNewMenuItem_0_0);
		
		JMenuItem mntmNewMenuItem_0_1 = new JMenuItem("\u0417\u0430\u0433\u043E\u0442\u043E\u0432\u043A\u0430");
		mnNewMenu_0.add(mntmNewMenuItem_0_1);
		
		JSeparator separator_0 = new JSeparator();
		mnNewMenu_0.add(separator_0);
		
		JMenuItem mntmNewMenuItem_0_2 = new JMenuItem("\u0412\u044B\u0439\u0442\u0438");
		mntmNewMenuItem_0_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialogExit();
			}
		});
		mnNewMenu_0.add(mntmNewMenuItem_0_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u041F\u043E\u043C\u043E\u0449\u044C");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1_0 = new JMenuItem("\u041B\u0438\u0446\u0435\u043D\u0437\u0438\u043E\u043D\u043D\u043E\u0435 \u0441\u043E\u0433\u043B\u0430\u0448\u0435\u043D\u0438\u0435");
		mntmNewMenuItem_1_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialogLicense();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1_0);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu_1.add(separator_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("\u041E \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0435");
		mntmNewMenuItem_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialogAbout();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1_1);
		
		vt.add(0, textField_2_0);
		vt.add(1, textField_2_1);
		vt.add(2, textField_1_0);
		vt.add(3, textField_1_1);
		vt.add(4, textField_1_2);
		vt.add(5, textField_6_0_0);
		
		vl.add(0, lblNewLabel_2_0);
		vl.add(1, lblNewLabel_2_1);
		vl.add(2, lblNewLabel_1_0);
		vl.add(3, lblNewLabel_1_1);
		vl.add(4, lblNewLabel_1_2);
		vl.add(5, lblNewLabel_6_0_0);
		
		et.add(0, textField_5_1_0);
		et.add(1, textField_5_1_1);
		et.add(2, textField_5_1_2);
		
		el.add(0, lblNewLabel_5_1_0);
		el.add(1, lblNewLabel_5_1_1);
		el.add(2, lblNewLabel_5_1_2);
		
		er.add(0, rdbtnNewRadioButton_0);
		er.add(1, rdbtnNewRadioButton_1);
		er.add(2, rdbtnNewRadioButton_2);
	}
	
	public boolean getErr() {
		// TODO Auto-generated method stub
		return err;
	}
	
	public boolean get(boolean a) {
		// TODO Auto-generated method stub
		return a;
	}
	
	public void set(boolean a, boolean b) {
		// TODO Auto-generated method stub
		a = b;
	}
	
	public void setErr(boolean a) {
		// TODO Auto-generated method stub
		err = a;
	}
		
	private void event(KeyEvent e ,JTextField textField) {
		// TODO Auto-generated method stub
		char n = e.getKeyChar();
		if (!Character.isDigit(n) && n != 8 && n != 46)
		{
			logp(INFO, getClassName(GraphicalUserInterface.class), "event", "Вы ввели не числовое значение".concat(textField.getText()));
			textField.setEditable(false);
		}else {
			logp(INFO, getClassName(GraphicalUserInterface.class), "event", "Вы ввели числовое значение".concat(textField.getText()));
			textField.setEditable(true);
		}
	}
	
	private void setVisibleBP(boolean a) {
		// TODO Auto-generated method stub
		setVisible(btnNewButton_1, a);
	}
	
	private void setEnabledBP(boolean a) {
		// TODO Auto-generated method stub
		setEnabled(btnNewButton_1, a);
	}
	
	private void activateSaveBP(boolean a) {
		// TODO Auto-generated method stub
		setEnabledBP(a);
		setVisibleBP(a);
	}
	
	private void setVisible(JButton a, boolean b) {
		// TODO Auto-generated method stub
		a.setVisible(b);
	}
	
	private void setVisible(JTextField a, boolean b) {
		// TODO Auto-generated method stub
		a.setVisible(b);
	}
	
	private void setVisible(JLabel a, boolean b) {
		// TODO Auto-gen.erated method stub
		a.setVisible(b);
	}
	
	private void setEnabled(JButton a, boolean b) {
		// TODO Auto-generated method stub
		a.setEnabled(b);
	}
	
	private void setEnabled(JTextField a, boolean b) {
		// TODO Auto-generated method stub
		a.setEnabled(b);
	}
	
	private void setEnabled(JLabel a, boolean b) {
		// TODO Auto-generated method stub
		a.setEnabled(b);
	}
	
	private void toggle(int a) {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < et.size(); i++) {
				toogleOne(et.get(i), el.get(i), false);
			}
			for (int i = 0; i < toggle; i++) {
				toogleOne(et.get(i), el.get(i), true);
			}
			logp(INFO, getClassName(GraphicalUserInterface.class), "toggle", String.join(getSpace(), "T".concat(Library.toString(a)), "Activated"));
		} catch (Exception e) {
			// TODO: handle exception
			logp(INFO, getClassName(GraphicalUserInterface.class), "toggle", String.join(getSpace(), "Error", "Activated"));
		}
	}
	
	private void toogleOne(JTextField a, JLabel b, boolean c) {
		// TODO Auto-generated method stub
		setEnabled(a, get(c));
		setVisible(a, get(c));
		setEnabled(b, get(c));
		setVisible(b, get(c));
	}
	
	private void dialogExit() {
		// TODO Auto-generated method stub
		int result = showConfirmDialog(frmRentCalc, "Вы действительно ходите выйти?", "Окно подтверждения", YES_NO_OPTION, QUESTION_MESSAGE);
		if (result == YES_OPTION) {
			System.exit(0);
		} else {
			if (result == NO_OPTION) {
			}
		}
	}
	
	private void dialogAbout() {
		// TODO Auto-generated method stub
		GraphicalUserInterfaceAbout.start();
	}
	
	private void dialogLicense() {
		showMessageDialog(frmRentCalc, "Место для лицензии", "Лицензионное соглашение", INFORMATION_MESSAGE);
	}
}
