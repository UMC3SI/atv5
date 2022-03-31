/**
 * 
 */
package application;

/**
 * @author Bruno Rodrigues (11211501661@alunos.umc.br)
 * @author Bianca Gomes (11211101607@alunos.umc.br)
 *
 */
public class Operadores {

	//Operadores aritm�ticos
	public float adicao (float v1, float v2) {
		return v1+v2;
	}
	
	public float subtracao (float v1, float v2) {
		return v1-v2;
	}
	
	public float multiplicacao (float v1, float v2) {
		return v1*v2;
	}
	
	public float divisao (float v1, float v2) {
		return v1/v2;
	}
	
	public float resto (float v1, float v2) {
		return v1%v2;
	}
	
	//Operadores de atribui��o
	public float atribuirSoma(float v1, float v2) {
		v1+=v2;
		return v1;
	}
	public float atribuirSubt(float v1, float v2) {
		v1-=v2;
		return v1;
	}
	public float atribuirMult(float v1, float v2) {
		v1*=v2;
		return v1;
	}
	public float atribuirDivi(float v1, float v2) {
		v1/=v2;
		return v1;
	}
	public float atribuirResto(float v1, float v2) {
		v1%=v2;
		return v1;
	}
	
	//Operadores de compara��o
	public boolean compIgual(float v1, float v2) {
		return v1 == v2;
	}
	public boolean compDif(float v1, float v2) {
		return v1 != v2;
	}
	public boolean compMenor(float v1, float v2) {
		return v1 < v2;
	}
	public boolean compMaior(float v1, float v2) {
		return v1 > v2;
	}
	public boolean compMenorIgual(float v1, float v2) {
		return v1 <= v2;
	}
	public boolean compMaiorIgual(float v1, float v2) {
		return v1 >= v2;
	}
	
	//Operadores l�gicos
	public boolean logAnd(boolean v1, boolean v2) {
		return v1 && v2;
	}
	public boolean logSimpleAnd(boolean v1, boolean v2) {
		return v1 & v2;
	}
	public boolean logOr(boolean v1, boolean v2) {
		return v1 || v2;
	}
	public boolean logSimpleOr(boolean v1, boolean v2) {
		return v1 | v2;
	}
	public boolean logExclusive(boolean v1, boolean v2) {
		return v1 ^ v2;
	}
	public boolean logNot(boolean v1) {
		return !v1;
	}
	
}
