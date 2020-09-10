package classesEMetodos;

public class produto2Teste {
public static void main(String[] args) {
	
	Produto2 p1 = new Produto2("lego disney ariel",105,99.00,23);
	
	System.out.println(p1.lego());
	
	Produto2 p2 = new Produto2("blady b.ferracini","preto ou branco",133.99,29);
	
	System.out.println(p2.tenisLivro());
	
	Produto2 p3 = new Produto2("o poder do tempo livre","amarelo",39.90,28);
	
	System.out.println(p3.tenisLivro());
	
	double totalGasto = p1.preço1 + p2.preço1 + p3.preço1;
	System.out.println("O total gasto sera de: " + totalGasto);
}
}
