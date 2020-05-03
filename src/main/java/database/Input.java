package database;

import static java.lang.Double.*;
import static database.Strings.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Input {
	
	private ArrayList<Double> doubleListTarif = new ArrayList<Double>();
	private ArrayList<Double> doubleListTarifEnergy = new ArrayList<Double>();
	
	
	public Input(int toggle) {
		initialize(toggle);
	}

	private void initialize(int toggle) {
		initializeTarif();
		initializeTarifEnergy(toggle);
	}
	
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
	
	private void initializeTarifEnergy(int toggle) {
		int i = 0;
		try {
			BufferedReader bufferedreader = new BufferedReader(new FileReader(getPathtoinputenergyfase1()));
			@SuppressWarnings("resource")
			BufferedReader bufferedreader1 = new BufferedReader(new FileReader(getPathtoinputenergyfase2()));
			@SuppressWarnings("resource")
			BufferedReader bufferedreader2 = new BufferedReader(new FileReader(getPathtoinputenergyfase3()));
			String input;
			switch (toggle) {
			case 1:
				
				while((input = bufferedreader.readLine())!=null) {
					getDoubleListTarifEnergy().add(i,  valueOf(input));
					i++;
				}
				bufferedreader.close();
				break;
			case 2:
				
				while((input = bufferedreader1.readLine())!=null) {
					getDoubleListTarifEnergy().add(i,  valueOf(input));
					i++;
				}
				break;
			case 3:
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

	public ArrayList<Double> getDoubleListTarif() {
		return doubleListTarif;
	}


	public void setDoubleListTarif(ArrayList<Double> doubleListTarif) {
		this.doubleListTarif = doubleListTarif;
	}


	public ArrayList<Double> getDoubleListTarifEnergy() {
		return doubleListTarifEnergy;
	}


	public void setDoubleListTarifEnergy(ArrayList<Double> doubleListTarifEnergy) {
		this.doubleListTarifEnergy = doubleListTarifEnergy;
	}

}
