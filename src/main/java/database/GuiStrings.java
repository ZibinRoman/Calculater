package database;

import java.util.*;

public class GuiStrings {
	
	private final String title = "Расчет кварплаты";
	private final String total = "Итого";
	private final String calc = "Рассчитать ";
	private final String all = "Все услуги";
	private final String save = "Сохранить";
	private ArrayList<String> checkBoxListText = new ArrayList<String>();
	private ArrayList<String> panelListText = new ArrayList<String>();
	private ArrayList<String> ListText = new ArrayList<String>();
	private ArrayList<String> ListTextEnergy = new ArrayList<String>();
	private ArrayList<String> labelListTextEnergy = new ArrayList<String>();
	
	public GuiStrings() {
		initialize();
	}
	
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

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getCheckBoxListText() {
		return checkBoxListText;
	}

	public void setCheckBoxListText(ArrayList<String> checkBoxListText) {
		this.checkBoxListText = checkBoxListText;
	}

	public ArrayList<String> getPanelListText() {
		return panelListText;
	}

	public void setPanelListText(ArrayList<String> panelListText) {
		this.panelListText = panelListText;
	}

	public ArrayList<String> getListText() {
		return ListText;
	}

	public void setListText(ArrayList<String> listText) {
		ListText = listText;
	}

	public ArrayList<String> getListTextEnergy() {
		return ListTextEnergy;
	}

	public void setListTextEnergy(ArrayList<String> listTextEnergy) {
		ListTextEnergy = listTextEnergy;
	}

	public ArrayList<String> getLabelListTextEnergy() {
		return labelListTextEnergy;
	}

	public void setLabelListTextEnergy(ArrayList<String> labelListTextEnergy) {
		this.labelListTextEnergy = labelListTextEnergy;
	}

	public String getTotal() {
		return total;
	}

	public String getCalc() {
		return calc;
	}

	public String getAll() {
		return all;
	}

	public String getSave() {
		return save;
	}
	
}
