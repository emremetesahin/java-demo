
public class Main {

	public static void main(String[] args) {
		int sayi1=2;
		int sayi2=1;
		int sayi3=1;
		int enBuyukSayi=0;
				if(sayi1>sayi2)
				{
					if(sayi1>sayi3)
					{
						enBuyukSayi=sayi1;
					}
					else if(sayi3>sayi1)
					{
						enBuyukSayi=sayi3;
					}
				}
				else if(sayi2>sayi3)
				{
					enBuyukSayi=sayi2;
				}
				else {enBuyukSayi=sayi3;}
				
				System.out.println(enBuyukSayi);
		

}
}
