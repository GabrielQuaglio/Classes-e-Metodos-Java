package exerciciosDeclassesEMetodos;

public class Pessoa {

	String nome;
    double peso;
    
    Pessoa(String nome, double peso1){
    	this.peso = peso1;
    	this.nome = nome;
    }
    
 void comer(Comida comida) {
    this.peso  += comida.peso;
		  
	  
  }
    
  String comer1() {
	  return "Olá eu sou o " + nome +  "e peso: " + peso + " kgs";
  }
}
