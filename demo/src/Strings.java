
public class Strings {

	public static void main(String[] args) {
		String message = " 1Bug�n hava �ok g�zel1 ";
		System.out.println(message);
		
		/*System.out.println(message.length());
		System.out.println(message.charAt(0));
		System.out.println(message.concat(" Ya�as�n"));
		System.out.println(message.startsWith("B"));
		System.out.println(message.endsWith("i"));
		System.out.println(message.contains("�ok"));
		char[] karakterler=new char[10];
		message.getChars(0, 7, karakterler, 2);
		//Mesajlar� 0.karakterden 7.karaktere kadar al�p dizinin 2.karakterinden itibaren de�i�tir
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
