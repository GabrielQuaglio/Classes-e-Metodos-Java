package classesEMetodos.Produto;

public class ProdutoTeste {

	public static void main(String[] args) {
		//neste caso nao prescisaremos importar a outra classe pois estamos dentro de um mesmo pacote,assim como oque esta no java.lang
		
		//para instanciarmos o produto nos fazemos da mesma forma que fazemos com o Scanner
		//Scanner entrada = new Scanner(System.in); usamos o Scanner e depois usamos a palavra new que chama um construtor
		//para construir o objeto
		//entao temos uma classe(Produto) que é o molde e duas instancias a partir do molde
		
       Produto p1 = new Produto("nootebook",4356.89); //nao esquecer dos parenteses//nome da classe ... = new nome da classe - pode variar
      // p1.nome = "nootebook";//usamos o metodo construtor que tem vantagem por ser mais simples a escrita
      // p1.preço = 4356.89;
       //p1.desconto = 0.25;// agora pra mudarmos o desconto apena chamando a classe, pois agora esse atributo pertence a classe
      
       
		var p2 = new Produto("caneta preta"); //a cada novo objeto prscisamos chmar o metodo
       // p2.nome = "caneta preta"; passamos no construtor pois perdemos o construtor padrao ao criar um novo
		//e neste novo definimos como parametro a String nome
        p2.preço = 12.56;
		//Produto.desconto = 0.50;
		
	System.out.println(p1.nome);
	System.out.println(p2.nome);
	
	double preçofinal = p1.comDesconto();//esta dando erro pois parametramos o descontodogerente, entao prescisamos definilo
	double preçofinal2 = p2.comDesconto();//com parentese chamamos o metodo e sem chamamos o atributo
	double media = (preçofinal2 + preçofinal  );
	
	System.out.printf("media do carrinho = R$%.2f.", media);//System  é uma classe/out um atributo e print é um comportammento
		//dica imprtante de que nem sempre irmos direto para o melhor codigo mas sim irmos melhorando ele aos poucos
	}
}
