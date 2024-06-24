package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	//ação que somente o seu pacote cozinha precisa conhecer (default)
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		//...?
		controlarSaida();
	}
	//ação que somente o seu pacote cozinha precisa conhecer (default)
	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}