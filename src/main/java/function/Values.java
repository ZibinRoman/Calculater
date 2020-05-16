/**
 * пакет function;
 * */
package function;
/**
 * импортируем все необходимое для класса
 * */
import java.util.*;
import javax.swing.*;
/**
 * класс переменных
 * */
public class Values {
	
	private ArrayList<Boolean> booleanList = new ArrayList<Boolean>();//Коллекция состояний переключателей, на случай, если не нужно расчитать какой то тариф
	private ArrayList<Double> doubleListTarif = new ArrayList<Double>();//Коллекция тарифов
	private ArrayList<Double> doubleListValue = new ArrayList<Double>();//Коллекция тестируемых значений 
	private ArrayList<Double> doubleListTotal = new ArrayList<Double>();//Коллекция промежуточных значений
	private ArrayList<String> stringList = new ArrayList<String>();//коллекция
	private ArrayList<Double> doubleListTarifEnergy = new ArrayList<Double>();//Коллекция тарифов электроэнергии 
	private ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();//Коллекция тестируемых значений электроэнергии
	private ArrayList<Double> doubleListTotalEnergy = new ArrayList<Double>();//создание коллекции 
	private ArrayList<String> stringListEnergy = new ArrayList<String>();//Коллекция промежуточных значений электроэнергии
	private double value;
	private int toggle;
	/**
	 * инициализация переменных класса 
	 * */
	public Values(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue,  ArrayList<Double> doubleListValueEnergy, int toggle) {
		for (int i = 0; i < checkBoxList.size(); i++) {//Цикл for от 0 до размера коллекции checkBoxList
			this.getBooleanList().add(i, checkBoxList.get(i).isSelected());//Перевод состояний JCheckBox в коллекцию booleanList состояний
		}
		this.setDoubleListValue(doubleListValue);//Переменная при инициализации класс
		this.setDoubleListValueEnergy(doubleListValueEnergy);//Переменная при инициализации класс
		this.setToggle(toggle);//Переменная при инициализации класса
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Boolean> getBooleanList() {
		return booleanList;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setBooleanList(ArrayList<Boolean> booleanList) {
		this.booleanList = booleanList;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Double> getDoubleListTarif() {
		return doubleListTarif;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListTarif(ArrayList<Double> doubleListTarif) {
		this.doubleListTarif = doubleListTarif;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Double> getDoubleListValue() {
		return doubleListValue;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListValue(ArrayList<Double> doubleListValue) {
		this.doubleListValue = doubleListValue;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Double> getDoubleListTotal() {
		return doubleListTotal;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListTotal(ArrayList<Double> doubleListTotal) {
		this.doubleListTotal = doubleListTotal;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getStringList() {
		return stringList;
	}

	public void setStringList(ArrayList<String> stringList) {
		this.stringList = stringList;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Double> getDoubleListTarifEnergy() {
		return doubleListTarifEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListTarifEnergy(ArrayList<Double> doubleListTarifEnergy) {
		this.doubleListTarifEnergy = doubleListTarifEnergy;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Double> getDoubleListValueEnergy() {
		return doubleListValueEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListValueEnergy(ArrayList<Double> doubleListValueEnergy) {
		this.doubleListValueEnergy = doubleListValueEnergy;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<Double> getDoubleListTotalEnergy() {
		return doubleListTotalEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListTotalEnergy(ArrayList<Double> doubleListTotalEnergy) {
		this.doubleListTotalEnergy = doubleListTotalEnergy;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public ArrayList<String> getStringListEnergy() {
		return stringListEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setStringListEnergy(ArrayList<String> stringListEnergy) {
		this.stringListEnergy = stringListEnergy;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public double getValue() {
		return value;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setValue(double value) {
		this.value = value;
	}
	/**
	 * метод, которыйт получает значение переменной
	 * */
	public int getToggle() {
		return toggle;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setToggle(int toggle) {
		this.toggle = toggle;
	}
}
