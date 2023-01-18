package moedas;

public class Euro extends Moeda{
	//metodo info para registrar uma mensagem
	public String info() {
		return "Euro " + this.valor;

	}
	//conversão de euro para real
	public double converter() {
		return valor / 5;
	}
	
	

}
