package classesEMetodos.Data;

public class DataTeste {//na realidade nao prescisariamos,pois o java ja tem classes que manipulam data

	public static void main(String[] args) {
		//instanciar 2 datas a nossa escolha a partir do "molde" da classe data
		
		Data d1 = new Data(13,04,2003);
		//d1.mes = 04;
		//d1.dia = 13;
		//d1.ano = 2003;
		
	    var d2 = new Data();//a cada novo objeto prscisamos chmar o metodo//e nem sempre usamos inferencia
		
		
		
		String dataCerta = d1.obterDataFormatada();
		System.out.println(dataCerta);
		System.out.println(d2.obterDataFormatada());
	}
}
