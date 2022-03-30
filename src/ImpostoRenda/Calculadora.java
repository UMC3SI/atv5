/**
 * 
 */
package ImpostoRenda;

/**
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 */
public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operadores result  = new Operadores();
		
		System.out.println("O resultado da adição é: "+ result.adicao(10, 5));
		System.out.println("O resultado da subtração é: "+ result.subtracao(10, 5));
		System.out.println("O resultado da multiplicação é: "+ result.multiplicacao(10, 5));
		System.out.println("O resultado da divisão é: "+ result.divisao(10, 5));
		System.out.println("O resultado da 2ª adição é: "+ result.adicao2(20, 4));
		System.out.println("O resultado da 2ª subtração é: "+ result.subtracao2(20, 4));
		System.out.println("O resultado da 2ª multiplicação é: "+ result.multiplicacao2(20, 4));
		System.out.println("O resultado da 2ª divisão é: "+ result.divisao2(20, 4));
		System.out.println("O resto da divisão é: "+ result.resto(17,2));
		result.comparacao(10, 15);
		result.maiorigual(76);
		result.menorigual(34);
		System.out.println("Ambos os valores são menores que 70: "+ result.valoresMenorque(49, 70));
		System.out.println("um dos valores é maior que 54: "+ result.valorMaiorque(49, 70));
	}

}