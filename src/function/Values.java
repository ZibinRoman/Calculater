package function;

import java.util.ArrayList;
/**
* @author 18130166
*/
public class Values {

private static ArrayList<Boolean> a0 = new ArrayList<Boolean>();	/*	Коллекция переключателей va			*/
private static ArrayList<Double>  a1 = new ArrayList<Double>();		/*	Коллекция тарифы все vb				*/
private static ArrayList<Double>  a2 = new ArrayList<Double>();		/*	Коллекция вводимых значений vc		*/
private static ArrayList<Double>  a3 = new ArrayList<Double>();		/*	Коллекция итого ve					*/
private static ArrayList<String>  a4 = new ArrayList<String>();		/*	Коллекция вывода vf					*/
private static ArrayList<Double>  b1 = new ArrayList<Double>();		/*	Коллекция тарифы электричество ea	*/
private static ArrayList<Double>  b2 = new ArrayList<Double>();		/*	Коллекция значения электричество eb	*/
private static ArrayList<Double>  b3 = new ArrayList<Double>();		/*	Коллекция итого электричество ec	*/
private static ArrayList<String>  b4 = new ArrayList<String>();		/*	Коллекция вывод электричество ef	*/
private static double value;										/*	Итог								*/

/**
 * @return the a0
 */
	public static ArrayList<Boolean> getA0() {
		return a0;
	}
/**
* @param a0 the a0 to set
*/
	public static void setA0(ArrayList<Boolean> a) {
		a0 = a;
	}
/**
* @return the a1
*/
	public static ArrayList<Double> getA1() {
		return a1;
	}
/**
* @param a1 the a1 to set
*/
	public static void setA1(ArrayList<Double> a) {
		a1 = a;
	}
/**
* @return the a2
*/
	public static ArrayList<Double> getA2() {
		return a2;
	}
/**
* @param a2 the a2 to set
*/
	public static void setA2(ArrayList<Double> a) {
		a2 = a;
	}
/**
* @return the a3
*/
	public static ArrayList<Double> getA3() {
		return a3;
	}
/**
* @param a3 the a3 to set
*/
	public static void setA3(ArrayList<Double> a) {
		a3 = a;
	}
/**
* @return the a4
*/
	public static ArrayList<String> getA4() {
		return a4;
	}
/**
* @param a4 the a4 to set
*/
	public static void setA4(ArrayList<String> a) {
		a4 = a;
	}
/**
* @return the b1
*/
	public static ArrayList<Double> getB1() {
		return b1;
	}
/**
* @param b1 the b1 to set
*/
	public static void setB1(ArrayList<Double> b) {
		b1 = b;
	}
/**
* @return the b2
*/
	public static ArrayList<Double> getB2() {
		return b2;
	}
/**
* @param b2 the b2 to set
*/
	public static void setB2(ArrayList<Double> b) {
		b2 = b;
	}
/**
* @return the b3
*/
	public static ArrayList<Double> getB3() {
		return b3;		}
/**
* @param b3 the b3 to set
*/
	public static void setB3(ArrayList<Double> b) {
		b3 = b;
	}
/**
* @return the b4
*/
	public static ArrayList<String> getB4() {
		return b4;
	}
/**
* @param b4 the b4 to set
*/
	public static void setB4(ArrayList<String> b) {
		b4 = b;
	}
/**
* @return the value
*/
	public static double getValue() {
		return value;
	}
/**
* @param value the value to set
*/
	public static void setValue(double a) {
		value = a;
	}
/**
* @param <E>
* @param value the value to set
*/
	public static <E> void clearArray(ArrayList<E> A) {
		A.clear();;
	}
}

