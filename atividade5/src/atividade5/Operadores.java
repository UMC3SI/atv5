/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade5;

/**
 *
 * @author Matheus Meirielli RGM : 11211102089 EMAIL : 11211102089@Alunos.umc.br
 */
public class Operadores {

    float v1, v2;

    public Operadores(float v1, float v2) {
        this.v1 = v1;
        this.v2 = v2;

    }

    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;

    }

    public float divisao(float v1, float v2) {
        return v1 / v2;
    }

    public float restoDivisao(float v1, float v2) {
        return v1 % v2;
    }

    public float adicao2(float v1, float v2) {
        return v1 += v2;
    }

    public float subtracao2(float v1, float v2) {
        return v1 -= v2;
    }

    public float divisao2(float v1, float v2) {
        return v1 /= v2;
    }

    public float multiplicacao2(float v1, float v2) {
        return v1 *= v2;
    }

    public float restoDivisao2(float v1, float v2) {
        return v1 %= v2;
    }

    public float e(float v1, float v2) {
        if ((v1 < v2) && v2 > 9) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    public float eBoolean(float v1, float v2) {
        if ((v1 < v2) & v2 > 9) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    public float ou(float v1, float v2) {
        if ((v1 > 3) || (v2 > 8)) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    public float ouBoolean(float v1, float v2) {
        if ((v1 > 4) | (v2 > 9)) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    public float ouexclusivo(float v1, float v2) {
        if ((v1 > 4) ^ (v2 > 10)) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    public float igual(float v1, float v2) {
        if (v1 == v2) {
            return v1;
        } else {
            return v2;
        }
    }

    public float diferente(float v1, float v2) {
        if (v1 != v2) {
            return v1;
        } else {
            return v2;
        }
    }

    public float menor(float v1, float v2) {
        if (v1 < v2) {
            return v1;
        } else {
            return v2;
        }
    }

    public float maior(float v1, float v2) {
        if (v1 > v2) {
            return v1;
        } else {
            return v2;
        }
    }

    public float menorigual(float v1, float v2) {
        if (v1 <= v2) {
            return v1;
        } else {
            return v2;
        }
    }

    public float maiorigual(float v1, float v2) {
        if (v1 >= v2) {
            return v1;
        } else {
            return v2;
        }
    }

    public String logico(String nome, String sobrenome) {
        if (nome != "Matheus" && sobrenome != "Meirielli") {
            return "Nome Inválido";
        } else {
            return "Nome Valido";
        }
    }

    public String comparativo(float v1) {
        if (v1 > 100) {
            return "Numero maior que 100";
        } else {
            return "Numero menor que 100";
        }
    }

    public float atribuicao(float v1, float v2) {
        return v1 = (3 * (v1 *= v2));
    }

}
