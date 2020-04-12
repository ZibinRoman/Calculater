/**
 * 
 */
package function;

import static java.util.logging.Level.*;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import database.Library;

import static database.Strings.*;
import static database.Library.*;
import static database.Log.*;

/**
 * @author Roman
 *
 */
public class Function extends Values {
	
	private static boolean error = false;
	
	public static void initialize(ArrayList<JCheckBox> ac, ArrayList<JTextField> at, ArrayList<JLabel> al, int toggle, ArrayList<JTextField> aet, ArrayList<JLabel> ael) {
		// TODO Auto-generated method stub
		try {
			clear();
			check();
			setValue(0);
			setArrayList(ac, at, al, toggle, aet, ael);
		} catch (Exception ex) {
			// TODO: handle exception
			setError(true);
			logp(INFO, getClassName(Function.class), "initialize", ex.getMessage());
		} finally {
			if (!isError()) {
				setValueOf(getA0(), getA1(), getA2(), getB1(), getB2());
			}
		}
	}
	
	public static void clear() {
		// TODO Auto-generated method stub
		try {
			clearArray(getA0());
			clearArray(getA1());
			clearArray(getA2());
			clearArray(getA3());
			clearArray(getA4());
			clearArray(getB1());
			clearArray(getB2());
			clearArray(getB3());
			clearArray(getB4());
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "clear", ex.getMessage());
			errorMessage("Ошибка очистки списков!");
		}
	}
	
	public static void setArrayList(ArrayList<JCheckBox> ac, ArrayList<JTextField> at, ArrayList<JLabel> al, int toggle, ArrayList<JTextField> aet, ArrayList<JLabel> ael) {
		// TODO Auto-generated method stub
		try {
			initializeA0(ac);
			initializeA1();
			initializeA2(at, al);
			if (toogleInRange(toggle)) {
				throw new Exception();
			}
			initializeB1(toggle);
			initializeB2(aet, ael, toggle);
		} catch (Exception ex) {
			// TODO: handle exception
			setError(true);
			logp(INFO, getClassName(Function.class), "setArrayList", "Введите корректные значения!");
			errorMessage("Введите корректные значения!");
		}
	}
	
	public static void check() {
		// TODO Auto-generated method stub
		if (isError()) {
			setError(false);
			logp(INFO, getClassName(Function.class), "check", "Обнуление ошибки");
		}
	}

	/**
	 * @return the error
	 */
	public static boolean isError() {
		// TODO Auto-generated method stub
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public static void setError(boolean error) {
		// TODO Auto-generated method stub
		Function.error = error;
	}
	
	public static void setValueOf(ArrayList<Boolean> a, ArrayList<Double> b, ArrayList<Double> c, ArrayList<Double> eb , ArrayList<Double> ec) {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < a.size(); i++) {
				logp(INFO, getClassName(Function.class), "setValueOf", String.join(getSpace(), "Iteration:=", Library.toString(i)));
				getA3().add(i, Library.round(setValue(a.get(i), b.get(i), c.get(i)), 2));
				setValue(getA3().get(i) + getValue());
				logp(INFO, getClassName(Function.class), "setValueOf", String.join(getSpace(), "Value:=", Library.toString(getValue())));
			}
			for (int i = 0; i < eb.size(); i++) {
				logp(INFO, getClassName(Function.class), "setValueOf", String.join(getSpace(), "Iteration:=", Library.toString(i)));
				getB3().add(i, Library.round(setValue(true, eb.get(i), ec.get(i)), 2));
				setValue(getB3().get(i) + getValue());
				logp(INFO, getClassName(Function.class), "setValueOf", String.join(getSpace(), "Value:=", Library.toString(getValue())));
			}
			setValue(Library.round(getValue(), 2));
			logp(INFO, getClassName(Function.class), "setValueOf", String.join(getSpace(), "Value:=", Library.toString(getValue())));
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "setValueOf", ex.getMessage());
		}
	}
	
	private static double setValue(boolean a, double b, double c) {
		// TODO Auto-generated method stub
		logp(INFO, getClassName(Function.class), "setValue", String.join(getSpace(), "Start",  Library.toString(a).concat(getSemicolon()),  Library.toString(b).concat(getSemicolon()),  Library.toString(c)));
		double d = 0;
		if (a) {
			d = b * c;
			logp(INFO, getClassName(Function.class), "setValue", String.join(getSpace(), "Return:=", Library.toString(d)));
			return d;
		} else {
			d = 0;
			logp(INFO, getClassName(Function.class), "setValue", String.join(getSpace(), "Return:=", Library.toString(d)));
			return d;
		}
	}
	
	private static void initializeA0(ArrayList<JCheckBox> a) {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < a.size(); i++) {
				getA0().add(i, a.get(i).isSelected());
			}
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "initializeA0", ex.getMessage());
			errorMessage(ex.getMessage());
		}
	}
	
	private static void initializeA1() {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(getPathtoinput()));
			String input;
			while ((input = br.readLine()) != null) {
				getA1().add(i, Double.valueOf(input));
				i++;
			}
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "initializeA1", ex.getMessage());
			errorMessage(ex.getMessage());
		}
	}
	
	private static void initializeA2(ArrayList<JTextField> a, ArrayList<JLabel> b) {
		// TODO Auto-generated method stub
		boolean error = false;
		try {
			error = false;
			for (int i = 0; i < a.size(); i++) {
				if(equal(a.get(i), getZero()) || equal(a.get(i), getEmpty())) {
					error = true;
					throw new Exception(getExceptinInTextField(b.get(i)));
				} else {
					error = false;
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "initializeA2", ex.getMessage());
			errorMessage(ex.getMessage());
		} finally {
			if (!error) {
				getA2().add(0, valueOf(a.get(0)));
				getA2().add(1, valueOf(a.get(0)));
				getA2().add(2, 0.134640);
				getA2().add(3, 0.134600);
				getA2().add(4, 0.009102);
				getA2().add(5, 0.134640);
				getA2().add(6, 0.134600);
				getA2().add(7, 19.29250);
				getA2().add(8, valueOf(a.get(2)));
				getA2().add(9, valueOf(a.get(3)));
				getA2().add(10, valueOf(a.get(4)));
				getA2().add(11, 0.135200);
				getA2().add(12, valueOf(a.get(2)));
				getA2().add(13, valueOf(a.get(3)));
				getA2().add(14, valueOf(a.get(1)));
				getA2().add(15, 1.00);
				getA2().add(16, 1.00);
				getA2().add(17, 1.00);
				getA2().add(18, valueOf(a.get(5)));
			}
		}
	}
		
	private static void initializeB1(int toggle) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			@SuppressWarnings("resource")
			BufferedReader br1 = new BufferedReader(new FileReader(getPathtoinputenergyfase1()));
			@SuppressWarnings("resource")
			BufferedReader br2 = new BufferedReader(new FileReader(getPathtoinputenergyfase2()));
			@SuppressWarnings("resource")
			BufferedReader br3 = new BufferedReader(new FileReader(getPathtoinputenergyfase3()));
			String input;
			switch (toggle) {
			case 1:
				while((input = br1.readLine())!=null) {
					getB1().add(i,  valueOf(input));
					i++;
				}
				break;
			case 2:
				while((input = br2.readLine())!=null) {
					getB1().add(i,  valueOf(input));
					i++;
				}
				break;
			case 3:
				while((input = br3.readLine())!=null) {
					getB1().add(i,  valueOf(input));
					i++;
				}
				break;	

			default:
				break;
			}
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "initializeB1", ex.getMessage());
			errorMessage(ex.getMessage());
		}
	}

	private static void initializeB2(ArrayList<JTextField> a, ArrayList<JLabel> b, int toggle) {
		// TODO Auto-generated method stub
		boolean error = false;
		try {
			error = false;
			for (int i = 0; i < toggle; i++) {
				if (equal(a.get(i), getZero())||equal(a.get(i), getEmpty())) {
					error = true;
					throw new Exception(getExceptinInTextField(b.get(i)));
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
			logp(INFO, getClassName(Function.class), "initializeB2", ex.getMessage());
			errorMessage(ex.getMessage());
		} finally {
			if (!error) {
				for (int i = 0; i < toggle; i++) {
					getB2().add(i, valueOf(a.get(i)));
				}
			}
		}
	}
	
	private static boolean toogleInRange(int toggle) {
		if(toggle <= 0 || toggle > 3) {
			return true;
		} else {
			return false;
		}
	}
}
