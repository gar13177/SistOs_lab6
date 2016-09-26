

public class Comunicador {
	
	private int x = 0;
	
	
	public synchronized int Resta(){
		if (x > 0)
			x--;
		else{
			try{
				wait();
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
