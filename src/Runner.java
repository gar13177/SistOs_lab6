
public class Runner {
	
	private Comunicador _comunicador;
	private Sumador _sumador;
	private Restador _restador;
	
	public Runner(){
		_comunicador = new Comunicador();
		_sumador = new Sumador(_comunicador);
		_restador = new Restador(_comunicador);
		
		Thread b = new Thread(_sumador);
		Thread a = new Thread(_restador);
		
		a.start();
		b.start();
		try{
			a.join();
			b.join();
		}catch (InterruptedException  e){
			e.printStackTrace();
		}
		System.out.println("finalizado");
	}

}
