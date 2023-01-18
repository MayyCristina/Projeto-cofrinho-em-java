package moedas;

public class Dolar extends Moeda {
	//metodo info para registrar uma mensagem
	public String info() {
		return "Dolar " + this.valor;

	}
	// metodo de conversão para real
	public double converter() {
		return valor / 5;
	}
	
	

}
