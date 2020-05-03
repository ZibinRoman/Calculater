package function; 

import java.math.*;
import java.util.*;
import javax.swing.*;
import database.*;

public class Function extends Values {
		
	public Function(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListValueEnergy, int toggle) {
		super(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);
	}

	public void initialize() {
		try {
			Input input = new Input(getToggle());
			setDoubleListTarif(input.getDoubleListTarif());
			setDoubleListTarifEnergy(input.getDoubleListTarifEnergy());
			setValueOf(getBooleanList(), getDoubleListTarif(), getDoubleListValue(), getDoubleListTarifEnergy(), getDoubleListValueEnergy());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void setValueOf(ArrayList<Boolean> booleanList, ArrayList<Double> doubleListTarif, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListTarifEnergy , ArrayList<Double> doubleListValueEnergy){
		try {
			for (int i = 0; i < booleanList.size(); i++) {
				getDoubleListTotal().add(i, round(setValueOf(booleanList.get(i), doubleListTarif.get(i), doubleListValue.get(i)), 2 ));
				setValue(getDoubleListTotal().get(i) + getValue());
			}
			for (int i = 0; i < doubleListTarifEnergy.size(); i++) {
				getDoubleListTotalEnergy().add(i, round(setValueOf(true, doubleListTarifEnergy.get(i), doubleListValueEnergy.get(i)) , 2));
				setValue(getDoubleListTotalEnergy().get(i) + getValue());
			}
			setValue(round(getValue(), 2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private double setValueOf(boolean booleanList, double doubleListTarif, double doubleListValue) {
		double value = 0;
		if (booleanList) {
			value = doubleListTarif * doubleListValue;
			return value;
		} else {
			value = 0;
			return value;
		}
	}
	
	private double round(double a, int b) {
		if(b < 0) throw new IllegalArgumentException();
		BigDecimal c = new BigDecimal(Double.toString(a));
		c = c.setScale(b, RoundingMode.HALF_UP);
		return c.doubleValue();
	}

}
