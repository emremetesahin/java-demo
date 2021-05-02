
public class examples {

	public static void main(String[] args) {
		// Sayýnýn Asal Olup olmadýðýný bulma
		int number = 12;
		Boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		System.out.println(isPrime);

		// Sesli Harf olup olmadýðýný bulma
		char harf = 'a';
		char[] kalinsesler = { 'a', 'ý', 'o', 'u' };
		String sonuc = "ince harfli";
		for (int i = 0; i < 3; i++) {
			if (harf == kalinsesler[i]) {
				sonuc = "kalýn harfli";
			}
		}
		System.out.println(sonuc);
		// Mükemmel sayý olup olmadýðýný bulma
		int sayi = 220;
		int toplam = 0;
		sonuc = "Sayý Mükemmel bir sayý deðildir ";
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}
		}
		if (sayi == toplam || sayi == 1) {
			sonuc = "Sayý Mükemmel bir sayýdýr ";
		}
		System.out.println(sonuc);
		// Arkadaþ sayý olup olmadýðýný bulma
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
			System.out.println("Sayýlar arkadaþ sayýlardýr");
		} else {
			System.out.println("Sayýlar arkadaþ sayýlar deðildir");
		}
		
		
		
		//Sayýyý bulma
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