package classesEMetodos.AreaCirc;

public class AreaCircTeste {
public static void main(String[] args) {
	
	AreaCirc a = new AreaCirc(10);
	//a.pi = 10; //como pi é uma variavel de instancia nos podemos alterar seu valor
	
	AreaCirc a2 = new AreaCirc(10);
	//AreaCirc.pi = 10;//o novo jeito de acessar o pi agora é assim quando nao é um final
	//a2.pi = 6; //como pi é uma variavel de instancia nos podemos alterar seu valor
	System.out.println(a.area());
	//AreaCirc.pi = 4;
	System.out.println(a2.area());
	
	//o System, math sao atributos de classe pois nao usamos o new para chama-los
	//quando usamos o static queremos definir algo que seja um constante
	//que nao seja possivel mudar por isso usaremos final
	//e com isso por convençao usaremos seu nome todo maisculo
}
}
//static AGORA ESSA PORRA PERTENCE A CLASSE E NAO PRESCIMOAS CRIAR UMA INSTANCIA PARA ACESSAR