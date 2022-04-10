package calc_atv5;
/*
código feito por Leonardo Piascentini Bugmann, RGM:11211100076
*/
public class Calculadora {
	
	public static void main(String[] args) {
		Operadores resultado = new Operadores();
		
		System.out.println("O resultado da adição é: " + resultado.adicao(10, 5));
		
		System.out.println("O resultado da subtração é: " + resultado.subtracao(10, 5));
		
		System.out.println("O resultado da multiplicação é: " + resultado.multiplicacao(10, 5));
		
		System.out.println("O resultado da divisão é: " + resultado.divisao(10, 5));
		
		System.out.println("O resultado do resto é: " + resultado.resto(10, 5));
		
		System.out.println("A atribuição (soma) é: " + resultado.atribuicaoSoma(10, 5));
		
		System.out.println("A atribuição (subitração) é: " + resultado.atribuicaoSubi(10, 5));
		
		System.out.println("A atribuição (multiplicação) é: " + resultado.atribuicaoMulti(10, 5));
		
		System.out.println("A atribuição (divisão) é: " + resultado.atribuicaoDivi(10, 5));
		
		System.out.println("A atribuição (resto) é: " + resultado.atribuicaoResto(10, 5));
		
		System.out.println("A comparação (igualdade) é: " + resultado.comparacaoIgual(10, 5));
		
		System.out.println("A comparação (diferença) é: " + resultado.comparacaoDiff(10, 5));
		
		System.out.println("A comparação (menor que) é: " + resultado.comparacaoMenor(10, 5));
		
		System.out.println("A comparação (maior que) é: " + resultado.comparacaoMaior(10, 5));
		
		System.out.println("A comparação (menor igual) é: " + resultado.comparacaoMenorIgual(10, 5));
		
		System.out.println("A comparação (maior igual) é: " + resultado.comparacaoMaiorIgual(10, 5));
		
		System.out.println("A lógica é (se 10 for menor que 10 E 5 menor que 5 print o valor de 5.0): " + resultado.logicoAnd(10, 5));
		
		System.out.println("A lógica é (se 10 for menor que 10 E 5 menor que 5 print boolean false): " + resultado.logicoAndBoolean(10, 5));
		
		System.out.println("A lógica é (se 10 for menor que 11 OU 5 menor que 6 print o valor de 10): " + resultado.logicoOr(10, 5));
		
		System.out.println("A lógica é (se 10 for menor que 11 OU 5 menor que 6 print boolean true): " + resultado.logicoOrBoolean(10, 5));
	}
}
