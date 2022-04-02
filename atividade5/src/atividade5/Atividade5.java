/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5;

/**
 *
 * @author Matheus Meirielli RGM : 11211102089 EMAIL : 11211102089@Alunos.umc.br
 * @co-author Guilherme Antunes RGM: 11211102142 EMAIL : 11211102142@Alunos.umc.br
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operadores resultado = new Operadores(0, 0);

        //EXEMPLO DE ADIÇÃO
        System.out.println("=================");
        System.out.println("(1) EXEMPLO DE ADICAO");
        System.out.println("o resultado e : " + resultado.adicao(10, 5));
        System.out.println("=================");
        //EXEMPLO DE SUBTRAÇÃO
        System.out.println("(2)EXEMPLO DE SUBTRACAO");
        System.out.println("o resultado e : " + resultado.subtracao(10, 5));
        System.out.println("=================");
        //EXEMPLO DE MULTIPLICAÇÃO
        System.out.println("(3) EXEMPLO DE MULTIPLICACAO");
        System.out.println("o resultado e : " + resultado.multiplicacao(10, 5));
        System.out.println("=================");
        //EXEMPLO DE DIVISÃO
        System.out.println("(4)EXEMPLO DE DIVISAO");
        System.out.println("o resultado e : " + resultado.divisao(10, 5));
        System.out.println("=================");
        //EXEMPLO DE RESTO DE DIVISÃO
        System.out.println("(5) EXEMPLO DE RESTO DE DIVISAO");
        System.out.println("o resultado e : " + resultado.restoDivisao(10, 5));
        System.out.println("=================");
        //EXEMPLO DE OPERADOR DE ADIÇÃO 2
        System.out.println("                  ");
        System.out.println("----- METODOS DE ATRIBUICAO -----");
        System.out.println("(6) EXEMPLO DE ADICAO 2");
        System.out.println("o resultado e : " + resultado.adicao2(10, 5));
        System.out.println("=================");
        //EXEMPLO DE SUBTRAÇÃO 2
        System.out.println("(7) EXEMPLO DE SUBTRACAO 2");
        System.out.println("o resultado e : " + resultado.subtracao2(10, 5));
        System.out.println("=================");
        //EXEMPLO DE MULTIPLICAÇÃO 2
        System.out.println("(8) EXEMPLO DE MULTIPLICACAO 2");
        System.out.println("o resultado e : " + resultado.multiplicacao2(10, 5));
        System.out.println("=================");
        //EXEMPLO DE DIVISÃO 2
        System.out.println("(9) EXEMPLO DE DIVISAO 2");
        System.out.println("o resultado e : " + resultado.divisao2(10, 5));
        System.out.println("=================");
        //EXEMPLO DE RESTO DE DIVISÃO 2
        System.out.println("(10) EXEMPLO DE RESTO DIVISAO 2");
        System.out.println("o resultado e : " + resultado.restoDivisao2(10, 5));
        System.out.println("=================");
        //CASO E 
        System.out.println("                  ");
        System.out.println("----- METODOS DE OPERADORES LOGICOS -----");
        System.out.println("(11) EXEMPLO DE CASO E");
        System.out.println("o resultado e : " + resultado.e(10, 5));
        System.out.println("=================");
        //CASO E BOOLEAN
        System.out.println("(12) EXEMPLO DE CASO E - BOOLEAN");
        System.out.println("o resultado e : " + resultado.eBoolean(10, 5));
        System.out.println("=================");
        //CASO OU
        System.out.println("(13) EXEMPLO DE CASO OU");
        System.out.println("o resultado e : " + resultado.ou(10, 5));
        System.out.println("=================");
        //CASO OU BOOLEAN
        System.out.println("(14) EXEMPLO DE CASO OU BOOLEAN");
        System.out.println("o resultado e : " + resultado.ouBoolean(10, 5));
        System.out.println("=================");
        //CASO OU BOOLEAN
        System.out.println("(15) EXEMPLO DE CASO OU EXCLUSIVO");
        System.out.println("o resultado e : " + resultado.ouexclusivo(10, 5));
        System.out.println("=================");
        //CASO IGUAL
        System.out.println("(16) EXEMPLO DE CASO IGUAL");
        System.out.println("o resultado e : " + resultado.igual(10, 5));
        System.out.println("=================");
        //CASO DIFERENTE
        System.out.println("(17) EXEMPLO DE CASO DIFERENTE");
        System.out.println("o resultado e : " + resultado.diferente(10, 5));
        System.out.println("=================");
        //CASO MENOR
        System.out.println("(18) EXEMPLO DE CASO MENOR");
        System.out.println("o resultado e : " + resultado.menor(10, 5));
        System.out.println("=================");
        //CASO MENOR IGUAL
        System.out.println("(19) EXEMPLO DE CASO MENOR IGUAL");
        System.out.println("o resultado e : " + resultado.menorigual(10, 5));
        System.out.println("=================");
        //CASO MAIOR 
        System.out.println("(20) EXEMPLO DE CASO MAIOR");
        System.out.println("o resultado e : " + resultado.maior(10, 5));
        System.out.println("=================");
        //CASO MAIOR IGUAL
        System.out.println("(21) EXEMPLO DE CASO MAIOR");
        System.out.println("o resultado e : " + resultado.maiorigual(10, 5));
        System.out.println("=================");
        //EXEMPLO DE OPERADOR DE ATRIBUIÇÃO
        System.out.println("                  ");
        System.out.println("----- EXEMPLO DE OPERADOR DE ATRIBUICAO -----");
        System.out.println("o resultado e : " + resultado.atribuicao(10, 5));
        System.out.println("=================");
        //EXEMPLO DE OPERADOR LÓGICO
        System.out.println("                  ");
        System.out.println("----- EXEMPLO DE OPERADOR LOGICO -----");
        System.out.println("o resultado e : " + resultado.logico("Matheus", "Meirielli"));
        System.out.println("=================");
        //EXEMPLO DE OPERADOR COMPARATIVO
        System.out.println("                  ");
        System.out.println("----- EXEMPLO DE OPERADOR COMPARATIVO -----");
        System.out.println("o resultado e : " + resultado.comparativo(50));
        System.out.println("========F I M=========");

    }

}
