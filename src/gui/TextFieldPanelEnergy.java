package gui;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import database.GuiStrings;
import javax.swing.border.*;
import java.awt.event.*;

public class TextFieldPanelEnergy extends JPanel {

	private static final long serialVersionUID = 2310981483111642649L;
	private ArrayList<JLabel> labelListEnergy = new ArrayList<JLabel>();
	private ArrayList<JTextField> textFieldListEnergy = new ArrayList<JTextField>();
	private ArrayList<JRadioButton> radioButtonListEnergy = new ArrayList<JRadioButton>();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int toggle = 1;
	
	public TextFieldPanelEnergy(int iterator) {
		GuiStrings string = new GuiStrings();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		JLabel lblNewLabel = new JLabel(string.getPanelListText().get(iterator));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0};
		gbl_panel_1.rowHeights = new int[]{0};
		gbl_panel_1.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		ArrayList<GridBagConstraints> gbcRadioButtonListEnergyList = new ArrayList<GridBagConstraints>();
		for (int i = 0; i < 3; i++) {
			getRadioButtonListEnergy().add(i,  new JRadioButton(string.getListTextEnergy().get(i)));
			buttonGroup.add(getRadioButtonListEnergy().get(i));
			gbcRadioButtonListEnergyList.add(i, new GridBagConstraints());
			gbcRadioButtonListEnergyList.get(i).fill = GridBagConstraints.BOTH;
			gbcRadioButtonListEnergyList.get(i).gridx = 0;
			gbcRadioButtonListEnergyList.get(i).gridy = i;
			panel.add(getRadioButtonListEnergy().get(i), gbcRadioButtonListEnergyList.get(i));
		}	
		ArrayList<GridBagConstraints> gbclabelList = new ArrayList<GridBagConstraints>();
		ArrayList<GridBagConstraints> gbctextFieldList = new ArrayList<GridBagConstraints>();
		for (int i = 0; i < 3; i++) {
			getLabelListEnergy().add(i, new JLabel(string.getLabelListTextEnergy().get(i)));
			gbclabelList.add(i, new GridBagConstraints());
			gbclabelList.get(i).gridx = 0;
			gbclabelList.get(i).gridy = i;
			panel_1.add(getLabelListEnergy().get(i), gbclabelList.get(i));
			getTextFieldListEnergy().add(i,  new JTextField());
			gbctextFieldList.add(i, new GridBagConstraints());
			gbctextFieldList.get(i).gridx = 1;
			gbctextFieldList.get(i).gridy = i;
			panel_1.add(getTextFieldListEnergy().get(i), gbctextFieldList.get(i));
			getTextFieldListEnergy().get(i).setColumns(10);
		}
		getRadioButtonListEnergy().get(0).setSelected(true);
		getRadioButtonListEnergy().get(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setToggle(1);
				
			}
		});
		getRadioButtonListEnergy().get(1).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setToggle(2);
				
			}
		});
		getRadioButtonListEnergy().get(2).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setToggle(3);
				
			}
		});
	}

	public ArrayList<JLabel> getLabelListEnergy() {
		return labelListEnergy;
	}

	public void setLabelListEnergy(ArrayList<JLabel> labelList) {
		this.labelListEnergy = labelList;
	}

	public ArrayList<JTextField> getTextFieldListEnergy() {
		return textFieldListEnergy;
	}

	public void setTextFieldListEnergy(ArrayList<JTextField> textFieldList) {
		this.textFieldListEnergy = textFieldList;
	}

	public ArrayList<JRadioButton> getRadioButtonListEnergy() {
		return radioButtonListEnergy;
	}

	public void setRadioButtonListEnergy(ArrayList<JRadioButton> radioButtonListEnergy) {
		this.radioButtonListEnergy = radioButtonListEnergy;
	}

	public int getToggle() {
		return toggle;
	}

	public void setToggle(int toggle) {
		this.toggle = toggle;
	}

}
