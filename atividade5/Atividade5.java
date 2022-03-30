/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5;

/**
 *
 * @author Matheus
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operadores resultado = new Operadores(0,0);
        
        //EXEMPLO DE ADIÇÃO
        System.out.println("o resultado e : " + resultado.adicao(10,5));
        //EXEMPLO DE SUBTRAÇÃO
        System.out.println("o resultado e : " + resultado.subtracao(10,5));
        //EXEMPLO DE MULTIPLICAÇÃO
        System.out.println("o resultado e : " + resultado.multiplicacao(10,5));
        //EXEMPLO DE DIVISÃO
        System.out.println("o resultado e : " + resultado.divisao(10,5));
        //EXEMPLO DE OPERADOR DE ATRIBUIÇÃO
        System.out.println("o resultado e : " + resultado.atribuicao(10,5));
        //EXEMPLO DE OPERADOR LÓGICO
        System.out.println("o resultado e : " + resultado.logico("Matheus","Meirielli"));
        //EXEMPLO DE OPERADOR COMPARATIVO
        System.out.println("o resultado e : " + resultado.comparativo(50));
        
      
      
    }
    
}
