/**
 * РџР°РєРµС‚ test
 */
package test;
/***
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
 * @author Roman
 * <h1>РљР»Р°СЃСЃ Test</h1>
 * <h2>РџСЂРѕРІРѕРґРёС‚ 1 С‚РµСЃС‚</h2>
 */
class Test {
	/**
	 * <h1>РњРµС‚РѕРґ test РєР»Р°СЃСЃР° Test</h1>
	 * <br><i>Р’С‹РїРѕР»РЅСЏРµС‚ С‚РµСЃС‚, РїРѕ РјР°С‚РµРјР°С‚РёС‡РµСЃРєРѕР№ РјРѕРґРµР»Рё</i></br>
	 * <br><i>РџРµСЂРІС‹Р№ С‚РµСЃС‚</i></br>
	 * <h1>Р’РІРѕРґРёРјС‹Рµ Р·РЅР°С‡РµРЅРёСЏ:</h1>
	 * @param РџР»РѕС‰Р°РґСЊ = 300
	 * @param Р–РёР»СЊС†С‹ = 2
	 * @param РћС‚РѕРїР»РµРЅРёРµ = 110
	 * @param РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР° = 130
	 * @param Р“РѕСЂСЏС‡Р°СЏ РІРѕРґР° = 120
	 * @param Р“Р°Р· = 150
	 * @param Р’С‹Р±РѕСЂ С„Р°Р·С‹ СЃС‡РµС‚С‡РёРєР° СЌР»РµРєС‚СЂРѕСЌРЅРµСЂРіРёРё = 3
	 * @param РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 1 = 200
	 * @param РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 2 = 250
       * @param РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 3 = 350
	 
	 */
	@Test/*РђРЅРЅРѕС‚Р°С†РёСЏ, С‡С‚Рѕ РґР°РЅРЅС‹Р№ РјРµС‚РѕРґ С‚РµСЃС‚*/
	public void test() {
		/**
		 * Р�РЅРёС†РёР°Р»РёР·Р°С†РёСЏ РїРµСЂРµРјРµРЅРЅС‹С… С‚РµСЃС‚Р°
		 */
		double testValue = 259759.56;/*РїРµСЂРµРјРµРЅРЅР°СЏ СЃ РєРѕС‚РѕСЂРѕР№ РїСЂРѕРёСЃС…РѕРґРёС‚ СЃСЂР°РІРЅРµРЅРёРµ, Р·РЅР°С‡РµРЅРёРµ С‚РµСЃС‚Р°*/
		double testingValue = 0;/*РїРµСЂРµРЅРЅР°СЏ СЃ РєРѕС‚РѕСЂРѕР№ РїСЂРѕРёСЃС…РѕРґРёС‚ СЃСЂР°РІРЅРµРЅРёРµ, Р·РЅР°С‡РµРЅРёРµ РїРµСЂРµРјРµРЅРЅРѕР№ Value РёР· РєР»Р°СЃСЃР° Function */
		ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();/*РљРѕР»Р»РµРєС†РёСЏ, С‚РёРї РєРѕС‚РѕСЂРѕР№ JCheckBox, СЂСѓРґРёРјРµРЅС‚ С‚РµСЃС‚Р°*/
		ArrayList<Double> doubleListValue = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ, С‚РёРї РєРѕС‚РѕСЂРѕР№ Double, РѕС‚РІРµС‡Р°РµС‚ Р·Р° РІРІРѕРґРёРјС‹Рµ Р·РЅР°С‡РµРЅРёСЏ*/
		ArrayList<Double> doubleListValueEnergy = new ArrayList<Double>();/*РљРѕР»Р»РµРєС†РёСЏ, С‚РёРї РєРѕС‚РѕСЂРѕР№ Double, РѕС‚РІРµС‡Р°РµС‚ Р·Р° РІРІРѕРґРёРјС‹Рµ Р·РЅР°С‡РµРЅРёСЏ, РЅРѕ С‚РѕР»СЊРєРѕ Р·Р° СЌР»РµРєС‚СЂРёС‡РµСЃС‚РІРѕ*/
		/**
		 * Р—Р°РґР°РЅРёРµ РїР°СЂР°РјРµС‚СЂРѕРІ:
		 */
		double area = 300.00;/*РџР»РѕС‰Р°РґСЊ*/
		int numberOfPersons = 2;/*Р–РёР»СЊС†С‹*/
		double heating = 110.00;/*РћС‚РѕРїР»РµРЅРёРµ*/
		double coldWater = 130.00;/*РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР°*/
		double hotWater = 120.00;/*Р“РѕСЂСЏС‡Р°СЏ РІРѕРґР°*/
		double gas = 150.00;/*Р“Р°Р·*/
		int toggle = 3;/*Р’С‹Р±РѕСЂ С„Р°Р·С‹*/
		double fase1 = 200.00;/*РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 1*/
		double fase2 = 250.00;/*РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 2*/
             double fase3 = 350.00;/*РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 3 */

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
		doubleListValueEnergy.add(0, fase1);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ. Р”РЅРµРІРЅР°СЏ Р·РѕРЅР°*/
		doubleListValueEnergy.add(1, fase2);/*Р­Р»РµРєС‚СЂРѕСЌРЅРµСЂРіРёСЏ. РќРѕС‡РЅР°СЏ Р·РѕРЅР°*/
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
