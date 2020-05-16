/**
 * пакет gui;
 * */
package gui;
/**
 * импортируем все необходимое для класса
 * */
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
/**
 * панели с полями для ввода("вводимые данные" и "электричество")
 * */
public class TextFieldTotalPanel extends JPanel {

	private static final long serialVersionUID = 119992317524412365L;//серийный ID окна
	private TextFieldPanel panel = new TextFieldPanel(1);//панели
	private TotalPanel panel_1; //панель
	/**
	 * панели, в которых будут располагаться поля для ввода
	 * их положение, размер и другие параметры
	 * суперкласс
	 * */
	public TextFieldTotalPanel(CheckPanel checkPanel, TextFieldPanelEnergy textFieldPanelEnergy) {
		
		panel_1 = new TotalPanel(checkPanel, textFieldPanelEnergy, panel);//новая панель
		GridBagLayout gridBagLayout = new GridBagLayout();//создание
		gridBagLayout.columnWidths = new int[]{0, 0, 0};//ширина колонок
		gridBagLayout.rowHeights = new int[]{0, 0, 0};//высота строки
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};//ширина колонок
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};//высота строки
		setLayout(gridBagLayout);//расположение
		
		GridBagConstraints gbc_panel = new GridBagConstraints();//создание
		gbc_panel.anchor = GridBagConstraints.NORTHWEST;//расположение компонента в левом верхнем углу
		gbc_panel.insets = new Insets(0, 0, 5, 0);//представление границ из контейнера
		gbc_panel.gridx = 0;//задаем расположение панели по х
		gbc_panel.gridy = 0;//задаем расположение панели по у
		add(panel, gbc_panel);//создание
		
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();//создание
		gbc_panel_1.anchor = GridBagConstraints.NORTHWEST;//расположение компонента в левом верхнем углу
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);//представление границ из контейнера
		gbc_panel_1.gridx = 0;//задаем расположение панели по х
		gbc_panel_1.gridy = 1;//задаем расположение панели по у
		add(panel_1, gbc_panel_1);//создание

	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public TextFieldPanel getPanel() {
		return panel;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setPanel(TextFieldPanel panel) {
		this.panel = panel;//записать  значение переменной
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public TotalPanel getPanel_1() {
		return panel_1;//получить значение переменной
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setPanel_1(TotalPanel panel_1) {
		this.panel_1 = panel_1;//записать  значение переменной
	}

}
