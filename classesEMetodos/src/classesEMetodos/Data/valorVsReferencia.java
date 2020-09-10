package classesEMetodos.Data;

public class valorVsReferencia {
public static void main(String[] args) {
	
	double a =2;
	double b = a; //atribuiçao por valor
	
	a++;
	b--;//sao independentes de forma que quando alteramos um valor o outro nao se altera
	System.out.println(a + " " + b);//da mesma forma(primitivvo)
	
	Data d1 = new Data(1,6,2022);
	Data d2 = d1;//atribuiçao por referencia (objeto)
	
	d1.dia = 31;
	d2.mes = 12;//as modificaçoes de um alteram os dois
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
	
	voltarDataParaValorPadrao(d1);
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
	
	
}
static void voltarDataParaValorPadrao(Data d) {
	d.dia = 1;
	d.mes = 1;
	d.ano = 1970;
			
}
}
