package Main.core.rules;

public class BusinessRules {
	public static boolean Run(Boolean... rules) {
		var result = true;
		for (Boolean rule : rules) {
			if (!rule) {
				result = false;
				break;
			}
		}
		return result;

	}
}
