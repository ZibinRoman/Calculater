/**
 * пакет gui;
 * */
package gui;
/**
 * импортируем все необходимое для класса
 * */
import java.awt.*;
import javax.swing.*;
import database.GuiStrings;
/**
 * создание графического интерфейса
 */
public class Gui {

	private JFrame frame;//объявление переменной фрейма
		/**
		 * метод, который запускает графический интерфейс
		 * */
	public void start() {
		EventQueue.invokeLater(new Runnable() {//новый поток
			public void run() {
				/**
				 * try на случай ошибки
				 */
				try {
					Gui window = new Gui();//создание окна
					window.frame.setVisible(true);//видимость окна
					/**
					 * catch сработает в случае ошибки
					 */
				} catch (Exception e) {
					e.printStackTrace();/*Вывод в консоль действий, которые привели к ошибке*/
				}
			}
		});
	}
	/**
	 * инициализация метода initialize()
	 * */
	public Gui() {
		initialize();//суперкласс
	}

	/**
	 * создание frame, определение его параметров 
	 * и некоторого содержимого
	 */
	private void initialize() {
		GuiStrings string = new GuiStrings();
		
		frame = new JFrame();//новый фрейм
		frame.setResizable(false);//нельзя изменить размер
		frame.setTitle(string.getTitle());//название
		frame.setBounds(100, 100, 800, 300);//размер и расположение
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Операция закрытия по умолчанию
		GridBagLayout gridBagLayout = new GridBagLayout();//расположение элементов
		gridBagLayout.columnWidths = new int[]{10, 0, 0, 0};//ширина колонок
		gridBagLayout.rowHeights = new int[]{10, 0, 0};//высота строки
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0};//ширина колонок
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};//высота строки
		frame.setBackground(Color.GREEN);
		frame.getContentPane().setLayout(gridBagLayout);
		/**
		 * панель "Услуги"
		 * */		
		CheckPanel checkPanel= new CheckPanel(0);//панель с чекбоксами
		GridBagConstraints gbc_checkPanel = new GridBagConstraints();//создание
		gbc_checkPanel.fill = GridBagConstraints.HORIZONTAL;//Изменение размера компонента по горизонтали, но не по вертикали
		gbc_checkPanel.anchor = GridBagConstraints.NORTH;//расположение компонента в верхней части  по центру горизонтально
		gbc_checkPanel.insets = new Insets(0, 0, 5, 5);//установка переменных
		gbc_checkPanel.gridx = 0;//задаем расположение по х
		gbc_checkPanel.gridy = 0;//задаем расположение по у
		frame.getContentPane().add(checkPanel, gbc_checkPanel);//создание панели
		/**
		 * панель "электричество"
		 * */
		TextFieldPanelEnergy textFieldPanelEnergy = new TextFieldPanelEnergy(2);//установка переменных
		GridBagConstraints gbcTextFieldPanelEnergyl = new GridBagConstraints();//установка переменных
		gbcTextFieldPanelEnergyl.anchor = GridBagConstraints.NORTHWEST;//расположение компонента в левом верхнем углу
		gbcTextFieldPanelEnergyl.insets = new Insets(0, 0, 5, 5);//установка переменных
		gbcTextFieldPanelEnergyl.gridx = 2;//задаем расположение по х
		gbcTextFieldPanelEnergyl.gridy = 0;//задаем расположение по у
		frame.getContentPane().add(textFieldPanelEnergy, gbcTextFieldPanelEnergyl);//создание панели
		/**
		 * панель "Водимые данные"
		 * */
		TextFieldTotalPanel textFieldPanel = new TextFieldTotalPanel(checkPanel, textFieldPanelEnergy);//создание
		GridBagConstraints gbcTextFieldPanel = new GridBagConstraints();//установка переменных
		gbcTextFieldPanel.fill = GridBagConstraints.HORIZONTAL;//Изменение размера компонента по горизонтали
		gbcTextFieldPanel.anchor = GridBagConstraints.NORTH;//расположение компонента в верхней части  по центру
		gbcTextFieldPanel.insets = new Insets(0, 0, 5, 5);//установка переменных
		gbcTextFieldPanel.gridx = 1;//задаем расположение по х
		gbcTextFieldPanel.gridy = 0;//задаем расположение по у
		frame.getContentPane().add(textFieldPanel, gbcTextFieldPanel);//создание панели
		/**
		 * панель "итого"
		 * */
		JPanel panel_1 = new JPanel();//установка переменных
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();//установка переменных
		gbc_panel_1.anchor = GridBagConstraints.NORTH;//расположение компонента в верхней части  по центру
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.HORIZONTAL;//Изменение размера компонента по горизонтали
		gbc_panel_1.gridx = 3;//задаем расположение по х
		gbc_panel_1.gridy = 0;//задаем расположение по у
		frame.getContentPane().add(panel_1, gbc_panel_1);//создание панели
	}
		
}
