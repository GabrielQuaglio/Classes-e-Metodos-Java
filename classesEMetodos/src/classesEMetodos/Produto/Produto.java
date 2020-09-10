package classesEMetodos.Produto;

public class Produto {
//definimos tres variaveis, e elas pertencem ao objeto, sempro que crio um novo objeto ele vai armazenar esses valores
	// a classe define um tipo, no momento em que eu criei uma classe eu consigo criar variaveis do tipo que a classe define
	// criamos uma classe produto e criamos variaveis do tipo produto
	
	String nome; //isso � um atributo
	double pre�o; // tambem � um atributo
	static double desconto = 0.25; //tambem � um atributo, agora da classe
	
	//para evitar problemas definimos o construtor padrao de forma explicita,para nao perder o construtor default(padrao)
	Produto() { 
	}
	
	Produto(String nomeInicial) { //nao sao metodos simples pois nao tem retorno definido , e nao construtores
		nome = nomeInicial ;
	}
	Produto(String nomeInicial,double pre�oInicial) { //nao sao metodos simples pois nao tem retorno definido , e nao construtores
		pre�o = pre�oInicial;
		nome = nomeInicial ;
	}

	
		 
	//dessa forma temos 3 formas de criar
	
	
	double comDesconto() { //nao prescisaremos de parametros pois nos ja temos os dados de pre�o e desconto no objeto
		               
	return pre�o - (desconto * pre�o );	
	}
	double comDesconto(double descontoDoGerente) {    //se quiseermos parametrar um valor como por exemplo o desconto de gerente nos o definimos normalmente 
		return pre�o - (desconto + descontoDoGerente*(pre�o));	
	}
	
	//sem problema pois parametros diferentes
	
	
	
	
}
