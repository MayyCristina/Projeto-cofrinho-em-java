package programa;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import moedas.Dolar;
import moedas.Euro;
import moedas.Moeda;
import moedas.Real;

public class Cofrinho {

	private static List<Moeda> listMoeda = new ArrayList<>();

	public static void main(String[] args) {
		//criação do menu para o cofrinho
		int opcao = 0;
		boolean continua = true;

		while (continua) {

			JOptionPane.showMessageDialog(null,
					"Digite:\n" + "1 para adicionar moeda\n" + "2 para remover moeda\n"
							+ "3 para listar as moedas dentro do cofrinho\n"
							+ "4 para calcular quanto dinheiro existe no cofrinho convertido para real\n"
							+ "9 para encerrar\n" + "CLIQUE OK PARA CONTINUAR");

			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma opção"));
			
			//switch case adicionado para poder complementar as funções adicionadas ao menu do cofrinho
			switch (opcao) {
			case 1: //realizado um if para que o usuário digite uma das 3 opções possíveis para o tipo da moeda
				    // Se o número digitado não corresponder a 1, 2 ou 3, o else executára exibindo tipo de moeda incorreta
				int tipoMoeda = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Digite 1 para dólar\n" + "2 para euro\n" + "3 para real"));
				if (tipoMoeda == 1 || tipoMoeda == 2 || tipoMoeda == 3) {
					escolherMoeda(tipoMoeda);

				} else {
					JOptionPane.showMessageDialog(null, "Tipo de moeda incorreta");

				}
				break;
			case 2: //Ao digitar 2 a moeda desejada será removida
				int posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite qual moeda deseja remover"));
				if (posicao < listMoeda.size()) {
					listMoeda.remove(posicao);
				}
				break;
			case 3: //Digitando 3 retornará a posição da lista
				for (int i = 0; i < listMoeda.size(); i++) {
					System.out.println(i + "° " + listMoeda.get(i).info());
				}
				break;
			case 4: //ao apertar 4, irá gerar o total de todas as moedas da lista convertida para real
				double total = 0;
				for (int i = 0; i < listMoeda.size(); i++) {
					total += listMoeda.get(i).converter();
					
				}
				System.out.println("O valor total em reais é " + total);
				break;
			case 9: // o usuário deve digitar 9 para encerrar o programa
				continua = false;
				break;
			default:
				break;
			}
		}
	}
	// Foi feito if e else if para representar em número cada tipo de moeda, 1 para dolar, 2 para euro e 3 para real
	public static void escolherMoeda(int tipo) {
		//O usuário deverá digitar o valor da moeda ou das moedas que escolheu
		double moeda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da sua moeda"));
		if (tipo == 1) {
			Dolar dolar = new Dolar();
			dolar.setValor(moeda);
			adicionarMoeda(dolar);
		} else if (tipo == 2) {
			Euro euro = new Euro();
			euro.setValor(moeda);
			adicionarMoeda(euro);
		} else if (tipo == 3) {
			Real real = new Real();
			real.setValor(moeda);
			adicionarMoeda(real);
		}
	}
    //metodo para adicionar moeda
	public static void adicionarMoeda(Moeda moeda) {
		listMoeda.add(moeda);
	}
	//metodo de remover moedas
	public void removerMoeda(Moeda moeda) {

	}
	//metodo para listagem de moedas
	public void listagemMoedas() {

	}
	//metodo de total convertido
	public void totalConvertido() {

	}

}
