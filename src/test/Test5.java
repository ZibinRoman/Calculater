/**
 * РџР°РєРµС‚ test
 */
package test;
/****
 * РЎС‚Р°С‚РёС‡РµСЃРєРёРµ РёРјРїРѕСЂС‚С‹
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * Р�РјРїРѕСЂС‚С‹
 */
import java.math.*;
import java.util.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;
/**
 * Пакет test
 */
package test;
/**
 * Статические импорты
 */
import static org.junit.jupiter.api.Assertions.*;
/***
 * Импорты
 */
import java.math.*;
import java.util.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;

/**
 * @author Roman
 * <h1>Класс Test1</h1>
 * <h2>Проводит 2 тест</h2>
 */
class Test1 {

	/**
	 * <h1>Метод test класса Test</h1>
	 * <br><i>Выполняет тест, по математической модели</i></br>
	 * <br><i>Второй тест</i></br>
	 * <h1>Вводимые значения:</h1>
	* @param Площадь = 450
* @param Жильцы = 2
* @param Отопление = 140.00 
* @param Холодная вода = 180.00 
* @param Горячая вода = 120.00 
* @param Газ = 110.00 
* @param Выбор фазы счетчика электроэнергии = 3 
* @param Тарифная зона 1 = 110.00 
* @param Тарифная зона 2 = 200.00 
* @param Тарифная зона 3 = 280.00	 * 
	 */
	@Test/*Аннотация, что данный метод тест*/
	public void test() {
		/**
		 * Инициализация переменных теста
		 */
		double testValue =  328900.76;/*переменная с которой происходит сравнение, значение теста*/
		double testingValue = 0;/*перенная с которой происходит сравнение, значение переменной 1 */
		ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();/*Коллекция, тип которой JCheckBox, рудимент теста*/
		ArrayList<Double> doubleListValue = new ArrayList<Double>();/*Коллекция, тип которой Double, отвечает за вводимые значения*/
		ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*Коллекция, тип которой Double, отвечает за вводимые значения, но только за электричество*/
		/**
		 * Задание параметров:
		 */
		double area = 450.00;/*Площадь*/
		int numberOfPersons = 2;/*Жильцы*/
		double heating = 140.00;/*Отопление*/
		double coldWater = 180.00;/*Холодная вода*/
		double hotWater = 120.00;/*Горячая вода*/
		double gas = 110.00;/*Газ*/
		int toggle = 3;/*Выбор фазы*/
		double fase1 = 110.00;/*Тарифная зона 1*/
		double fase2 = 200.00;/*Тарифная зона 2*/
		double fase3 = 280.00;/*Тарифная зона 2*/
		/**
		 * Инициализация checkBoxList, ∀(JCheckBox)setSelected = true
		 */
		for (int i = 0; i < 19; i++) {
			checkBoxList.add(i, new JCheckBox());/*добавление переменной в коллекцию checkBoxList*/
			checkBoxList.get(i).setSelected(true);/*переключение checkBoxList.get(i) в true*/
		}
		/**
		 * Инициализация doubleListValue, добавляются значения в коллекцию
		 */
		doubleListValue.add(0, area);/*Содержание*/
		doubleListValue.add(1, area);/*Уборка мест общего использования*/
		doubleListValue.add(2, 0.134640);/*Холодное водоснабжение при содержании общего имущества*/
		doubleListValue.add(3, 0.134600);/*Холодная вода на горячее водоснабжение при содержании общего имущества*/
		doubleListValue.add(4, 0.009102);/*Тепловая энергия горячего водоснабжения при содержании общего имущества*/
		doubleListValue.add(5, 0.134640);/*Отведение сточных вод холодной воды при содержании общего имущества*/
		doubleListValue.add(6, 0.134600);/*Отведение сточных вод горячей воды при содержании общего имущества*/
		doubleListValue.add(7, 19.29250);/*Электроэнергия при содержании общего имущества*/
		doubleListValue.add(8, heating);/*Отопление*/
		doubleListValue.add(9, coldWater);/*Холодное водоснабжение*/
		doubleListValue.add(10, hotWater);/*Холодное водоснабжение на нужды горячего водоснабжения*/
		doubleListValue.add(11, 0.135200);/*Тепловая энергия горячего водоснабжения*/
		doubleListValue.add(12, coldWater);/*Отведение сточных вод холодного водоснабжения*/
		doubleListValue.add(13, hotWater);/*Отведение сточных вод горячего водоснабжения*/
		doubleListValue.add(14, Double.valueOf(numberOfPersons));/*Обращение с твердыми коммунальными отходами*/
		doubleListValue.add(15, 1.00);/*Обслуживание телевизионной антенны*/
		doubleListValue.add(16, 1.00);/*Замочно-переговорное устройство*/
		doubleListValue.add(17, 1.00);/*Радио*/
		doubleListValue.add(18, gas);/*Газ*/
		/**
		 *  Инициализация doubleListValueEnergy, добавляются значения в коллекцию
		 */
		doubleListValueEnergy.add(0, fase1);/*Электроэнергия. Пиковая зона*/
		doubleListValueEnergy.add(1, fase2);/*Электроэнергия. Полупиковая зона*/
		doubleListValueEnergy.add(2, fase3);/*Электроэнергия. Ночная зона*/
		Function function = new Function(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);/*Создание переменной function типа Function*/
		function.initialize();/*Выполняется расчет*/
		testingValue = function.getValue(); /*значение переменной Value из класса Function*/
		assertEquals(testValue,  testingValue);/*сравнение двух значений*/
		assertTrue(testValue == testingValue);/*выполнение теста*/
	}

}

/**
 * 
 * @author Roman
 * <h1>Класс Test</h1>
 * <h2>Хранит значения, которые используются для расчета</h2>
 *
 */
class Values {
	/**
	 * Переменные коллеции
	 */
	private ArrayList<Boolean> booleanList = new ArrayList<Boolean>();/*Коллекция состояний переключателей, на случай, если не нужно расчитать какой то тариф*/
	private ArrayList<Double> doubleListTarif = new ArrayList<Double>();/*Коллекция тарифов*/
	private ArrayList<Double> doubleListValue = new ArrayList<Double>();/*Коллекция тестируемых значений*/
	private ArrayList<Double> doubleListTotal = new ArrayList<Double>();/*Коллекция промежуточных значений*/
	private ArrayList<Double> doubleListTarifEnergy = new ArrayList<Double>();/*Коллекция тарифов электроэнергии*/
	private ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*Коллекция тестируемых значений электроэнергии*/
	private ArrayList<Double> doubleListTotalEnergy = new ArrayList<Double>();/*Коллекция промежуточных значений электроэнергии*/
	
	/**
	 * Переменные 
	 */
	private double value;/*Итоговое значени*/
	private int toggle;/*Переключатель фаз*/
	
