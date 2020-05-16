/**
 * пакет gui;
 * */
package gui;
/**
 * импортируем все необходимое для класса
 * */
import javax.swing.*;
import static database.Strings.*;
import java.awt.*;
import java.util.*;
import database.GuiStrings;
import database.Output;
import function.Function;
import javax.swing.border.*;
import java.awt.event.*;
/**
 * панель подведения итогов "ИТОГО"
 * */
public class TotalPanel extends JPanel {
	/**
	 * создание панели подведения итогов, 
	 * его параметры и некоторое содержимое 
	 * суперкласс
	 * */
	private static final long serialVersionUID = 4829371702879931075L;//серийный ID окна
	private JTextField textField;//поле для вывода
	private boolean swith = false;//создание переменных
	private boolean swithSave = false;//создание переменных
	private Function func;//создание переменных
	
	public TotalPanel(CheckPanel checkPanel, TextFieldPanelEnergy textFieldPanelEnergy, TextFieldPanel textFieldPanel) {
		GuiStrings string = new GuiStrings();//создание
		setBorder(new LineBorder(new Color(0, 0, 0)));//цвет границы
		GridBagLayout gridBagLayout = new GridBagLayout();//создание
		gridBagLayout.columnWidths = new int[]{0, 0, 0};//ширина колонок
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};//высота строки
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};//ширина колонок
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};//высота строки
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel(string.getTotal());//создание
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();//создание
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);//представление границ из контейнера
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;//расположение компонента в правой части, по центру вертикально.
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;//Изменение размера компонента по вертикали
		gbc_lblNewLabel.gridx = 0;//задаем расположение по х
		gbc_lblNewLabel.gridy = 0;//задаем расположение по у
		add(lblNewLabel, gbc_lblNewLabel);//создание
		
		textField = new JTextField();//поле вывода
		textField.setEditable(false);//запрет на ввод
		GridBagConstraints gbc_textField = new GridBagConstraints();//создание
		gbc_textField.insets = new Insets(0, 0, 5, 0);//представление границ из контейнера
		gbc_textField.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_textField.gridx = 1;//задаем расположение по х
		gbc_textField.gridy = 0;//задаем расположение по у
		add(textField, gbc_textField);//создание
		textField.setColumns(10);
		/**
		 * кнопка запуска вычислений и вывода в TextField
		 * при вводе неправильного значения срабатывает исключение
		 * */
		JButton btnNewButton = new JButton(string.getCalc());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (swith) {
						swith = false;
					}
					ArrayList<Double> doubleListValue = new ArrayList<Double>();//коллекция тарифов
					ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();//коллекция тарифов электричества
					doubleListValueEnergy = doubleListValueEnergy(textFieldPanelEnergy.getTextFieldListEnergy(), textFieldPanelEnergy.getToggle());//тарифы электричество
					doubleListValue = doubleListValue(textFieldPanel.getTextFieldList());//тарифы
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
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();//создание
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);//представление границ из контейнера
		gbc_btnNewButton.gridx = 0;//задаем расположение по х
		gbc_btnNewButton.gridy = 1;//задаем расположение по у
		add(btnNewButton, gbc_btnNewButton);//создание
		
		JButton btnNewButton_1 = new JButton(string.getAll());//кнопка
		btnNewButton_1.addActionListener(new ActionListener() {//кнопка
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < checkPanel.getCheckBoxList().size(); i++) {
					checkPanel.getCheckBoxList().get(i).setSelected(true);//панель с галочкми
				}
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();//определяет будет ли компонент заполнять все пространство ячейки
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);//представление границ из контейнера
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_btnNewButton_1.gridx = 1;//задаем расположение по х
		gbc_btnNewButton_1.gridy = 1;//задаем расположение по у
		add(btnNewButton_1, gbc_btnNewButton_1);//создание
		/**
		 * кнопка, по которой заполненяется платежная 
		 * квитанция и сохраненение в нем вычислений 
		 * при вводе неправильного значения срабатывает исключение
		 * */
		JButton btnNewButton_2 = new JButton(string.getSave());
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (swithSave) {
					Output out = new Output(checkPanel.getCheckBoxList(), func.getDoubleListTarif(),  func.getDoubleListValue(),  func.getDoubleListTotal(),  func.getDoubleListTarifEnergy(), func.getDoubleListValueEnergy(), func.getDoubleListTotalEnergy(), func.getToggle(), func.getValue());
					out.initializeOutput();
					JOptionPane.showMessageDialog(getRootPane(), "Сохранено", "Сообщение", JOptionPane.INFORMATION_MESSAGE);//сообщение о сохранении
					swithSave = false;
				} else {
					JOptionPane.showMessageDialog(getRootPane(), "Нечего сохранять", "Ошибка", JOptionPane.ERROR_MESSAGE);//сообщение об ошибке
					swithSave = false;
				}
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();//создание
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);//представление границ из контейнера
		gbc_btnNewButton_2.gridx = 0;//задаем расположение по х
		gbc_btnNewButton_2.gridy = 2;//задаем расположение по у
		add(btnNewButton_2, gbc_btnNewButton_2);//создание
	}
	
	private ArrayList<Double> doubleListValue(ArrayList<JTextField> textFieldList) {
		ArrayList<Double> doubleListValue= new ArrayList<Double>();//коллекция тарифов
		boolean error = false;
		try {
			error = false;
			for (int i = 0; i < textFieldList.size(); i++) {
				if (textFieldList.get(i).getText().trim().equals(getZero())) {
					error = true;//ошибка
					throw new Exception("Значения должны быть больше нуля");//сообщение для диалогового окна
				} else {
					error = false;//нет ошибок
				}	
				if (textFieldList.get(i).getText().trim().equals(getEmpty())||textFieldList.get(i).getText().trim().equals(null)) {
					error = true; //ошибка
					throw new Exception("Есть пустые поля");//сообщение для диалогового окна
				} else {
					error = false;//нет ошибок
				}	
			}
		} catch (Exception e) {
			e.getStackTrace();
			JOptionPane.showMessageDialog(getRootPane(), e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);// диалоговое окно ошибка
		} finally {
			/**
			 **** 1 колонка:
			 *1-	Содержание;
			 *2-	Уборка мест общего пользования;
			 *3-	ХВС при СОИ;
			 *4-	ХВ на ГВС при СОИ;
			 *5-	ТЭ ГВС при СОИ;
			 *6-	Отведение сточных вод Х при СОИ;
			 *7-	Отведение сточных вод Г при СОИ;
			 *8-	Эл. эн. при СОИ
			 *9-	Отопление;
			 *10-	Хол. Водоснабжение.
			 **** 2 колонка:
			 *11-	XB на нужды ГВС;
			 *12-	Тепл. энергия ГВС;
			 *13-	Отведение сточных вод ХВ;
			 *14-	Отведение сточных вод ГВ;
			 *15-	Обращение с ТКО;
			 *16-	Обсл. ТА (Обслуживание телевизионной антенны);
			 *17-	ЗПУ (Замочно-переговорное устройство);
			 *18-	Радио (Доступ к системе радиовещания);
			 *19-	Газ (Газоснабжение).
			 * */
			if (!error) {
				doubleListValue.add(0, Double.valueOf(textFieldList.get(0).getText().trim()));//тариф 1
				doubleListValue.add(1, Double.valueOf(textFieldList.get(0).getText().trim()));//тариф 2
				doubleListValue.add(2, 0.134640);//тариф 3
				doubleListValue.add(3, 0.134600);//тариф 4
				doubleListValue.add(4, 0.009102);//тариф 5
				doubleListValue.add(5, 0.134640);//тариф 6
				doubleListValue.add(6, 0.134600);//тариф 7
				doubleListValue.add(7, 19.29250);//тариф 8
				doubleListValue.add(8, Double.valueOf(textFieldList.get(2).getText().trim()));/*Отопление*/
				doubleListValue.add(9, Double.valueOf(textFieldList.get(3).getText().trim()));/*ХВ*/
				doubleListValue.add(10, Double.valueOf(textFieldList.get(4).getText().trim()));/*ГВ*/
				doubleListValue.add(11, 0.135200);//тариф 12
				doubleListValue.add(12, Double.valueOf(textFieldList.get(3).getText().trim()));//тариф 13
				doubleListValue.add(13, Double.valueOf(textFieldList.get(4).getText().trim()));//тариф 14
				doubleListValue.add(14, Double.valueOf(textFieldList.get(1).getText().trim()));//тариф 15
				doubleListValue.add(15, 1.00);//тариф 16
				doubleListValue.add(16, 1.00);//тариф 17
				doubleListValue.add(17, 1.00);//тариф 18
				doubleListValue.add(18, Double.valueOf(textFieldList.get(5).getText().trim()));//тариф 19
			}
		}
		return doubleListValue;	
	}
	
	private ArrayList<Double> doubleListValueEnergy(ArrayList<JTextField> textFieldListEnergy, int toggle) {
		ArrayList<Double> doubleListValueEnergy= new ArrayList<Double>();//коллекция тарифов на электричество
		boolean error = false;
		try {
			error = false;
			for (int i = 0; i < toggle; i++) {
				
			}
		} catch (Exception e) {
			
		} finally {
			if (!error) {
				for (int i = 0; i < toggle; i++) {
					doubleListValueEnergy.add(i, Double.valueOf((textFieldListEnergy.get(i).getText().trim())));//тарифы электричество
				}
			}
		}
		return doubleListValueEnergy;
	}

}
