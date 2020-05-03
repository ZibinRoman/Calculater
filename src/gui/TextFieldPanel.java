package gui;

import javax.swing.*;

import java.awt.*;
import java.util.*;
import database.GuiStrings;
import javax.swing.border.*;

public class TextFieldPanel extends JPanel {

	private static final long serialVersionUID = -8968686479684944447L;
	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();
	private ArrayList<JTextField> textFieldList = new ArrayList<JTextField>();
	
	public TextFieldPanel(int iterator) {
		GuiStrings string = new GuiStrings();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		JLabel lblNewLabel = new JLabel(string.getPanelListText().get(iterator));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
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
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0};
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		ArrayList<GridBagConstraints> gbclabelList = new ArrayList<GridBagConstraints>();
		ArrayList<GridBagConstraints> gbctextFieldList = new ArrayList<GridBagConstraints>();
		for (int i = 0; i < 6; i++) {
			getLabelList().add(i, new JLabel(string.getListText().get(i)));
			gbclabelList.add(i, new GridBagConstraints());
			gbclabelList.get(i).gridx = 0;
			gbclabelList.get(i).gridy = i;
			panel.add(getLabelList().get(i), gbclabelList.get(i));
			getTextFieldList().add(i,  new JTextField());
			gbctextFieldList.add(i, new GridBagConstraints());
			gbctextFieldList.get(i).gridx = 1;
			gbctextFieldList.get(i).gridy = i;
			panel.add(getTextFieldList().get(i), gbctextFieldList.get(i));
			getTextFieldList().get(i).setColumns(10);
		}
	}
	
	public ArrayList<JLabel> getLabelList() {
		return labelList;
	}

	public void setLabelList(ArrayList<JLabel> labelList) {
		this.labelList = labelList;
	}

	public ArrayList<JTextField> getTextFieldList() {
		return textFieldList;
	}

	public void setTextFieldList(ArrayList<JTextField> textFieldList) {
		this.textFieldList = textFieldList;
	}

}