	/**
	 * <h1>Супер класс класса Values</h1>
	 * <h2>Переменные необходимые для расчета:</h2>
	 * @param checkBoxList
	 * @param doubleListValue
	 * @param doubleListValueEnergy
	 * @param toggle
	 */
	public Values(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue,  ArrayList<Double> doubleListValueEnergy, int toggle) {
		/**
		 * Перевод состояний JCheckBox в коллекцию booleanList состояний
		 */
		for (int i = 0; i < checkBoxList.size(); i++) {/*Цикл for от 0 до размера коллекции checkBoxList*/
			this.getBooleanList().add(i, checkBoxList.get(i).isSelected());/*Перевод состояний JCheckBox в коллекцию booleanList состояний*/
		}
		this.setDoubleListValue(doubleListValue);/*Переменная при инициализации класса*/
		this.setDoubleListValueEnergy(doubleListValueEnergy);/*Переменная при инициализации класса*/
		this.setToggle(toggle);/*Переменная при инициализации класса*/
	}
	
	/**
	 * Получить booleanList
	 * @return booleanList
	 */
	public ArrayList<Boolean> getBooleanList() {
		return booleanList;/*Вернуть booleanList*/
	}
	
	/**
	 * Установить booleanList
	 * @param booleanList
	 */
	public void setBooleanList(ArrayList<Boolean> booleanList) {
		this.booleanList = booleanList;/*Установить booleanList*/
	}
	
	/**
	 * Получить doubleListTarif
	 * @return doubleListTarif
	 */
	public ArrayList<Double> getDoubleListTarif() {
		return doubleListTarif;/*Вернуть doubleListTarif*/
	}
	
	/**
	 * Установить doubleListTarif
	 * @param doubleListTarif
	 */
	public void setDoubleListTarif(ArrayList<Double> doubleListTarif) {
		this.doubleListTarif = doubleListTarif;/*Установить doubleListTarif*/
	}
	
	/**
	 * Получить doubleListValue
	 * @return doubleListValue
	 */
	public ArrayList<Double> getDoubleListValue() {
		return doubleListValue;/*Вернуть doubleListValue*/
	}
	
	/**
	 * Установить doubleListValue
	 * @param doubleListValue
	 */
	public void setDoubleListValue(ArrayList<Double> doubleListValue) {
		this.doubleListValue = doubleListValue;/*Установить doubleListValue*/
	}
	
	/**
	 * Получить doubleListTotal
	 * @return doubleListTotal
	 */
	public ArrayList<Double> getDoubleListTotal() {
		return doubleListTotal;/*Вернуть doubleListTotal*/ 
	}
	
	/**
	 * Установить doubleListTotal
	 * @param doubleListTotal
	 */
	public void setDoubleListTotal(ArrayList<Double> doubleListTotal) {
		this.doubleListTotal = doubleListTotal;/*Установить doubleListTotal*/
	}
	
	/**
	 * Получить doubleListTarifEnergy
	 * @return doubleListTarifEnergy
	 */
	public ArrayList<Double> getDoubleListTarifEnergy() {
		return doubleListTarifEnergy;/*Вернуть doubleListTarifEnergy*/ 
	}
	
	/**
	 * Установить doubleListTarifEnergy
	 * @param doubleListTarifEnergy
	 */
	public void setDoubleListTarifEnergy(ArrayList<Double> doubleListTarifEnergy) {
		this.doubleListTarifEnergy = doubleListTarifEnergy;/*Установить doubleListTarifEnergy*/
	}
	
	/**
	 * Получить doubleListValueEnergy
	 * @return doubleListValueEnergy
	 */
	public ArrayList<Double> getDoubleListValueEnergy() {
		return doubleListValueEnergy;/*Вернуть doubleListValueEnergy*/ 
	}
	
	/**
	 * Установить doubleListValueEnergy
	 * @param doubleListValueEnergy
	 */
	public void setDoubleListValueEnergy(ArrayList<Double> doubleListValueEnergy) {
		this.doubleListValueEnergy = doubleListValueEnergy;/*Установить doubleListValueEnergy*/
	}
	
	/**
	 * Получить doubleListTotalEnergy
	 * @return doubleListTotalEnergy
	 */
	public ArrayList<Double> getDoubleListTotalEnergy() {
		return doubleListTotalEnergy;/*Вернуть doubleListTotalEnergy*/ 
	}
	
	/**
	 * Установить doubleListTotalEnergy
	 * @param doubleListTotalEnergy
	 */
	public void setDoubleListTotalEnergy(ArrayList<Double> doubleListTotalEnergy) {
		this.doubleListTotalEnergy = doubleListTotalEnergy;/*Установить doubleListTotalEnergy*/
	}
	
	/**
	 * Получить value
	 * @return value
	 */
	public double getValue() {
		return value;/*Вернуть value*/
	}
	
	/**
	 * Установить value
	 * @param value
	 */
	public void setValue(double value) {
		this.value = value;/*/*Установить value*/
	}
	
	/**
	 * Получить toggle
	 * @return toggle
	 */
	public int getToggle() {
		return toggle;/*Вернуть value*/
	}
	
	/**
	 * Установить toggle
	 * @param toggle
	 */
	public void setToggle(int toggle) {
		this.toggle = toggle;/*Устаноить toggle*/
	}
	
}

/**
 * 
 * @author Roman
 * <h1>Класс Function</h1>
 * <h2>Математическая модель, выполняет расчеты</h2>
 *
 */
class Function extends Values {
	
	/**
	 * <h1>Супер класс класса Function</h1>
	 * <h2>Переменные необходимые для расчета:</h2>
	 * @param checkBoxList
	 * @param doubleListValue
	 * @param doubleListValueEnergy
	 * @param toggle
	 */
	public Function(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListValueEnergy, int toggle) {
		super(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);/*Переменные при инициализации класса*/
	}
	
