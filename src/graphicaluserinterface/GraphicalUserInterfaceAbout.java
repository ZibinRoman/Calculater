package graphicaluserinterface;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class GraphicalUserInterfaceAbout extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3531710176262699575L;
	/**
	 * 
	 */
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void start() {
		try {
			GraphicalUserInterfaceAbout dialog = new GraphicalUserInterfaceAbout();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GraphicalUserInterfaceAbout() {
		setTitle("\u041E \u043F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u0435");
		setBounds(100, 100, 510, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{150, 278, 0};
		gbl_contentPanel.rowHeights = new int[]{228, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		JPanel panel_0 = new JPanel();
		GridBagConstraints gbc_panel_0 = new GridBagConstraints();
		gbc_panel_0.insets = new Insets(0, 0, 5, 5);
		gbc_panel_0.fill = GridBagConstraints.BOTH;
		gbc_panel_0.gridx = 0;
		gbc_panel_0.gridy = 0;
		contentPanel.add(panel_0, gbc_panel_0);
		GridBagLayout gbl_panel_0 = new GridBagLayout();
		gbl_panel_0.columnWidths = new int[]{0, 0};
		gbl_panel_0.rowHeights = new int[]{0, 0, 0};
		gbl_panel_0.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_0.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_0.setLayout(gbl_panel_0);
		
		JLabel lblNewLabel = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_0.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_Icon = new JLabel("");
		lblNewLabel_Icon.setIcon(new ImageIcon("textures/About.jpg"));
		GridBagConstraints gbc_lblNewLabel_Icon = new GridBagConstraints();
		gbc_lblNewLabel_Icon.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_Icon.gridx = 0;
		gbc_lblNewLabel_Icon.gridy = 1;
		panel_0.add(lblNewLabel_Icon, gbc_lblNewLabel_Icon);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		contentPanel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u041A\u0430\u043B\u044C\u043A\u0443\u043B\u0442\u043E\u0440 \u043A\u0432\u0430\u0440\u043F\u043B\u0430\u0442\u044B");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0412\u0435\u0440\u0441\u0438\u044F (03-2020) 1.0.0.0 Zeta");
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEFT);
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0420\u0430\u0437\u0440\u0430\u0431\u043E\u0442\u0447\u0438\u043A: \u0417\u044B\u0431\u0438\u043D \u0420\u043E\u043C\u0430\u043D \u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u0412\u0438\u0437\u0443\u0430\u043B\u044C\u043D\u044B\u0435 \u044D\u0444\u0444\u0435\u043A\u0442\u044B: \u0417\u044B\u0431\u0438\u043D \u0420\u043E\u043C\u0430\u043D \u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 4;
		panel_1.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0413\u0440\u0430\u0444\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0438\u043D\u0442\u0435\u0440\u0444\u0435\u0439\u0441: \u0417\u044B\u0431\u0438\u043D \u0420\u043E\u043C\u0430\u043D \u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 5;
		panel_1.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("\u041C\u043E\u0434\u0435\u043B\u0438\u0440\u043E\u0432\u0430\u043D\u0438\u0435: \u0417\u044B\u0431\u0438\u043D \u0420\u043E\u043C\u0430\u043D \u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 6;
		panel_1.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\u041F\u0440\u043E\u0433\u0440\u0430\u043C\u043C\u043D\u044B\u0439 \u043A\u043E\u0434: \u0417\u044B\u0431\u0438\u043D \u0420\u043E\u043C\u0430\u043D \u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 7;
		panel_1.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("\u041C\u0430\u0442\u0435\u043C\u0430\u0442\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u043C\u043E\u0434\u0435\u043B\u0438: \u0417\u044B\u0431\u0438\u043D \u0420\u043E\u043C\u0430\u043D \u0421\u0442\u0435\u043F\u0430\u043D\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 8;
		panel_1.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\u041A\u043E\u043C\u043C\u0435\u043D\u0442\u0430\u0440\u0438\u0438: \u0413\u043B\u0443\u0448\u043A\u043E\u0432 \u0410\u0440\u0442\u0435\u043C \u0412\u0430\u043B\u0435\u0440\u044C\u0435\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 9;
		panel_1.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("\u0422\u0430\u043B\u0438\u0441\u043C\u0430\u043D: \u0420\u0430\u0444\u0438\u043A\u043E\u0432 \u0410\u0440\u0441\u043B\u0430\u043D \u0418\u043B\u044C\u0444\u0430\u0442\u043E\u0432\u0438\u0447");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_11.gridx = 0;
		gbc_lblNewLabel_11.gridy = 10;
		panel_1.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("\u041B\u0438\u0446\u0435\u043D\u0437\u0438\u044F: open-source software");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_12.gridx = 0;
		gbc_lblNewLabel_12.gridy = 11;
		panel_1.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel(" ");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.gridx = 0;
		gbc_lblNewLabel_13.gridy = 12;
		panel_1.add(lblNewLabel_13, gbc_lblNewLabel_13);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
