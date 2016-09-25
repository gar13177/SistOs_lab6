
public class Restador implements Runnable {
private Comunicador _comunicador;
	
	public Restador(Comunicador c){
		this._comunicador = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++){
			System.out.println("Thread Restador: "+_comunicador.Resta());
		}
		
	}

}
