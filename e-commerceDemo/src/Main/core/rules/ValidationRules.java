package Main.core.rules;

public class ValidationRules {
	public static boolean validate(boolean[] rules) {
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
