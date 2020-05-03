package database;

import java.util.*;

public class GuiStrings {
	
	private final String title = "Р Р°СЃС‡РµС‚ РєРІР°СЂРїР»Р°С‚С‹";
	private final String total = "Р�С‚РѕРіРѕ";
	private final String calc = "Р Р°СЃСЃС‡РёС‚Р°С‚СЊ ";
	private final String all = "Р’СЃРµ СѓСЃР»СѓРіРё";
	private final String save = "РЎРѕС…СЂР°РЅРёС‚СЊ";
	private ArrayList<String> checkBoxListText = new ArrayList<String>();
	private ArrayList<String> panelListText = new ArrayList<String>();
	private ArrayList<String> ListText = new ArrayList<String>();
	private ArrayList<String> ListTextEnergy = new ArrayList<String>();
	private ArrayList<String> labelListTextEnergy = new ArrayList<String>();
	
	public GuiStrings() {
		initialize();
	}
	
	private void initialize() {
		getCheckBoxListText().add(0, "РЎРѕРґРµСЂР¶Р°РЅРёРµ");
		getCheckBoxListText().add(1, "РЈР±. РјРµСЃС‚ РѕР±С‰. РїРѕР»СЊР·.");
		getCheckBoxListText().add(2, "РҐР’РЎ РїСЂРё РЎРћР�");
		getCheckBoxListText().add(3, "РҐР’ РЅР° Р“Р’РЎ РїСЂРё РЎРћР�");
		getCheckBoxListText().add(4, "РўР­ Р“Р’РЎ РїСЂРё РЎРћР�");
		getCheckBoxListText().add(5, "РћС‚РІ. СЃС‚. РІ. РҐ РїСЂРё РЎРћР�");
		getCheckBoxListText().add(6, "РћС‚РІ. СЃС‚. РІ. Р“ РїСЂРё РЎРћР�");
		getCheckBoxListText().add(7, "Р­Р». СЌРЅ. РїСЂРё РЎРћР�");
		getCheckBoxListText().add(8, "РћС‚РѕРїР»РµРЅРёРµ");
		getCheckBoxListText().add(9, "РҐРѕР». РІРѕРґРѕСЃРЅР°Р±Р¶РµРЅРёРµ");
		getCheckBoxListText().add(10, "РҐР’ РЅР° РЅСѓР¶РґС‹ Р“Р’РЎ");
		getCheckBoxListText().add(11, "РўРµРїР». СЌРЅРµСЂРіРёСЏ Р“Р’РЎ");
		getCheckBoxListText().add(12, "РћС‚РІ. СЃС‚РѕС‡. РІРѕРґ РҐР’");
		getCheckBoxListText().add(13, "РћС‚РІ. СЃС‚РѕС‡. РІРѕРґ Р“Р’");
		getCheckBoxListText().add(14, "РћР±СЂР°С‰РµРЅРёРµ СЃ РўРљРћ");
		getCheckBoxListText().add(15, "РћРћР±СЃР». РўРђ");
		getCheckBoxListText().add(16, "Р—РџРЈ");
		getCheckBoxListText().add(17, "Р Р°РґРёРѕ");
		getCheckBoxListText().add(18, "Р“Р°Р·");
		getPanelListText().add(0, "РЈСЃР»СѓРіРё");
		getPanelListText().add(1, "Р’РІРѕРґРёРјС‹Рµ РґР°РЅРЅС‹Рµ");
		getPanelListText().add(2, "Р­Р»РµРєС‚СЂРёС‡РµСЃС‚РІРѕ");
		getPanelListText().add(3, "Р�С‚РѕРіРѕ");
		getListText().add(0, "РџР»РѕС‰Р°РґСЊ");
		getListText().add(1, "Р–РёР»СЊС†С‹");
		getListText().add(2, "РћС‚РѕРїР»РµРЅРёРµ");
		getListText().add(3, "РҐРѕР»РѕРґРЅР°СЏ РІРѕРґР°");
		getListText().add(4, "Р“РѕСЂСЏС‡Р°СЏ РІРѕРґР°");
		getListText().add(5, "Р“Р°Р·");
		getListTextEnergy().add(0, "РћРґРЅРѕСЃС‚Р°РІРѕС‡РЅС‹Р№ С‚Р°СЂРёС„");
		getListTextEnergy().add(1, "РўР°СЂРёС„ РїРѕ РґРІСѓРј Р·РѕРЅР°Рј");
		getListTextEnergy().add(2, "РўР°СЂРёС„ РїРѕ С‚СЂРµРј Р·РѕРЅР°Рј");
		getLabelListTextEnergy().add(0, "РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 1");
		getLabelListTextEnergy().add(1, "РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 2");
		getLabelListTextEnergy().add(2, "РўР°СЂРёС„РЅР°СЏ Р·РѕРЅР° 3");
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getCheckBoxListText() {
		return checkBoxListText;
	}

	public void setCheckBoxListText(ArrayList<String> checkBoxListText) {
		this.checkBoxListText = checkBoxListText;
	}

	public ArrayList<String> getPanelListText() {
		return panelListText;
	}

	public void setPanelListText(ArrayList<String> panelListText) {
		this.panelListText = panelListText;
	}

	public ArrayList<String> getListText() {
		return ListText;
	}

	public void setListText(ArrayList<String> listText) {
		ListText = listText;
	}

	public ArrayList<String> getListTextEnergy() {
		return ListTextEnergy;
	}

	public void setListTextEnergy(ArrayList<String> listTextEnergy) {
		ListTextEnergy = listTextEnergy;
	}

	public ArrayList<String> getLabelListTextEnergy() {
		return labelListTextEnergy;
	}

	public void setLabelListTextEnergy(ArrayList<String> labelListTextEnergy) {
		this.labelListTextEnergy = labelListTextEnergy;
	}

	public String getTotal() {
		return total;
	}

	public String getCalc() {
		return calc;
	}

	public String getAll() {
		return all;
	}

	public String getSave() {
		return save;
	}
	
}
