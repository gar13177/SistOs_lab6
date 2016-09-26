import java.util.Random;


public class Sumador implements Runnable {
	private Comunicador _comunicador;
	private Random rnd = new Random();
	
	public Sumador(Comunicador c){
		this._comunicador = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++){
			System.out.println("Thread Sumador: "+_comunicador.Suma());
			try{
				Thread.sleep(Long.valueOf((long)rnd.nextDouble()*4000+1000));
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
