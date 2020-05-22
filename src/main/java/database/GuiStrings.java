/**
 * пакет database;
 * */
package database;
/**
 * импортируем все необходимое для класса
 * */
import java.util.*;
/**
 * класс хранит подписи (названия) 
 * к элементам интерфейса 
 * */
public class GuiStrings {
	/**
	 * класс хранит подписи (названия) 
	 * к элементам интерфейса:
	 * CheckBox;  Panel; Textbox ; RadioBox
	 * */
	private final String title = "Расчет кварплаты";//название окнакнопки
	private final String total = "Итого";//подписсь к полю вывода
	private final String calc = "Рассчитать ";//название кнопки
	private final String all = "Все услуги";//название кнопки
	private final String save = "Сохранить";//название кнопки
	private ArrayList<String> checkBoxListText = new ArrayList<String>();//значение коллекции
	private ArrayList<String> panelListText = new ArrayList<String>();//значение коллекции
	private ArrayList<String> ListText = new ArrayList<String>();//значение коллекции
	private ArrayList<String> ListTextEnergy = new ArrayList<String>();//значение коллекции
	private ArrayList<String> labelListTextEnergy = new ArrayList<String>();//значение коллекции
	
	public GuiStrings() {
		initialize();
	}
	/**
	 * хранит подписи (названия) 
	 * к элементам интерфейса:
	 * поля ввода, переключатели, флажки
	 * CheckBox; Textbox; RadioBox
	 * */

	private void initialize() {
		getCheckBoxListText().add(0, "Содержание");
		getCheckBoxListText().add(1, "Уб. мест общ. польз.");
		getCheckBoxListText().add(2, "ХВС при СОИ");
		getCheckBoxListText().add(3, "ХВ на ГВС при СОИ");
		getCheckBoxListText().add(4, "ТЭ ГВС при СОИ");
		getCheckBoxListText().add(5, "Отв. ст. в. Х при СОИ");
		getCheckBoxListText().add(6, "Отв. ст. в. Г при СОИ");
		getCheckBoxListText().add(7, "Эл. эн. при СОИ");
		getCheckBoxListText().add(8, "Отопление");
		getCheckBoxListText().add(9, "Хол. водоснабжение");
		getCheckBoxListText().add(10, "ХВ на нужды ГВС");
		getCheckBoxListText().add(11, "Тепл. энергия ГВС");
		getCheckBoxListText().add(12, "Отв. сточ. вод ХВ");
		getCheckBoxListText().add(13, "Отв. сточ. вод ГВ");
		getCheckBoxListText().add(14, "Обращение с ТКО");
		getCheckBoxListText().add(15, "ООбсл. ТА");
		getCheckBoxListText().add(16, "ЗПУ");
		getCheckBoxListText().add(17, "Радио");
		getCheckBoxListText().add(18, "Газ");
		getPanelListText().add(0, "Услуги");
		getPanelListText().add(1, "Вводимые данные");
		getPanelListText().add(2, "Электричество");
		getPanelListText().add(3, "Итого");
		getListText().add(0, "Площадь");
		getListText().add(1, "Жильцы");
		getListText().add(2, "Отопление");
		getListText().add(3, "Холодная вода");
		getListText().add(4, "Горячая вода");
		getListText().add(5, "Газ");
		getListTextEnergy().add(0, "Одноставочный тариф");
		getListTextEnergy().add(1, "Тариф по двум зонам");
		getListTextEnergy().add(2, "Тариф по трем зонам");
		getLabelListTextEnergy().add(0, "Тарифная зона 1");
		getLabelListTextEnergy().add(1, "Тарифная зона 2");
		getLabelListTextEnergy().add(2, "Тарифная зона 3");
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public String getTitle() {
		return title;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getCheckBoxListText() {
		return checkBoxListText;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setCheckBoxListText(ArrayList<String> checkBoxListText) {
		this.checkBoxListText = checkBoxListText;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getPanelListText() {
		return panelListText;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setPanelListText(ArrayList<String> panelListText) {
		this.panelListText = panelListText;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getListText() {
		return ListText;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setListText(ArrayList<String> listText) {
		ListText = listText;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getListTextEnergy() {
		return ListTextEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setListTextEnergy(ArrayList<String> listTextEnergy) {
		ListTextEnergy = listTextEnergy;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getLabelListTextEnergy() {
		return labelListTextEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setLabelListTextEnergy(ArrayList<String> labelListTextEnergy) {
		this.labelListTextEnergy = labelListTextEnergy;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public String getTotal() {
		return total;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public String getCalc() {
		return calc;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public String getAll() {
		return all;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public String getSave() {
		return save;
	}
	
}