	/**
	 * <h1>Метод initialize класса Function</h1>
	 * <h2>Инициализирует коллекции тарифов и выполняет метод расчета</h2> 
	 */
	public void initialize() {
		/**
		* Иницализация коллекции тарифов doubleListTarifEnergy
		*/
		switch (getToggle()) {/*Зависимость от выбора фазы счетчика электроэнергии*/
			case 1:/*Одноставочный тариф*/
				getDoubleListTarifEnergy().add(0, 2.22);/*Одноставочный тариф*/
				break;/*Остановка выполнения*/
			case 2:/*Тариф по двум зонам*/
				getDoubleListTarifEnergy().add(0, 2.55);/*Дневная зона*/
				getDoubleListTarifEnergy().add(1, 1.78);/*Ночная зона*/
				break;/*Остановка выполнения*/
			case 3:/*Тариф по трем зонам*/
				getDoubleListTarifEnergy().add(0, 4.12);/*Пиковая зона*/
				getDoubleListTarifEnergy().add(1, 3.17);/*Полупиковая зона*/
				getDoubleListTarifEnergy().add(2, 2.54);/*Ночная зона*/
				break;/*Остановка выполнения*/
			default:/*По умолчанию*/
				break;/*Остановка выполнения*/
		}
		/**
		* Иницализация коллекции тарифов doubleListTarif
		*/
		getDoubleListTarif().add(0, 20.16);/*Содержание*/
		getDoubleListTarif().add(1, 1.80);/*Уборка мест общего использования*/
		getDoubleListTarif().add(2, 25.68);/*Холодное водоснабжение при содержании общего имущества*/
		getDoubleListTarif().add(3, 25.68);/*Холодная вода на горячее водоснабжение при содержании общего имущества*/
		getDoubleListTarif().add(4, 2134.16);/*Тепловая энергия горячего водоснабжения при содержании общего имущества*/
		getDoubleListTarif().add(5, 30.59);/*Отведение сточных вод холодной воды при содержании общего имущества*/
		getDoubleListTarif().add(6, 30.59);/*Отведение сточных вод горячей воды при содержании общего имущества*/
		getDoubleListTarif().add(7, 2.22);/*Электроэнергия при содержании общего имущества*/
		getDoubleListTarif().add(8, 2134.16);/*Отопление"*/
		getDoubleListTarif().add(9, 25.68);/*Холодное водоснабжение*/
		getDoubleListTarif().add(10, 25.68);/*Холодное водоснабжение на нужды горячего водоснабжения*/
		getDoubleListTarif().add(11, 2134.16);/*Тепловая энергия горячего водоснабжения*/
		getDoubleListTarif().add(12, 30.59);/*Отведение сточных вод холодного водоснабжения*/
		getDoubleListTarif().add(13,30.59);/*Отведение сточных вод горячего водоснабжения*/
		getDoubleListTarif().add(14,70.00);/*Обращение с твердыми коммунальными отходами*/
		getDoubleListTarif().add(15,100.00);/*Обслуживание телевизионной антенны*/
		getDoubleListTarif().add(16,30.00);/*Замочно-переговорное устройство*/
		getDoubleListTarif().add(17,140.00);/*Радио*/
		getDoubleListTarif().add(18,7.10);/*Газ*/
		setValueOf(getBooleanList(), getDoubleListTarif(), getDoubleListValue(), getDoubleListTarifEnergy(), getDoubleListValueEnergy());/*Вызов метода setValueOf*/
	}
	
	/**
	 * <h1>Метод setValueOf класса Function</h1>
	 * <i>Выполняет расчет, по математической модели</i>
	 * <h2>Переменные необходимые для расчета:</h2>
	 * @param booleanList
	 * @param doubleListTarif
	 * @param doubleListValue
	 * @param doubleListTarifEnergy
	 * @param doubleListValueEnergy
	 */
	private void setValueOf(ArrayList<Boolean> booleanList, ArrayList<Double> doubleListTarif, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListTarifEnergy , ArrayList<Double> doubleListValueEnergy){
		/**
		 * try на случай ошибки
		 */
		try {
			for (int i = 0; i < booleanList.size(); i++) {
				getDoubleListTotal().add(i, round(setValueOf(booleanList.get(i), doubleListTarif.get(i), doubleListValue.get(i)), 2 ));/*Заполнение коллекции промежуточных значений*/
				setValue(getDoubleListTotal().get(i) + getValue());/*Сложение предыдущего итогого значения и коллекции промежуточных значений*/
			}
			for (int i = 0; i < doubleListTarifEnergy.size(); i++) {
				getDoubleListTotalEnergy().add(i, round(setValueOf(true, doubleListTarifEnergy.get(i), doubleListValueEnergy.get(i)) , 2));/*Заполнение коллекции промежуточных значений электроэнергии*/
				setValue(getDoubleListTotalEnergy().get(i) + getValue());/*Сложение предыдущего итогого значения и коллекции промежуточных значений электроэнергии*/
			}
			setValue(round(getValue(), 2));/*Округление до 2 знаков после запятой и запись итогого значения*/
		}
		/**
		 * catch сработает в случае ошибки
		 */
		catch (Exception e) {
			e.printStackTrace();/*Вывод в консоль действий, которые привели к ошибке*/
		}
	}
	
	/**
	 * <h1>Метод setValueOf класса Function</h1>
	 * <i>Выполняет расчет, по математической модели</i>
	 * <h2>Переменные необходимые для расчета:</h2>
	 * @param booleanList
	 * @param doubleListTarif
	 * @param doubleListValue
	 * @return
	 * <i>Возращает умноженное значение</i>
	 * <br>doubleListTarif * doubleListValue</br>
	 */
	private double setValueOf(boolean booleanList, double doubleListTarif, double doubleListValue) {
		double value = 0;/*value = 0*/
		if (booleanList) {/*Нужен ли расчет*/
			value = doubleListTarif * doubleListValue;/*Умножение doubleListTarif на doubleListValue*/
			return value;/*Вернуть полученное значение*/
		} else {/*Иначе*/
			value = 0;/*value = 0*/
			return value;/*Вернуть полученное значение*/
		}
	}
	/**
	 * <h1>Метод round класса Function</h1>
	 * <i>Выполняет округление до b знаков после запятой</i>
	 * <h2>Переменные необходимые для расчета:</h2>
	 * @param a <i>число</i>
	 * @param b <i>до скольки знаков после запятой</i>
	 * @return <i>округленное число a до b знаков после запятой</i>
	 */
	private double round(double a, int b) {
		if(b < 0) throw new IllegalArgumentException();/*Проверка b*/
		BigDecimal c = new BigDecimal(Double.toString(a));/*Переменная, которая будет использована для округления*/
		c = c.setScale(b, RoundingMode.HALF_UP);/*Округление вида HALF_UP*/
		return c.doubleValue();/*Вернуть округленное значение*/
	}

}


/**
 * @author Roman
 * <h1>РљР»Р°СЃСЃ Test1</h1>
 * <h2>РџСЂРѕРІРѕРґРёС‚ 2 С‚РµСЃС‚</h2>
 */
class Test1 {

