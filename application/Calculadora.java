/**
 * 
 */
package application;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class Calculadora {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
				
		Operadores resultado = new Operadores();
		
		//Exemplos do professor
		System.out.println("O resultado é: " + resultado.adicao(10, 5));
		System.out.println("O resultado é: " + resultado.subtracao(10, 5));
		System.out.println("O resultado é: " + resultado.multiplicacao(10, 5));
		System.out.println("O resultado é: " + resultado.divisao(10, 5));
		System.out.println();
		
		//Atividade 5
		//Operadores aritméticos
		System.out.println("Operadores aritméticos\n");
		System.out.println("O resultado é: " + resultado.resto(5, 2));
		System.out.println("=====================================================");
		
		//Operadores de atribuição
		System.out.println("Operadores de atribuição\n");
		System.out.println("O resultado é: " + resultado.atribuirSoma(5, 5));
		System.out.println("O resultado é: " + resultado.atribuirSubt(10, 4));
		System.out.println("O resultado é: " + resultado.atribuirMult(5, 5));
		System.out.println("O resultado é: " + resultado.atribuirDivi(20, 4));
		System.out.println("O resultado é: " + resultado.atribuirResto(50, 12));
		System.out.println("=====================================================");
				
		//Operadores de comparação
		System.out.println("Operadores de comparação\n");
		System.out.println("O resultado é: " + resultado.compIgual(5, 4));
		System.out.println("O resultado é: " + resultado.compDif(10, 11));
		System.out.println("O resultado é: " + resultado.compMenor(8, 4));
		System.out.println("O resultado é: " + resultado.compMaior(5, 2));
		System.out.println("O resultado é: " + resultado.compMenorIgual(5, 4));
		System.out.println("O resultado é: " + resultado.compMaiorIgual(6, 3));
		System.out.println("=====================================================");
		
		//Operadores lógicos
		System.out.println("Operadores lógicos\n");
		System.out.println("O resultado é: " + resultado.logAnd(true, true));
		System.out.println("O resultado é: " + resultado.logSimpleAnd(false, true));
		System.out.println("O resultado é: " + resultado.logOr(false, true));
		System.out.println("O resultado é: " + resultado.logSimpleOr(false, true));
		System.out.println("O resultado é: " + resultado.logExclusive(false, false));
		System.out.println("O resultado é: " + resultado.logNot(false));
		System.out.println("=====================================================");		
	}

}
