package classesEMetodos;

public class Produto2 {
     String nome1;
     int pe�as1;
     double pre�o1;
     int data1;
     String cor1;
     
	
	//SITE DA AMAZON
	//3 produtos
	//lego; nome:lego disney ariel;n/pe�as:105;pre�o:99,00;data maxima de entrega:23 dias
	//tenis; nomme: blady b,ferracini;pre�o:133,99;cores:preto ou branco,data maxima de entrega: 29 dias
	//livro; nome: o poder do tempo livre,pre�o:39,90,cor:amarelo,data maxima de entrega: 28 dias
	
	Produto2(String nome, int pe�as, double pre�o, int data ){
		nome1 = nome;
		pe�as1 = pe�as;
		pre�o1 = pre�o;
		data1 = data;
	}
	Produto2(String nome,String cor, double pre�o, int data){
		nome1 = nome;
		cor1 = cor;
		pre�o1 = pre�o;
		data1 = data;
	}
	
	
	String lego() {
		return String.format("%s contendo %d pe�as\nPre�o: R$%.2f\nEntrega em no maximo %s dias\n"
				,nome1,pe�as1,pre�o1,data1);
	}
	String tenisLivro () {
		return String.format("%s, disponivel em %s\nPre�o: R$%.2f\nEntrega em no maximo %s dias\n"
				,nome1,cor1,pre�o1,data1);
	}
	
	
}