	/**
	 * <h1>РњРµС‚РѕРґ test РєР»Р°СЃСЃР° Test</h1>
	 * <br><i>Р’С‹РїРѕР»РЅСЏРµС‚ С‚РµСЃС‚, РїРѕ РјР°С‚РµРјР°С‚РёС‡РµСЃРєРѕР№ РјРѕРґРµР»Рё</i></br>
	 * <br><i>Р’С‚РѕСЂРѕР№ С‚РµСЃС‚</i></br>
	 * <h1>Р’РІРѕРґРёРјС‹Рµ Р·РЅР°С‡РµРЅРёСЏ:</h1>
	* @param РџР»РѕС‰Р°РґСЊ = 450
* @param Р–РёР»СЊС†С‹ = 2
* @param РћС‚РѕРїР»РµРЅРёРµ = 140.00 
* @param РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР° = 180.00 
* @param Р“РѕСЂСЏС‡Р°СЏ РІРѕРґР° = 120.00 
* @param Р“Р°Р· = 110.00 
* @param Р’С‹Р±РѕСЂ С„Р°Р·С‹ СЃС‡РµС‚С‡РёРєР° СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё = 3 
* @param РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 1 = 110.00 
* @param РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 2 = 200.00 
* @param РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 3 = 280.00	 * 
	 */
	@Test/*РђРЅРЅРѕС‚Р°С†РёСЏ, С‡С‚Рѕ РґР°РЅРЅС‹Р№ РјРµС‚РѕРґ С‚РµСЃС‚*/
	public void test() {
		/**
		 * Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РїРµСЂРµРјРµРЅРЅС‹С… С‚РµСЃС‚Р°
		 */
		double testValue =  328900.76;/*РїРµСЂРµРјРµРЅРЅР°СЏ СЃ РєРѕС‚РѕСЂРѕР№ РїСЂРѕРёСЃС…РѕРґРёС‚ СЃСЂР°РІРЅРµРЅРёРµ, Р·РЅР°С‡РµРЅРёРµ С‚РµСЃС‚Р°*/
		double testingValue = 0;/*РїРµСЂРµРЅРЅР°СЏ СЃ РєРѕС‚РѕСЂРѕР№ РїСЂРѕРёСЃС…РѕРґРёС‚ СЃСЂР°РІРЅРµРЅРёРµ, Р·РЅР°С‡РµРЅРёРµ РїРµСЂРµРјРµРЅРЅРѕР№ 1 */
		ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();/*РљРѕР»Р»РµРєС†РёСЏ, С‚РёРї РєРѕС‚РѕСЂРѕР№ JCheckBox, СЂСѓРґРёРјРµРЅС‚ С‚РµСЃС‚Р°*/
		ArrayList<Double> doubleListValue = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ, С‚РёРї РєРѕС‚РѕСЂРѕР№ Double, РѕС‚РІРµС‡Р°РµС‚ Р·Р° РІРІРѕРґРёРјС‹Рµ Р·РЅР°С‡РµРЅРёСЏ*/
		ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ, С‚РёРї РєРѕС‚РѕСЂРѕР№ Double, РѕС‚РІРµС‡Р°РµС‚ Р·Р° РІРІРѕРґРёРјС‹Рµ Р·РЅР°С‡РµРЅРёСЏ, РЅРѕ С‚РѕР»СЊРєРѕ Р·Р° СЌР»РµРєС‚СЂРёС‡РµСЃС‚РІРѕ*/
		/**
		 * Р—Р°РґР°РЅРёРµ РїР°СЂР°РјРµС‚СЂРѕРІ:
		 */
		double area = 450.00;/*РџР»РѕС‰Р°РґСЊ*/
		int numberOfPersons = 2;/*Р–РёР»СЊС†С‹*/
		double heating = 140.00;/*РћС‚РѕРїР»РµРЅРёРµ*/
		double coldWater = 180.00;/*РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР°*/
		double hotWater = 120.00;/*Р“РѕСЂСЏС‡Р°СЏ РІРѕРґР°*/
		double gas = 110.00;/*Р“Р°Р·*/
		int toggle = 3;/*Р’С‹Р±РѕСЂ С„Р°Р·С‹*/
		double fase1 = 110.00;/*РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 1*/
		double fase2 = 200.00;/*РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 2*/
		double fase3 = 280.00;/*РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 2*/
		/**
		 * Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ checkBoxList, в€Ђ(JCheckBox)setSelected = true
		 */
		for (int i = 0; i < 19; i++) {
			checkBoxList.add(i, new JCheckBox());/*РґРѕР±Р°РІР»РµРЅРёРµ РїРµСЂРµРјРµРЅРЅРѕР№ РІ РєРѕР»Р»РµРєС†РёСЋ checkBoxList*/
			checkBoxList.get(i).setSelected(true);/*РїРµСЂРµРєР»СЋС‡РµРЅРёРµ checkBoxList.get(i) РІ true*/
		}
		/**
		 * Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ doubleListValue, РґРѕР±Р°РІР»СЏСЋС‚СЃСЏ Р·РЅР°С‡РµРЅРёСЏ РІ РєРѕР»Р»РµРєС†РёСЋ
		 */
		doubleListValue.add(0, area);/*РЎРѕРґРµСЂР¶Р°РЅРёРµ*/
		doubleListValue.add(1, area);/*РЈР±РѕСЂРєР° РјРµСЃС‚ РѕР±С‰РµРіРѕ РёСЃРїРѕР»СЊР·РѕРІР°РЅРёСЏ*/
		doubleListValue.add(2, 0.134640);/*РҐРѕР»РѕРґРЅРѕРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		doubleListValue.add(3, 0.134600);/*РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР° РЅР° РіРѕСЂСЏС‡РµРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		doubleListValue.add(4, 0.009102);/*РўРµРїР»РѕРІР°СЏ СЌРЅРµСЂРіРёСЏ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		doubleListValue.add(5, 0.134640);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ С…РѕР»РѕРґРЅРѕР№ РІРѕРґС‹ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		doubleListValue.add(6, 0.134600);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ РіРѕСЂСЏС‡РµР№ РІРѕРґС‹ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		doubleListValue.add(7, 19.29250);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		doubleListValue.add(8, heating);/*РћС‚РѕРїР»РµРЅРёРµ*/
		doubleListValue.add(9, coldWater);/*РҐРѕР»РѕРґРЅРѕРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ*/
		doubleListValue.add(10, hotWater);/*РҐРѕР»РѕРґРЅРѕРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ РЅР° РЅСѓР¶РґС‹ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		doubleListValue.add(11, 0.135200);/*РўРµРїР»РѕРІР°СЏ СЌРЅРµСЂРіРёСЏ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		doubleListValue.add(12, coldWater);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ С…РѕР»РѕРґРЅРѕРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		doubleListValue.add(13, hotWater);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		doubleListValue.add(14, Double.valueOf(numberOfPersons));/*РћР±СЂР°С‰РµРЅРёРµ СЃ С‚РІРµСЂРґС‹РјРё РєРѕРјРјСѓРЅР°Р»СЊРЅС‹РјРё РѕС‚С…РѕРґР°РјРё*/
		doubleListValue.add(15, 1.00);/*РћР±СЃР»СѓР¶РёРІР°РЅРёРµ С‚РµР»РµРІРёР·РёРѕРЅРЅРѕР№ Р°РЅС‚РµРЅРЅС‹*/
		doubleListValue.add(16, 1.00);/*Р—Р°РјРѕС‡РЅРѕ-РїРµСЂРµРіРѕРІРѕСЂРЅРѕРµ СѓСЃС‚СЂРѕР№СЃС‚РІРѕ*/
		doubleListValue.add(17, 1.00);/*Р Р°РґРёРѕ*/
		doubleListValue.add(18, gas);/*Р“Р°Р·*/
		/**
		 *  Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ doubleListValueEnergy, РґРѕР±Р°РІР»СЏСЋС‚СЃСЏ Р·РЅР°С‡РµРЅРёСЏ РІ РєРѕР»Р»РµРєС†РёСЋ
		 */
		doubleListValueEnergy.add(0, fase1);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ. РџРёРєРѕРІР°СЏ Р·РѕРЅР°*/
		doubleListValueEnergy.add(1, fase2);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ. РџРѕР»СѓРїРёРєРѕРІР°СЏ Р·РѕРЅР°*/
		doubleListValueEnergy.add(2, fase3);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ. РќРѕС‡РЅР°СЏ Р·РѕРЅР°*/
		Function function = new Function(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);/*РЎРѕР·РґР°РЅРёРµ РїРµСЂРµРјРµРЅРЅРѕР№ function С‚РёРїР° Function*/
		function.initialize();/*Р’С‹РїРѕР»РЅСЏРµС‚СЃСЏ СЂР°СЃС‡РµС‚*/
		testingValue = function.getValue(); /*Р·РЅР°С‡РµРЅРёРµ РїРµСЂРµРјРµРЅРЅРѕР№ Value РёР· РєР»Р°СЃСЃР° Function*/
		assertEquals(testValue,  testingValue);/*СЃСЂР°РІРЅРµРЅРёРµ РґРІСѓС… Р·РЅР°С‡РµРЅРёР№*/
		assertTrue(testValue == testingValue);/*РІС‹РїРѕР»РЅРµРЅРёРµ С‚РµСЃС‚Р°*/
	}

}

