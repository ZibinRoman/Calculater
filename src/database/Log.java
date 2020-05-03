package database;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roman
 *
 */
public class Log {
	
	private static Logger log = Logger.getLogger(Log.class.getName());
	
	public static void logp(Level level, String sourceClass, String sourceMethod, String msg) {
		log.logp(level, sourceClass, sourceMethod, msg);
	}

	public static String getClassName(Class<?> a) {
		return a.getName();
	}

}
