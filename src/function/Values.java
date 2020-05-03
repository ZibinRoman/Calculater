package function;

import java.util.*;
import javax.swing.*;


public class Values {
	
	private ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
	private ArrayList<Double> doubleListTarif = new ArrayList<Double>();
	private ArrayList<Double> doubleListValue = new ArrayList<Double>();
	private ArrayList<Double> doubleListTotal = new ArrayList<Double>();
	private ArrayList<String> stringList = new ArrayList<String>();
	private ArrayList<Double> doubleListTarifEnergy = new ArrayList<Double>();
	private ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();
	private ArrayList<Double> doubleListTotalEnergy = new ArrayList<Double>();
	private ArrayList<String> stringListEnergy = new ArrayList<String>();
	private double value;
	private int toggle;
	
	public Values(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue,  ArrayList<Double> doubleListValueEnergy, int toggle) {
		for (int i = 0; i < checkBoxList.size(); i++) {
			this.getBooleanList().add(i, checkBoxList.get(i).isSelected());
		}
		this.setDoubleListValue(doubleListValue);
		this.setDoubleListValueEnergy(doubleListValueEnergy);
		this.setToggle(toggle);
	}
	
	public ArrayList<Boolean> getBooleanList() {
		return booleanList;
	}

	public void setBooleanList(ArrayList<Boolean> booleanList) {
		this.booleanList = booleanList;
	}

	public ArrayList<Double> getDoubleListTarif() {
		return doubleListTarif;
	}

	public void setDoubleListTarif(ArrayList<Double> doubleListTarif) {
		this.doubleListTarif = doubleListTarif;
	}

	public ArrayList<Double> getDoubleListValue() {
		return doubleListValue;
	}

	public void setDoubleListValue(ArrayList<Double> doubleListValue) {
		this.doubleListValue = doubleListValue;
	}

	public ArrayList<Double> getDoubleListTotal() {
		return doubleListTotal;
	}

	public void setDoubleListTotal(ArrayList<Double> doubleListTotal) {
		this.doubleListTotal = doubleListTotal;
	}

	public ArrayList<String> getStringList() {
		return stringList;
	}

	public void setStringList(ArrayList<String> stringList) {
		this.stringList = stringList;
	}

	public ArrayList<Double> getDoubleListTarifEnergy() {
		return doubleListTarifEnergy;
	}

	public void setDoubleListTarifEnergy(ArrayList<Double> doubleListTarifEnergy) {
		this.doubleListTarifEnergy = doubleListTarifEnergy;
	}

	public ArrayList<Double> getDoubleListValueEnergy() {
		return doubleListValueEnergy;
	}

	public void setDoubleListValueEnergy(ArrayList<Double> doubleListValueEnergy) {
		this.doubleListValueEnergy = doubleListValueEnergy;
	}

	public ArrayList<Double> getDoubleListTotalEnergy() {
		return doubleListTotalEnergy;
	}

	public void setDoubleListTotalEnergy(ArrayList<Double> doubleListTotalEnergy) {
		this.doubleListTotalEnergy = doubleListTotalEnergy;
	}

	public ArrayList<String> getStringListEnergy() {
		return stringListEnergy;
	}

	public void setStringListEnergy(ArrayList<String> stringListEnergy) {
		this.stringListEnergy = stringListEnergy;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getToggle() {
		return toggle;
	}

	public void setToggle(int toggle) {
		this.toggle = toggle;
	}
	
}
