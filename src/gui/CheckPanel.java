package gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import database.GuiStrings;
import javax.swing.border.*;

public class CheckPanel extends JPanel {

	private static final long serialVersionUID = -6192899335398206441L;
	private ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();

	public CheckPanel(int iterator) {
		GuiStrings string = new GuiStrings();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowWeights = new double[]{0.0, 1.0};
		gridBagLayout.columnWeights = new double[]{1.0};
		setLayout(gridBagLayout);
		JLabel lblNewLabel = new JLabel(string.getPanelListText().get(iterator));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		ArrayList<GridBagConstraints> gbcCheckBoxList = new ArrayList<GridBagConstraints>();
		for (int i = 0; i < 10; i++) {
			getCheckBoxList().add(i, new JCheckBox(string.getCheckBoxListText().get(i)));
			gbcCheckBoxList.add(i, new GridBagConstraints());
			gbcCheckBoxList.get(i).fill = GridBagConstraints.BOTH;
			gbcCheckBoxList.get(i).gridx = 0;
			gbcCheckBoxList.get(i).gridy = i;
			panel.add(getCheckBoxList().get(i), gbcCheckBoxList.get(i));
		}
		for (int i = 10; i < 19; i++) {
			getCheckBoxList().add(i, new JCheckBox(string.getCheckBoxListText().get(i)));
			gbcCheckBoxList.add(i, new GridBagConstraints());
			gbcCheckBoxList.get(i).fill = GridBagConstraints.BOTH;
			gbcCheckBoxList.get(i).gridx = 1;
			gbcCheckBoxList.get(i).gridy = i-10;
			panel.add(getCheckBoxList().get(i), gbcCheckBoxList.get(i));
		}
	}

	public ArrayList<JCheckBox> getCheckBoxList() {
		return checkBoxList;
	}

	public void setCheckBoxList(ArrayList<JCheckBox> checkBoxList) {
		this.checkBoxList = checkBoxList;
	}

	
	
}
