package classesEMetodos.AreaCirc;

public class AreaCirc {

	double raio;
	static final double PI = 3.14;
	
	 AreaCirc(double raioInicial) {
		 raio = raioInicial;
		
		// nome da classe mais ctrl+space cria um construtor
	}
	 double area() { //nao recebe parametro pos ja tem os dados definidos
		 return raio * raio * PI;
	 }
}
