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
		
		System.out.println("O resultado da adi��o �: "+ result.adicao(10, 5));
		System.out.println("O resultado da subtra��o �: "+ result.subtracao(10, 5));
		System.out.println("O resultado da multiplica��o �: "+ result.multiplicacao(10, 5));
		System.out.println("O resultado da divis�o �: "+ result.divisao(10, 5));
		System.out.println("O resultado da 2� adi��o �: "+ result.adicao2(20, 4));
		System.out.println("O resultado da 2� subtra��o �: "+ result.subtracao2(20, 4));
		System.out.println("O resultado da 2� multiplica��o �: "+ result.multiplicacao2(20, 4));
		System.out.println("O resultado da 2� divis�o �: "+ result.divisao2(20, 4));
		System.out.println("O resto da divis�o �: "+ result.resto(17,2));
		result.comparacao(10, 15);
		result.maiorigual(76);
		result.menorigual(34);
		System.out.println("Ambos os valores s�o menores que 70: "+ result.valoresMenorque(49, 70));
		System.out.println("um dos valores � maior que 54: "+ result.valorMaiorque(49, 70));
	}

}