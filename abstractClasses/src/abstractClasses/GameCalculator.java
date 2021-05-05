package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate(); 
	
	public final void gameOver() { //final override edilmemesi gereken metodlar için kullanýlýr
		System.out.println("Oyun Bitti");
	}

}
