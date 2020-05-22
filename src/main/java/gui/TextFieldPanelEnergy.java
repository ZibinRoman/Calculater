/**
 * пакет gui;
 * */
package gui;
/**
 * импортируем все необходимое для класса
 * */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.border.*;
import database.GuiStrings;
import java.awt.event.*;
/**
 * панель "электричество"
 * */
public class TextFieldPanelEnergy extends JPanel {

	private static final long serialVersionUID = 2310981483111642649L;//серийный ID окна
	private ArrayList<JLabel> labelListEnergy = new ArrayList<JLabel>();//коллекция подписей
	private ArrayList<JTextField> textFieldListEnergy = new ArrayList<JTextField>();//коллекция полей для ввода
	private ArrayList<JRadioButton> radioButtonListEnergy = new ArrayList<JRadioButton>();///коллекция переключателей
	private final ButtonGroup buttonGroup = new ButtonGroup();//группировка
	private int toggle = 1;//переменная группы
	/**
	 * создание панели "электричество",
	 * его параметров и некоторого содержимого
	 * суперкласс
	 * */
	public TextFieldPanelEnergy(int iterator) {
		GuiStrings string = new GuiStrings();//создаем
		setBorder(new LineBorder(new Color(0, 0, 0)));//цвет границы черные
		GridBagLayout gridBagLayout = new GridBagLayout();//создание
		gridBagLayout.columnWidths = new int[]{0, 0};//ширина колонок
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};//высота строки
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};//ширина колонок
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};//высота строки
		setLayout(gridBagLayout);//расположение
		JLabel lblNewLabel = new JLabel(string.getPanelListText().get(iterator));//создаем
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();//создаем
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);//представление границ из контейнера
		gbc_lblNewLabel.gridx = 0;//задаем расположение названия панели по х
		gbc_lblNewLabel.gridy = 0;//задаем расположение названия панели по у
		add(lblNewLabel, gbc_lblNewLabel);//создаем
		JPanel panel = new JPanel();//создаем
		GridBagConstraints gbc_panel = new GridBagConstraints();//создание
		gbc_panel.insets = new Insets(0, 0, 5, 0);//представление границ из контейнера
		gbc_panel.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_panel.gridx = 0;//задаем расположение панели по х
		gbc_panel.gridy = 1;//задаем расположение панели по у
		add(panel, gbc_panel);//создаем
		GridBagLayout gbl_panel = new GridBagLayout();//создание
		gbl_panel.columnWidths = new int[]{0, 0};//ширина колонок
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};//высота строки
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};//ширина колонок
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};//высота строки
		panel.setLayout(gbl_panel);//расположение
		
		JPanel panel_1 = new JPanel();//создание
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();//новая панель
		gbc_panel_1.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_panel_1.gridx = 0;//задаем расположение панели по х
		gbc_panel_1.gridy = 2;//задаем расположение панели по у
		add(panel_1, gbc_panel_1);//создаем
		GridBagLayout gbl_panel_1 = new GridBagLayout();//создание
		gbl_panel_1.columnWidths = new int[]{0};//ширина колонок
		gbl_panel_1.rowHeights = new int[]{0};//высота строки
		gbl_panel_1.columnWeights = new double[]{Double.MIN_VALUE};//ширина колонок
		gbl_panel_1.rowWeights = new double[]{Double.MIN_VALUE};//высота строки
		panel_1.setLayout(gbl_panel_1);//расположение
		ArrayList<GridBagConstraints> gbcRadioButtonListEnergyList = new ArrayList<GridBagConstraints>();//коллекция переключателей
		/**
		 * цикл создания переключателей
		 * */
		for (int i = 0; i < 3; i++) {//три переключателя на каждый вид тарифа(одноставочный и тд)
			getRadioButtonListEnergy().add(i,  new JRadioButton(string.getListTextEnergy().get(i)));//создание
			buttonGroup.add(getRadioButtonListEnergy().get(i));//создание
			gbcRadioButtonListEnergyList.add(i, new GridBagConstraints());//создание
			gbcRadioButtonListEnergyList.get(i).fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
			gbcRadioButtonListEnergyList.get(i).gridx = 0;//задаем расположение переключателей по х
			gbcRadioButtonListEnergyList.get(i).gridy = i;//задаем расположение переключателей по у 
			panel.add(getRadioButtonListEnergy().get(i), gbcRadioButtonListEnergyList.get(i));//создание
		}	
		ArrayList<GridBagConstraints> gbclabelList = new ArrayList<GridBagConstraints>();//коллекция подписей
		ArrayList<GridBagConstraints> gbctextFieldList = new ArrayList<GridBagConstraints>();//коллекция полей для ввода
		/**
		 * цикл создания полей для ввода и подписей к ним
		 * */
		for (int i = 0; i < 3; i++) {
			getLabelListEnergy().add(i, new JLabel(string.getLabelListTextEnergy().get(i)));//создание
			gbclabelList.add(i, new GridBagConstraints());//создание
			gbclabelList.get(i).gridx = 0;//задаем расположение подписи по х
			gbclabelList.get(i).gridy = i;//задаем расположение подписи по у
			panel_1.add(getLabelListEnergy().get(i), gbclabelList.get(i));//создание панели
			getTextFieldListEnergy().add(i,  new JTextField());//создание
			gbctextFieldList.add(i, new GridBagConstraints());//создание
			gbctextFieldList.get(i).gridx = 1;//задаем расположение поля ввода по х
			gbctextFieldList.get(i).gridy = i;//задаем расположение поля ввода по у
			panel_1.add(getTextFieldListEnergy().get(i), gbctextFieldList.get(i));//создание
			getTextFieldListEnergy().get(i).setColumns(10);
		}
		/**переключатель тарифная зона 1
		 * */
		getRadioButtonListEnergy().get(0).setSelected(true);
		getRadioButtonListEnergy().get(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setToggle(1);//тарифная зона 1
				
			}
		});
		/**переключатель тарифная зона 2
		 * */
		getRadioButtonListEnergy().get(1).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setToggle(2);//тарифная зона 2
				
			}
		});
		/**переключатель тарифная зона 3
		 * */
		getRadioButtonListEnergy().get(2).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setToggle(3);//тарифная зона 3
				
			}
		});
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<JLabel> getLabelListEnergy() {
		return labelListEnergy;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setLabelListEnergy(ArrayList<JLabel> labelList) {
		this.labelListEnergy = labelList;//записать  значение переменной
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<JTextField> getTextFieldListEnergy() {
		return textFieldListEnergy;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setTextFieldListEnergy(ArrayList<JTextField> textFieldList) {
		this.textFieldListEnergy = textFieldList;//записать  значение переменной
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<JRadioButton> getRadioButtonListEnergy() {
		return radioButtonListEnergy;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setRadioButtonListEnergy(ArrayList<JRadioButton> radioButtonListEnergy) {
		this.radioButtonListEnergy = radioButtonListEnergy;//записать  значение переменной
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public int getToggle() {
		return toggle;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setToggle(int toggle) {
		this.toggle = toggle;//записать  значение переменной
	}

}
