package calc_atv5;
/*
c�digo feito por Leonardo Piascentini Bugmann, RGM:11211100076
*/
public class Calculadora {
	
	public static void main(String[] args) {
		Operadores resultado = new Operadores();
		
		System.out.println("O resultado da adi��o �: " + resultado.adicao(10, 5));
		
		System.out.println("O resultado da subtra��o �: " + resultado.subtracao(10, 5));
		
		System.out.println("O resultado da multiplica��o �: " + resultado.multiplicacao(10, 5));
		
		System.out.println("O resultado da divis�o �: " + resultado.divisao(10, 5));
		
		System.out.println("O resultado do resto �: " + resultado.resto(10, 5));
		
		System.out.println("A atribui��o (soma) �: " + resultado.atribuicaoSoma(10, 5));
		
		System.out.println("A atribui��o (subitra��o) �: " + resultado.atribuicaoSubi(10, 5));
		
		System.out.println("A atribui��o (multiplica��o) �: " + resultado.atribuicaoMulti(10, 5));
		
		System.out.println("A atribui��o (divis�o) �: " + resultado.atribuicaoDivi(10, 5));
		
		System.out.println("A atribui��o (resto) �: " + resultado.atribuicaoResto(10, 5));
		
		System.out.println("A compara��o (igualdade) �: " + resultado.comparacaoIgual(10, 5));
		
		System.out.println("A compara��o (diferen�a) �: " + resultado.comparacaoDiff(10, 5));
		
		System.out.println("A compara��o (menor que) �: " + resultado.comparacaoMenor(10, 5));
		
		System.out.println("A compara��o (maior que) �: " + resultado.comparacaoMaior(10, 5));
		
		System.out.println("A compara��o (menor igual) �: " + resultado.comparacaoMenorIgual(10, 5));
		
		System.out.println("A compara��o (maior igual) �: " + resultado.comparacaoMaiorIgual(10, 5));
		
		System.out.println("A l�gica � (se 10 for menor que 10 E 5 menor que 5 print o valor de 5.0): " + resultado.logicoAnd(10, 5));
		
		System.out.println("A l�gica � (se 10 for menor que 10 E 5 menor que 5 print boolean false): " + resultado.logicoAndBoolean(10, 5));
		
		System.out.println("A l�gica � (se 10 for menor que 11 OU 5 menor que 6 print o valor de 10): " + resultado.logicoOr(10, 5));
		
		System.out.println("A l�gica � (se 10 for menor que 11 OU 5 menor que 6 print boolean true): " + resultado.logicoOrBoolean(10, 5));
	}
}
