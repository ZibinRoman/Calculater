/**
 * пакет database;
 * */
package database;
/**
 * хранит все строковые значения
 * */
public class Strings {
	
	private static final String space = " ";
	private static final String empty = "";
	private static final String zero = "0";
	private static final String semicolon = ";";
	private static final String colon = ":";
	private static final String pathToInput = "src/main/java/database/Input.txt";//путь к файлу с тарифами
	private static final String pathToOutput = "Output.txt";//путь к файлу вывода
	private static final String pathToInputEnergyFase1 = "src/main/java/database/InputEnergyFase1.txt";//путь к файлу с тарифом энергии тарифная зона 1
	private static final String pathToInputEnergyFase2 = "src/main/java/database/InputEnergyFase2.txt";//путь к файлу с тарифом энергии тарифная зона 2
	private static final String pathToInputEnergyFase3 = "src//main/java/database/InputEnergyFase3.txt";//путь к файлу с тарифом энергии тарифная зона 3
	/**
	 * для вывода в файл
	 * */
	private static final String tarif = "Тариф";
	private static final String value = "Значения";
	private static final String total = "Итого";
	private static final String timer = "Время";
	
	private static final String format10 = "|%10s|";
	private static final String format30 = "|%30s|";
	private static final String format80 = "|%80s|";
	/**
	 * получить значения переменных (↓17 штук)
	 * */
	public static String getSpace() {
		return space;
	}
	public static String getEmpty() {
		return empty;
	}
	public static String getSemicolon() {
		return semicolon;
	}
	public static String getZero() {
		return zero;
	}
	public static String getColon() {
		return colon;
	}
	public static String getPathtoinput() {
		return pathToInput;
	}
	public static String getPathtooutput() {
		return pathToOutput;
	}
	public static String getPathtoinputenergyfase1() {
		return pathToInputEnergyFase1;
	}
	public static String getPathtoinputenergyfase2() {
		return pathToInputEnergyFase2;
	}
	public static String getPathtoinputenergyfase3() {
		return pathToInputEnergyFase3;
	}
	public static String getTarif() {
		return tarif;
	}
	public static String getValue() {
		return value;
	}
	public static String getTotal() {
		return total;
	}
	public static String getTimer() {
		return timer;
	}
	public static String getFormat10() {
		return format10;
	}
	public static String getFormat30() {
		return format30;
	}
	public static String getFormat80() {
		return format80;
	}

}
