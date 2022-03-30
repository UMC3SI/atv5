/**
 * 
 */
package ImpostoRenda;

/**
 * @author Julia Calazans - 11211102258@alunos.umc.br
 * @author Gustavo de Almeida Monteiro - 11211100223@alunos.umc.br
 */
public class Operadores {
	public float adicao(float v1, float v2) {
		return v1+v2;
	}
	
	public float subtracao(float v1, float v2) {
		return v1-v2;
	}
	
	public float multiplicacao(float v1, float v2) {
		return v1*v2;
	}
	
	public float divisao(float v1, float v2) {
		return v1/v2;
	}
	
	public float adicao2(float v1, float v2) {
		return v1 += v2;
	}
	
	public float subtracao2(float v1, float v2) {
		return v1 -= v2;
	}
	
	public float multiplicacao2(float v1, float v2) {
		return v1 *= v2;
	}
	
	public float divisao2(float v1, float v2) {
		return v1 /= v2;
	}
	
	public float resto(float v1, float v2) {
		return v1 %= v2;
	}
	
	public void comparacao(float v1, float v2) {
		if (v1 == v2) {
			System.out.println("Valores iguais");
		}
		else if (v1 > v2) {
			System.out.println(v1 + " é maior que " + v2);
		}
		else {
			System.out.println(v2 + " é maior que " + v1);
		}
	}
	
	public void maiorigual(float v) {
		if (v >= 80) {
			System.out.println(v + " é maior ou igual á 80");
		}
		else {
			System.out.println(v + " é menor que 80");
		}
	}
	
	public void menorigual(float v) {
		if (v <= 58) {
			System.out.println(v + " é menor ou igual á 58");
		}
		else {
			System.out.println(v + " é maior que 58");
		}
	}
	
	public boolean valoresMenorque(float v1, float v2) {
		if (v1 < 70 && v2 < 70) {
			return true;
		}
		else return false;
	}
	
	public boolean valorMaiorque(float v1, float v2) {
		if (v1 > 54 || v2 > 54) {
			return true;
		}
		else return false;
	}
}