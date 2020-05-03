/**
 * Пакет test
 */
package test;
/**
 * Статические импорты
 */
import static org.junit.jupiter.api.Assertions.*;
/**
 * Импорты
 */
import java.math.*;
import java.util.*;
import javax.swing.*;
import org.junit.jupiter.api.Test;

/**
 * @author Roman
 * <h1>Класс Test</h1>
 * <h2>Проводит 1 тест</h2>
 */
class Test {
	/**
	 * <h1>Метод test класса Test</h1>
	 * <br><i>Выполняет тест, по математической модели</i></br>
	 * <br><i>Первый тест</i></br>
	 * <h1>Вводимые значения:</h1>
	 * @param Площадь = 300
	 * @param Жильцы = 2
	 * @param Отопление = 110
	 * @param Холодная вода = 130
	 * @param Горячая вода = 120
	 * @param Газ = 150
	 * @param Выбор фазы счетчика электроэнергии = 3
	 * @param Тарифная зона 1 = 200
	 * @param Тарифная зона 2 = 250
       * @param Тарифная зона 3 = 350
	 
	 */
	@Test/*Аннотация, что данный метод тест*/
	public void test() {
		/**
		 * Инициализация переменных теста
		 */
		double testValue = 259759.56;/*переменная с которой происходит сравнение, значение теста*/
		double testingValue = 0;/*перенная с которой происходит сравнение, значение переменной Value из класса Function */
		ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();/*Коллекция, тип которой JCheckBox, рудимент теста*/
		ArrayList<Double> doubleListValue = new ArrayList<Double>();/*Коллекция, тип которой Double, отвечает за вводимые значения*/
		ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*Коллекция, тип которой Double, отвечает за вводимые значения, но только за электричество*/
		/**
		 * Задание параметров:
		 */
		double area = 300.00;/*Площадь*/
		int numberOfPersons = 2;/*Жильцы*/
		double heating = 110.00;/*Отопление*/
		double coldWater = 130.00;/*Холодная вода*/
		double hotWater = 120.00;/*Горячая вода*/
		double gas = 150.00;/*Газ*/
		int toggle = 3;/*Выбор фазы*/
		double fase1 = 200.00;/*Тарифная зона 1*/
		double fase2 = 250.00;/*Тарифная зона 2*/
             double fase3 = 350.00;/*Тарифная зона 3 */

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
		doubleListValueEnergy.add(0, fase1);/*Электроэнергия. Дневная зона*/
		doubleListValueEnergy.add(1, fase2);/*Электроэнергия. Ночная зона*/
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
