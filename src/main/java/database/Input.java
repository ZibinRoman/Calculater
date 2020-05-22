/**
 * пакет database;
 * */
package database;
/**
 * импортируем все необходимое для класса
 * */
import static java.lang.Double.*;
import static database.Strings.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
/**
 * используется для получения значений из файлов
 * */
public class Input {
	
	private ArrayList<Double> doubleListTarif = new ArrayList<Double>();//коллекция тарифов
	private ArrayList<Double> doubleListTarifEnergy = new ArrayList<Double>();///коллекция тарифов элекртичество
	
	/**
	 * указать тарифный план при создании
	 * */
	public Input(int toggle) {
		initialize(toggle);
	}
	private void initialize(int toggle) {
		initializeTarif();
		initializeTarifEnergy(toggle);
	}
	/**
	 * чтение данных из файла
	 * */
	private void initializeTarif() {
		int i = 0;
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferedreader = new BufferedReader(new FileReader(getPathtoinput()));
			String input;
			while ((input = bufferedreader.readLine()) != null) {
				getDoubleListTarif().add(i, Double.valueOf(input));
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * считывает значение тарифов электричества из файла 
	 * */
	private void initializeTarifEnergy(int toggle) {
		int i = 0;
		try {
			BufferedReader bufferedreader = new BufferedReader(new FileReader(getPathtoinputenergyfase1()));//чтение из файла
			@SuppressWarnings("resource")
			BufferedReader bufferedreader1 = new BufferedReader(new FileReader(getPathtoinputenergyfase2()));//чтение из файла
			@SuppressWarnings("resource")
			BufferedReader bufferedreader2 = new BufferedReader(new FileReader(getPathtoinputenergyfase3()));//чтение из файла
			String input;
			switch (toggle) {
			case 1:
				/**
				 * тарифная зона 1
				 * */
				while((input = bufferedreader.readLine())!=null) {
					getDoubleListTarifEnergy().add(i,  valueOf(input));
					i++;
				}
				bufferedreader.close();
				break;
			case 2:
				/**
				 * тарифная зона 2
				 * */
				while((input = bufferedreader1.readLine())!=null) {
					getDoubleListTarifEnergy().add(i,  valueOf(input));
					i++;
				}
				break;
			case 3:
				/**
				 * тарифная зона 3
				 * */
				while((input = bufferedreader2.readLine())!=null) {
					getDoubleListTarifEnergy().add(i,  valueOf(input));
					i++;
				}
				break;	

			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	public ArrayList<Double> getDoubleListTarifEnergy() {
		return doubleListTarifEnergy;
	}
	/**
	 * метод, которыйт записывает значение переменной
	 * */
	public void setDoubleListTarifEnergy(ArrayList<Double> doubleListTarifEnergy) {
		this.doubleListTarifEnergy = doubleListTarifEnergy;
	}

}
