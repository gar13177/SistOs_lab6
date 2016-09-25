import java.util.Random;

public class Comunicador {
	
	private int x = 0;
	private Random rnd = new Random();
	
	public synchronized int Resta(){
		if (x > 0)
			x--;
		else{
			try{
				wait(Long.valueOf((long)rnd.nextDouble()*4000+1000));
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			x--;
		}
		return x;
	}
	
	public synchronized int Suma(){
		x++;
		notifyAll();
		return x;
	}

}
