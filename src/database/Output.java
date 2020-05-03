package database;

import static database.Strings.*;
import static java.lang.String.*;

import java.io.*;
import java.util.*;
import javax.swing.*;
import function.*;

public class Output extends Values{

	public Output(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListTarif, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListTotal, ArrayList<Double> doubleListTarifEnergy, ArrayList<Double> doubleListValueEnergy, ArrayList<Double> doubleListTotalEnergy, int toggle, double value) {
		super(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);
		this.setDoubleListTarif(doubleListTarif);
		this.setDoubleListTotal(doubleListTotal);
		this.setDoubleListTarifEnergy(doubleListTarifEnergy);
		this.setDoubleListTotalEnergy(doubleListTotalEnergy);
		this.setValue(value);
	}
	
	public void initializeOutput() {
		try {
			initializeList(getStringList(), getStringListEnergy(), getToggle());
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(getPathtooutput()));
			for (int i = 0; i < getStringList().size(); i++) {
				bufferedwriter.write(getWrite(valueOf(getDoubleListTarif().get(i)), valueOf(getDoubleListValue().get(i)), valueOf(getDoubleListTotal().get(i)), getStringList().get(i)));
				bufferedwriter.newLine();
			}
			for (int i = 0; i < getStringListEnergy().size(); i++) {
				bufferedwriter.write(getWrite(valueOf(getDoubleListTarifEnergy().get(i)), valueOf(getDoubleListValueEnergy().get(i)), valueOf(getDoubleListTotalEnergy().get(i)), getStringListEnergy().get(i)));
				bufferedwriter.newLine();
			}
			bufferedwriter.write(join(getEmpty(), format(getFormat80(), String.join(getSpace(), Strings.getTotal(), "к", "оплате".concat(getColon()))),  format(getFormat10(), valueOf(getValue()))));
			bufferedwriter.newLine();
			bufferedwriter.write(join(getEmpty(), String.format(getFormat80(),  Strings.getTimer().concat(getColon())), format(getFormat30(), getDate())));
			bufferedwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String getDate() {
		Date date = new Date();
		return date.toString();
	}
	
	private String getWrite(String doubleListTarif, String doubleListValue, String doubleListTotal, String stringList) {
		String string0 = format(getFormat80(), stringList);
		String string1 = join(getEmpty(), format(getFormat10(), Strings.getTarif().concat(getColon())), format(getFormat10(), doubleListTarif));
		String string2 = join(getEmpty(), format(getFormat10(), Strings.getValue().concat(getColon())), format(getFormat10(), doubleListValue));
		String string3 = join(getEmpty(), format(getFormat10(), Strings.getTotal().concat(getColon())), format(getFormat10(), doubleListTotal));
		return join(getEmpty(),  string0, string1, string2, string3);
	}
	
	private void initializeList(ArrayList<String> stringList, ArrayList<String> stringListEnergy, int toggle) {
		try {
			stringList.clear();
			stringListEnergy.clear();
			stringList.add(0, "Содержание");
			stringList.add(1, "Уборка мест общего использования");
			stringList.add(2, "Холодное водоснабжение при содержании общего имущества");
			stringList.add(3, "Холодная вода на горячее водоснабжение при содержании общего имущества");
			stringList.add(4, "Тепловая энергия горячего водоснабжения при содержании общего имущества");
			stringList.add(5, "Отведение сточных вод холодной воды при содержании общего имущества");
			stringList.add(6, "Отведение сточных вод горячей воды при содержании общего имущества");
			stringList.add(7, "Электроэнергия при содержании общего имущества");
			stringList.add(8, "Отопление");
			stringList.add(9, "Холодное водоснабжение");
			stringList.add(10, "Холодное водоснабжение на нужды горячего водоснабжения");
			stringList.add(11, "Тепловая энергия горячего водоснабжения");
			stringList.add(12, "Отведение сточных вод холодного водоснабжения");
			stringList.add(13, "Отведение сточных вод горячего водоснабжения");
			stringList.add(14, "Обращение с твердыми коммунальными отходами");
			stringList.add(15, "Обслуживание телевизионной антенны");
			stringList.add(16, "Замочно-переговорное устройство");
			stringList.add(17, "Радио");
			stringList.add(18, "Газ");
			switch (toggle) {
			case 1:
				stringListEnergy.add(0, "Электроэнергия Одноставочный тариф");
				break;
			case 2:
				stringListEnergy.add(0, "Электроэнергия. Дневная зона");
				stringListEnergy.add(1, "Электроэнергия. Ночная зона");
				break;
			case 3:
				stringListEnergy.add(0, "Электроэнергия. Пиковая зона");
				stringListEnergy.add(1, "Электроэнергия. Полупиковая зона");
				stringListEnergy.add(2, "Электроэнергия. Ночная зона");
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	

}
