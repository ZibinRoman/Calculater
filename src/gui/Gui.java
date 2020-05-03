package gui;

import java.awt.*;
import javax.swing.*;
import database.GuiStrings;

public class Gui {

	private JFrame frame;
		
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		GuiStrings string = new GuiStrings();
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle(string.getTitle());
		frame.setBounds(100, 100, 800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{10, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{10, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
				
		CheckPanel checkPanel= new CheckPanel(0);
		GridBagConstraints gbc_checkPanel = new GridBagConstraints();
		gbc_checkPanel.fill = GridBagConstraints.HORIZONTAL;
		gbc_checkPanel.anchor = GridBagConstraints.NORTH;
		gbc_checkPanel.insets = new Insets(0, 0, 5, 5);
		gbc_checkPanel.gridx = 0;
		gbc_checkPanel.gridy = 0;
		frame.getContentPane().add(checkPanel, gbc_checkPanel);
		
		TextFieldPanelEnergy textFieldPanelEnergy = new TextFieldPanelEnergy(2);
		GridBagConstraints gbcTextFieldPanelEnergyl = new GridBagConstraints();
		gbcTextFieldPanelEnergyl.anchor = GridBagConstraints.NORTHWEST;
		gbcTextFieldPanelEnergyl.insets = new Insets(0, 0, 5, 5);
		gbcTextFieldPanelEnergyl.gridx = 2;
		gbcTextFieldPanelEnergyl.gridy = 0;
		frame.getContentPane().add(textFieldPanelEnergy, gbcTextFieldPanelEnergyl);
		
		TextFieldTotalPanel textFieldPanel = new TextFieldTotalPanel(checkPanel, textFieldPanelEnergy);
		GridBagConstraints gbcTextFieldPanel = new GridBagConstraints();
		gbcTextFieldPanel.fill = GridBagConstraints.HORIZONTAL;
		gbcTextFieldPanel.anchor = GridBagConstraints.NORTH;
		gbcTextFieldPanel.insets = new Insets(0, 0, 5, 5);
		gbcTextFieldPanel.gridx = 1;
		gbcTextFieldPanel.gridy = 0;
		frame.getContentPane().add(textFieldPanel, gbcTextFieldPanel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(panel_1, gbc_panel_1);
	}
		
}
