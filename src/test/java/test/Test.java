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
import java.util.*;
import javax.swing.*;

import function.Function;

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
	 * @param Площадь = 250
	 * @param Жильцы = 4
	 * @param Отопление = 4.00
	 * @param Холодная вода = 14.00
	 * @param Горячая вода = 15.00
	 * @param Газ = 20.00
	 * @param Выбор фазы счетчика электроэнергии = 2
	 * @param Тарифная зона 1 = 150.00
	 * @param Тарифная зона 2 = 100.00
	 * 
	 */
	@org.junit.jupiter.api.Test/*Аннотация, что данный метод тест*/
	public void test() {
		/**
		 * Инициализация переменных теста
		 */
		double testValue = 17276.93;/*переменная с которой происходит сравнение, значение теста*/
		double testingValue = 0;/*перенная с которой происходит сравнение, значение переменной Value из класса Function */
		ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();/*Коллекция, тип которой JCheckBox, рудимент теста*/
		ArrayList<Double> doubleListValue = new ArrayList<Double>();/*Коллекция, тип которой Double, отвечает за вводимые значения*/
		ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*Коллекция, тип которой Double, отвечает за вводимые значения, но только за электричество*/
		/**
		 * Задание параметров:
		 */
		double area = 250.00;/*Площадь*/
		int numberOfPersons = 4;/*Жильцы*/
		double heating = 4.00;/*Отопление*/
		double coldWater = 14.00;/*Холодная вода*/
		double hotWater = 15.00;/*Горячая вода*/
		double gas = 20.00;/*Газ*/
		int toggle = 2;/*Выбор фазы*/
		double fase1 = 150.00;/*Тарифная зона 1*/
		double fase2 = 100.00;/*Тарифная зона 2*/
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