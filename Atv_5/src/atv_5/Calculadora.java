/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv_5;

/**
 *
 * @author Pedro Ferreira Martins <"11201100435@alunos.umc.br">
 * @author Raphael Ninomiya <"1121110998@alunos.umc.br">
 * @author Victor Ferreira Silva <"11211100596@alunos.umc.br">
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Operadores result = new Operadores();
        
        //        Métodos de operações simples:
        {
            System.out.println(" ____________________________________");
            System.out.println("|                                    |");
            System.out.println("|---------- Valores: 10, 5 ----------|");
            System.out.println("|         Operações simples          |");
            System.out.println("|____________________________________|");
            System.out.println();
            System.out.println("O resultado da adição será de: "+result.adicao(10, 5));
            System.out.println();
            System.out.println("O resultado da subtracao será de: "+result.subtracao(10, 5));
            System.out.println();
            System.out.println("O resultado da multiplicacao será de: "+result.multiplicacao(10, 5));
            System.out.println();
            System.out.println("O resultado da divisao será de: "+result.divisao(10, 5));
            System.out.println();
            System.out.println("O resultado da resto da divisão será de: "+result.resto_div(10, 5));
            System.out.println();

            //        Resposta:
            //  ____________________________________
            // |                                    |
            // |---------- Valores: 10, 5 ----------|
            // |         Operações simples          |
            // |____________________________________|
            //
            // O resultado da adição será de: 15.0
            //
            // O resultado da subtracao será de: 5.0
            //
            // O resultado da multiplicacao será de: 50.0
            //
            // O resultado da divisao será de: 2.0
            //
            // O resultado da resto da divisão será de: 0.0
        }
        
        
            //        Métodos de atribuição:
        {
            System.out.println(" ____________________________________");
            System.out.println("|                                    |");
            System.out.println("|---------- Valores: 10, 5 ----------|");
            System.out.println("|       Métodos de atribuição        |");
            System.out.println("|____________________________________|");
            System.out.println();
            System.out.println("O resultado da adição será de: "+result.atrib_soma(10, 5));
            System.out.println();
            System.out.println("O resultado da subtracao será de: "+result.atrib_sub(10, 5));
            System.out.println();
            System.out.println("O resultado da multiplicacao será de: "+result.atrib_mult(10, 5));
            System.out.println();
            System.out.println("O resultado da divisao será de: "+result.atrib_div(10, 5));
            System.out.println();
            System.out.println("O resultado da resto_div será de: "+result.atrib_resto(10, 5));
            System.out.println();

            //        Resultado:

            //  ____________________________________
            // |                                    |
            // |---------- Valores: 10, 5 ----------|
            // |       Métodos de atribuição        |
            // |____________________________________|
            //
            // O resultado da adição será de: 15.0
            //
            // O resultado da subtracao será de: 5.0
            //
            // O resultado da multiplicacao será de: 50.0
            //
            // O resultado da divisao será de: 2.0
            //
            // O resultado da resto_div será de: 0.0
        }
        
        
            //       Métodos de comparação:
        {
            System.out.println(" ____________________________________");
            System.out.println("|                                    |");
            System.out.println("|--------- Métodos lógicos ----------|");
            System.out.println("|____________________________________|");
            System.out.println();
            System.out.println(result.comparacao(12,12,8,8));
            System.out.println();
            System.out.println(result.comparacao(12,10,8,8));
            System.out.println();
            System.out.println(result.comparacao(12,12,9,8));
            System.out.println();
            System.out.println(result.comparacao(12,10,9,8));
            System.out.println();
            System.out.println(result.OU(1,5,6,1));
            System.out.println();
            System.out.println(result.OU(1,1,6,1));
            System.out.println();
            System.out.println(result.OU(1,5,6,0));
            System.out.println();
            System.out.println(result.unless(50));
            System.out.println();
            System.out.println(result.unless(101));
            
            //        Resposta:

            // ____________________________________
            //|                                    |
            //|--------- Métodos lógicos ----------|
            //|____________________________________|
            //
            //Os números 12.0 e 12.0 são iguais, assim como 8.0 e 8.0.
            //0.0
            //
            //Apenas os números 8.0 e 8.0 são iguais.
            //0.0
            //
            //Apenas os números 12.0 e 12.0 são iguais.
            //0.0
            //
            //Nenhum número se repete.
            //0.0
            //
            //O primeiro número (1.0) é igual a pelo menos um outro número fornecido.
            //0.0
            //
            //O primeiro número (1.0) é igual a pelo menos um outro número fornecido.
            //0.0
            //
            //O primeiro número (1.0) não é igual a nenhum outro número fornecido.
            //0.0
            //
            //O número fornecido é menor igual que 100.
            //0.0
            //
            //O número fornecido é maior que 100.
            //0.0
        }
        
    }
    
}
