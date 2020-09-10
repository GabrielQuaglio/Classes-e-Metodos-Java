package classesEMetodos;

public class Produto2 {
     String nome1;
     int peças1;
     double preço1;
     int data1;
     String cor1;
     
	
	//SITE DA AMAZON
	//3 produtos
	//lego; nome:lego disney ariel;n/peças:105;preço:99,00;data maxima de entrega:23 dias
	//tenis; nomme: blady b,ferracini;preço:133,99;cores:preto ou branco,data maxima de entrega: 29 dias
	//livro; nome: o poder do tempo livre,preço:39,90,cor:amarelo,data maxima de entrega: 28 dias
	
	Produto2(String nome, int peças, double preço, int data ){
		nome1 = nome;
		peças1 = peças;
		preço1 = preço;
		data1 = data;
	}
	Produto2(String nome,String cor, double preço, int data){
		nome1 = nome;
		cor1 = cor;
		preço1 = preço;
		data1 = data;
	}
	
	
	String lego() {
		return String.format("%s contendo %d peças\nPreço: R$%.2f\nEntrega em no maximo %s dias\n"
				,nome1,peças1,preço1,data1);
	}
	String tenisLivro () {
		return String.format("%s, disponivel em %s\nPreço: R$%.2f\nEntrega em no maximo %s dias\n"
				,nome1,cor1,preço1,data1);
	}
	
	
}
