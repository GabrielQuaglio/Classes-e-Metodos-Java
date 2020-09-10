package classesEMetodos.Produto;

public class Produto {
//definimos tres variaveis, e elas pertencem ao objeto, sempro que crio um novo objeto ele vai armazenar esses valores
	// a classe define um tipo, no momento em que eu criei uma classe eu consigo criar variaveis do tipo que a classe define
	// criamos uma classe produto e criamos variaveis do tipo produto
	
	String nome; //isso é um atributo
	double preço; // tambem é um atributo
	static double desconto = 0.25; //tambem é um atributo, agora da classe
	
	//para evitar problemas definimos o construtor padrao de forma explicita,para nao perder o construtor default(padrao)
	Produto() { 
	}
	
	Produto(String nomeInicial) { //nao sao metodos simples pois nao tem retorno definido , e nao construtores
		nome = nomeInicial ;
	}
	Produto(String nomeInicial,double preçoInicial) { //nao sao metodos simples pois nao tem retorno definido , e nao construtores
		preço = preçoInicial;
		nome = nomeInicial ;
	}

	
		 
	//dessa forma temos 3 formas de criar
	
	
	double comDesconto() { //nao prescisaremos de parametros pois nos ja temos os dados de preço e desconto no objeto
		               
	return preço - (desconto * preço );	
	}
	double comDesconto(double descontoDoGerente) {    //se quiseermos parametrar um valor como por exemplo o desconto de gerente nos o definimos normalmente 
		return preço - (desconto + descontoDoGerente*(preço));	
	}
	
	//sem problema pois parametros diferentes
	
	
	
	
}
