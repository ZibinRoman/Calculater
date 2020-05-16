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
/**
 * панель "вводимые данные"
 * */
public class TextFieldPanel extends JPanel {

	private static final long serialVersionUID = -8968686479684944447L;//серийный ID окна
	private ArrayList<JLabel> labelList = new ArrayList<JLabel>();//коллекция подписей
	private ArrayList<JTextField> textFieldList = new ArrayList<JTextField>();//коллекция полей ввода
	/**
	 * создание панели "Вводимые данные" с полями ввода
	 * параметры панели и названия
	 * суперкласс
	 * */
	public TextFieldPanel(int iterator) {
		GuiStrings string = new GuiStrings();//создаем
		setBorder(new LineBorder(new Color(0, 0, 0)));//граница черная
		GridBagLayout gridBagLayout = new GridBagLayout();//создаем
		gridBagLayout.columnWidths = new int[]{0, 0};//ширина колонок
		gridBagLayout.rowHeights = new int[]{0, 0, 0};//высота строки
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};//ширина колонок
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};//высота строки
		setLayout(gridBagLayout);//расположение
		JLabel lblNewLabel = new JLabel(string.getPanelListText().get(iterator));//создаем
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();//создаем
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);//представление границ из контейнера
		gbc_lblNewLabel.gridx = 0;//задаем расположение названия панели по х
		gbc_lblNewLabel.gridy = 0;//задаем расположение названия панели по у
		add(lblNewLabel, gbc_lblNewLabel);//создание
		JPanel panel = new JPanel();//новая панель
		GridBagConstraints gbc_panel = new GridBagConstraints();//создание
		gbc_panel.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_panel.gridx = 0;//задаем расположение панели по х
		gbc_panel.gridy = 1;//задаем расположение панели по у
		add(panel, gbc_panel);//создаем панель
		GridBagLayout gbl_panel = new GridBagLayout();//создаем 
		gbl_panel.columnWidths = new int[]{0};//ширина колонок
		gbl_panel.rowHeights = new int[]{0};//высота строки
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};//ширина колонок
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};//высота строки
		panel.setLayout(gbl_panel);//расположение
		ArrayList<GridBagConstraints> gbclabelList = new ArrayList<GridBagConstraints>();//коллекция подписей
		ArrayList<GridBagConstraints> gbctextFieldList = new ArrayList<GridBagConstraints>();//коллекция полей для ввода
		/**
		 * цикл создания полей для ввода и подписей к ним
		 * */
		for (int i = 0; i < 6; i++) {//6 итараций цикла - 6 полей ввода с подписями
			getLabelList().add(i, new JLabel(string.getListText().get(i)));//создание подписей
			gbclabelList.add(i, new GridBagConstraints());//создание подписей
			gbclabelList.get(i).gridx = 0;//задаем расположение подписей по х
			gbclabelList.get(i).gridy = i;//задаем расположение подписей по у
			panel.add(getLabelList().get(i), gbclabelList.get(i));//создание полей ввода
			getTextFieldList().add(i,  new JTextField());//создание полей ввода
			gbctextFieldList.add(i, new GridBagConstraints());//создание полей ввода
			gbctextFieldList.get(i).gridx = 1;//задаем расположение полей ввода по х
			gbctextFieldList.get(i).gridy = i;//задаем расположение полей ввода по у
			panel.add(getTextFieldList().get(i), gbctextFieldList.get(i));//создание панели
			getTextFieldList().get(i).setColumns(10);
		}
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<JLabel> getLabelList() {
		return labelList;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setLabelList(ArrayList<JLabel> labelList) {
		this.labelList = labelList;//записать значение переменной
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<JTextField> getTextFieldList() {
		return textFieldList;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setTextFieldList(ArrayList<JTextField> textFieldList) {
		this.textFieldList = textFieldList;//записать значение переменной
	}

}
