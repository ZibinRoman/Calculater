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
 * панель на которой создаются checkBox*ы
 * */
public class CheckPanel extends JPanel {
	
	private static final long serialVersionUID = -6192899335398206441L;//серийный ID окна
	private ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();//коллекция чекбоксов
	/**
	 * создание панели на которой создаются checkBox*ы
	 * и ее параметры
	 * суперкласс
	 * */
	public CheckPanel(int iterator) {
		GuiStrings string = new GuiStrings();//создание
		setBorder(new LineBorder(new Color(0, 0, 0)));//цвет границы чертный
		GridBagLayout gridBagLayout = new GridBagLayout();//установка переменных
		gridBagLayout.rowWeights = new double[]{0.0, 1.0};//высота строк
		gridBagLayout.columnWeights = new double[]{1.0};//ширина столбцов
		setLayout(gridBagLayout);//расположение
		JLabel lblNewLabel = new JLabel(string.getPanelListText().get(iterator));//создание
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();//создание
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;//задаем расположение названия панели по x
		gbc_lblNewLabel.gridy = 0;//задаем расположение названия панели по у
		add(lblNewLabel, gbc_lblNewLabel);//создание панели
		JPanel panel = new JPanel();//установка переменных
		GridBagConstraints gbc_panel = new GridBagConstraints();//создание
		gbc_panel.fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
		gbc_panel.gridx = 0;//задаем расположение по x
		gbc_panel.gridy = 1;//задаем расположение по у
		add(panel, gbc_panel);//создание панели
		GridBagLayout gbl_panel = new GridBagLayout();//создание
		gbl_panel.columnWidths = new int[]{0, 0};//ширина колонок
		gbl_panel.rowHeights = new int[]{0, 0};//высота строки
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};//ширина колонок
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};//высота строки
		panel.setLayout(gbl_panel);
		ArrayList<GridBagConstraints> gbcCheckBoxList = new ArrayList<GridBagConstraints>();//коллекция CheckBox"ов
		/**
		 * создание checkBox*ов первого столбца панели "услуги"
		 * */
		for (int i = 0; i < 10; i++) {//цикл, который создает на панели с 0 по 10 услуги 
			getCheckBoxList().add(i, new JCheckBox(string.getCheckBoxListText().get(i)));
			gbcCheckBoxList.add(i, new GridBagConstraints());//создание ячеек
			gbcCheckBoxList.get(i).fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
			gbcCheckBoxList.get(i).gridx = 0;//задаем расположение по x - первый столбец
			gbcCheckBoxList.get(i).gridy = i;//задаем расположение по у
			panel.add(getCheckBoxList().get(i), gbcCheckBoxList.get(i));//создаем на панели CheckBox с заданными параметрами
		}
		/**
		 * создание checkBox*ов второго столбца панели "услуги"
		 * */
		for (int i = 10; i < 19; i++) {//цикл, который создает на панели с 10 по 19 услуги 
			getCheckBoxList().add(i, new JCheckBox(string.getCheckBoxListText().get(i)));//создание
			gbcCheckBoxList.add(i, new GridBagConstraints());//создание ячеек
			gbcCheckBoxList.get(i).fill = GridBagConstraints.BOTH;//определяет будет ли компонент заполнять все пространство ячейки
			gbcCheckBoxList.get(i).gridx = 1;//задаем расположение по x  - второй столбец
			gbcCheckBoxList.get(i).gridy = i-10;//задаем расположение по у
			panel.add(getCheckBoxList().get(i), gbcCheckBoxList.get(i));//создаем на панели CheckBox с заданными параметрами
		}
	}
	/**
	 * метод, который получает значение переменной checkBoxList
	 * */
	public ArrayList<JCheckBox> getCheckBoxList() {
		return checkBoxList; //получить значение переменной checkBoxList
	}
	/**
	 * метод,  который записывает значение переменной checkBoxList
	 * */
	public void setCheckBoxList(ArrayList<JCheckBox> checkBoxList) {
		this.checkBoxList = checkBoxList; //записать значение переменной checkBoxList
	}

	
	
}
