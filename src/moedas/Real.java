package moedas;

public class Real extends Moeda{
	
	//metodo info para registrar uma mensagem
	public String info() {
		return "Real " + this.valor;

	}
	// vai retornar o valor do real 
	public double converter() {
		return valor;
	}
	

}
