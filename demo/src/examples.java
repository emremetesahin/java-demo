
public class examples {

	public static void main(String[] args) {
		// Say�n�n Asal Olup olmad���n� bulma
		int number = 12;
		Boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime);

		// Sesli Harf olup olmad���n� bulma
		char harf = 'a';
		char[] kalinsesler = { 'a', '�', 'o', 'u' };
		String sonuc = "ince harfli";
		for (int i = 0; i < 3; i++) {
			if (harf == kalinsesler[i]) {
				sonuc = "kal�n harfli";
			}
		}
		System.out.println(sonuc);
		// M�kemmel say� olup olmad���n� bulma
		int sayi = 220;
		int toplam = 0;
		sonuc = "Say� M�kemmel bir say� de�ildir ";
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (sayi == toplam || sayi == 1) {
			sonuc = "Say� M�kemmel bir say�d�r ";
		}
		System.out.println(sonuc);
		// Arkada� say� olup olmad���n� bulma
		int sayi1 = 222;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				if (i != sayi2) {
					toplam1 += i;
				}
			}

		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				if (i != sayi1) {
					toplam2 += i;
				}
			}
		}
		if (toplam1 == sayi2 && toplam2 == sayi1) {
			System.out.println("Say�lar arkada� say�lard�r");
		} else {
			System.out.println("Say�lar arkada� say�lar de�ildir");
		}
		
		
		
		//Say�y� bulma
		int[]sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=5;
		boolean sonuc2=false;
		for(int i=0;i<sayilar.length;i++)
		{
			if(sayilar[i]==5)
			{
				sonuc2=true;
				break;
			}
		}
		System.out.println(sonuc2);

	}
}