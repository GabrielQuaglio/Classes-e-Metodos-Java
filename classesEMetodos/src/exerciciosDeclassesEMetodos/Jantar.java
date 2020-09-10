package exerciciosDeclassesEMetodos;

public class Jantar {

	public static void main(String[] args) {
		// implementaremos o algoritmo para instanciar uma pessoa
		// instanciar 2 comidas
		// e fazer com que a pessoa coma a comida

		// Class pessoa = seu nome,seu peso, e o metodo chamado comer
		// ele ira receber como parametro um outro objeto da classe comida

		// Class comida = seus nomes, seus pesos
		// acresentaremos o peso da comida ao pesso da pessoa(provavelmente no return

		// Class Jantar = main,instanciaremos 2 comidas
		// criaremos o objeto pessoa e chamaremos o metdo comer
		// mostra o antes e depois e seu nome

		Pessoa p = new Pessoa("Guilherme", 99.7);

		Comida c1 = new Comida("feijao", 0.2);

		Comida c2 = new Comida("arroz", 0.1);

		System.out.println(p.comer1());
		p.comer(c1);
		p.comer(c2);
		System.out.println(p.comer1());
	}
}
