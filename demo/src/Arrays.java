
public class Arrays {

	public static void main(String[] args) {
		String[] people = new String[3];
		people[0] = "Emre";
		people[1] = "Çaðla";
		people[2] = "Ömer";
		for (String string : people) {
			System.out.println(string);
		}
		double[] myList = { 1.2, 6.3, 4.5, 5.1 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			System.out.println(number);
			total += number;

		}
		System.out.println("Sayýlarýn toplamý " + total);
		System.out.println("En büyük sayý " + max);

		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";
		for (int i = 0; i < sehirler.length; i++) {

			System.out.println("------------------");
			for (int j = 0; j < sehirler[i].length; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("------------------");
		}
	}

}
