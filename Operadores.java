float v1;
    float v2;

    public Operadores(float v1, float v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    //conta de adição
    public float adicao() {
        return v1 + v2;
    }

    //conta de subtração
    public float subtracao() {
        return v1 - v2;
    }

    //conta de multiplicação
    public float multiplicacao() {
        return v1 * v2;
    }

    //conta de divisão
    public float divisao() {
        return v1 / v2;
    }

    //conta de sobra da divisão
    public float retornoDivisao() {
        return v1 % v2;
    }

    // métodos usando operadores de atribuição
    public float somaIgual() {
        return v1 += v2;
    }

    public float subtracaoIgual() {
        return v1 -= v2;
    }

    public float divisaoIgual() {
        return v1 /= v2;
    }

    public float multiplicacaoIgual() {
        return v1 *= v2;
    }

    public float retornodivisaoIgual() {
        return v1 %= v2;
    }

    //Métodos usando operadores lógicos
    //retorna true se v1 e v2 forem true, se não retorna false, se v1 é false v2 não é avaliada
    public float e() {
        if ((v1 < v2) && v2 > 11) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }
    //retorna true se v1 e v2 forem true, se não retorna false, ambas são avaliadas

    public float eBooleano() {
        if ((v1 < v2) & v2 > 11) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }
    //retorna true se v1 ou v2 forem true, se v1 é false v2 não é avaliada

    public float ou() {
        if ((v1 > 4) || (v2 > 9)) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    //retorna true se v1 ou v2 forem true, Se não retorna false, Ambas expressões v1 e v2 são avaliadas.
    public float ouBooleano() {
        if ((v1 > 4) | (v2 > 9)) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }

    // retorna true se v1 for true e v2 for false ou vise versa, caso não retorna false.
    public float ouexclusivo() {
        if ((v1 > 4) ^ (v2 > 10)) {
            return v1 - v2;
        } else {
            return v1 + v2;
        }
    }
    //não sei como funciona
    /*public float nao() {
        boolean v1 = false;
        boolean v2 = true;
         System.out.println(v1);
        v1= !v2;
        System.out.println(v1);
        return v1;
    }*/

    //método usando operadores de comparação
    //o número é igual
    public float igual() {
        if (v1 == v2) {
            return v1;
        } else {
            return v2;
        }
    }

    // !v1 retorna true se v1 for false, se não retorna false
    public float diferente() {
        if (v1 != v2) {
            return v1;
        } else {
            return v2;
        }
    }

    // < retorna true se o valor for menor, se for maior retorna false
    public float menor() {
        if (v1 < v2) {
            return v1;
        } else {
            return v2;
        }
    }

    // > retorna false se o valor for maior, se for menor retorna false
    public float maior() {
        if (v1 > v2) {
            return v1;
        } else {
            return v2;
        }
    }

    // >= retorna true se o valor for menor ou igual, se for maior retorna false
    public float menorIgual() {
        if (v1 <= v2) {
            return v1;
        } else {
            return v2;
        }
    }

    // >= retorna true se o valor for maior ou igual, se for menor retorna false
    public float maiorIgual() {
        if (v1 >= v2) {
            return v1;
        } else {
            return v2;
        }
    }
