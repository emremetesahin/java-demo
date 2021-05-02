
public class Strings {

	public static void main(String[] args) {
		String message = " 1Bugün hava çok güzel1 ";
		System.out.println(message);
		
		/*System.out.println(message.length());
		System.out.println(message.charAt(0));
		System.out.println(message.concat(" Yaþasýn"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("i"));
		System.out.println(message.contains("çok"));
		char[] karakterler=new char[10];
		message.getChars(0, 7, karakterler, 2);
		//Mesajlarý 0.karakterden 7.karaktere kadar alýp dizinin 2.karakterinden itibaren deðiþtir
		System.out.println(karakterler);
		System.out.println(message.indexOf("1"));
		System.out.println(message.lastIndexOf("1"));
*/
		System.out.println(message.replace(" ","-"));
		System.out.println(message.substring(2,5));
		for(String kelime:message.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
