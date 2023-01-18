package moedas;
//classe abstrata que as subclasses dolar, real, euro herdarão
public abstract class Moeda {
    //atributo que as outras subclasses irão herdar
	protected double valor;
    //metodo para pegar o valor da moeda
	public double getValor() {
		return valor;
	}
    //metodo para modificar o valor
	public void setValor(double valor) {
		this.valor = valor;
	}
	//metodo info para registrar uma mensagem
	public String info() {
		return "Moeda " + this.valor;

	}

	public double converter() {
		return valor;

	}

}