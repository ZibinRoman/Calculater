package gui;

import javax.swing.*;

import static database.Strings.*;

import java.awt.*;
import java.util.*;
import database.GuiStrings;
import database.Output;
import function.Function;
import javax.swing.border.*;
import java.awt.event.*;


public class TotalPanel extends JPanel {

	private static final long serialVersionUID = 4829371702879931075L;
	private JTextField textField;
	private boolean swith = false;
	private boolean swithSave = false;
	private Function func;
	
	public TotalPanel(CheckPanel checkPanel, TextFieldPanelEnergy textFieldPanelEnergy, TextFieldPanel textFieldPanel) {
		GuiStrings string = new GuiStrings();
		setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel(string.getTotal());
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton(string.getCalc());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (swith) {
						swith = false;
					}
					ArrayList<Double> doubleListValue = new ArrayList<Double>();
					ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();
					doubleListValueEnergy = doubleListValueEnergy(textFieldPanelEnergy.getTextFieldListEnergy(), textFieldPanelEnergy.getToggle());
					doubleListValue = doubleListValue(textFieldPanel.getTextFieldList());
					func = new Function(checkPanel.getCheckBoxList(), doubleListValue, doubleListValueEnergy , textFieldPanelEnergy.getToggle());
					func.initialize();
				} catch (Exception ex) {
					ex.getStackTrace();
					JOptionPane.showMessageDialog(getRootPane(), "Введены некорректные значения", "Ошибка", JOptionPane.ERROR_MESSAGE);
					swith = true;
					swithSave = false;
				} finally {
					if(!swith) {
						textField.setText(String.valueOf(func.getValue()));
						swithSave = true;
					}
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton(string.getAll());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < checkPanel.getCheckBoxList().size(); i++) {
					checkPanel.getCheckBoxList().get(i).setSelected(true);
				}
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(string.getSave());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (swithSave) {
					Output out = new Output(checkPanel.getCheckBoxList(), func.getDoubleListTarif(),  func.getDoubleListValue(),  func.getDoubleListTotal(),  func.getDoubleListTarifEnergy(), func.getDoubleListValueEnergy(), func.getDoubleListTotalEnergy(), func.getToggle(), func.getValue());
					out.initializeOutput();
					JOptionPane.showMessageDialog(getRootPane(), "Сохранено", "Сообщение", JOptionPane.INFORMATION_MESSAGE);
					swithSave = false;
				} else {
					JOptionPane.showMessageDialog(getRootPane(), "Нечего сохранять", "Ошибка", JOptionPane.ERROR_MESSAGE);
					swithSave = false;
				}
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 2;
		add(btnNewButton_2, gbc_btnNewButton_2);
	}
	
	private ArrayList<Double> doubleListValue(ArrayList<JTextField> textFieldList) {
		ArrayList<Double> doubleListValue= new ArrayList<Double>();
		boolean error = false;
		try {
			error = false;
			for (int i = 0; i < textFieldList.size(); i++) {
				if (textFieldList.get(i).getText().trim().equals(getZero())) {
					error = true;
					throw new Exception("Значения должны быть больше нуля");
				} else {
					error = false;
				}	
				if (textFieldList.get(i).getText().trim().equals(getEmpty())||textFieldList.get(i).getText().trim().equals(null)) {
					error = true;
					throw new Exception("Есть пустые поля");
				} else {
					error = false;
				}	
			}
		} catch (Exception e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(getRootPane(), e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
		} finally {
			if (!error) {
				doubleListValue.add(0, Double.valueOf(textFieldList.get(0).getText().trim()));
				doubleListValue.add(1, Double.valueOf(textFieldList.get(0).getText().trim()));
				doubleListValue.add(2, 0.134640);
				doubleListValue.add(3, 0.134600);
				doubleListValue.add(4, 0.009102);
				doubleListValue.add(5, 0.134640);
				doubleListValue.add(6, 0.134600);
				doubleListValue.add(7, 19.29250);
				doubleListValue.add(8, Double.valueOf(textFieldList.get(2).getText().trim()));/*Отопление*/
				doubleListValue.add(9, Double.valueOf(textFieldList.get(3).getText().trim()));/*ХВ*/
				doubleListValue.add(10, Double.valueOf(textFieldList.get(4).getText().trim()));/*ГВ*/
				doubleListValue.add(11, 0.135200);
				doubleListValue.add(12, Double.valueOf(textFieldList.get(3).getText().trim()));
				doubleListValue.add(13, Double.valueOf(textFieldList.get(4).getText().trim()));
				doubleListValue.add(14, Double.valueOf(textFieldList.get(1).getText().trim()));
				doubleListValue.add(15, 1.00);
				doubleListValue.add(16, 1.00);
				doubleListValue.add(17, 1.00);
				doubleListValue.add(18, Double.valueOf(textFieldList.get(5).getText().trim()));
			}
		}
		return doubleListValue;	
	}
	
	private ArrayList<Double> doubleListValueEnergy(ArrayList<JTextField> textFieldListEnergy, int toggle) {
		ArrayList<Double> doubleListValueEnergy= new ArrayList<Double>();
		boolean error = false;
		try {
			error = false;
			for (int i = 0; i < toggle; i++) {
				
			}
		} catch (Exception e) {
			
		} finally {
			if (!error) {
				for (int i = 0; i < toggle; i++) {
					doubleListValueEnergy.add(i, Double.valueOf((textFieldListEnergy.get(i).getText().trim())));
				}
			}
		}
		return doubleListValueEnergy;
	}

}
