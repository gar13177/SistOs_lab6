import java.util.Random;


public class Restador implements Runnable {
	private Comunicador _comunicador;
	private Random rnd = new Random();
	
	public Restador(Comunicador c){
		this._comunicador = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++){
			System.out.println("Thread Restador: "+_comunicador.Resta());
			try{
				Thread.sleep(Long.valueOf((long)rnd.nextDouble()*4000+1000));
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
