package Main.business.validationRules;
import java.util.regex.Pattern;
import Main.entity.concretes.User;

public class UserValidator implements Validator {
	public static boolean[] rules(User user) {
		boolean emailType=Pattern.matches("^[a-zA-Z0-9]{2,}[@][a-zA-Z0-9]{2,}[.][a-zA-Z0-9]{2,}.?[a-zA-Z0-9]{0,}[a-zA-Z]{1}$",user.getMail());
		 boolean passwordType=Pattern.matches(".{6,}",user.getPassword());
		 boolean nameType=Pattern.matches("[a-zA-ZçÇğĞıİöÖşŞüÜ]*[ ][a-zA-ZçÇğĞıİöÖşŞüÜ]*",user.getName()+" "+user.getLastName());
		 boolean CheckEmptyMailAndPassword=(user.getMail()!=null&user.getPassword()!=null)?true:false;
		 
		 boolean[] result= {emailType,passwordType,nameType,CheckEmptyMailAndPassword};
		 return result;
	}
}
