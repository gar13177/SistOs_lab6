
public class Sumador implements Runnable {
	private Comunicador _comunicador;
	
	public Sumador(Comunicador c){
		this._comunicador = c;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++){
			System.out.println("Thread Sumador: "+_comunicador.Suma());
		}
		
	}

}
