/**
 * @author @vasconceloscaio Caio Vasconcelos <11211101570@alunos.umc.br>
 * @author @Parthur15 Arthur Pires <11211101539@alunos.umc.br>
 */

public class Operadores {
    public float adicao(float c1, float c2) {
        return c1 + c2;
    }

    public float subtracao(float c1, float c2) {
        return c1 - c2;
    }

    public float multiplicacao(float c1, float c2) {
        return c1 * c2;
    }

    public float divisao(float c1, float c2) {
        return c1 / c2;
    }

    // Atribuição
    public float atribuicao_adicao(float c1, float c2) {
        return c1 += c2;
    }

    public float atribuicao_subtracao(float c1, float c2) {
        return c1 -= c2;
    }

    public float atribuicao_multiplicacao(float c1, float c2) {
        return c1 *= c2;
    }

    public float atribuicao_divisao(float c1, float c2) {
        return c1 /= c2;
    }

    public float atribuicao_resto(float c1, float c2) {
        return c1 %= c2;
    }

    // Comparação
    public String comparacao_igualA(float c1, float c2) {
        if (c1 == c2) {
            return c1 + " é igual a " + c2;
        } else {
            return c1 + " não é igual a " + c2;
        }
    }

    public String comparacao_diferenteDE(float c1, float c2) {
        if (c1 != c2) {
            return c1 + " é diferente de " + c2;
        } else {
            return c1 + " não é diferente de " + c2;
        }
    }

    public String comparacao_menorQUE(float c1, float c2) {
        if (c1 < c2) {
            return c1 + " é menor que " + c2;
        } else {
            return c1 + " não menor que " + c2;
        }
    }

    public String comparacao_maiorQUE(float c1, float c2) {
        if (c1 > c2) {
            return c1 + " é maior que " + c2;
        } else {
            return c1 + " não é maior que " + c2;
        }
    }

    public String comparacao_menorIgual(float c1, float c2) {
        if (c1 <= c2) {
            return c1 + " é menor ou igual a " + c2;
        } else {
            return c1 + " não é menor ou igual a " + c2;
        }
    }

    public String comparacao_maiorIgual(float c1, float c2) {
        if (c1 >= c2) {
            return c1 + " é maior ou igual a  " + c2;
        } else {
            return c1 + " não é maior ou igual a  " + c2;
        }
    }

    // Lógicos
    public String logical_AND_AND(float c1, float c2, float c3, float c4) {
        if (c1 >= c2 && c3 <= c4) {
            return c1 + " é maior ou igual a " + c2 + " e " + c3 + " é menor ou igual a " + c4;
        } else {
            return c1 + " não é maior ou igual a  " + c2 + " e/ou " + c3 + " não é menor ou igual a " + c4;
        }
    }

    public String logical_AND(float c1, float c2, float c3, float c4) {
        if (c1 >= c2 & c3 <= c4) {
            return c1 + " é maior ou igual a " + c2 + " e " + c3 + " é menor ou igual a " + c4;
        } else {
            return c1 + " não é maior ou igual a  " + c2 + " e/ou " + c3 + " não é menor ou igual a " + c4;
        }
    }

    public String logical_OR_OR(float c1, float c2, float c3, float c4) {
        if (c1 > c2 || c3 < c4) {
            return c1 + " é maior que " + c2 + " ou " + c3 + " é menor que " + c4;
        } else {
            return c1 + " não é maior que " + c2 + " ou " + c3 + " não é menor que " + c4;
        }
    }

    public String logical_OR(float c1, float c2, float c3, float c4) {
        if (c1 > c2 | c3 < c4) {
            return c1 + " é maior que " + c2 + " ou " + c3 + " é menor que " + c4;
        } else {
            return c1 + " não é maior que " + c2 + " ou " + c3 + " não é menor que " + c4;
        }
    }

    public String logical_XOR(float c1, float c2, float c3, float c4) {
        if (c1 > c2 ^ c3 < c4) {
            return c1 + " é maior que " + c2 + " e " + c3 + " é maior que " + c4 + " ou " + c1 + " menor que " + c2
                    + " e "
                    + c3 + " menor que " + c4;
        } else {
            return c1 + " maior que " + c2 + " e " + c3 + " menor que " + c4 + " ou " + c1 + " menor que " + c2 + " e "
                    + c3 + " maior que " + c4;
        }
    }

    public String logical_NOT(float c1, float c2) {
        if (!(c1 < c2)) {
            return " false ";
        } else {
            return " true ";
        }
    }
}
