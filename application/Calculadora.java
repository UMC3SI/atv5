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
		System.out.println("O resultado �: " + resultado.adicao(10, 5));
		System.out.println("O resultado �: " + resultado.subtracao(10, 5));
		System.out.println("O resultado �: " + resultado.multiplicacao(10, 5));
		System.out.println("O resultado �: " + resultado.divisao(10, 5));
		System.out.println();
		
		//Atividade 5
		//Operadores aritm�ticos
		System.out.println("Operadores aritm�ticos\n");
		System.out.println("O resultado �: " + resultado.resto(5, 2));
		System.out.println("=====================================================");
		
		//Operadores de atribui��o
		System.out.println("Operadores de atribui��o\n");
		System.out.println("O resultado �: " + resultado.atribuirSoma(5, 5));
		System.out.println("O resultado �: " + resultado.atribuirSubt(10, 4));
		System.out.println("O resultado �: " + resultado.atribuirMult(5, 5));
		System.out.println("O resultado �: " + resultado.atribuirDivi(20, 4));
		System.out.println("O resultado �: " + resultado.atribuirResto(50, 12));
		System.out.println("=====================================================");
				
		//Operadores de compara��o
		System.out.println("Operadores de compara��o\n");
		System.out.println("O resultado �: " + resultado.compIgual(5, 4));
		System.out.println("O resultado �: " + resultado.compDif(10, 11));
		System.out.println("O resultado �: " + resultado.compMenor(8, 4));
		System.out.println("O resultado �: " + resultado.compMaior(5, 2));
		System.out.println("O resultado �: " + resultado.compMenorIgual(5, 4));
		System.out.println("O resultado �: " + resultado.compMaiorIgual(6, 3));
		System.out.println("=====================================================");
		
		//Operadores l�gicos
		System.out.println("Operadores l�gicos\n");
		System.out.println("O resultado �: " + resultado.logAnd(true, true));
		System.out.println("O resultado �: " + resultado.logSimpleAnd(false, true));
		System.out.println("O resultado �: " + resultado.logOr(false, true));
		System.out.println("O resultado �: " + resultado.logSimpleOr(false, true));
		System.out.println("O resultado �: " + resultado.logExclusive(false, false));
		System.out.println("O resultado �: " + resultado.logNot(false));
		System.out.println("=====================================================");		
	}

}
