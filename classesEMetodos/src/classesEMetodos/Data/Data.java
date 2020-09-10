package classesEMetodos.Data;

public class Data {

	//sem preocupaçao com validaçoes por enquanto
	int mes;//podemos definir as variaveeis para fora dos metodos para serem usadas em diversos locais
	int dia;
	int ano; 
	
	//3 tipos de variaveis:locais(dentro de metodos e ...), instancia e classe como as daqui
	//somente as de classe e de instancia tem valor padrao definido
	
	//professor usou o .format que parece com o printf
	//melhor forma pois ele funciona de todas as formas
	//usando system ele ira funcionar apenas em um terminal
	
	//iremos refatorar usando o construtor default(explicito) e um metodo construtor	
	//dia 1/mes 1/ano 1970	padrao caso nao informemos
	//quando usarmos o metodo construtor nos escolhemos
	Data() {
	//dia = 1;
	//mes = 1;
	//ano = 1970;
		this(1,1,1970);//podemos usar o this() dentro de um contrutor para chamarmos outro construtor
		//quem definira qual é o construtor chmado é a assinatura, parametros do this() = construtor()
	}
	Data(int dia,int mes,int ano){
		//dia = diaOficial; podemos usar tambem o abaixo
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
 String obterDataFormatada (){
		return String.format("%d/%d/%d",dia,mes,ano);
		
		
		
		
	}


	

}
