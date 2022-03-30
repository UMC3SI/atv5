package calc_atv5;
/*
código feito por Leonardo Piascentini Bugmann, RGM:11211100076
*/
public class Operadores {
	
	public float adicao (float x1,float x2) {
		return x1 + x2;
	}
	public float subtracao (float x1,float x2) {
		return x1 - x2;
	}
	public float multiplicacao (float x1,float x2) {
		return x1 * x2;
	}
	public float divisao (float x1,float x2) {
		return x1 / x2;
	}
	public float resto (float x1,float x2) {
		return x1 % x2;
	}
	
	
	public float atribuicaoSoma (float x1,float x2) {
		return x1 += x2;
	}
	public float atribuicaoSubi (float x1,float x2) {
		return x1 -= x2;
	}
	public float atribuicaoMulti (float x1,float x2) {
		return x1 *= x2;
	}
	public float atribuicaoDivi (float x1,float x2) {
		return x1 /= x2;
	}
	public float atribuicaoResto (float x1,float x2) {
		return x1 %= x2;
	}
	
	
	public boolean comparacaoIgual (float x1,float x2) {
		if (x1 == x2) {
			return true;	
		}
		return false;
	}
	public boolean comparacaoDiff (float x1,float x2) {
		if (x1 != x2) {
			return true;	
		}
		return false;
	}
	public float comparacaoMenor (float x1,float x2) {
		if (x1 < x2) {
			return x1;	
		}
		return x2;
	}
	public float comparacaoMaior (float x1,float x2) {
		if (x1 > x2) {
			return x1;	
		}
		return x2;
	}
	public float comparacaoMenorIgual (float x1,float x2) {
		if (x1 <= x2) {
			return x1;	
		}
		return x2;
	}
	public float comparacaoMaiorIgual (float x1,float x2) {
		if (x1 >= x2) {
			return x1;	
		}
		return x2;
	}
	
	
	public float logicoAnd (float x1,float x2) {
		if (x1 < 10 && x2 < 5) {
			return x1;	
		}
		return x2;
	}
	public boolean logicoAndBoolean (float x1,float x2) {
		if (x1 < 10 & x2 < 5) {
			return true;	
		}
		return false;
	}
	public float logicoOr (float x1,float x2) {
		if (x1 < 11 || x2 < 6) {
			return x1;	
		}
		return x2;
	}
	public boolean logicoOrBoolean (float x1,float x2) {
		if (x1 < 11 | x2 < 6) {
			return true;	
		}
		return false;
	}
	
	
	
	
	
}
