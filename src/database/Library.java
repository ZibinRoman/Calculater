/**
 * 
 */
package database;

import static javax.swing.JOptionPane.*;
import static database.Strings.*;
import static java.util.logging.Level.*;
import static database.Log.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 *
 */
public class Library {
		
	public static boolean equal(JTextField a, String b) {
		// TODO Auto-generated method stub
		boolean c = a.getText().trim().equals(b);
		logp(INFO, getClassName(Library.class), "equal", String.join(getSpace(), a.getText(), b, "Return:=", toString(c)));
		return c;
	}
	
	public static double valueOf(JTextField a) {
		// TODO Auto-generated method stub
		return Double.valueOf(a.getText().trim());
	}

	public static double valueOf(String a) {
		// TODO Auto-generated method stub
		return Double.valueOf(a);
	}
	
	public static String getExceptinInTextField(JLabel a) {
		// TODO Auto-generated method stub
		return String.join(getSpace(), "Введите корректное значение в ячейке", a.getText(), "(x должен быть больше 0)" );
	}
	
	public static void errorMessage(String a) {
		// TODO Auto-generated method stub
		showMessageDialog(getRootFrame(), a, "Ошибка", ERROR_MESSAGE);
	}
	
	public static void showMessage(String a) {
		showMessageDialog(getRootFrame(), a, "Выполнено", INFORMATION_MESSAGE);
	}
	
	public static double round(double a, int b) {
		// TODO Auto-generated method stub
		logp(INFO, getClassName(Library.class), "round", String.join(getSpace(), "Start", toString(a).concat(getSemicolon()), toString(b)));
		if(b < 0) throw new IllegalArgumentException();
		BigDecimal c = new BigDecimal(Double.toString(a));
		c = c.setScale(b, RoundingMode.HALF_UP);
		logp(INFO, getClassName(Library.class), "round", String.join(getSpace(), "Return:=", c.toString()));
		return c.doubleValue();
	}
	
	public static String toString(double a) {
		// TODO Auto-generated method stub
		return Double.toString(a);
	}
	
	public static String toString(int a) {
		// TODO Auto-generated method stub
		return Integer.toString(a);
	}
	
	public static String toString(boolean a) {
		// TODO Auto-generated method stub
		return Boolean.toString(a);
	}
}