/**
 * 
 * @author Roman
 * <h1>РљР»Р°СЃСЃ Test</h1>
 * <h2>РҐСЂР°РЅРёС‚ Р·РЅР°С‡РµРЅРёСЏ, РєРѕС‚РѕСЂС‹Рµ РёСЃРїРѕР»СЊР·СѓСЋС‚СЃСЏ РґР»СЏ СЂР°СЃС‡РµС‚Р°</h2>
 *
 */
class Values {
	/**
	 * РџРµСЂРµРјРµРЅРЅС‹Рµ РєРѕР»Р»РµС†РёРё
	 */
	private ArrayList<Boolean> booleanList = new ArrayList<Boolean>();/*РљРѕР»Р»РµРєС†РёСЏ СЃРѕСЃС‚РѕСЏРЅРёР№ РїРµСЂРµРєР»СЋС‡Р°С‚РµР»РµР№, РЅР° СЃР»СѓС‡Р°Р№, РµСЃР»Рё РЅРµ РЅСѓР¶РЅРѕ СЂР°СЃС‡РёС‚Р°С‚СЊ РєР°РєРѕР№ С‚Рѕ С‚Р°СЂРёС„*/
	private ArrayList<Double> doubleListTarif = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ С‚Р°СЂРёС„РѕРІ*/
	private ArrayList<Double> doubleListValue = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ С‚РµСЃС‚РёСЂСѓРµРјС‹С… Р·РЅР°С‡РµРЅРёР№*/
	private ArrayList<Double> doubleListTotal = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ РїСЂРѕРјРµР¶СѓС‚РѕС‡РЅС‹С… Р·РЅР°С‡РµРЅРёР№*/
	private ArrayList<Double> doubleListTarifEnergy = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ С‚Р°СЂРёС„РѕРІ СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё*/
	private ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ С‚РµСЃС‚РёСЂСѓРµРјС‹С… Р·РЅР°С‡РµРЅРёР№ СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё*/
	private ArrayList<Double> doubleListTotalEnergy = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ РїСЂРѕРјРµР¶СѓС‚РѕС‡РЅС‹С… Р·РЅР°С‡РµРЅРёР№ СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё*/
	
	/**
	 * РџРµСЂРµРјРµРЅРЅС‹Рµ 
	 */
	private double value;/*Р�С‚РѕРіРѕРІРѕРµ Р·РЅР°С‡РµРЅРё*/
	private int toggle;/*РџРµСЂРµРєР»СЋС‡Р°С‚РµР»СЊ С„Р°Р·*/
	
