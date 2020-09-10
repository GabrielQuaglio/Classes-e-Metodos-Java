package classesEMetodos.Data;

public class valorNulo {

	public static void main(String[] args) {
		
		
		String a = "";
		System.out.println(a.concat("!!!!!!"));
		
		Data b = null;
		b.ano = 3;
		System.out.println(b.ano);
		
		String s2 = null;// erro pois nao podemos acessar nem atributo nem metodo de ua variavel que esta nula
		System.out.println(s2.concat("!!!!!!"));
		
//NullPointerExeception é um erro de execuçao, nao acontece ao compilar e sim ao roda
	}
}
