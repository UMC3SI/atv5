public class Calculadora {
    public static void main(String[] args) {
        Operadores resultado = new Operadores();

        // Operadores Aritméticos
        // Adição
        System.out.println("A solução da adição de 15+3 é igual a: " + resultado.adicao(15, 3));
        // Subtração
        System.out.println("A solução da subtração de 15-8 é igual a: " + resultado.subtracao(15, 8));
        // Multiplicação
        System.out.println("A solução da multiplicação de 20-3 é igual a: " + resultado.multiplicacao(20, 3));
        // Divisão
        System.out.println("A solução divisão de 9-3 é igual a: " + resultado.divisao(9, 3));

        // Operadores Atribuição
        // Adição
        System.out.println("\nA solução da adição de 20+=16 é igual a: " + resultado.atribuicao_adicao(20, 16));
        // Subtração
        System.out.println("A solução da Subtração de 30-= 15 é igual a: " + resultado.atribuicao_subtracao(30, 15));
        // Multiplicação
        System.out.println("A solução da Multiplicação de 45*= 5 é igual a: " + resultado.atribuicao_multiplicacao(45, 5));
        // Divisão
        System.out.println("A solução da Divisão de 21/= 7 é igual a: " + resultado.atribuicao_divisao(21, 7));
        // Resto da Divisão
        System.out.println("A solução da Resto da Divisão de 40%= 7 é igual a: " + resultado.atribuicao_resto(40, 7));

        // Operadores Comparação
        // Igual a...
        System.out.println("\nO Resultado da comparação : " + resultado.comparacao_igualA(20, 20));
        // Diferente de...
        System.out.println("O Resultado da comparação: " + resultado.comparacao_diferenteDE(18, 4));
        // Menor que...
        System.out.println("O Resultado da comparação: " + resultado.comparacao_menorQUE(1, 6));
        // Maior que...
        System.out.println("O Resultado da comparação: " + resultado.comparacao_maiorQUE(24, 19));
        // Menor ou Igual a...
        System.out.println("O Resultado da comparação: " + resultado.comparacao_menorIgual(15, 16));
        // Maior ou Igual a...
        System.out.println("O Resultado da comparação: " + resultado.comparacao_maiorIgual(4, 2));

        // Operadores Lógicos
        // And.And
        System.out.println("\nO Resultado da lógica : " + resultado.logical_AND_AND(15, 13, 1 , 4));
        // And
        System.out.println("O Resultado da lógica : " + resultado.logical_AND(5, 2, 10 , 14));
        // Or.Or
        System.out.println("O Resultado da lógica : " + resultado.logical_OR_OR(10, 7, 21 , 92));
        // Or
        System.out.println("O Resultado da lógica : " + resultado.logical_OR(120, 132, 45 , 80));
        // Or.Exclusive
        System.out.println("O Resultado da lógica : " + resultado.logical_XOR(11, 12, 5 , 8));
        // Not
        System.out.println("O Resultado da lógica : " + resultado.logical_NOT(13, 12));
        
    }

}
