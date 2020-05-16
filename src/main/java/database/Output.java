/**
 * ����� database;
 * */
package database;
/**
 * ����������� ��� ����������� ��� ������
 * */
import static java.lang.String.*;
import static database.Strings.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import function.*;
/**
 * ����� ��� ���������� ��������� ��������� � ���� Output.txt
 * */
public class Output extends Values{

	public Output(ArrayList<JCheckBox> checkBoxList, ArrayList<Double> doubleListTarif, ArrayList<Double> doubleListValue, ArrayList<Double> doubleListTotal, ArrayList<Double> doubleListTarifEnergy, ArrayList<Double> doubleListValueEnergy, ArrayList<Double> doubleListTotalEnergy, int toggle, double value) {
		super(checkBoxList, doubleListValue, doubleListValueEnergy, toggle);
		this.setDoubleListTarif(doubleListTarif);// ������������� ���������� ��� ������ � ����
		this.setDoubleListTotal(doubleListTotal);// ������������� ���������� ��� ������ � ����
		this.setDoubleListTarifEnergy(doubleListTarifEnergy);// ������������� ���������� ��� ������ � ����
		this.setDoubleListTotalEnergy(doubleListTotalEnergy);// ������������� ���������� ��� ������ � ����
		this.setValue(value);// ������������� ���������� ��� ������ � ����
	}
	/**
	 * ���������� ����� � ���� Output.txt
	 * */
	public void initializeOutput() {
		try {
			initializeList(getStringList(), getStringListEnergy(), getToggle());
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(getPathtooutput()));
			for (int i = 0; i < getStringList().size(); i++) {
				bufferedwriter.write(getWrite(valueOf(getDoubleListTarif().get(i)), valueOf(getDoubleListValue().get(i)), valueOf(getDoubleListTotal().get(i)), getStringList().get(i)));//����������
				bufferedwriter.newLine();//���������� ����������� �����
			}
			for (int i = 0; i < getStringListEnergy().size(); i++) {
				bufferedwriter.write(getWrite(valueOf(getDoubleListTarifEnergy().get(i)), valueOf(getDoubleListValueEnergy().get(i)), valueOf(getDoubleListTotalEnergy().get(i)), getStringListEnergy().get(i)));//���������� 
				bufferedwriter.newLine();//���������� ����������� �����
			}
			bufferedwriter.write(join(getEmpty(), format(getFormat80(), String.join(getSpace(), Strings.getTotal(), "�", "������".concat(getColon()))),  format(getFormat10(), valueOf(getValue()))));//����������
			bufferedwriter.newLine();//���������� ����������� �����
			bufferedwriter.write(join(getEmpty(), String.format(getFormat80(),  Strings.getTimer().concat(getColon())), format(getFormat30(), getDate())));//����������
			bufferedwriter.close();//��������� �����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * getDate() ����� ��������� ����
	 * � ����������� �� � ������ ��� ������ 
	 * � �������� Output.txt
	 * */
	private static String getDate() {
		Date date = new Date();
		return date.toString();
	}
	/**
	 * ���������� ���������� � ������������ ����� ""
	 * � ���������� � ���������� 
	 * ��� ������������ ������ � ��������
	 * */
	private String getWrite(String doubleListTarif, String doubleListValue, String doubleListTotal, String stringList) {
		String string0 = format(getFormat80(), stringList);
		String string1 = join(getEmpty(), format(getFormat10(), Strings.getTarif().concat(getColon())), format(getFormat10(), doubleListTarif));
		String string2 = join(getEmpty(), format(getFormat10(), Strings.getValue().concat(getColon())), format(getFormat10(), doubleListValue));
		String string3 = join(getEmpty(), format(getFormat10(), Strings.getTotal().concat(getColon())), format(getFormat10(), doubleListTotal));
		return join(getEmpty(),  string0, string1, string2, string3);
	}
	/**
	 * ������ ��� ���������� 
	 * ��������� - ��������� ���������
	 * */
	private void initializeList(ArrayList<String> stringList, ArrayList<String> stringListEnergy, int toggle) {
		try {
			/**
			 * �������� �������
			 * */
			stringList.clear();
			stringListEnergy.clear();
			stringList.add(0, "����������");
			stringList.add(1, "������ ���� ������ �������������");
			stringList.add(2, "�������� ������������� ��� ���������� ������ ���������");
			stringList.add(3, "�������� ���� �� ������� ������������� ��� ���������� ������ ���������");
			stringList.add(4, "�������� ������� �������� ������������� ��� ���������� ������ ���������");
			stringList.add(5, "��������� ������� ��� �������� ���� ��� ���������� ������ ���������");
			stringList.add(6, "��������� ������� ��� ������� ���� ��� ���������� ������ ���������");
			stringList.add(7, "�������������� ��� ���������� ������ ���������");
			stringList.add(8, "���������");
			stringList.add(9, "�������� �������������");
			stringList.add(10, "�������� ������������� �� ����� �������� �������������");
			stringList.add(11, "�������� ������� �������� �������������");
			stringList.add(12, "��������� ������� ��� ��������� �������������");
			stringList.add(13, "��������� ������� ��� �������� �������������");
			stringList.add(14, "��������� � �������� ������������� ��������");
			stringList.add(15, "������������ ������������� �������");
			stringList.add(16, "�������-������������ ����������");
			stringList.add(17, "�����");
			stringList.add(18, "���");
			switch (toggle) {
			/**
			 * �������� ���� 1
			 * */
			case 1:
				stringListEnergy.add(0, "�������������� ������������� �����");
				break;
			/**
			 * �������� ���� 1
			 * */
			case 2:
				stringListEnergy.add(0, "��������������. ������� ����");
				stringListEnergy.add(1, "��������������. ������ ����");
				break;
			/**
			 * �������� ���� 1
			 * */
			case 3:
				stringListEnergy.add(0, "��������������. ������� ����");
				stringListEnergy.add(1, "��������������. ����������� ����");
				stringListEnergy.add(2, "��������������. ������ ����");
				break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