	/**
	 * <h1>РЎСѓРїРµСЂ РєР»Р°СЃСЃ РєР»Р°СЃСЃР° Values</h1>
	 * <h2>РџРµСЂРµРјРµРЅРЅС‹Рµ РЅРµРѕР±С…РѕРґРёРјС‹Рµ РґР»СЏ СЂР°СЃС‡РµС‚Р°:</h2>
	 * @param checkBoxList
	 * @param doubleListValue
	 * @param doubleListValueEnergy
	 * @param toggle
	 */
	public Values(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue,  ArrayList<Double> doubleListValueEnergy, int toggle) {
		/**
		 * РџРµСЂРµРІРѕРґ СЃРѕСЃС‚РѕСЏРЅРёР№ JCheckBox РІ РєРѕР»Р»РµРєС†РёСЋ booleanList СЃРѕСЃС‚РѕСЏРЅРёР№
		 */
		for (int i = 0; i < checkBoxList.size(); i++) {/*Р¦РёРєР» for РѕС‚ 0 РґРѕ СЂР°Р·РјРµСЂР° РєРѕР»Р»РµРєС†РёРё checkBoxList*/
			this.getBooleanList().add(i, checkBoxList.get(i).isSelected());/*РџРµСЂРµРІРѕРґ СЃРѕСЃС‚РѕСЏРЅРёР№ JCheckBox РІ РєРѕР»Р»РµРєС†РёСЋ booleanList СЃРѕСЃС‚РѕСЏРЅРёР№*/
		}
		this.setDoubleListValue(doubleListValue);/*РџРµСЂРµРјРµРЅРЅР°СЏ РїСЂРё РёРЅРёС†РёР°Р»РёР·Р°С†РёРё РєР»Р°СЃСЃР°*/
		this.setDoubleListValueEnergy(doubleListValueEnergy);/*РџРµСЂРµРјРµРЅРЅР°СЏ РїСЂРё РёРЅРёС†РёР°Р»РёР·Р°С†РёРё РєР»Р°СЃСЃР°*/
		this.setToggle(toggle);/*РџРµСЂРµРјРµРЅРЅР°СЏ РїСЂРё РёРЅРёС†РёР°Р»РёР·Р°С†РёРё РєР»Р°СЃСЃР°*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ booleanList
	 * @return booleanList
	 */
	public ArrayList<Boolean> getBooleanList() {
		return booleanList;/*Р’РµСЂРЅСѓС‚СЊ booleanList*/
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ booleanList
	 * @param booleanList
	 */
	public void setBooleanList(ArrayList<Boolean> booleanList) {
		this.booleanList = booleanList;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ booleanList*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ doubleListTarif
	 * @return doubleListTarif
	 */
	public ArrayList<Double> getDoubleListTarif() {
		return doubleListTarif;/*Р’РµСЂРЅСѓС‚СЊ doubleListTarif*/
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTarif
	 * @param doubleListTarif
	 */
	public void setDoubleListTarif(ArrayList<Double> doubleListTarif) {
		this.doubleListTarif = doubleListTarif;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTarif*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ doubleListValue
	 * @return doubleListValue
	 */
	public ArrayList<Double> getDoubleListValue() {
		return doubleListValue;/*Р’РµСЂРЅСѓС‚СЊ doubleListValue*/
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListValue
	 * @param doubleListValue
	 */
	public void setDoubleListValue(ArrayList<Double> doubleListValue) {
		this.doubleListValue = doubleListValue;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListValue*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ doubleListTotal
	 * @return doubleListTotal
	 */
	public ArrayList<Double> getDoubleListTotal() {
		return doubleListTotal;/*Р’РµСЂРЅСѓС‚СЊ doubleListTotal*/ 
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTotal
	 * @param doubleListTotal
	 */
	public void setDoubleListTotal(ArrayList<Double> doubleListTotal) {
		this.doubleListTotal = doubleListTotal;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTotal*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ doubleListTarifEnergy
	 * @return doubleListTarifEnergy
	 */
	public ArrayList<Double> getDoubleListTarifEnergy() {
		return doubleListTarifEnergy;/*Р’РµСЂРЅСѓС‚СЊ doubleListTarifEnergy*/ 
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTarifEnergy
	 * @param doubleListTarifEnergy
	 */
	public void setDoubleListTarifEnergy(ArrayList<Double> doubleListTarifEnergy) {
		this.doubleListTarifEnergy = doubleListTarifEnergy;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTarifEnergy*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ doubleListValueEnergy
	 * @return doubleListValueEnergy
	 */
	public ArrayList<Double> getDoubleListValueEnergy() {
		return doubleListValueEnergy;/*Р’РµСЂРЅСѓС‚СЊ doubleListValueEnergy*/ 
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListValueEnergy
	 * @param doubleListValueEnergy
	 */
	public void setDoubleListValueEnergy(ArrayList<Double> doubleListValueEnergy) {
		this.doubleListValueEnergy = doubleListValueEnergy;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListValueEnergy*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ doubleListTotalEnergy
	 * @return doubleListTotalEnergy
	 */
	public ArrayList<Double> getDoubleListTotalEnergy() {
		return doubleListTotalEnergy;/*Р’РµСЂРЅСѓС‚СЊ doubleListTotalEnergy*/ 
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTotalEnergy
	 * @param doubleListTotalEnergy
	 */
	public void setDoubleListTotalEnergy(ArrayList<Double> doubleListTotalEnergy) {
		this.doubleListTotalEnergy = doubleListTotalEnergy;/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ doubleListTotalEnergy*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ value
	 * @return value
	 */
	public double getValue() {
		return value;/*Р’РµСЂРЅСѓС‚СЊ value*/
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ value
	 * @param value
	 */
	public void setValue(double value) {
		this.value = value;/*/*РЈСЃС‚Р°РЅРѕРІРёС‚СЊ value*/
	}
	
	/**
	 * РџРѕР»СѓС‡РёС‚СЊ toggle
	 * @return toggle
	 */
	public int getToggle() {
		return toggle;/*Р’РµСЂРЅСѓС‚СЊ value*/
	}
	
	/**
	 * РЈСЃС‚Р°РЅРѕРІРёС‚СЊ toggle
	 * @param toggle
	 */
	public void setToggle(int toggle) {
		this.toggle = toggle;/*РЈСЃС‚Р°РЅРѕРёС‚СЊ toggle*/
	}
	
}

/**
 * 
 * @author Roman
 * <h1>РљР»Р°СЃСЃ Function</h1>
 * <h2>РњР°С‚РµРјР°С‚РёС‡РµСЃРєР°СЏ РјРѕРґРµР»СЊ, РІС‹РїРѕР»РЅСЏРµС‚ СЂР°СЃС‡РµС‚С‹</h2>
 *
 */
class Function extends Values {
	
	/**
	 * <h1>РЎСѓРїРµСЂ РєР»Р°СЃСЃ РєР»Р°СЃСЃР° Function</h1>
	 * <h2>РџРµСЂРµРјРµРЅРЅС‹Рµ РЅРµРѕР±С…РѕРґРёРјС‹Рµ РґР»СЏ СЂР°СЃС‡РµС‚Р°:</h2>
	 * @param checkBoxList
	 * @param doubleListValue
	 * @param doubleListValueEnergy
	 * @param toggle
	 */
	public Function(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListValueEnergy, int toggle) {
		super(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);/*РџРµСЂРµРјРµРЅРЅС‹Рµ РїСЂРё РёРЅРёС†РёР°Р»РёР·Р°С†РёРё РєР»Р°СЃСЃР°*/
	}
	
	/**
	 * <h1>РњРµС‚РѕРґ initialize РєР»Р°СЃСЃР° Function</h1>
	 * <h2>Р�РЅРёС†РёР°Р»РёР·РёСЂСѓРµС‚ РєРѕР»Р»РµРєС†РёРё С‚Р°СЂРёС„РѕРІ Рё РІС‹РїРѕР»РЅСЏРµС‚ РјРµС‚РѕРґ СЂР°СЃС‡РµС‚Р°</h2> 
	 */
	public void initialize() {
		/**
		* Р�РЅРёС†Р°Р»РёР·Р°С†РёСЏ РєРѕР»Р»РµРєС†РёРё С‚Р°СЂРёС„РѕРІ doubleListTarifEnergy
		*/
		switch (getToggle()) {/*Р—Р°РІРёСЃРёРјРѕСЃС‚СЊ РѕС‚ РІС‹Р±РѕСЂР° С„Р°Р·С‹ СЃС‡РµС‚С‡РёРєР° СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё*/
			case 1:/*РћРґРЅРѕСЃС‚Р°РІРѕС‡РЅС‹Р№ С‚Р°СЂРёС„*/
				getDoubleListTarifEnergy().add(0, 2.22);/*РћРґРЅРѕСЃС‚Р°РІРѕС‡РЅС‹Р№ С‚Р°СЂРёС„*/
				break;/*РћСЃС‚Р°РЅРѕРІРєР° РІС‹РїРѕР»РЅРµРЅРёСЏ*/
			case 2:/*РўР°СЂРёС„ РїРѕ РґРІСѓРј Р·РѕРЅР°Рј*/
				getDoubleListTarifEnergy().add(0, 2.55);/*Р”РЅРµРІРЅР°СЏ Р·РѕРЅР°*/
				getDoubleListTarifEnergy().add(1, 1.78);/*РќРѕС‡РЅР°СЏ Р·РѕРЅР°*/
				break;/*РћСЃС‚Р°РЅРѕРІРєР° РІС‹РїРѕР»РЅРµРЅРёСЏ*/
			case 3:/*РўР°СЂРёС„ РїРѕ С‚СЂРµРј Р·РѕРЅР°Рј*/
				getDoubleListTarifEnergy().add(0, 4.12);/*РџРёРєРѕРІР°СЏ Р·РѕРЅР°*/
				getDoubleListTarifEnergy().add(1, 3.17);/*РџРѕР»СѓРїРёРєРѕРІР°СЏ Р·РѕРЅР°*/
				getDoubleListTarifEnergy().add(2, 2.54);/*РќРѕС‡РЅР°СЏ Р·РѕРЅР°*/
				break;/*РћСЃС‚Р°РЅРѕРІРєР° РІС‹РїРѕР»РЅРµРЅРёСЏ*/
			default:/*РџРѕ СѓРјРѕР»С‡Р°РЅРёСЋ*/
				break;/*РћСЃС‚Р°РЅРѕРІРєР° РІС‹РїРѕР»РЅРµРЅРёСЏ*/
		}
		/**
		* Р�РЅРёС†Р°Р»РёР·Р°С†РёСЏ РєРѕР»Р»РµРєС†РёРё С‚Р°СЂРёС„РѕРІ doubleListTarif
		*/
		getDoubleListTarif().add(0, 20.16);/*РЎРѕРґРµСЂР¶Р°РЅРёРµ*/
		getDoubleListTarif().add(1, 1.80);/*РЈР±РѕСЂРєР° РјРµСЃС‚ РѕР±С‰РµРіРѕ РёСЃРїРѕР»СЊР·РѕРІР°РЅРёСЏ*/
		getDoubleListTarif().add(2, 25.68);/*РҐРѕР»РѕРґРЅРѕРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		getDoubleListTarif().add(3, 25.68);/*РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР° РЅР° РіРѕСЂСЏС‡РµРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		getDoubleListTarif().add(4, 2134.16);/*РўРµРїР»РѕРІР°СЏ СЌРЅРµСЂРіРёСЏ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		getDoubleListTarif().add(5, 30.59);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ С…РѕР»РѕРґРЅРѕР№ РІРѕРґС‹ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		getDoubleListTarif().add(6, 30.59);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ РіРѕСЂСЏС‡РµР№ РІРѕРґС‹ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		getDoubleListTarif().add(7, 2.22);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ РїСЂРё СЃРѕРґРµСЂР¶Р°РЅРёРё РѕР±С‰РµРіРѕ РёРјСѓС‰РµСЃС‚РІР°*/
		getDoubleListTarif().add(8, 2134.16);/*РћС‚РѕРїР»РµРЅРёРµ"*/
		getDoubleListTarif().add(9, 25.68);/*РҐРѕР»РѕРґРЅРѕРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ*/
		getDoubleListTarif().add(10, 25.68);/*РҐРѕР»РѕРґРЅРѕРµ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ РЅР° РЅСѓР¶РґС‹ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		getDoubleListTarif().add(11, 2134.16);/*РўРµРїР»РѕРІР°СЏ СЌРЅРµСЂРіРёСЏ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		getDoubleListTarif().add(12, 30.59);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ С…РѕР»РѕРґРЅРѕРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		getDoubleListTarif().add(13,30.59);/*РћС‚РІРµРґРµРЅРёРµ СЃС‚РѕС‡РЅС‹С… РІРѕРґ РіРѕСЂСЏС‡РµРіРѕ РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёСЏ*/
		getDoubleListTarif().add(14,70.00);/*РћР±СЂР°С‰РµРЅРёРµ СЃ С‚РІРµСЂРґС‹РјРё РєРѕРјРјСѓРЅР°Р»СЊРЅС‹РјРё РѕС‚С…РѕРґР°РјРё*/
		getDoubleListTarif().add(15,100.00);/*РћР±СЃР»СѓР¶РёРІР°РЅРёРµ С‚РµР»РµРІРёР·РёРѕРЅРЅРѕР№ Р°РЅС‚РµРЅРЅС‹*/
		getDoubleListTarif().add(16,30.00);/*Р—Р°РјРѕС‡РЅРѕ-РїРµСЂРµРіРѕРІРѕСЂРЅРѕРµ СѓСЃС‚СЂРѕР№СЃС‚РІРѕ*/
		getDoubleListTarif().add(17,140.00);/*Р Р°РґРёРѕ*/
		getDoubleListTarif().add(18,7.10);/*Р“Р°Р·*/
		setValueOf(getBooleanList(), getDoubleListTarif(), getDoubleListValue(), getDoubleListTarifEnergy(), getDoubleListValueEnergy());/*Р’С‹Р·РѕРІ РјРµС‚РѕРґР° setValueOf*/
	}
	
	/**
	 * <h1>РњРµС‚РѕРґ setValueOf РєР»Р°СЃСЃР° Function</h1>
	 * <i>Р’С‹РїРѕР»РЅСЏРµС‚ СЂР°СЃС‡РµС‚, РїРѕ РјР°С‚РµРјР°С‚РёС‡РµСЃРєРѕР№ РјРѕРґРµР»Рё</i>
	 * <h2>РџРµСЂРµРјРµРЅРЅС‹Рµ РЅРµРѕР±С…РѕРґРёРјС‹Рµ РґР»СЏ СЂР°СЃС‡РµС‚Р°:</h2>
	 * @param booleanList
	 * @param doubleListTarif
	 * @param doubleListValue
	 * @param doubleListTarifEnergy
	 * @param doubleListValueEnergy
	 */
	private void setValueOf(ArrayList<Boolean> booleanList, ArrayList<Double> doubleListTarif, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListTarifEnergy , ArrayList<Double> doubleListValueEnergy){
		/**
		 * try РЅР° СЃР»СѓС‡Р°Р№ РѕС€РёР±РєРё
		 */
		try {
			for (int i = 0; i < booleanList.size(); i++) {
				getDoubleListTotal().add(i, round(setValueOf(booleanList.get(i), doubleListTarif.get(i), doubleListValue.get(i)), 2 ));/*Р—Р°РїРѕР»РЅРµРЅРёРµ РєРѕР»Р»РµРєС†РёРё РїСЂРѕРјРµР¶СѓС‚РѕС‡РЅС‹С… Р·РЅР°С‡РµРЅРёР№*/
				setValue(getDoubleListTotal().get(i) + getValue());/*РЎР»РѕР¶РµРЅРёРµ РїСЂРµРґС‹РґСѓС‰РµРіРѕ РёС‚РѕРіРѕРіРѕ Р·РЅР°С‡РµРЅРёСЏ Рё РєРѕР»Р»РµРєС†РёРё РїСЂРѕРјРµР¶СѓС‚РѕС‡РЅС‹С… Р·РЅР°С‡РµРЅРёР№*/
			}
			for (int i = 0; i < doubleListTarifEnergy.size(); i++) {
				getDoubleListTotalEnergy().add(i, round(setValueOf(true, doubleListTarifEnergy.get(i), doubleListValueEnergy.get(i)) , 2));/*Р—Р°РїРѕР»РЅРµРЅРёРµ РєРѕР»Р»РµРєС†РёРё РїСЂРѕРјРµР¶СѓС‚РѕС‡РЅС‹С… Р·РЅР°С‡РµРЅРёР№ СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё*/
				setValue(getDoubleListTotalEnergy().get(i) + getValue());/*РЎР»РѕР¶РµРЅРёРµ РїСЂРµРґС‹РґСѓС‰РµРіРѕ РёС‚РѕРіРѕРіРѕ Р·РЅР°С‡РµРЅРёСЏ Рё РєРѕР»Р»РµРєС†РёРё РїСЂРѕРјРµР¶СѓС‚РѕС‡РЅС‹С… Р·РЅР°С‡РµРЅРёР№ СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё*/
			}
			setValue(round(getValue(), 2));/*РћРєСЂСѓРіР»РµРЅРёРµ РґРѕ 2 Р·РЅР°РєРѕРІ РїРѕСЃР»Рµ Р·Р°РїСЏС‚РѕР№ Рё Р·Р°РїРёСЃСЊ РёС‚РѕРіРѕРіРѕ Р·РЅР°С‡РµРЅРёСЏ*/
		}
		/**
		 * catch СЃСЂР°Р±РѕС‚Р°РµС‚ РІ СЃР»СѓС‡Р°Рµ РѕС€РёР±РєРё
		 */
		catch (Exception e) {
			e.printStackTrace();/*Р’С‹РІРѕРґ РІ РєРѕРЅСЃРѕР»СЊ РґРµР№СЃС‚РІРёР№, РєРѕС‚РѕСЂС‹Рµ РїСЂРёРІРµР»Рё Рє РѕС€РёР±РєРµ*/
		}
	}
	
	/**
	 * <h1>РњРµС‚РѕРґ setValueOf РєР»Р°СЃСЃР° Function</h1>
	 * <i>Р’С‹РїРѕР»РЅСЏРµС‚ СЂР°СЃС‡РµС‚, РїРѕ РјР°С‚РµРјР°С‚РёС‡РµСЃРєРѕР№ РјРѕРґРµР»Рё</i>
	 * <h2>РџРµСЂРµРјРµРЅРЅС‹Рµ РЅРµРѕР±С…РѕРґРёРјС‹Рµ РґР»СЏ СЂР°СЃС‡РµС‚Р°:</h2>
	 * @param booleanList
	 * @param doubleListTarif
	 * @param doubleListValue
	 * @return
	 * <i>Р’РѕР·СЂР°С‰Р°РµС‚ СѓРјРЅРѕР¶РµРЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ</i>
	 * <br>doubleListTarif * doubleListValue</br>
	 */
	private double setValueOf(boolean booleanList, double doubleListTarif, double doubleListValue) {
		double value = 0;/*value = 0*/
		if (booleanList) {/*РќСѓР¶РµРЅ Р»Рё СЂР°СЃС‡РµС‚*/
			value = doubleListTarif * doubleListValue;/*РЈРјРЅРѕР¶РµРЅРёРµ doubleListTarif РЅР° doubleListValue*/
			return value;/*Р’РµСЂРЅСѓС‚СЊ РїРѕР»СѓС‡РµРЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ*/
		} else {/*Р�РЅР°С‡Рµ*/
			value = 0;/*value = 0*/
			return value;/*Р’РµСЂРЅСѓС‚СЊ РїРѕР»СѓС‡РµРЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ*/
		}
	}
	/**
	 * <h1>РњРµС‚РѕРґ round РєР»Р°СЃСЃР° Function</h1>
	 * <i>Р’С‹РїРѕР»РЅСЏРµС‚ РѕРєСЂСѓРіР»РµРЅРёРµ РґРѕ b Р·РЅР°РєРѕРІ РїРѕСЃР»Рµ Р·Р°РїСЏС‚РѕР№</i>
	 * <h2>РџРµСЂРµРјРµРЅРЅС‹Рµ РЅРµРѕР±С…РѕРґРёРјС‹Рµ РґР»СЏ СЂР°СЃС‡РµС‚Р°:</h2>
	 * @param a <i>С‡РёСЃР»Рѕ</i>
	 * @param b <i>РґРѕ СЃРєРѕР»СЊРєРё Р·РЅР°РєРѕРІ РїРѕСЃР»Рµ Р·Р°РїСЏС‚РѕР№</i>
	 * @return <i>РѕРєСЂСѓРіР»РµРЅРЅРѕРµ С‡РёСЃР»Рѕ a РґРѕ b Р·РЅР°РєРѕРІ РїРѕСЃР»Рµ Р·Р°РїСЏС‚РѕР№</i>
	 */
	private double round(double a, int b) {
		if(b < 0) throw new IllegalArgumentException();/*РџСЂРѕРІРµСЂРєР° b*/
		BigDecimal c = new BigDecimal(Double.toString(a));/*РџРµСЂРµРјРµРЅРЅР°СЏ, РєРѕС‚РѕСЂР°СЏ Р±СѓРґРµС‚ РёСЃРїРѕР»СЊР·РѕРІР°РЅР° РґР»СЏ РѕРєСЂСѓРіР»РµРЅРёСЏ*/
		c = c.setScale(b, RoundingMode.HALF_UP);/*РћРєСЂСѓРіР»РµРЅРёРµ РІРёРґР° HALF_UP*/
		return c.doubleValue();/*Р’РµСЂРЅСѓС‚СЊ РѕРєСЂСѓРіР»РµРЅРЅРѕРµ Р·РЅР°С‡РµРЅРёРµ*/
	}

}
