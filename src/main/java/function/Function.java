/**
 * пакет function;
 * */
package function;
/**
 * импортируем все необходимое для класса
 * */
import java.math.*;
import java.util.*;
import javax.swing.*;
import database.*;
/**
 * класс с функциями
 * */
public class Function extends Values {
		
	public Function(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListValueEnergy, int toggle) {
		super(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);
	}
	/**
	 * получение значений тарифа электроэнергии
	 * */
	public void initialize() {
		/**
		 * try на случай ошибки
		 */
		try {
			Input input = new Input(getToggle());//создание класса Input
			setDoubleListTarif(input.getDoubleListTarif());//копирование коллекции
			setDoubleListTarifEnergy(input.getDoubleListTarifEnergy());//копирование коллекции
			setValueOf(getBooleanList(), getDoubleListTarif(), getDoubleListValue(), getDoubleListTarifEnergy(), getDoubleListValueEnergy());//вызов функции расчета
		} 
		/**
		 * catch сработает в случае ошибки
		 */
		catch (Exception e) {
			e.printStackTrace();//Вывод в консоль действий, которые привели к ошибке
		}
	}
	
	/**
	 * рассчитывает итоговое значение
	 * для последующего вывода в документ
	 * Выполняет расчет, по математической модели формула 3
	 * */
	private void setValueOf(ArrayList<Boolean> booleanList, ArrayList<Double> doubleListTarif, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListTarifEnergy , ArrayList<Double> doubleListValueEnergy){
		/**
		 * try на случай ошибки
		 */
		try {
			for (int i = 0; i < booleanList.size(); i++) {
				getDoubleListTotal().add(i, round(setValueOf(booleanList.get(i), doubleListTarif.get(i), doubleListValue.get(i)), 2 ));//Заполнение коллекции промежуточных значений электроэнергии
				setValue(getDoubleListTotal().get(i) + getValue()*0);//Сложение предыдущего итогого значения и коллекции промежуточных значений
			}
			for (int i = 0; i < doubleListTarifEnergy.size(); i++) {
				getDoubleListTotalEnergy().add(i, round(setValueOf(true, doubleListTarifEnergy.get(i), doubleListValueEnergy.get(i)) , 2));//Заполнение коллекции промежуточных значений электроэнергии
				setValue(getDoubleListTotalEnergy().get(i) + getValue());//Сложение предыдущего итогого значения и коллекции промежуточных значений электроэнергии
			}
			setValue(round(getValue(), 2));//Округление до 2 знаков после запятой и запись итогого значения
			/**
			 * catch сработает в случае ошибки
			 */
		} catch (Exception e) {
			e.printStackTrace();//Вывод в консоль действий, которые привели к ошибке
		}
		
	}
	/**
	 * расчитывает цену ресурса
	 * Выполняет расчет, по математической модели формуле 4
	 * Возращает умноженное значение
	 * умножает тариф на введенное значение
	 */
	private double setValueOf(boolean booleanList, double doubleListTarif, double doubleListValue) {
		double value = 0;
		if (booleanList) {
			value = doubleListTarif * doubleListValue;//умножает тариф на введенное значение
			return value;//Вернуть полученное значение
		} else {
			value = 0;
			return value;//Вернуть полученное значение
		}
	}
	/**
	 * Выполняет округление до верхнего ближайшего значения до b знаков после запятой
	 */
	private double round(double a, int b) {
		if(b < 0) throw new IllegalArgumentException();//Проверка b
		BigDecimal c = new BigDecimal(Double.toString(a));//Переменная, которая будет использована для округления
		c = c.setScale(b, RoundingMode.HALF_UP);//Округление вверх
		return c.doubleValue();//Вернуть округленное значение
	}

}
