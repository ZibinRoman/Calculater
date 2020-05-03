package gui;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class TextFieldTotalPanel extends JPanel {

	private static final long serialVersionUID = 119992317524412365L;
	private TextFieldPanel panel = new TextFieldPanel(1);
	private TotalPanel panel_1; 

	public TextFieldTotalPanel(CheckPanel checkPanel, TextFieldPanelEnergy textFieldPanelEnergy) {
		
		panel_1 = new TotalPanel(checkPanel, textFieldPanelEnergy, panel);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);
		
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		add(panel_1, gbc_panel_1);

	}

	public TextFieldPanel getPanel() {
		return panel;
	}

	public void setPanel(TextFieldPanel panel) {
		this.panel = panel;
	}

	public TotalPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(TotalPanel panel_1) {
		this.panel_1 = panel_1;
	}

}
